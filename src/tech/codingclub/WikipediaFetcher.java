package tech.codingclub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import redis.clients.jedis.Jedis;
import tech.codingclub1.utility.HttpURLConnectionExample;

import java.util.ArrayList;
import java.util.Date;

public class WikipediaFetcher implements Runnable {

    private String query;
     public void run()
     {

     }

    public WikipediaFetcher(String query){
        this.query = query;
    }

    private String getWikipediaUrl(){
        String cleanKeyword = query.replaceAll("[ ]+","_");
        return "https://en.wikipedia.org/wiki/"+cleanKeyword;
    }

    private String fetchHTML(){
        String url = getWikipediaUrl();
        String html = null;
        try {
            html = HttpURLConnectionExample.sendGet( url );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return html;
    }


    public WikiResult getResult() {
        String html = fetchHTML();
        String result = "";

        WikiResult wikiResult = null;

        if(html!=null&&html.length() > 0 ){
            //Parse using Jsoup
            Document document = Jsoup.parse(html,"https://en.wikipedia.org");
            Elements paragraphs = document.body().select(".mw-parser-output > *");

            int step = 0;
            for(Element element : paragraphs){
                if(step==0 ){
                    if(element.tagName().equals("table")){
                        step =1;
                    }
                }else if(step == 1){
                    if(element.tagName().equals("p")){
                        result = element.text();
                        String imageUrl = "";
                        try{
                            imageUrl = document.body().select(".infobox img").get(0).attr("src");
                        }catch (Exception e){
                        }
                        wikiResult = new WikiResult(query,result,imageUrl);

                        break;
                    }
                }
            }

            //System.out.println(html);
        }

        return wikiResult;
    }

    public static void main(String[] args) {
        System.out.println("This is Ajay Gupta");
        System.out.println("Hello Wikipedia Downloader running at "+ new Date().toString()+" sharp.");
        String arr[]={"India","United States"};
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList=WebCrawler.getCities();
        for (String element : arrayList) {
            WikipediaFetcher wikipediaFetcher = new WikipediaFetcher(element);
            WikiResult wikiResult = wikipediaFetcher.getResult();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json=gson.toJson(wikiResult);
            Jedis jedis = new Jedis("localhost");


            jedis.set(element, json);
//            System.out.println("Stored string in redis:");
          System.out.println(jedis.get(element));
      // System.out.println(json);
           // taskManager.waitTillQueueIsFreeAndAddTask(wikipediaFetcher);
        }
//        WikipediaFetcher wikipediaFetcher = new WikipediaFetcher("India");
//        WikiResult wikiResult = wikipediaFetcher.getResult();
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        String json=gson.toJson(wikiResult);
//        System.out.println(json);
//        WikipediaFetcher wikipediaFetcher1 = new WikipediaFetcher("United States");
//        WikiResult wikiResult2 = wikipediaFetcher1.getResult();
//        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
//        String json2=gson.toJson(wikiResult2);
//        System.out.println(json2);

    }

}

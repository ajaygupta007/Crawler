package tech.codingclub;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import tech.codingclub1.utility.HttpURLConnectionExample;

import java.util.Date;


public class WikipediaDownloader implements Runnable {
    private String keyword;
    private String result;
    public WikipediaDownloader(){

    }

    public WikipediaDownloader(String keyword){
        this.keyword=keyword;
    }


    public void run() {
        if(null == this.keyword || this.keyword.length() ==0){
            return;
        }
        this.keyword = this.keyword.trim().replaceAll("[ ]+","_");

        String wikiUrl=getWikipediaUrlForQuery(this.keyword);
        String imageUrl=null;
        String response="";
        try {
            String wikipediaResponseHTML= HttpURLConnectionExample.sendGet(wikiUrl);
            //System.out.println(wikipediaResponseHTML);

            Document document= Jsoup.parse(wikipediaResponseHTML,"https://en.wikipedia.org");

            Elements childElements=document.body().select(".mw-parser-output >*");

            int state=0;

            for(Element childElement:childElements){

                if(state == 0){
                    if(childElement.tagName().equals("table")){
                        state=1;
                    }}
                else if(state==1){
                    if(childElement.tagName().equals("p")){
                        state = 2;
                        response=childElement.text();
                        break;
                    }
                }


                // System.out.println(childElement.tagName());

            }
            imageUrl=document.body().select(".infobox img").get(0).attr("src");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(imageUrl.startsWith(("//"))){
            imageUrl="https:"+imageUrl;
        }

        WikiResult wikiResult=new WikiResult(this.keyword,response,imageUrl);

        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        String json=gson.toJson(wikiResult);
        System.out.println(json);
    }

    private String getWikipediaUrlForQuery(String cleanKeyword) {
        return "https://en.wikipedia.org/wiki/"+cleanKeyword;
    }

    public static void main(String[] args) {
        TaskManager taskManager=new TaskManager(20);

        String[] arr={"India","United States"};

        System.out.println("This side is Ajay\nWikipedia Downloader running at "+new Date().toString()+" sharp");
        for(String keyword:arr){
            WikipediaDownloader wikipediaDownloader=new WikipediaDownloader(keyword);
            taskManager.waitTillQueueIsFreeAndAddTask(wikipediaDownloader);
        }



    }
}



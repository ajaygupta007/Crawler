package tech.codingclub;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import tech.codingclub1.utility.HttpURLConnectionExample;

import java.util.ArrayList;

public  class WebCrawler {

    public  static ArrayList<String> getCities() {

        System.setProperty("http.agent", "Chrome");

        String html = "";
        String url = "http://ontheworldmap.com/all/cities";
        try {
            html = HttpURLConnectionExample.sendGet(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<String> arrayList=new ArrayList<>();
        Document document = Jsoup.parse(html, "http://ontheworldmap.com/");
        Elements childelement = document.body().select(".ul-reset >  *");

        for (Element x : childelement) {
            if (x.tagName().equals("li")) {
                String data=x.text();
                arrayList.add(data);
//                System.out.println(data);
                if(data.equalsIgnoreCase("Zurich")){
                    break;
                }

            }
        }

        return arrayList;
    }

//    public static void main(String[] args) {
//        WebCrawler webCrawler=new WebCrawler();
//        webCrawler.getCities();
//
//    }
//
//    @Override
//    public void run() {
//        getCities();
//
//    }
}
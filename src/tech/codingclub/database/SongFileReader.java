package tech.codingclub.database;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

import static tech.codingclub.utility.FileUtility.readAndPrintFile;
import static tech.codingclub1.utility.HttpURLConnectionExample.sendGet;

public class SongFileReader {
    private static String fetchHTML(String url){
        String html = null;
        try {
            html = sendGet( url );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return html;
    }
    public static void main(String[] args) throws Exception {
        String nameOfFile="C:\\Users\\lenovo\\Documents\\Javaprogram\\crawlsonglinks.txt";
        ArrayList<String> stringArrayList=readAndPrintFile(nameOfFile);
        for (String row : stringArrayList)
        {
            String html = sendGet (row);
            Document document = Jsoup.parse(html,"https://songspk.mobi");
            Elements links = document.body().select(".thumb-image > *");

            for (Element link : links) {
                String a=link.attr("href");
                String p=a;
                a="https://songspk.mobi"+a;
                String html1 = sendGet(a);
                Document document1 = Jsoup.parse(html1,"https://songspk.mobi");
                Elements paragraphs = document1.body().select(".list-group-item > *");
                String Album="",Duration="",Singers="",Lyricist="",Music_Director="";
                int a1=0,b=0,c=0,d=0,e=0;
                for (Element val : paragraphs) {
                    String temp=val.text();
                    if(a1==1)
                    {
                        Album=temp;
                        // System.out.println(Album);
                        a1 = 0; b = 0;c=0;d=0;e=0;
                    }
                    else if(b==1)
                    {
                        Duration=temp;
                        //System.out.println(temp);
                        a1 = 0; b = 0;c=0;d=0;e=0;
                    }
                    else if(c==1)
                    {
                        Singers=temp;
                        //System.out.println(temp);
                        a1 = 0; b = 0;c=0;d=0;e=0;
                    }
                    else if(d==1)
                    {
                        Lyricist=temp;
                        // System.out.println(temp);
                        a1 = 0; b = 0;c=0;d=0;e=0;
                    }
                    else if(e==1)
                    {
                        Music_Director=temp;
                        //System.out.println(temp);
                        a1 = 0; b = 0;c=0;d=0;e=0;
                    }
                    else if(temp.equals("Album")) {
                        a1 = 1; b = 0;c=0;d=0;e=0;

                    }
                    else if(temp.equals("Duration"))
                    {
                        a1 = 0; b = 1;c=0;d=0;e=0;
                    }
                    else if(temp.equals("Singers"))
                    {
                        a1 = 0; b = 0;c=1;d=0;e=0;
                    }
                    else if(temp.equals("Lyricist"))
                    {
                        a1 = 0; b = 0;c=0;d=1;e=0;
                    }
                    else if(temp.equals("Music Director"))
                    {
                        a1 = 0; b = 0;c=0;d=0;e=1;
                    }
                    else ;
                    //System.out.println(Album+" "+Duration+" "+Singers+" "+ Lyricist+Music_Director);
                }
                SongDetials song = new SongDetials(row,a,Album,Duration,Singers,Music_Director,Lyricist);
                //new GenericDB<SongDetials>().getRow(tech.codingclub.tables.Music.MUSIC,SongDetials,);
            }
        }
    }
}
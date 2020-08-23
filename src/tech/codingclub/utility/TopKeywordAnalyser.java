package tech.codingclub.utility;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import tech.codingclub.TaskManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class TopKeywordAnalyser implements  Runnable{
    private final String filePath;
    public TopKeywordAnalyser(String filePath)
    {
        this.filePath=filePath;
    }
    public void run()
    {

            ArrayList<String> keywordsFileData = null;
        try {
            keywordsFileData=  FileUtility.readAndPrintFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap<String,Integer> keywordsCounter = new HashMap<String,Integer>();
        for(String row : keywordsFileData)
        {
            String [] keywords= row.split(" ");
            for(String keyword: keywords)
            {
                String str = keyword.toLowerCase();
                if(!keywordsCounter.containsKey(str))
                {
                    keywordsCounter.put(str,1);
                }
                else
                {
                    Integer value = keywordsCounter.get(str);
                    keywordsCounter.put(str,value+1);
                }
            }
        }
        ArrayList<KeywordCount> keywordCountArrayList = new ArrayList<KeywordCount>();
        for(String keyword : keywordsCounter.keySet())
        {
            KeywordCount keywordCount = new KeywordCount(keyword,keywordsCounter.get(keyword));
            keywordCountArrayList.add(keywordCount);
        }
        Collections.sort(keywordCountArrayList, new Comparator<KeywordCount>() {
            @Override
            public int compare(KeywordCount o1, KeywordCount o2) {
                return o2.count-o1.count;
            }
        });
//        for(KeywordCount keywordCount:keywordCountArrayList)
//        {
//            System.out.println(keywordCount.keyword + " " + keywordCount.count);
//        }
        String json = new Gson().toJson(keywordCountArrayList);
        System.out.println(json);
        String convertJson="{'keyword':'Hello GSON','count':100}";
        KeywordCount keywordCount = new Gson().fromJson(convertJson,KeywordCount.class);
        System.out.println(" Converted to object "+keywordCount.keyword+ " "+ keywordCount.count);
   String convertJsonArray="[{'keyword':'Hello GSON','count':100},{'keyword':'Last One','count':100}]";
   ArrayList<KeywordCount> countArrayList = new Gson().fromJson(convertJsonArray,new TypeToken<ArrayList<KeywordCount>>(){}.getType());
        System.out.println("Json Object Convert To ArrayList : ");
   for(KeywordCount keywordCountTemp: countArrayList)
   {
       System.out.println(keywordCountTemp.keyword + ": "+keywordCountTemp.count);
   }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(1);
        taskManager.waitTillQueueIsFreeAndAddTask(new TopKeywordAnalyser("C:\\Users\\lenovo\\Downloads\\IndianNationalAnthem.txt"));
    }

}

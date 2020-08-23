package tech.codingclub;

import java.io.*;
import java.util.*;

public class FileReaderRunnable implements Runnable {
    public String str;
    FileReaderRunnable(String path)
    {
        this.str=path;
    }
    private  String[] splitSentenceByWords(String str){

        //if string is empty or null, return empty array
        if(str == null || str.equals(""))
            return new String[0];

        String[] words = str.split(" ");

        return words;
    }
    @Override
    public void run() {
        LinkedHashMap<String, Integer> wordcount =
                new LinkedHashMap<String, Integer>();
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader("C:\\Users\\lenovo\\Downloads\\IndianNationalAnthem.txt"));
            String str;

            while ((str = in.readLine()) != null) {
                str = str.toLowerCase(); // convert to lower case
                String[] words = str.split("\\s+"); //split the line on whitespace, would return an array of words

                for (String word : words) {
                    if (word.length() == 0) {
                        continue;
                    }
                    Integer occurences = wordcount.get(word);

                    if (occurences == null) {
                        occurences = 1;
                    } else {
                        occurences++;
                    }

                    wordcount.put(word, occurences);
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }


        ArrayList<Integer> values = new ArrayList<Integer>();
        values.addAll(wordcount.values());

        Collections.sort(values, Collections.reverseOrder());

        int last_i = -1;


        for (Integer i : values.subList(0, 9)) {
            if (last_i == i) // without duplicates
                continue;
            last_i = i;


            for (String s : wordcount.keySet()) {

                if (wordcount.get(s) == i) // which have this value
                    System.out.println(s + " " + i);


            }
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(100);
        String path="C:\\Users\\lenovo\\Downloads\\IndianNationalAnthem.txt";
        FileReaderRunnable runnable1 =new FileReaderRunnable(path);
        taskManager. waitTillQueueIsFreeAndAddTask(runnable1);
//        Thread thread1 = new Thread(runnable1);
//        thread1.start();
    }
}

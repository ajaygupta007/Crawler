package tech.codingclub.utility;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileUtility {
    public static boolean createFile(String fileNameWithPath)
    {
        File file =new File(fileNameWithPath);
        boolean fileCreated;
        fileCreated = false;
        try {
              fileCreated=  file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileCreated;
    }
    public static ArrayList<String>   readAndPrintFile(String fileName) throws IOException {
        Scanner scanner=null;
        ArrayList<String> strings=new ArrayList<String>();        File file =new File(fileName);
        try {
             scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                //System.out.println(line);
           strings.add(line);
        }
}       catch (Exception e)
        {
           e.printStackTrace();
        }
        finally {
            if(scanner!=null)
            {
                scanner.close();
            }
        }

        return strings;
    }
   public static boolean writeToFile(String fileNameWithPath, String content) {

       try {
           FileWriter fileWriter = new FileWriter(fileNameWithPath,true);
           fileWriter.append(content);
           fileWriter.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return true;
    }
    public static boolean  appendToFile(String fileName,String content)
    {

        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            fileWriter.append(content);
            fileWriter.append("\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
      return true;

    }

    public static void main(String[] args) throws IOException {
        System.out.println("This side is ajay gupta :");
        System.out.println("Running FileUtility at "+ new Date().toString());
        String nameOfNewFile="C:\\Users\\lenovo\\IdeaProjects\\hellojava\\data\\practice\\File\\create-file.txt";
        Boolean created =createFile(nameOfNewFile);
        System.out.println("File Created : "+created);
         ArrayList<String> stringArrayList=readAndPrintFile(nameOfNewFile);
         for (String row : stringArrayList)
         {
             System.out.println("Line : "+row );
         }
        System.out.println("no of lines in file :  "+ stringArrayList.size());
         String nameofWriteFile="C:\\Users\\lenovo\\IdeaProjects\\hellojava\\data\\practice\\File\\write-file.txt";

         boolean wroteTofile =  writeToFile(nameofWriteFile,"This file is generated on ajay system automatically");
        System.out.println(wroteTofile);
        for(int i=1;i<=100;i++)
        {
            String data = i+"";
            appendToFile(nameofWriteFile,data);

        }
        System.out.println("appended file size "+ readAndPrintFile(nameofWriteFile));
    }



}

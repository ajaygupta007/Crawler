package tech.codingclub;
import java.util.ArrayList;
import java.util.Date;

public class task7 {
    public static void main(String args[])
    {
       System.out.println("This is Ajay Gupta");
       System.out.println("task7 running at "+ new Date().toString()+" sharp.");
        ArrayList<String> arrayList =new ArrayList<String>();
        arrayList.add("Welcome");
        arrayList.add("to");
        arrayList.add("the");
        arrayList.add("java");
        arrayList.add("code");
        String first = arrayList.get(0);
        System.out.println("First one :"+ first);
        arrayList.set(2,"THE");
        int size=arrayList.size();
     arrayList.remove(size-1);
     for(int i=0;i<arrayList.size();i++)
     {
         System.out.println(arrayList.get(i));
     }
     arrayList.clear();
        System.out.println("size after clearing : "+arrayList.size());
    }

}

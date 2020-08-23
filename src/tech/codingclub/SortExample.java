package tech.codingclub;
import java.util.*;

public class SortExample {
    public static void main(String args[])
    {
        System.out.println("This is Ajay Gupta");
        System.out.println("sort example running at "+ new Date().toString()+" sharp.");
        ArrayList<String> emails=new ArrayList<String>();
        emails.add("contact@codingclub.tech");
        emails.add("admin@google.com");
        emails.add("admin@linkedin.com");
        for(String mail:emails)
        {
            System.out.println(mail);
        }
        Collections.sort(emails);
        System.out.println("########## After sort #######");
        for(String mail:emails)
        {
            System.out.println(mail);
        }
        int arr[]={43,2 ,6,5,2};
        Arrays.sort(arr);
        for(int element:arr){
            System.out.println(element);
        }
    }

}
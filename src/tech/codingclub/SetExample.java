package tech.codingclub;
import java.util.*;

public class SetExample {
    public static void main(String args[])
    {
       System.out.println("This is Ajay Gupta");
       System.out.println("set example running at "+ new Date().toString()+" sharp.");
        ArrayList<String> emails=new ArrayList<String>();
        emails.add("contact@codingclub.tech");
        emails.add("admin@google.com");
        emails.add("admin@linkedin.com");
        emails.add("admin@google.com");
        emails.add("admin@google.com");
        emails.add("hr@toktok.com");
        emails.add("admin@tiktok.com");
        emails.add("admin@tiktok.com");
        ArrayList<String> blackListedEmails= new ArrayList<String >();
        blackListedEmails.add("admin@tiktok.com");
        blackListedEmails.add("admin@tiktok.com");
        Set<String> uniqueemails= new HashSet<String>();
        uniqueemails.add("hr@google.com");
        uniqueemails.addAll(emails);
        Iterator<String> iterator =uniqueemails.iterator();
        while ((iterator.hasNext()))
        {
            System.out.println("Iterator Showing :" +iterator.next());
        }
        for(String x:uniqueemails)
        {
            System.out.println("for loop showing :"+x);
        }
        System.out.println("Size of set :"+ uniqueemails.size());
        uniqueemails.remove("admin@linkedin.com");
        System.out.println("Removed Linkedin Mail");
        for(String x:uniqueemails)
        {
            System.out.println("for loop showing :"+x);
        }

    }

}

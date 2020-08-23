package tech.codingclub;
import java.util.*;

public class task9 {
    public static void main(String args[])
    {
       System.out.println("This is Ajay Gupta");
       System.out.println("task8 running at "+ new Date().toString()+" sharp.");
        Map<String,String> countryToCapital = new HashMap<String, String>();
        countryToCapital.put("India","Delhi");
        countryToCapital.put("China","Beijing");
        countryToCapital.put("Canada","ottawa");
        if(countryToCapital.containsKey("India"))
        {
            System.out.println("Capital of india is : "+ countryToCapital.get("India"));
        }
        if(countryToCapital.containsKey("RuSSia"))
        {
            System.out.println("Capital of russia is : "+ countryToCapital.get("Russia"));
        }
        else {
            System.out.println("Capital of russia is not found");
        }
        System.out.println("key below");
        for(String key:countryToCapital.keySet())
        {
            System.out.println(key);
        }
        System.out.println("values below");
        for(String x:countryToCapital.values())
        {
            System.out.println(x);
        }
        System.out.println("######################");
        for(String key:countryToCapital.keySet())
        {
            System.out.println(key+": "+countryToCapital.get(key));
        }
    }

}

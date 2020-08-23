package tech.codingclub;
import java.util.Date;
import java.util.Random;

public class task6 {
    public static void main(String args[])
    {
       System.out.println("This is Ajay Gupta");
       System.out.println("task2 running at "+ new Date().toString()+" sharp.");
        Random random =new Random();
        int randomIntValue= random.nextInt(100);
        System.out.println("random int value 0 to 99 : "+ randomIntValue);
        int randomIntvalueInRange=50+random.nextInt(50);
        System.out.println("random value : 50 -99 : "+ randomIntvalueInRange);
        String string="HelloWorld";
        System.out.println("Printing string : "+string);
        string = string +"!";
        System.out.println("printing modified string : "+string);
        System.out.println("current length : "+string.length());
        System.out.println("string(5,end) : "+ string.substring(5));
        System.out.println("string 5th and 6th index: "+ string.substring(5,7));
        System.out.println("uppercase : "+string.toUpperCase());
        System.out.println("lowercase : "+ string.toLowerCase());
        System.out.println("Index of h: "+ string.indexOf('H'));
        System.out.println("cahr at 6 Index : "+string.charAt(6));
        String s1="abc";
        String s2="adc";
        System.out.println(s1.compareTo(s2));
        Date date= new Date();
        long currentEpochTime = date.getTime();
        int sum=0;
        for(int i=0;i<100000000;i++)
        {
            sum=sum+1;
        }
        long timeNow =new Date().getTime();
        long diff=(timeNow -currentEpochTime);
        System.out.println(diff + " milliseconds to run 10^6  on any machine ");
        System.out.println("Current Time : "+ new Date().toString());


    }


}

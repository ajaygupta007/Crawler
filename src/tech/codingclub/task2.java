package tech.codingclub;
import java.util.Date;

public class task2 {
    public static void main(String args[])
    {
       System.out.println("This is Ajay Gupta");
       System.out.println("task2 running at "+ new Date().toString()+" sharp.");
        int a=8,b=400;
        int c=a+b;
        System.out.println("sum of "+ a+" +"+ b+" = "+c);
        double wideningVariable =a;
        System.out.println("wideningVariable value"+" = "+wideningVariable);
        wideningVariable =a+0.1;
        System.out.println("modified wideningVariable value"+" = "+wideningVariable);
        int narrowVariable= (int) wideningVariable;
        System.out.println("narrowVariable value "+narrowVariable);
        int overflowVariable=Integer.MAX_VALUE;
        System.out.println("overflowVariable value "+ overflowVariable);
        overflowVariable+=4;
        System.out.println("modified overflowVariable value "+ overflowVariable);


    }


}

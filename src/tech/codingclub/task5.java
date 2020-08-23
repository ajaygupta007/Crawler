package tech.codingclub;
import java.util.Date;
public class task5 {
    public static void main(String args[])
    {
       System.out.println("This is Ajay Gupta");
       System.out.println("task5 running at "+ new Date().toString()+" sharp.");
        int a=100,b=8;
        System.out.println("Addition :"+ (a+b));
        System.out.println("Subtraction :"+ (a-b));
        System.out.println("Multiplication  :"+ (a*b));
        System.out.println("Division :"+ (a/b));
        System.out.println("Modulo :"+ a%b);
         double c=Math.abs(-20.20);
        System.out.println("Math.abs() :"+ Math.abs(c));
        double d=c;
        System.out.println("Math.ceil() :"+Math.ceil(d));
        System.out.println("Math.floor() :"+Math.floor(d));
        System.out.println("Math.max :"+Math.max(2,3));
        System.out.println("Math.min :"+Math.min(3,2));
        System.out.println("Math.random() 0 to 1  :" +Math.random());
        int random= 10+ (int)(Math.random()*90);
        System.out.println("Math.random() from 10 to 100 "+random);
        System.out.println("Math.pi() "+Math.PI);
        int e=100;
        System.out.println("post increment : "+ e++);
        System.out.println("pre increment : "+ ++e);
    }
}

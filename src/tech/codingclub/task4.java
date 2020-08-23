package tech.codingclub;
import java.util.Date;
import java.util.Scanner;

public class task4 {
    public static void main(String args[])
    {
       System.out.println("This is Ajay Gupta");
       System.out.println("task4 running at "+ new Date().toString()+" sharp.");
       int arr[]={1,2,3,4};
        System.out.println("Last element of array " + arr[arr.length-1]);
        int twodarray[][]={{1,2,3,4},{5,6,7,8}};
        System.out.println("last row and last column value "+twodarray[1][3]);
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of a");
        a=s.nextInt();
        System.out.println("enter value of b");
        b=s.nextInt();
        System.out.println("sum of a and b "+ (a+b));

    }

}

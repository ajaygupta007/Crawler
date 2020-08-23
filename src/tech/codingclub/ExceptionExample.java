package tech.codingclub;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int x=100;
        Scanner scanner = new Scanner(System.in);
        int y=scanner.nextInt();
        try {
            int ans = x / y;
            System.out.println(ans);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        try{
            int arr[]={45,234,56};
            System.out.println(arr[100]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException ! ");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException! ");
        }
        catch (Exception e)
        {
            System.out.println("caught ! "+ e.getClass());
        }
        finally {
            System.out.println("Inside finally ! ");
        }
        System.out.println("Hello world ");
    }
}

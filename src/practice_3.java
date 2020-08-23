import java.lang.*;
import java.util.*;

public class practice_3 {
    public static void main(String[] args) {
        ThreadX x=new ThreadX();
        Thread t1=new Thread(x);
        ThreadY y=new ThreadY();
        ThreadZ z=new ThreadZ();
        Thread t2=new Thread(y);
        Thread t3=new Thread(z);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("MULTITHREADING IS OVER");
    }
}
class ThreadX implements Runnable{
    public void  run() {
        for (int j = 1; j<= 5; j++) {
            System.out.println("from thread B with i=" + (-1 * j));
        }
        System.out.println("Exit from ThreadX");
    }
}
class ThreadY implements Runnable{
    public void  run() {
        for (int k = 1; k<= 5;k++) {
            System.out.println("from thread c with k=" + (2* k));
        }
        System.out.println("Exit from ThreadY");
    }
}
class ThreadZ implements Runnable{
    public void  run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("from thread A with i=" + (2* i-1));
        }
        System.out.println("Exit from ThreadZ");
    }
}
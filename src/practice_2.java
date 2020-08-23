import java.lang.*;
import java.util.*;

public class practice_2 {
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        ThreadC c=new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println("MULTITHREADING IS OVER");
    }
}
class ThreadB extends Thread{
    public void  run() {
        for (int j = 1; j<= 5; j++) {
            System.out.println("from thread B with i=" + (-1 * j));
        }
        System.out.println("Exit from ThreadB");
    }
}
class ThreadC extends Thread{
    public void  run() {
        for (int k = 1; k<= 5;k++) {
            System.out.println("from thread c with k=" + (2* k));
        }
        System.out.println("Exit from ThreadC");
    }
}
class ThreadA extends Thread{
    public void  run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("from thread A with i=" + (2* i-1));
        }
        System.out.println("Exit from ThreadA");
    }
}
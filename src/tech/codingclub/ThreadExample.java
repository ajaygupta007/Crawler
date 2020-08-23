package tech.codingclub;

public class ThreadExample extends Thread {
    private String threadName;
    public int count;
    public ThreadExample(String threadName,int count)
    {
        this.threadName=threadName;
        this.count=count;
    }
    public  void run()
    {
        while(count<100)
        {
            count++;
            if(threadName.equals("THREAD_A"))
            {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(threadName.equals("THREAD_B"))
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(threadName.equals("THREAD_C"))
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + ": "+ count);
        }

    }

    public static void main(String[] args) {
        ThreadExample thread1=new ThreadExample("THREAD_A",0);
        ThreadExample thread2=new ThreadExample("THREAD_B",0);
        ThreadExample thread3=new ThreadExample("THREAD_C",0);
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(thread1.count);
        System.out.println(thread2.count);
        System.out.println(thread3.count);
    }



}

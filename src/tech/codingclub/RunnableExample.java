package tech.codingclub;

public class RunnableExample implements Runnable {
    private int waitTimeWhileLoop;
    private String threadName;
    public int count;


    public RunnableExample(String threadName, int count,int waitTimeWhileLoop)
    {
        this.threadName=threadName;
        this.count=count;
        this.waitTimeWhileLoop=waitTimeWhileLoop;
    }
    public  void run()
    {
        while(count<100)
        {
            count++;
                try {
                    Thread.sleep(waitTimeWhileLoop);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            System.out.println(threadName + ": "+ count);
        }

    }

    public static void main(String[] args) {
        RunnableExample runnable1 =new RunnableExample("THREAD_A",0,200);
        RunnableExample runnable2 =new RunnableExample("THREAD_B",0,500);
        RunnableExample runnable3 =new RunnableExample("THREAD_C",0,1000);
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable1);
        Thread thread3 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread3.start();

    }



}

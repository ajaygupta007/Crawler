package tech.codingclub.utility;

import tech.codingclub.RunnableExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadManager {
    private int poolSize;
    private ExecutorService executorService;
    public ThreadManager(int poolSize)
    {
        this.poolSize = poolSize;
        executorService = Executors.newFixedThreadPool(poolSize);
    }
    public void execute(Runnable runnable)
    {
        executorService.submit(runnable);
    }

    public static void main(String[] args) {
        ThreadManager threadManager = new ThreadManager(100);
        for(int i=0;i<100;i++)
        {
            RunnableExample temp = new RunnableExample("THREAD_No-"+ i,0,100+i);
                    threadManager.execute(temp);
        }
        System.out.println("###################################");
    }
}

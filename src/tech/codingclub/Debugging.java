package tech.codingclub;

import java.io.*;
import java.util.Date;

public class Debugging {
    public static void main(String[] args) throws IOException {
        int N=10;
        int sum=0;
        for(int i=0;i<=N;i++)
            sum+=i;
        System.out.println("Sum till N number : "+ N);
        Singleton singleton= Singleton.getSingletonInstance(456);


        System.out.println(new Date().toString());
        System.out.println(singleton.data+sum);
        int x=sum;
        int y=45;
        int z=x+y;
        System.out.println(z+" must be 100");
        FileInputStream fstream = new FileInputStream("C:\\Users\\lenovo\\IdeaProjects\\hellojava\\src\\tech\\codingclub\\Debugging.java");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

//Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console - do what you want to do
            System.out.println (strLine);
        }

//Close the input stream
        fstream.close();
    }

}

import java.util.ArrayList;
import java.util.Scanner;
public class practice_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        float avg = 0;
        ArrayList<Integer> l = new ArrayList<Integer>();
        System.out.println("enter the input");
        while (s.hasNextInt()) {
            l.add(s.nextInt());
        }
        for (int i = 0; i < l.size(); i++)
            sum = sum + l.get(i);
        avg = sum / l.size();
        System.out.println("Average :" + avg);
    }
}


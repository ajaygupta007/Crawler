package tech.codingclub;
import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String args[])
    {
       System.out.println("This is Ajay Gupta");
       System.out.println("stackExample running at "+ new Date().toString()+" sharp.");
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(2);
        stack.push(5);
        stack.push(10);
        stack.push(101);
        int topElementpoped=stack.pop();
        int index=stack.search(5);
        int find200=stack.search(200);
        System.out.println("Top element :"+ stack.peek());
        System.out.println("INdex of 5 : "+index);
        System.out.println("Index of 200 :"+find200);
        Iterator stackiterator =stack.iterator();
        while (stackiterator.hasNext())
        {
            System.out.println("Iterator showing element :"+stackiterator.next());
        }
        while ((!stack.empty()))
        {
            int topElement=stack.pop();
            System.out.println("Popped :"+topElement);
        }

    }

}

package tech.codingclub;

public class SingletonExample {

    public static void main(String[] args) {

        Singleton obj1 =Singleton.getSingletonInstance(352);
        obj1.data=1234;
        System.out.println(obj1.data + " & " );
        
    }
}

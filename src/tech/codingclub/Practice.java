package tech.codingclub;

public class Practice {
    int z=10;
    void call() {
        System.out.println("hello World !");
        z=1;
    }
    void get()
    {
        call();
    }

    public static void main(String[] args) {
        Practice obj=new Practice();
        obj.get();
        System.out.println(obj.z);
    }

}

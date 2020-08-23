package tech.codingclub;

public class Car implements CarInterface{
    public static int wheelCount=4;
    double batteryleft=100.0;
    public static final int maxSpeed=300;
    private int CurrentSpeed=0;
    String numberPlate;
    public Car(){

    }

    public Car(String numberPlate)
    {
        this.numberPlate=numberPlate;
    }
    public Car(String numberPlate,int CurrentSpeed)
    {
        this.numberPlate=numberPlate;
        this.CurrentSpeed=CurrentSpeed;
    }

    void accelerate()
    {
        System.out.println("Speed up : "+numberPlate);
        CurrentSpeed+=10;
    }


    public static void printAboutWheel() {
        System.out.println("Car has "+ Car.wheelCount +" wheels ");

    }

    @Override
    public void applyBreak() {
CurrentSpeed=0;
    }

    public static void main(String[] args) {

    }


    public int getCurrentSpeed() {
        return  CurrentSpeed;
    }

    public void increaseSpeed(int i) {
        if(i<0)
            return ;
        CurrentSpeed+=i;
        if(CurrentSpeed>=maxSpeed)
            CurrentSpeed=maxSpeed;
    }
}

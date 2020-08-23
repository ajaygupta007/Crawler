package tech.codingclub;

public class ElectricCar extends Car {
    public ElectricCar()
    {
        super();
    }
    public ElectricCar(String numberPlate)
    {
        super(numberPlate);
    }
    public ElectricCar(String numberPlate,int currentSpeed)
    {
        super(numberPlate,currentSpeed);
    }
    public double getBatteryleft() {
        return batteryleft;
    }
    public void accelerate()
    {
        super.accelerate();
        batteryleft=batteryleft-0.5;
    }


    public static void main(String[] args) {
  ElectricCar tesla=new ElectricCar("Tesla 001",500);
  tesla.accelerate();
        System.out.println("TEsla currentspeed : "+tesla.getCurrentSpeed() + " battery lefft : " +tesla.getBatteryleft());

    }
}

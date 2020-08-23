package tech.codingclub;
public class LearnClass {
    public static void main(String[] args) {
        Car audi=new Car("Audi 007");
        audi.accelerate();
        audi.wheelCount=8;
        Car bmw= new Car("BMW 007",100);
        bmw.accelerate();
        bmw.increaseSpeed(100);

        System.out.println("Current Speed audi : "+audi.getCurrentSpeed());
        System.out.println("Current Speed audi : "+bmw.getCurrentSpeed());
        System.out.println("AD count : "+ audi.wheelCount);
        System.out.println("BM count : "+bmw.wheelCount);
        Car.wheelCount=4;
        Car.printAboutWheel();
        System.out.println("AD Now : "+ audi.wheelCount);
        System.out.println("BM Now : "+bmw.wheelCount);
        DummyCar car= new DummyCar() {
            @Override
            public void move() {

            }
        };
    }
}

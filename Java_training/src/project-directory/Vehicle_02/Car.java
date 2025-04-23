package Vehicle_02;

public class Car extends Vehicle_02 {
    @Override
    public void honk() {
        System.out.println("Car horn: Beeeep!");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
    }
}
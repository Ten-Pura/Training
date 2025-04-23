package Vehicle;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Tesla Model S");
        myCar.accelerate(60);
        myCar.displayCarInfo();
    }
}
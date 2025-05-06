package Car_02;

public class Main {
    public static void main(String[] args) {
        CarType type = CarType.SEDAN;
        System.out.println("Car type: " + type);
        System.out.println("Max speed: " + type.getMaxSpeed());
    }
}
package Vehicle;

public class Vehicle {
    private String color;
    private int speed;

    public Vehicle(String color) {
        this.color = color;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        this.speed += amount;
    }

    public void displayStatus() {
        System.out.println("color:" + color);
        System.out.println("speed:" + speed);
    }
}
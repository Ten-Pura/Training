package Car;

public class Car {
    private String color;
    private int speed;

    public Car(String color) {
        this.color = color;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        this.speed += amount;
    }

    public void displayStatus() {
        System.out.println("Color:" + this.color);
        System.out.println("Speed:" + this.speed);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Red");
        myCar.accelerate(50);
        myCar.displayStatus();
    }

}
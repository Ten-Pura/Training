package Vehicle;

public class Car extends Vehicle {
    private String model;

    public Car(String color, String model) {
        super(color);   //親クラスのコンストラクタを呼び出す
        this.model = model;
    }

    public void displayCarInfo() {
        System.out.println("Model:" + this.model);
        displayStatus();
    }
}
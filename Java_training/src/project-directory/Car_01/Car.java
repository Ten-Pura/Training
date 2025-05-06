package Car_01;

public class Car {
    enum CarType {
        SEDAN, SUV, TRUCK, COUPE
    }

    public static void main(String[] args) {
        CarType myCarType = CarType.SUV;

        switch (myCarType) {
            case SEDAN:
                System.out.println("セダンタイプの車です。");
                break;
            case SUV:
                System.out.println("SUVタイプの車です。");
                break;
            case TRUCK:
                System.out.println("トラックタイプの車です。");
                break;
            case COUPE:
                System.out.println("クーペタイプの車です。");
                break;
        }
    }
}
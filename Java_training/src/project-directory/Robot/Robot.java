package Robot;

public class Robot implements Movable {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void move(int distance) {
        System.out.println(name + " moved" + distance + " meters.");
    }

    public static void main(String[] args) {
        Robot r2d2 = new Robot("R2D2");
        r2d2.move(200);
    }
}
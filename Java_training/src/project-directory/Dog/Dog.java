package Dog;

interface Movable {
    void move(int distance);
}

interface Soundable {
    void makeSound();
}

interface RunAround {
    void run();
}

public class Dog implements Movable, Soundable, RunAround {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void move(int distance) {
        System.out.println(name + " runs" + distance + " meters.");
    } 

    @Override
    public void makeSound() {
        System.out.println("ワンワン！！");
    }

    @Override
    public void run() {
        System.out.println(name + " runs around O-hori lake.");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Pochi");
        myDog.move(1000);
        myDog.makeSound();
        myDog.run();
    }
}
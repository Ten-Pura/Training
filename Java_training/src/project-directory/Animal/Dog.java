package Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Mathew");
        myDog.eat();
        myDog.makeSound();
    }
}
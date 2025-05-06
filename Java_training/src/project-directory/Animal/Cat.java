package Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says meow.");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat("lily");
        myCat.eat();
        myCat.makeSound();
    }
}
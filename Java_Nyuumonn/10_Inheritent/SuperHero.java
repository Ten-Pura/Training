public class SuperHero extends Hero {
    boolean flying;
    public void fly() {
        this.flying = true;
        System.out.println(this.name + "は飛びがった！");
    }

    public void land() {
        this.flying = false;
        System.out.println(this.name + "は着地した！");
    }

    public void run() {
        System.out.println(this.name + "は撤退した。");
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        h.run();
        SuperHero sh = new SuperHero();
        sh.run();
    }
}
public class Hero {
    String name = "ミナト";
    int hp = 100;
    
    //Attack a monster
    public void attack() {
        System.out.println(this.name + "の攻撃");
    }

    //Run away from a monster
    public void run() {
        System.out.println( this.name + "は逃げ出した。");
    }

    //main method
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "dummy_hero";
        h.attack();
        h.run();
    }
}
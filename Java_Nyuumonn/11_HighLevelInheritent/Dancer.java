public class Dancer extends Character {
    public Dancer() {
        this.name = "Dancer";
        this.hp = 100;
    }
    
    public void dance() {
        System.out.println(this.name + "は情熱的に踊った");
    }

    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃");
        System.out.println("敵に3ポイントのダメージ");
        m.hp -= 3;
    }

    public static void main(String[] args) {
        Dancer d = new Dancer();
        Matango m = new Matango('A');
        d.dance();
        d.attack(m);
    }
}
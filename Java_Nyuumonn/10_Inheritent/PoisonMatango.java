public class PoisonMatango extends Matango {
    //Number of possible attack
    int cntPosionAttack = 5;

    //constructor
    public PoisonMatango(char suffix) {
        super(suffix);
    }

    //PoisonAttack
    public void attack(Hero h) {
        super.attack(h);
        if (0 != cntPosionAttack ){
            System.out.println("さらに毒の胞子をばらまいた！");
            System.out.println(h.name + "に" + (h.hp/5) + "のダメージ！");
            h.hp = h.hp - (h.hp / 5);
            cntPosionAttack -= 1;
        }
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        PoisonMatango pm = new PoisonMatango('A');
        pm.attack(h);
        pm.attack(h);
        pm.attack(h);
        h.run();
    }
}
public class Main {
    public static void main(String[] args) {
        //Heroインスタンスを生成
        Hero h = new Hero("ミナト");
        Hero dummy = new Hero();
        //フィールド値を設定
        System.out.println("勇者" + h.name + "を生み出した！");
        System.out.println("勇者" + dummy.name + "を生み出した！");

        Thief t1 = new Thief("アサカ", 40, 5);
        Thief t2 = new Thief("アサカ", 35);
        Thief t3 = new Thief("アサカ");
        System.out.println(t1.name + t1.hp + t1.mp);
        System.out.println(t2.name + t2.hp + t2.mp);
        System.out.println(t3.name + t3.hp + t3.mp);
    }
}

public class Hero {
    String name;
    int hp;

    public Hero(String name) {
        //通常の1つ目のコンストラクタ
        this.hp = 100;
        this.name = name;
    }

    public Hero() {
        //コンストラクタを呼び出し
        this("dummy");
    }

    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した。");
    }

    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は" + sec + "秒座った。");
        System.out.println(this.name + "は" + sec + "ポイント回復した。");
    }

    public void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は、転んだ。");
        System.out.println(this.name + "は5のダメージを負った。");
    }

    public void run() {
        System.out.println(this.name + "は、逃げ出した。");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした。");
    }
}

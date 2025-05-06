import java.util.List;
import java.util.ArrayList;

public class Question_01 {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<>();
        Hero hero_01 = new Hero("Saito");
        heros.add(hero_01);
        Hero hero_02 = new Hero("Suzuki");
        heros.add(hero_02);

        for(int i = 0; i<heros.size() ; i++) {
            System.out.println((i+1) + "人目の勇者は" + heros.get(i).getName() + "です。");
        }
    }
}

private class Hero {
    private String name;
    public Hero(String name) { this.name = name; }
    public String getName() {return this.name; }
}
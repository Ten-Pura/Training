import java.util.*;

public class Quiz_16_2 {
    public static void main(String[] args){
        List<Hero> heros = new ArrayList<Hero>();

        heros.add(new Hero("斎藤"));
        heros.add(new Hero("鈴木"));

        heros.stream()
                    .map(Hero::getName)
                    .forEach(System.out::println);
    }
}

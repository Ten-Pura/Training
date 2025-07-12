import java.util.*;

public class Quiz_16_3 {
    public static void main(String[] args){
        Hero[] array = {
            new Hero("斎藤"),
            new Hero("鈴木")
        };
        List<Hero> heros = Arrays.asList(array);

        Random rand = new Random();
        Map<Hero, Integer> herosMap = new HashMap<>();
        for(Hero h: heros){
            herosMap.put(h, rand.nextInt(10));
        }

        herosMap.entrySet().stream()
                        .map(e -> e.getKey().getName() + "が倒した敵＝" + e.getValue())
                        .forEach(System.out::println);
    }
}

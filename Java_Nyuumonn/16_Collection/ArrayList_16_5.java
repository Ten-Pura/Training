import java.util.*;

public class ArrayList_16_5 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>();

        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("panda");

        for(String word: words) {
            System.out.println(word);
        }
    }
}

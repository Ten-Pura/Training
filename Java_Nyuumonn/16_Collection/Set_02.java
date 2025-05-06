import java.util.Set;
import java.util.TreeSet;

public class Set_02 {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();

        words.add("xyz");
        words.add("samurai");
        words.add("silc");
        words.add("wolf");

        for(String e: words) {
            System.out.print(e + "->");
        }
    }
}
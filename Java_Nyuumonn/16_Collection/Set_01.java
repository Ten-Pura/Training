import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Set_01 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("red");

        System.out.println("色は" + colors.size() + "種類です。");

        Iterator<String> it = colors.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


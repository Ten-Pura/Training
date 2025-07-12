import java.util.*;

public class ArrayList_16_4 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");

        Iterator it = colors.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

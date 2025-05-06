import java.util.*;

public class ArrayList_04 {
    public static void main(String[] arg) {
        ArrayList<String> names = new ArrayList<>();
        names.add("kanade");
        names.add("asuka");
        names.add("sugahara");

        Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
    }
}
import java.util.*;
import java.util.stream.Collectors;

public class ArrayList_16_2 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("奏");
        stringList.add("武蔵");
        stringList.add("大和");
        stringList.add("渚");

        Iterator<String> it = stringList.iterator();

        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
    }
}
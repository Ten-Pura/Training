import java.util.*;
import java.util.stream.Collectors;

public class ArrayList_16_6 {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new HashMap<String, Integer>();

        prefs.put("Tokyo", 1261);
        prefs.put("Kyoto", 255);
        prefs.put("Kumamoto", 181);

        prefs.entrySet().stream()
                            .map(e -> e.getKey() + "の人口は" + e.getValue() + "万人です。")
                            .forEach(System.out::println);
    }
}

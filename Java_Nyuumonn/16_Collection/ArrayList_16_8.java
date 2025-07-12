import java.util.*;

public class ArrayList_16_8 {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new HashMap<String, Integer>();

        prefs.put("Tokyo", 1261);
        prefs.put("Kyoto", 255);
        prefs.put("Kumamoto", 181);

        System.out.println("keySetを使ったFor文");
        for(String key: prefs.keySet()) {
            String s = key + "の人口は" + prefs.get(key) + "万人です。";
            System.out.println(s);
        }

        System.out.println("entrySetを使ったFor文");
        for(Map.Entry<String, Integer> e: prefs.entrySet()) {
            String s = e.getKey() + "の人口は" + e.getValue() + "万人です。";
            System.out.println(s);
        }
    }
}

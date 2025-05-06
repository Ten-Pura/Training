import java.util.*;

public class Map_02 {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new HashMap<>();
        prefs.put("Tyoto", 255);
        prefs.put("Tokyo", 1261);
        prefs.put("Kumamoto", 182);
        for(String key: prefs.keySet()) {
            int value = prefs.get(key);
            System.out.println("The population of " + key + " is " + value + "k.");
        }
    }
}
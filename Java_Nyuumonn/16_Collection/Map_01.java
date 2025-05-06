import java.util.Map;
import java.util.HashMap;

public class Map_01 {
    public static void main(String[] args) {
        Map<String, Integer> prefs = new HashMap<String, Integer>();

        prefs.put("Kyoto", 255);
        prefs.put("Tokyo", 1261);
        prefs.put("Kumamoto", 181);

        int tokyo = prefs.get("Tokyo");
        System.out.println("The population of Tokyo is " + tokyo + "k.");
        prefs.remove("Kyoto");
        prefs.put("Kumamoto", 182);
        int kumamoto = prefs.get("Kumamoto");
        System.out.println("The population of Kumamoto is " + kumamoto + "k.");
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i=1 ; i<101; i++) {
            sb.append(i).append(",");
        }
        String s = sb.toString();
        System.out.println(s);

        //String[]に分割
        String strs[] = s.split(",");
        for (String str: strs) {
            System.out.println(str);
        }
    }
}

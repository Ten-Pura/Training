import java.util.Date;

public class Main {
    public static void main (String[] args) {
        String s = "";
        System.out.println(new Date());
        for (int i=1; i < 100000; i++) {
            s = s + args[0];
        }
        System.out.println(new Date());

        StringBuilder sb = new StringBuilder();
        System.out.println(new Date());
        for (int i=1; i < 100000; i++) {
            sb.append(args[0]);
        }
        System.out.println(new Date());
    }
}
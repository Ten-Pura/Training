import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //6つのint値からDateインスタンスを生成する
        c.set(2023, 8, 18, 5, 53, 20);
        c.set(Calendar.MONTH, 9);
        Date d = c.getTime();
        System.out.println(d);

        //Dateインスタンスからint値を生成
        Date now = new Date();
        c.setTime(now);
        int y = c.get(Calendar.YEAR);
        System.out.println(y);
    }
}
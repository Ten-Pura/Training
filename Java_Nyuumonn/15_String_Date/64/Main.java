import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        //文字列からDateインスタンスを生成
        Date d = f.parse("2023/09/18 06:00:00");
        System.out.println(d);

        //Dateインスタンスから文字列を生成
        Date now = new Date();
        String s = f.format(now);
        System.out.println("現在の時刻は" + s + "です。");
        
        //error
        d = null;
        d.toString();
    }
}
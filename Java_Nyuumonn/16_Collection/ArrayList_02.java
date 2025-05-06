import java.util.ArrayList;

public class ArrayList_02 {
    public static void main(String[] args) {
        //ArrayListを準備
        ArrayList<String> names = new ArrayList<String>();

        //3人を追加
        names.add("tanaka");
        names.add("suzuki");
        names.add("saito");

        System.out.println(names.get(2));
    }
    
}

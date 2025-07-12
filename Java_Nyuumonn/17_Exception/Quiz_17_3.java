import java.util.*;

public class Quiz_17_3 {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        if(args != null){
            for(String s: args) {
                try {
                    numbers.add(Integer.parseInt(s));
                } catch(Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        } else {
            System.err.println("数値を入力してください。");
        }
    }
}

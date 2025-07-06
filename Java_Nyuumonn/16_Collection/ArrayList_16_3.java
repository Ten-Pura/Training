import java.util.*;

public class ArrayList_16_3 {
    public static void main(String[] args) {
        
        Set names = new HashSet();
        
        if(0<args.length){
            for(String e: args) {
                names.add(e);
            }
        } else {
            System.out.println("Please, input names of your team mates");
        }

        System.out.println(names.size() + "種類");
    }
}
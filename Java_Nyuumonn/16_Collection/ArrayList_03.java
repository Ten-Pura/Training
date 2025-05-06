import java.util.ArrayList;

public class ArrayList_03 {
    public static void main(String[] arg) {
        ArrayList<Integer> points = new ArrayList<Integer>();
        
        points.add(100);
        points.add(20);
        points.add(58);

        for (int i = 0; i<points.size(); i++) {
            System.out.println(points.get(i));
        }
    } 
}

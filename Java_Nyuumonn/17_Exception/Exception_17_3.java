import java.io.FileWriter;

public class Exception_17_3 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("test");
            fw.close();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

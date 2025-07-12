import java.io.FileWriter;

public class Exception_17_10 {
    public static void main(String[] args){
        try(FileWriter fw = new FileWriter("data.txt")) {
            fw.write("test_Exeption_17_10¥n");
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

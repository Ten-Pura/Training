import java.io.FileReader;

public class JavaAPI_18_01 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data.txt");
        StringBuilder sb = new StringBuilder();
        int input = fr.read();
        while (input != -1) {
            sb.append(input);
            input = fr.read();
        }
        fr.close();
        System.err.println(sb.toString());
    }
}

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaAPI_18_02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data");
        FileReader fr = new FileReader("data.txt");
        int input;
        char output;

        input = fr.read();
        while(input != -1) {
            output = (char)input;
            fw.write(output);
            input = fr.read();
        }

        fw.close();
        fr.close();

    }    
}

import java.io.FileWriter;
import java.io.IOException;

public class Exception_17_8 {
    public static void main(String[] args){
        FileWriter fw = null;

        try {
            fw = new FileWriter("data.txt");
            fw.write("test");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                if(fw!=null){
                    fw.close();
                }
            } catch(IOException e){
                ;
            }
        }
    }
}

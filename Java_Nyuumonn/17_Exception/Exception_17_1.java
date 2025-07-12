import java.io.File;
import java.io.FileWriter;
import java.io.*;

public class Exception_17_1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
        } catch(Exception e) {
            System.out.println("エラーが発生しました。");
        }
    }
}

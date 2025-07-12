public class Quiz_17_1 {
    public static void main(String[] args) {
        try{
            String s = null;
            System.err.println(s.length());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

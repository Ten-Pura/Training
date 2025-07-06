public class Main {
    public static void main(String[] args) {
        String s = args[0];
        if(s.matches(".*")){
            System.out.println("1");
        }
        if(s.matches("A{1}[0-9]{1,2}")){
            System.out.println("2");
        }
        if(s.matches("U{1}[A-Z]{2,4}")){
            System.out.println("3");
        } 

    }
}

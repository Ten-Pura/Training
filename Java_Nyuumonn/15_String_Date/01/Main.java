public class Main {
    public static void main(String[] args) {
        String s1 = "スッキリJava";
        String s2 = args[0];
        String s3 = "java";

        if (s2.equals(s3)) {
            System.out.println("s2とs3は等しい");
        }
        else if (s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とし3はケースを区別しなければ等しい");
        }
        else {
            System.out.println("s2とs3は等しくない");
        }

        System.out.println("s1の長さは" + s1.length() + "です。");

        if (s1.isEmpty()) {
            System.out.println("s1は空文字です。");
        }
    }
}

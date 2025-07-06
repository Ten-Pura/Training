public class Main {
    public static void main(String[] args) {
        Y arr[] = {new A(), new B()}; 
        for (int i = 0; i < arr.length; i++) {
            arr[i].a();
        }
        for (Y e: arr) {
            e.b();
        }
    }
}
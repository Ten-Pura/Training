package calcapp.main;
import calcapp.logic.CalcLogic;

public class Calc {
    public static void main(String[] args) {
        int a = 10; int b = 5;
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.println(total);
        System.out.println(delta);
    }
}
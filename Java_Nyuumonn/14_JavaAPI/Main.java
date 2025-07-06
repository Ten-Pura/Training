public class Main {
    public static void main(String[] args) {
        Account account_01 = new Account(" 4649", 1592);
        Account account_02 = new Account("4649", 2023);
        System.out.println(account_01);
        System.out.println(account_02);
        System.out.println(account_01.equals(account_02));
    }
}

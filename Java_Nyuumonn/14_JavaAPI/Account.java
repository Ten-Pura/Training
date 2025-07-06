import java.lang.String;

public class Account {
    private String accountNumber;
    private int balance;

    Account (String s, int i) {
        this.accountNumber = s.trim();
        this.balance = i;
    }

    public String getAccountNumber() {return this.accountNumber;}
    public void setAccountNumber(String s) {this.accountNumber = s;}

    public int getBalance() {return this.balance;}
    public void setBalance(int i) {this.balance = i;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "¥" + balance + "（口座番号" + accountNumber + "）";
    }

    @Override
    public boolean equals(Object o) {
        boolean flg = false;
        if (o instanceof Account) {
            Account a = (Account) o;
            if (a.toString().equals(this.toString())) {
                flg = true;
            }
        }

        return flg;

    }
}

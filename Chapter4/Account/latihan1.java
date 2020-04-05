
public class latihan1 {
    public static void main(String[] args) {
        Account acct;
        acct = new Account();
        acct.setInitialBalance(250);
        acct.add(20);
        System.out.println("Balance : " + acct.getCurrentBalance());
    }
}
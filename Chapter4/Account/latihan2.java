
public class latihan2 {
    public static void main(String[] args) {
        Account acc1,acc2;
        acc1 = new Account();
        acc2 = new Account();

        acc1.setInitialBalance(300);
        acc2.setInitialBalance(500);

        acc1.setOwnerName("John Doe");
        acc2.setOwnerName("John Doe");

        System.out.println("rekening 1 milik " + acc1.getOwnerName() + " tersisa $" + acc1.getCurrentBalance());
        System.out.println("rekening 2 milik " + acc2.getOwnerName() + " tersisa $" + acc2.getCurrentBalance());
    }
}
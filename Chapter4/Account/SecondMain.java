
public class SecondMain {
    public static void main(String[] args) {
        Bicycle bike;
        Account acct;

       

        bike = new Bicycle();
        bike.setOwnerName("Kanaya");

        acct = new Account("Kanaya", 250);

        acct.add(25.00);
        acct.deduct(50);

        // output
        System.out.println(bike.getOwnerName() + " owns a Bicycle and");
        System.out.println("has $ " + acct.getCurrentBalance() + " left in the bank");
    }
}
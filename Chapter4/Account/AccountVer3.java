
public class AccountVer3 {
    //data members
    private static final double FEE = 0.50;
    private String ownerName;
    private double balance;

    // constructor
    public AccountVer3(String name, double startingBalance){
        ownerName = name;
        balance = startingBalance;
    }

    public void add(double amt){
        balance = balance + amt;
    }
    // potongan tiap transaksi pengurangan saldo
    public void deduct(double amt){
        balance = balance - amt - FEE;
    }
    //return the current balance
    public double getCurrentBalance(){
        return balance;
    }
    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String name){
        ownerName = name;
    }
}
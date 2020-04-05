
public class Account {
    private String ownerName;
    private double balance;

    //constructor
    public Account(String name, double startingBalance){
        ownerName = name;
        balance = startingBalance;
    }

    public void add(double amt){
        balance = balance + amt;
    }
    public void deduct(double amt){
        balance = balance - amt;
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
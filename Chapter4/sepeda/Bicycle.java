
public class Bicycle {
    //Data member
    private String ownerName;

    // Constructor : initialize the data member
    public Bicycle(){
        ownerName = "unknown";
    }
    // returns the name of this bicycle's owner
    public String getOwnerName(){
        return ownerName;
    }
    //Assign the name of this bicycle's owner
    public void setOwnerName(String name){
        ownerName = name;
    }
}
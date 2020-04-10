
public class Ch5AccountVer2 {
    // Data members
    private String ownerName;
    private double balance;

    private boolean active;

    // constructor
    public Ch5AccountVer2(String name, double startingBalance){
        ownerName = name;
        balance = startingBalance;

        setActive(true);
    }

    // tambah saldo
    public void add(double amt){
        // tambah jika nilai amt nya positif, jika tidak lain cerita
        if(isActive() && amt > 0){
            balance = balance + amt;
        }
    }

    // tutup akun , set active to false
    public void close(){
        setActive(false);
    }

    // kurangi saldo
    public void deduct(double amt){
        // kurangi jika nilai amt positif
        if(isActive() && amt > 0){
            double newBalance = balance - amt;
            // jangan kurangi kallo saldo akhir menjadi negatif
            if(newBalance >=0){
                balance = newBalance;
            }
        }
    }
    // memanggil saldo saat ini
    public double getCurrentBalance(){
        return balance;
    }

    //memanggil nama pemilik
    public String getOwnerName(){
        return ownerName;
    }

    // mengecek apakah akun aktif 
    public boolean isActive(){
        return active;
    }

    // mengganti nama pemilik sebuah akun
    public void setOwnerName(String name){
        ownerName = name;
    }

    //mengeset status rekening aktif atau tidak
    public void setActive(boolean state){
        active = state;
    }

}
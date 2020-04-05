import java.text.*;
public class DeductionWithFee {
    // contoh program ini melakukan pengurangan fee sebanyak 3 kal
    // dari akun

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        AccountVer3 acct;

        acct = new AccountVer3("Aisfa Nahla", 50.00);

        acct.deduct(10);
        acct.deduct(10);
        acct.deduct(10);

        System.out.println("owner : " + acct.getOwnerName());
        System.out.println("Bal : $" + df.format(acct.getCurrentBalance()));
    }
}
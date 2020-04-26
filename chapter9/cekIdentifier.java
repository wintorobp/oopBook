import java.util.Scanner;

public class cekIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        String namaVariabel;

        while (true) {
            System.out.print("cek nama  identifier : ");
            namaVariabel = scanner.next();
            if (namaVariabel.equalsIgnoreCase("STOP")) {
                break;
            }
            if (namaVariabel.matches("[a-zA-Z][a-zA-Z0-9_$]*")) {
                System.out.println(namaVariabel+ " termasuk identifier valid");
               
            }else{
                System.out.println(namaVariabel+ " termasuk identifier tidak valid");
            }
        }
    }
}
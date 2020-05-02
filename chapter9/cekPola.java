import java.util.Scanner;

public class cekPola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
       
        int pilihan;
        String namaVariabel, password;

        System.out.println("===================================");
        System.out.println("Program Menu");
        System.out.println("1. Cek Variabel");
        System.out.println("2. Cek Validitas Password");
        System.out.println("===================================");
        
        System.out.print("Pilih Menu(1/2) : ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
            while (true) {
                System.out.print("masukkan nama variabel  : ");
                namaVariabel = scanner.next();
                if (namaVariabel.equalsIgnoreCase("STOP")) {
                    break;
                }
                if (namaVariabel.matches("[a-zA-Z][a-zA-Z0-9_$]*")) {
                    System.out.println("variabel ini VALID");
                    break;
                }else{
                    System.out.println("variabel ini INVALID");
                    System.out.println("variabel harus diawali huruf");
                }
            }
            break;
            case 2:
            while (true) {
                System.out.print("masukkan password  : ");
                password = scanner.next();
                if (password.equalsIgnoreCase("STOP")) {
                    break;
                }
                if (password.matches("[A-Z][a-zA-Z0-9_$]{7}")) {
                    System.out.println("PASSWORD VALID");
                    break;
                }else{
                    System.out.println("\nPASSWORD INVALID");
                    System.out.println("Syarat Password");
                    System.out.println("1. Diawali huruf kapital");
                    System.out.println("2. 8 digit");
                }
            }
        }
    }
}
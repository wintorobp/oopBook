import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        int pilihan,usia;
        String namaDepan,namaBelakang;
        char karakterNama,karakterNamaDepan,karakterNamaBelakang;
        
        System.out.println("===================================");
        System.out.println("Program Menu");
        System.out.println("1. Mencari Kode ASCII dari karakter");
        System.out.println("2. Mencari Karakter dari kode ASCII");
        System.out.println("===================================");
        
        System.out.print("Pilih Menu(1/2) : ");
        pilihan = scanner.nextInt();

        

        switch (pilihan) {
            case 1:
            System.out.print("Nama Depan: ");
            namaDepan = scanner.next();
            System.out.print("Nama Belakang: ");
            namaBelakang = scanner.next();
            karakterNamaDepan = namaDepan.charAt(0);
            karakterNamaBelakang = namaBelakang.charAt(0);
            System.out.println("Nama Depan Saya adalah "+ namaDepan);
            System.out.println("Huruf Pertama Nama Depan : "+namaDepan.charAt(0));
            System.out.println("Kode ASCII dari huruf pertama nama Depan saya : "+(int)karakterNamaDepan);
            break;
            case 2:
            System.out.print("Usia : ");
            usia = scanner.nextInt();
            System.out.println("Usia Saya : "+usia);
            System.out.println("Karakter dengan kode ASCII "+usia+" : "+(char)usia);

        }

        

        


    }
}
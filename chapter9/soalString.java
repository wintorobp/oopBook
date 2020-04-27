import java.util.Scanner;

import org.w3c.dom.UserDataHandler;

public class soalString {
    public static final char kosong =' ';
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        
        String namaLengkap,namaKapital,username,user,password,pass;
        username ="puput";
        password = "0231108402";
        int pilihan, hitungVokal,pjgKarakter,index,jmlKata;
        hitungVokal =0;
        pjgKarakter =0;
        index =0;
        jmlKata =0;

        boolean cek=true;

        char huruf;
        
        System.out.println("===================================");
        System.out.println("Program Menu");
        System.out.println("1. Menghitung panjang karakter");
        System.out.println("2. Menghitung Jumlah Huruf Vokal");
        System.out.println("3. Menghitung Jumlah Kata ");
        System.out.println("4. Mengecek Username ");
        System.out.println("===================================");
        
        System.out.print("Pilih Menu(1/2/3/4) : ");
        pilihan = scanner.nextInt();

        

        switch (pilihan) {
            case 1:
            System.out.print("Nama Lengkap (gunakan huruf kecil) : ");
            namaLengkap = scanner.next();
            namaKapital = namaLengkap.toUpperCase();
            pjgKarakter = namaKapital.length();
            System.out.println("Nama Lengkap Anda : "+namaKapital);
            System.out.println("Panjang Karakter Nama Anda : "+pjgKarakter);
            break;
            case 2:
            System.out.print("Nama Lengkap (gunakan huruf kecil) : ");
            namaLengkap = scanner.next();
            namaKapital = namaLengkap.toUpperCase();
            System.out.println("Nama Lengkap Anda : "+namaKapital);
            for (int i = 0; i < namaKapital.length(); i++) {
                huruf = namaKapital.charAt(i);
                if (huruf == 'A'||
                    huruf == 'I'||
                    huruf == 'U'||
                    huruf == 'E'||
                    huruf == 'O') {
                    hitungVokal++;
                }
            }
            System.out.println("jumlah huruf vokal pada nama anda : "+hitungVokal);
            break;
            case 3:
            System.out.print("Nama Lengkap : ");
            namaLengkap = scanner.next();
            namaKapital = namaLengkap.toUpperCase();
            pjgKarakter = namaKapital.length();

            while (index < pjgKarakter) {
                while (index < pjgKarakter && namaKapital.charAt(index) == kosong){
                    index++;
                }
                while (index < pjgKarakter && namaKapital.charAt(index) != kosong) {
                    index++;
                }
                jmlKata++;
            }
            System.out.println("jumlah kata pada nama anda : "+jmlKata);
            case 4:
           

            while (true) {
                System.out.print("masukkan username(nama depan) : ");
                user = scanner.next();
                System.out.print("masukkan password(npm) : ");
                pass = scanner.next();
                
                if (user.equalsIgnoreCase(username) && pass.equalsIgnoreCase(password)) {
                    System.out.println("Selamat Password dan Username BENAR");
                    break;
                }   
                System.out.println("Username atau Password SALAH");
            }
                    
        }
    }
}
import java.util.Scanner;

public class hitungKarakter {
    private static final char kosong = ' ';
    public static void main(String[] args) {
        String nama;
        int jmlKarakter,pjgKarakter,index,jmlKata;

        jmlKarakter = 0;
        index =0;
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        System.out.print("masukkan nama : ");
        nama = scanner.next();
        pjgKarakter = nama.length();
        jmlKata=0;


        while (index < pjgKarakter){
            while (index < pjgKarakter &&  nama.charAt(index) == kosong) {
                System.out.println("while1 : "+ nama.charAt(index));
                index++;
            }
            while (index < pjgKarakter &&  nama.charAt(index) != kosong) {
                System.out.println("while2 : "+nama.charAt(index));
                index++;
                jmlKarakter++;
            }
            jmlKata++;
        }
        System.out.println("panjang karakter : "+pjgKarakter);
        System.out.println("jumlah huruf pada nama anda = "+jmlKarakter);
        System.out.println("jumlah kata pada nama anda = "+jmlKata);


    }
}
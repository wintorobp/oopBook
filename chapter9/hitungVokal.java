import java.util.Scanner;

public class hitungVokal {
    public static void main(String[] args) {
        String nama, namaKapital;
        int pjgKarakter, htgVokal=0;
        char huruf;

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        System.out.print("masukkan nama : ");
        nama = scanner.next();
        namaKapital = nama.toUpperCase();

        pjgKarakter = nama.length();
        
        for (int i = 0; i < pjgKarakter; i++) {
            huruf = namaKapital.charAt(i);
            if (huruf == 'A'||
                huruf == 'I'||
                huruf == 'O'||
                huruf == 'E'||
                huruf == 'U') {

                    htgVokal++;
                
            } 
        }
        scanner.close();

        System.out.println("panjang namamu : " + pjgKarakter);
        System.out.println("hay " + nama + 
                            ", kamu memiliki " + htgVokal + " huruf vokal");

    }
}
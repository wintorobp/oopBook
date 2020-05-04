import java.util.Scanner;

public class rataUsia {
    public static void main(String[] args) {
        int indexUsia;
        double rerata, jumlah;
        double[] usia;
        rerata =0;
        jumlah =0;
        indexUsia =0;
        Scanner scanner = new Scanner(System.in);
        // String nama[]= new String[3];

        System.out.print("jml mhs : ");
        indexUsia = scanner.nextInt();
        
        usia = new double[indexUsia];
        
        

        for (int i = 0; i < usia.length; i++) {
            System.out.print("usia ke-"+(i+1)+": ");
            usia[i] = scanner.nextDouble();
            jumlah += usia[i];
        }
        rerata = jumlah/3;
        System.out.println("rata-rata usia : "+rerata);

        System.out.format("%3s %5s","No","Usia\n");
        for (int j = 0; j < indexUsia; j++) {
            
            System.out.format("%3d", j+1);
            System.out.format("%5.0f\n",usia[j]);
        }
        

        scanner.close();
    }
}
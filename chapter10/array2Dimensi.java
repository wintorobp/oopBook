import java.util.Scanner;

public class array2Dimensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum, average;
        sum=0;
        average=0;
        double[][] payScaleTable = {
            {10.50,12.00,14.50,16.75,18.00},
            {20.50,22.25,24.00,26.25,28.00},
            {34.00,36.50,38.00,40.35,43.00},
            {50.00,60.00,70.00,80.00,99.99}
        };
        System.out.format("%7d %5d %5d %5d %5d", 0,1,2,3,4);
        System.out.print("\n");
        for (int i = 0; i < payScaleTable.length; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < payScaleTable[i].length; j++) {
                System.out.format("%5.2f ",payScaleTable[i][j]);
                if (j==4) {
                    System.out.println("\n");
                }
                
            }
        }

        for (int j = 0; j < 5; j++) {
            sum += payScaleTable[2][j];
        }
        average = sum/5;
        System.out.println("rata-rata gaji grade 2 : "+average);


        //selisih gaji tiap grade
        double difference;
        for (int i = 0; i < payScaleTable.length; i++) {
            difference = payScaleTable[i][4] - payScaleTable[i][0];
            System.out.println("selisih gaji grade"+i+"= "+difference);
        }

        // tambah gaji tiap grade
        
        for (int i = 0; i < payScaleTable.length; i++) {
            for (int j = 0; j < payScaleTable[i].length; j++) {
                payScaleTable[i][j] += 1.50;
            }
            
        }
        
        System.out.println("\nupdate gaji");
        System.out.println("=====================");
        System.out.format("%5d %5d %5d %5d %5d", 0,1,2,3,4);
        System.out.print("\n");

        for (double[] row : payScaleTable) {
            for (double pay : row) {
                System.out.format("%5.2f ",pay);
            }
            System.out.println(" ");
            
        }
        // for (int i = 0; i < payScaleTable.length; i++) {
        //     System.out.print(i+1+" ");
        //     for (int j = 0; j < payScaleTable[i].length; j++) {
        //         System.out.format("%5.2f ",payScaleTable[i][j]);
        //         if (j==4) {
        //             System.out.println("\n");
        //         }
                
        //     }
        // }

        double rataGaji,sumGaji;
        rataGaji=0;
        sumGaji=0;

        for (double[] gaji : payScaleTable) {
            for (double gj : gaji) {
                sumGaji += gj;
            }
            
        }
        System.out.println("total gaji = "+sumGaji);
        rataGaji = sumGaji/20;
        System.out.println("rataGaji : "+rataGaji);

        double maxGaji;
        maxGaji = payScaleTable[0][0];

        for (int i = 0; i < payScaleTable.length; i++) {
            for (int j = 0; j < payScaleTable[i].length; j++) {
                if (payScaleTable[i][j] > maxGaji) {
                    maxGaji = payScaleTable[i][j];
                }
            }
        }
        System.out.println("Max Gaji : "+maxGaji);
        

    }
}
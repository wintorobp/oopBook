import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        int sum;
        sum =0;
        Scanner scanner = new Scanner(System.in);        
        double[] number = new double[25];

        for (int i = 0; i < number.length; i++) {
            System.out.print("number"+(i+1)+": ");
            number[i] = scanner.nextDouble();
            sum += number[i];
        }
        System.out.println("jumlah total : "+ sum);

        scanner.close();
    }
}
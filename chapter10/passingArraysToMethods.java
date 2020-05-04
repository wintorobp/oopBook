import java.util.Scanner;

public class passingArraysToMethods {
    private Scanner scanner;
    
    public static void main(String[] args) {
        passingArraysToMethods test;
        test = new passingArraysToMethods();
        test.testArrayPassing();

    }

    public passingArraysToMethods(){
        scanner = new Scanner(System.in);
    }

    public void testArrayPassing() {
        test1();

        test2();
    }

    private void test1() {
        double[] arrayOne, arrayTwo;
        int minOne,minTwo,maxOne,maxTwo;
        arrayOne = new double[5];
        arrayTwo = new double[5];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (i+1);
            arrayTwo[i] = (i+6);
    }

    for (double d : arrayOne) {
        System.out.println(d);
    }
    System.out.println("\n");

    for (double e : arrayTwo) {
        System.out.println(e);
    }

    minOne = searchMinimum(arrayOne);
    minTwo = searchMinimum(arrayTwo);
    maxOne = searchMaximum(arrayOne);
    maxTwo = searchMaximum(arrayTwo);

    System.out.println("nilai terkeci dari array 1 : "+arrayOne[minOne]);
    System.out.println("nilai terkecil di array 2 : "+arrayTwo[minTwo]);
    System.out.println("nilai terbesar arrayOne : "+arrayOne[maxOne]);
    System.out.println("nilai terbesar arrayTwo : "+arrayTwo[maxTwo]);

    }

    private void test2() {
        double[] arrayOne, arrayTwo;
        arrayOne = readDoubles();
        arrayTwo = readDoubles();

    }

    for (double d : arrayOne) {
        System.out.println(d);
    }
    System.out.println("\n");

    for (double e : arrayTwo) {
        System.out.println(e);
    }

    

    

    public int searchMinimum(double[] number){
        int indexOfMinimum =0;

        for (int i = 0; i < number.length; i++) {
            if (number[i] < number[indexOfMinimum]) {
                indexOfMinimum = i;
            }
        }
        return indexOfMinimum;
    }

    public int searchMaximum(double[] number){
        int indexOfMaximum=0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > number[indexOfMaximum]) {
                indexOfMaximum = i;
            }
        }
        return indexOfMaximum;
    }

    public double[] readDoubles(){
        double[] number;
        System.out.println("berapa banyak inputan ?");
        int N = scanner.nextInt();
        number = new double[N];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Number"+i+": ");
            number[i] = scanner.nextInt();
        }
        return number;

    }

    

}
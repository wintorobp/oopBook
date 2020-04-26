import java.util.Scanner;

public class hitungUnila {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hitungUnila=0;

        String kata;

        while (true) {
            System.out.print("masukkan kata selanjutnya : ");
            kata = scanner.next();
            if (kata.equals("STOP")) {
                break;
            }else if (kata.equalsIgnoreCase("unila")) {
                hitungUnila++;
            }
        }
        System.out.println("kata 'UNILA' diketik sebanyak : "+ hitungUnila + "kali");
    }
}
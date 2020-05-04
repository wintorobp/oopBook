import java.util.Scanner;

public class stringToCharForeach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama ="Puput Budi Wintoro";
        char[] charNama = nama.toCharArray();

        for (char c : charNama) {
            System.out.println(c);
        }

    scanner.close();
    }
}
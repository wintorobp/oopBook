import java.util.*;
public class Ch2Monogram {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter(System.getProperty("line.separator"));
        System.out.print("masukkan nama anda lengkap : (First, Middle,Last) : ");
        name = scanner.next();
        System.out.println("Nama anda : " + name);
    }
}



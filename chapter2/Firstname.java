import java.util.*;

public class Firstname {
    public static void main(String[] args) {
        String firstname, lastname;
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nama depan : ");
        firstname = scanner.next();
        lastname = scanner.next();
        System.out.println("selamat pagi : " + firstname); 
    }
}
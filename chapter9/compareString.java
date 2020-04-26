import java.util.Scanner;

public class compareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1,str2;

        System.out.print("kata pertama : ");
        str1 = scanner.next();
        System.out.print("kata kedua : ");
        str2 = scanner.next();

        System.out.println("kata '"+str1 + "' compare to kata'" +str2+"' : "+str1.compareTo(str2));
    }
}
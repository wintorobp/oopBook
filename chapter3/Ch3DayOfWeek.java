import java.text.*;
import java.util.*;
public class Ch3DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tanggal,bulan,tahun;
        

        System.out.print("tahun (yyyy): ");
        tahun = scanner.nextInt();

        System.out.print("bulan (1-12): ");
        bulan = scanner.nextInt();

        System.out.print("Tanggal (1-31): ");
        tanggal = scanner.nextInt();

        GregorianCalendar cal = new GregorianCalendar(tahun, bulan-1, tanggal);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        System.out.println("");
        System.out.println("Day of Week : "+sdf.format(cal.getTime()));


    }
}
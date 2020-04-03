import java.util.*;
import java.text.*;

public class ManipulasiTanggal {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;

        today = new Date();
        sdf = new SimpleDateFormat("MMMMM/dd/yyyy/HH/a/ss");

        System.out.println(sdf.format(today));
    }
}
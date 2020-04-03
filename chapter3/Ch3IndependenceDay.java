import java.util.*;
import java.text.*;
public class Ch3IndependenceDay {
    public static void main(String[] args) {
        GregorianCalendar hariMerdeka = new GregorianCalendar(1945, Calendar.AUGUST, 17);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");

        System.out.println("hari kemerdekaan Indonesia : "+ sdf.format(hariMerdeka.getTime()));
    }
}
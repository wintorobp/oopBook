import java.util.*;
public class Ch3TestCalendar {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        System.out.println(cal.getTime());
        System.out.println("");

        System.out.println("TAHUN:          "+ cal.get(Calendar.YEAR));
        System.out.println("BULAN:          "+ cal.get(Calendar.MONTH));
        System.out.println("TANGGAL:        "+ cal.get(Calendar.DATE));
        System.out.println("Day of Month:   "+ cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Year:    "+ cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of Week:    "+ cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Week of Year:   "+ cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of Month   "+ cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("AM_PM:          "+ cal.get(Calendar.AM_PM));
        System.out.println("HOUR:           "+ cal.get(Calendar.HOUR));
        System.out.println("HOUR OF DAY:    "+ cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE:         "+ cal.get(Calendar.MINUTE));
    }
}
import java.util.*; //for Date
import java.text.*; //for simpledateformat
public class Ch2DateDisplay {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat simpleDF1, simpleDF2;

        today = new Date();
        simpleDF1 = new SimpleDateFormat();
        simpleDF2 = new SimpleDateFormat("EEEE MMMM dd, yyyy");

        //tampilan tanggal biasa
        System.out.println(simpleDF1.format(today));
        System.out.println(simpleDF2.format(today));


    }
}
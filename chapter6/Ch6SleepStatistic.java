import java.text.*;
import java.util.*;
public class Ch6SleepStatistic{
    private Scanner scanner;

    public static void main(String[] args) {
        Ch6SleepStatistic prog= new Ch6SleepStatistic();
        prog.start();
    }
    public Ch6SleepStatistic(){
        scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
    }
    public void start(){
        double sleepHour, sum=0;
        int cnt = 0;
        //masukkan nama asrama
        System.out.print("Dorm Name : ");
        String dorm = scanner.next();

        // loop : ambil rata tara tidur setiap penghuni
        // sampai 0 di enter
        sleepHour = getDouble("masukkan sleep hour (0 - to stop: )");

        while(sleepHour !=0){
            sum += sleepHour;
            cnt++;

            sleepHour = getDouble("masukkan sleep hour(0-to stop: )");
        }
        if (cnt==0){
            System.out.print("No Data Entered");
        }else{
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Rata-rata waktu tidur untuk " +
                                dorm + "is \n\n     " +
                                df.format(sum/cnt) + "hours.");
            
        }  
    }
    private double getDouble(String message){
        double result;

        System.out.print(message);
        result = scanner.nextDouble();
        return result;
    }  
}
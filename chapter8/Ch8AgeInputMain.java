import java.util.*;


public class Ch8AgeInputMain {
    public static void main(String[] args) {
        GregorianCalendar today;
        int age, thisYear, bornYr;
        String answer;

        Scanner scanner = new Scanner(System.in);

        AgeInputVer1 input = new AgeInputVer1();
        age = input.getAge("How old are you ?");

        today = new GregorianCalendar();
        thisYear = today.get(Calendar.YEAR);
        bornYr = thisYear - age;
        
        System.out.println("Already had your birthday this year? (Y/N)");
        answer = scanner.next();

        if (answer.equals("N")) {
            bornYr--;
        }
        System.out.println("\n You are born in "+ bornYr);
        scanner.close();
    }
}
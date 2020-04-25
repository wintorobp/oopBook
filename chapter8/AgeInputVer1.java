import java.util.*;
public class AgeInputVer1 {
    private static final String DEFAULT_MESSAGE="Your Age : ";
    private Scanner scanner;

    public AgeInputVer1(){
        scanner = new Scanner(System.in);
    }

    public int getAge(){
        return getAge(DEFAULT_MESSAGE);
    }
    public int getAge(String prompt){
        System.out.println(prompt);
        try {
            int age = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("coba lagi");
            
        }
       

        
    }

}
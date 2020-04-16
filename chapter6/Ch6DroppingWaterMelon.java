import java.util.*;
public class Ch6DroppingWaterMelon {
    public static void main(String[] args) {
        double initialHeight, position, touchtime;

        Scanner scanner = new Scanner(System.in);

        System.out.print("initial Height : ");
        initialHeight = scanner.nextDouble();

        touchtime = Math.sqrt(initialHeight/16);
        touchtime = Math.round(touchtime * 10000.0) /10000.0;

        System.out.println("\n\n Time  t | Posisition at Time t \n");

        for(int time=0; time<touchtime; time++){
            position = -16.0 * time * time + initialHeight;
            System.out.print("  "+ time);
            System.out.println("            " + position);
        }
        
        // print the last second
        System.out.println( "  " + touchtime + "     0.00");

    }
}
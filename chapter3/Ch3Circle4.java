import java.text.*;
import java.util.*;
public class Ch3Circle4 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final String TAB = "\t";
        final String NEWLINE = "\n";

        double radius, area, circumference;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("Enter Radius : ");
        radius = scanner.nextDouble();

        //compute
        area = PI * radius * radius;
        circumference = 2 * PI * radius;

        System.out.println(
            "Given Radius   :" + TAB + df.format(radius) + NEWLINE +
            "Area           :" + TAB + df.format(area) + NEWLINE +
            "Circumference  :" + TAB + df.format(circumference)
        );


    }
}
import java.text.*;
public class Ch3Circle {
    public static void main(String[] args) {

        final double PI = 3.14159;
        double radius, luas, keliling;
        DecimalFormat df = new DecimalFormat();

        radius = 2.35;

        luas = PI * radius * radius;
        keliling = 2 * PI * radius;

        System.out.println("radius : " + radius);
        System.out.println("luas : " + df.format(luas));
        System.out.println("keliling : " + df.format(keliling));


    }
}
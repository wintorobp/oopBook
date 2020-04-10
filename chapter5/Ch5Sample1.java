import java.util.*;
public class Ch5Sample1 {
    public static void main(String[] args) {
        double radius, circumference, area;
        
        Ch5Circle circle;
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan jari-jari : ");
        radius = scanner.nextDouble();

        circle = new Ch5Circle(radius);

        circumference = circle.getCircumference();
        area = circle.getArea();

        System.out.println("jari jari : " + radius);
        System.out.println("keliling : " + circumference);
        System.out.println("Luas : " + area);
    }
}
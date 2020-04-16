
public class CallFraction {
    public static void main(String[] args) {
        Fraction f1, f2, f3;

        f1 = new Fraction(1,2);
        f2 = new Fraction(1,4);

        f3 = f1.add(f2);

        System.out.println("jumlah dari " + f1.toString() + "AND" + f2.toString()+ "adalah = " + f3.toString());
    }
}
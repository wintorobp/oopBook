
public class CallFraction {
    public static void main(String[] args) {
        Fraction frac1, frac2;

        frac1 = new Fraction();
        frac1.setNumerator(6);
        frac1.setDenominator(8);

        frac2 = frac1;

        if(frac1==frac2){
            System.out.println("frac1 dan frac2 mengarah ke objek yg sama");
        }else{
            System.out.println("frac1 dan frac2 mengarah ke objek yg berbeda");
        }

        frac2 = new Fraction();
        frac2.setNumerator(3);
        frac2.setDenominator(4);

        if(frac2.equals(frac1)){
            System.out.println("frac1 dan frac2 bernilai sama");
        }else{
            System.out.println("frac1 dan frac2 nilainya berbeda");
        }

        System.out.println("nilai frac1 = " + frac1.toString());
        System.out.println("nilai frac2 = " + frac2.toString());

        

    }
}
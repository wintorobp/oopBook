
public class Fraction {
    //data member
    private int numerator;
    private int denominator;

    //constructor and method
    public Fraction(){
        numerator = 0;
        denominator = 1;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int num){
        numerator = num;
    }

    public void setDenominator(int denom){
        denominator = denom;
    }

    public String toString(){
        return getNumerator() + "/" + getDenominator();
    }

    public boolean equals(Fraction number){
        return (numerator == number.getNumerator() && denominator==number.getDenominator());
    }


    
}
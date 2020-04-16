package com.tutorial;


public class Fraction {
    //data member
    private int numerator;
    private int denominator;

    /**
* Returns the sum of this Fraction
* and the parameter frac. The sum
* returned is NOT simplified.
*
* @param frac the Fraction to add to this
*
Fraction
*
* @return the sum of this and frac
*/
    //constructor and method
    public Fraction(int num, int denom){
        numerator = num;
        denominator = denom;
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
        if(denom ==0){
            //fatal eror
            System.err.println("FATAL ERROR");
            System.exit(1);
        }
        denominator = denom;
    }

    public String toString(){
        return getNumerator() + "/" + getDenominator();
    }

    public boolean equals(Fraction number){
        return (numerator == number.getNumerator() && denominator==number.getDenominator());
    }

    public int gcd(int m, int n){
        int r = n % m;
        while(r!=0){
            n=m;
            m=r;
            r = n % m;
        }
        return m;
    }

    public Fraction simplify(){
        int num = getNumerator();
        int denom = getDenominator();
        int gcd = gcd(num, denom);

        Fraction simp = new Fraction(num/gcd, denom/gcd);
        return simp;
    }

    public Fraction add(Fraction frac){
        int a,b,c,d;

        Fraction sum;

        a=this.getNumerator();
        b=this.getDenominator();

        c = frac.getNumerator();
        d = frac.getDenominator();

        sum = new Fraction(a*d + b*c, b*d);

        return sum;
    }

    public Fraction divide(Fraction frac){
        int a,b,c,d;
        Fraction quotient;

        a=this.getNumerator();
        b=this.getDenominator();

        c = frac.getNumerator();
        d = frac.getDenominator();

        quotient = new Fraction(a*d, b*c);
        return quotient; 
    }

    public Fraction multiply(Fraction frac){
        int a,b,c,d;
        Fraction product;

        a=this.getNumerator();
        b=this.getDenominator();

        c = frac.getNumerator();
        d = frac.getDenominator();

        product = new Fraction(a*c, b*d);
        return product;

    }

    public Fraction subsract(Fraction frac){
        int a,b,c,d;
        Fraction diff;

        a=this.getNumerator();
        b=this.getDenominator();

        c = frac.getNumerator();
        d = frac.getDenominator();

        diff = new Fraction(a*d - b*c, b*d);
        return diff;
    }


    
}
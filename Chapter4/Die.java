import java.util.Random;
public class Die {
    // data member

    // the largest number on a die
    private static final int MAX_NUMBER = 6;

    // jumlah kematian minimal
    private static final int MIN_NUMBER = 1;

    // to represent a die that is not yet rolled
    private static final int NO_NUMBER =0;

    private int number;
    private Random random;

    // constructor
    public Die(){
        random = new Random();
        number = NO_NUMBER;
    }
    // rolls the die
    public void roll(){
        number = random.nextInt(MAX_NUMBER-MIN_NUMBER+1) + MIN_NUMBER;
    }
    //return the number on this die
    public int getNumber(){
        return number;
    }
}
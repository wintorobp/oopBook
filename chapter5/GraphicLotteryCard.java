import java.awt.*;

public class GraphicLotteryCard {
    // data members

    // lebar kartu
    public static final int WIDTH = 30;
    //tinggi kartu
    public static final int HEIGHT = 40;
    //angka tertinggi dari kartu
    private static final int MAX_NUMBER = 15;
    //angka terkecil dari kartu
    private static final int MIN_NUMBER = 10;
    //angka pada kartu sebelum di draw
    private static final int NO_NUMBER = 0;
    // warna tertinggi untuk kartu
    private static final int MAX_COLOR = 3;
    //warna terrendah dari kartu 
    private static final int MIN_COLOR = 1;
    // warna kartu sebelum di draw
    private static final int NO_COLOR = 0;
    //angka kartu terpilih
    private int number;
    //warna kartu terpilih
    private int color;

    // constructor 
    public GraphicLotteryCard(){
        spin();
    }
    // spin the card
    public void spin(){
        number = (int) (Math.floor(Math.random() * (MAX_NUMBER - MIN_NUMBER + 1))
                                    + MIN_NUMBER);
                                    
       color = (int) (Math.floor(Math.random() * (MAX_COLOR - MIN_COLOR + 1))
                                    + MIN_COLOR);

    }

    // return the number on this card
    public int getNumber(){
        return number;
    }

    // return the color on this card
    public int getColor(){
        return color;
    }
    
    public void draw(Graphics g, int xOrigin, int yOrigin){
        switch (color) {
            case 1: g.setColor(Color.RED);    
                    break;
            case 2: g.setColor(Color.GREEN);    
                    break;
            case 3: g.setColor(Color.BLUE);    
                    break;
            default:
                    break;
        }
        g.fillRect(xOrigin, yOrigin, WIDTH, HEIGHT);
        g.setColor(Color.WHITE);
        g.drawString("" + number, xOrigin + WIDTH/4, yOrigin + HEIGHT/2);
    }

   



}
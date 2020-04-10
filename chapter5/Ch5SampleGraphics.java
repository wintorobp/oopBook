import javax.swing.*;
import java.awt.*;

public class Ch5SampleGraphics {
    public static void main(String[] args) {
        JFrame win;
        Container contentPane;
        Graphics g;

        win = new JFrame("My First Rectangle");
        win.setSize(300,200);   
        win.setLocation(100,100);
        win.setVisible(true);

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = win.getContentPane();
        g = contentPane.getGraphics();

        try {Thread.sleep(200);} catch (Exception e) {}

        g.drawRect(150,50,80,30);
    }
}
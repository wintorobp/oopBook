import javax.swing.*;
import java.awt.*;

public class Ch5SampleGraphics2 {
    public static void main(String[] args) {
        JFrame win;
        Container contentPane;
        Graphics g;

        win = new JFrame("Rectangles");
        win.setSize(300,200);
        win.setLocation(200,200);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = win.getContentPane();
        contentPane.setBackground(Color.LIGHT_GRAY);

        g = contentPane.getGraphics();
        try {Thread.sleep(200);} catch (Exception e) {}
        
        g.setColor(Color.BLUE);
        g.drawRect(50,50,100,30);

        g.setColor(Color.RED);

        
        g.fillRect(175,50,100,30);

        

    }
}
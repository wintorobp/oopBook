import javax.swing.*;
import java.awt.*;
public class Ch5RoomWinner {
    public static void main(String[] args) {
        JFrame win;
        Container contentPane;
        Graphics g;

        GraphicLotteryCard one, two, three;

        win = new JFrame("Room Winner");
        win.setSize(300,200);
        win.setLocation(100,100);
        win.setVisible(true);

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = win.getContentPane();
        contentPane.setBackground(Color.WHITE);

        g = contentPane.getGraphics();

        one = new GraphicLotteryCard();
        two = new GraphicLotteryCard();
        three = new GraphicLotteryCard();

        one.spin();
        two.spin();
        three.spin();

        try {Thread.sleep(200);} catch (Exception e) {}

        one.draw(g, 10,20);
        two.draw(g, 50,20);
        three.draw(g, 90,20);

    }
}
/*
    Introduction to OOP with Java (5th Ed), McGraw-Hill

    Wu/Otani

    Chapter 5 Sample Program: Draw a square on a frame
                              window's content pane

    File: Ch5SampleGraphics.java

*/

import javax.swing.*; //for JFrame
import java.awt.*; //for Graphics and Container

class Ch5SampleGraphics {

    public static void main( String[] args ) {

        JFrame    win;
        Container contentPane;
        Graphics  g;

        win = new JFrame("My First Rectangle");
        win.setSize(300, 200);
        win.setLocation(100,100);
        win.setVisible(true);

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       //see Hints, Tips, & Pitfalls box at beginning of Chapter 2

        contentPane = win.getContentPane();
        g = contentPane.getGraphics();

//    NOTE:
//          Depending on the speed of your PC, you may
//          have to include the following 'try' statement
//          to put a delay before
//          drawing the rectangle. 1000 == 1 second,
//          so 200 means 0.2 seconds delay.
//
//          If you do not see a rectangle drawn in the window,
//          include the following 'try' statement. Experiment
//          by increasing and decreasing the value of 200
//          and see the effect.

        try {Thread.sleep(200);} catch (Exception e) {}

        g.drawRect(50,50,100,30);

    }
}
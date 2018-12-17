package lab5_1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test extends JFrame {

    public void paint(Graphics g) {

        super.paint(g);

        Shape[] mass = new Shape[20];

        for(int i = 0; i < 20; i++){

            final Random random = new Random();

            switch(random.nextInt(2)){
                case 0:
                    mass[i] = new Rectangle("#"+String.valueOf(random.nextInt(80) + 10)+String.valueOf(random.nextInt(80) + 10)+String.valueOf(random.nextInt(80) + 10), random.nextInt(600), random.nextInt(600), random.nextInt(100), random.nextInt(100));
                    break;
                case 1:
                    mass[i] = new Circle("#"+String.valueOf(random.nextInt(80) + 10)+String.valueOf(random.nextInt(80) + 10)+String.valueOf(random.nextInt(80) + 10), random.nextInt(600), random.nextInt(600), random.nextInt(100));
                    break;
            }

            mass[i].draw(g);

        }

    }

    public static void main(String[] args) {
        new Test();


    }

    public Test()
    {
        super("Test");

        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(800, 600);
        setVisible(true);
    }
}
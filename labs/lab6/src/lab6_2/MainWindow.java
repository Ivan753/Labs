package lab6_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindow extends JFrame {



    public MainWindow(){

        super("This is real competition");
        setSize(400,400);
        setLayout(new BorderLayout());


        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();
        JPanel jPanel4 = new JPanel();
        JPanel jPanel5 = new JPanel();

        jPanel1.setBounds(0, 0, 400, 100);
        jPanel5.setSize(400, 100);
        jPanel2.setSize(100, 200);
        jPanel2.setSize(100, 200);
        jPanel3.setSize(100, 200);

        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel3.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel4.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel5.setBorder(BorderFactory.createLineBorder(Color.black));

        jPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(MainWindow.this,
                        "<html><h2>Добро пожаловать</h2><i>на Север</i>");
            }

        });

        jPanel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(MainWindow.this,
                        "<html><h2>Добро пожаловать</h2><i>в Джидда</i>");
            }
        });

        jPanel3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                    JOptionPane.showMessageDialog(MainWindow.this,
                            "<html><h2>Добро пожаловать</h2><i>в Центр</i>");

            }
        });

        jPanel4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                    JOptionPane.showMessageDialog(MainWindow.this,
                            "<html><h2>Добро пожаловать</h2><i>в Дархане</i>");

            }
        });

        jPanel5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(MainWindow.this,
                            "<html><h2>Добро пожаловать</h2><i>в Абха</i>");

            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jPanel1, BorderLayout.NORTH);
        add(jPanel2, BorderLayout.WEST);
        add(jPanel3, BorderLayout.CENTER);
        add(jPanel4, BorderLayout.EAST);
        add(jPanel5, BorderLayout.SOUTH);



    }

    public static void main(String[]args)
    {
        new MainWindow().setVisible(true);
    }

}


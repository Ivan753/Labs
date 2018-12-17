package lab6_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow extends JFrame{


    JTextArea jta = new JTextArea();

    JMenuBar menuBar = new JMenuBar();

    JMenu menu_item1 = new JMenu("Цвет");
    JMenu menu_item2 = new JMenu("Шрифт");

    JMenuItem menu_item1_1 = new JMenuItem("Синий");
    JMenuItem menu_item1_2 = new JMenuItem("Красный");
    JMenuItem menu_item1_3 = new JMenuItem("Черный");

    JMenuItem menu_item2_1 = new JMenuItem("Times New Roman");
    JMenuItem menu_item2_2 = new JMenuItem("MS Sans Serif");
    JMenuItem menu_item2_3 = new JMenuItem("Courier New");


    public MainWindow(){

        super("Task");
        setSize(300,220);
        setLayout(null);

        menuBar.add(menu_item1);
        menuBar.add(menu_item2);

        menu_item1.add(menu_item1_1);
        menu_item1.add(menu_item1_2);
        menu_item1.add(menu_item1_3);

        menu_item2.add(menu_item2_1);
        menu_item2.add(menu_item2_2);
        menu_item2.add(menu_item2_3);



        add(jta);
        setJMenuBar(menuBar);

        jta.setBounds(10, 10, 200, 100);

        menu_item1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jta.setForeground(Color.blue);
            }
        });
        menu_item1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jta.setForeground(Color.red);
            }
        });
        menu_item1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jta.setForeground(Color.black);
            }
        });

        menu_item2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jta.setFont(new Font("Times New Roman", 400, 14));
            }
        });
        menu_item2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jta.setFont(new Font("MS Sans Serif", 400, 14));
            }
        });
        menu_item2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                jta.setFont(new Font("Courier New", 400, 14));
            }
        });



    }

    public static void main(String[]args)
    {
        new MainWindow().setVisible(true);
    }


}

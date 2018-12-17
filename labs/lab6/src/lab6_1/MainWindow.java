package lab6_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private static int number;

    private static int counter;

    JButton but1 = new JButton("Send");
    JTextField jta = new JTextField (10);
    JLabel result = new JLabel("");
    JLabel fl = new JLabel("");


    public MainWindow(){

        super("This is real competition");
        setSize(330,160);
        setLayout(null);
        add(but1);
        add(jta);
        add(result);
        add(fl);

        jta.setBounds(10, 10, 100, 20);
        result.setBounds(120,10,200,20);
        fl.setBounds(10,100,200,20);
        but1.setBounds(10,50,100,20);

        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                counter++;

                if(counter > 3) return;


                if((jta.getText().trim()).equals("")){
                    result.setText("Inter the value");
                    return;
                }

                int num = Integer.parseInt(jta.getText().trim());

                if(num == number) {

                    result.setText("You're winner!");
                    fl.setText("Game Over");

                }else{

                    if(counter < 3) {

                        result.setText("Incorrect answer! Try again");

                        if(num > number){
                            fl.setText("less");
                        }else{
                            fl.setText("more");
                        }

                    }else{
                        result.setText("Lost, lost, lost...");
                        fl.setText("Game Over");
                    }

                }

            }
        });



    }

    public static void main(String[]args)
    {
        number = (int) Math.round(Math.random()*20);
        new MainWindow().setVisible(true);
    }

}


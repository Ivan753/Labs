package pr4;

import java.awt.event.*;
import javax.swing.*;

public class MainWindow extends JFrame {

    private static int score_1;
    private static int score_2;

    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");

    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScouter = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    public MainWindow(){

        super("This is real competition");
        setSize(330,160);
        setLayout(null);
        add(but1);
        add(but2);
        add(result);
        add(lastScouter);
        add(winner);

        but1.setBounds(10,10,100,20);
        but2.setBounds(10,40,100,20);

        result.setBounds(120,10,200,20);
        lastScouter.setBounds(120,40,200,20);
        winner.setBounds(120,80,200,20);

        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                score_1++;

                result.setText("Result: "+score_1+" X "+score_2);
                lastScouter.setText("Last Scorer: AC Milan");
                winner.setText("Winner: "+(score_1>score_2?"AC Milan":"Real Madrid"));
            }
        });

        but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                score_2++;

                result.setText("Result: "+score_1+" X "+score_2);
                lastScouter.setText("Last Scorer: Real Madrid");
                winner.setText("Winner: "+(score_2>score_1?"Real Madrid":"AC Milan"));
            }
        });


    }

    public static void main(String[]args)
    {
        new MainWindow().setVisible(true);
    }

}

package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcscherm {
    private JButton knop;
    private JTextField getal1;
    private JTextField getal2;
    private JLabel uitkomst;
    public JPanel mainview;

    public Calcscherm() {
        knop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int waarde1 = Integer.parseInt(getal1.getText());
                int waarde2 = Integer.parseInt(getal2.getText());

                int vermenigvuldiging = waarde1*waarde2;

                uitkomst.setText(""+vermenigvuldiging);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("rekenmachine");
        frame.setContentPane(new Calcscherm().mainview);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

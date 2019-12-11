package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainform{
    public JPanel hoofdscherm;
    private JButton button1;


    public mainform() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JFrame frame = new JFrame("Virtual Fridge login");
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setPreferredSize(new Dimension(450, 812));
                frame.setContentPane(new Loginscherm().mainview);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BeginScherm");
        frame.setPreferredSize(new Dimension(375, 812));
        frame.setContentPane(new mainform().hoofdscherm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


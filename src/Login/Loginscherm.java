package Login;


import Login.Dashboard.DashboardPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loginscherm {
    public JPanel mainview;
    public JTextField gebruikersnaam;
    private JButton inlogKnop;
    private JButton registreerKnop;
    private JPasswordField passwordField1;


    public Loginscherm() {

        inlogKnop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // wanneer er op inloggen wordt gedrukt

//                String username = String.valueOf(gebruikersnaam.getText());
//                System.out.println(username);

                JFrame frame = new JFrame("Dashboard");
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                frame.setPreferredSize(new Dimension(450, 812));
                frame.setContentPane(new DashboardPage().mainview);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    // dit zorgt ervoor dat het programma gaat runnen
    public static void main(String[] args) {

        JFrame frame = new JFrame("BeginScherm");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setPreferredSize(new Dimension(450, 812));
        frame.setContentPane(new mainform().hoofdscherm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}



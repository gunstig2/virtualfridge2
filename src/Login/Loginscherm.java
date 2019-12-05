package Login;

import Calculator.Calcscherm;
import Login.Dashboard.DashboardScherm;
import sun.rmi.runtime.Log;

import javax.swing.*;
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

                String username = String.valueOf(gebruikersnaam.getText());

                System.out.println(username);

                JFrame frame = new JFrame("Dashboard");
                frame.setContentPane(new DashboardScherm().mainview);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);


            }
        });
    }

    // dit zorgt ervoor dat het programma gaat runnen
    public static void main(String[] args) {

        JFrame frame = new JFrame("BeginScherm");
        frame.setContentPane(new mainform().hoofdscherm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}



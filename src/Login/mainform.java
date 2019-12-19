package Login;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

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

    public static void connect(){

        try {
            String host = "jdbc:mysql://localhost:8080/Challenge";
            String uName = "root";
            String uPass = "";
            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stat = con.createStatement();
            String sql = "select * from Gebruiker";
            ResultSet rs = stat.executeQuery(sql);

            while ( rs.next()) {
//                int id_col = rs.getInt("Gebruikerscode");
                String first_name = rs.getString("Gebruikersnaam");
                String last_name = rs.getString("Email");
                String job = rs.getString("Wachtwoord");

                String p = first_name + " " + last_name + " " + job;
                System.out.println(p);
            }

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }

    }

    public static void main(String[] args) {
        connect();
    }

}


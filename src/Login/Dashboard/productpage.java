package Login.Dashboard;

import javax.swing.*;
import java.awt.*;

public class productpage {

    private JPanel panel1;
    private JTextField textField1;
    private JButton toevoegenButton;

    public static void main(String[] args) {

        JFrame frame = new JFrame("ProductScherm");
        frame.setContentPane(new productpage().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setPreferredSize(new Dimension(450, 812));

    }

}
package Login.Dashboard;

import javax.swing.*;
import java.awt.*;

public class DashboardScherm{

    public JPanel mainview;
    private JButton button1;

    public static void main(String[] args) {

        JFrame frame = new JFrame("BeginScherm");
        frame.setContentPane(new DashboardScherm().mainview);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setPreferredSize(new Dimension(450, 812));
    }
}


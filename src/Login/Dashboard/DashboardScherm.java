package Login.Dashboard;

import javax.swing.*;

public class DashboardScherm{

    public JPanel mainview;

    public static void main(String[] args) {
        JFrame frame = new JFrame("BeginScherm");
        frame.setContentPane(new DashboardScherm().mainview);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


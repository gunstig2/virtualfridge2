package Login.Dashboard;

import javax.swing.*;
import java.awt.*;

public class koelkast {

    public static void main(String[] args) {

        JFrame frame = new JFrame("koelkast");
        frame.setContentPane(new DashboardScherm().mainview);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setPreferredSize(new Dimension(450, 812));
    }
}

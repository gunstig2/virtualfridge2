package Login.Dashboard;

import javax.swing.*;
import java.awt.*;

public class Scanner {
    public JPanel mainview;


    public static void main(String[] args) {

        JFrame frame = new JFrame("Scanner");
        frame.setContentPane(new Scanner().mainview);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setPreferredSize(new Dimension(450, 812));
    }
}

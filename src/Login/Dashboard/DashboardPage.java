package Login.Dashboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardPage {
    public JPanel mainview;
    private JButton koelkastButton;
    private JLabel profielKnop;
    private JButton statisticButton;
    private JButton scannerButton;

    public DashboardPage() {

        koelkastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Koelkast");
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                frame.setPreferredSize(new Dimension(450, 812));
                frame.setContentPane(new koelkast().mainview);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        statisticButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Statistieken");
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                frame.setPreferredSize(new Dimension(450, 812));
                frame.setContentPane(new statistics().mainview);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        scannerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Scanner");
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                frame.setPreferredSize(new Dimension(450, 812));
                frame.setContentPane(new Scanner().mainview);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Dashboard");
        frame.setContentPane(new DashboardPage().mainview);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setPreferredSize(new Dimension(450, 812));
    }
}

package Login.Dashboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class statistics {
    public JPanel mainview;
    private JButton koelkastButton;
    private JButton scannerButton;
    private JButton statsButton;


    public statistics() {
        koelkastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    JFrame frame = new JFrame("Koelkast");
                    frame.setContentPane(new koelkast().mainview);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                    frame.setPreferredSize(new Dimension(450, 812));

            }
        });
        scannerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Scanner");
                frame.setContentPane(new Scanner().mainview);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                frame.setPreferredSize(new Dimension(450, 812));
            }
        });
        statsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Statistieken");
                frame.setContentPane(new statistics().mainview);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                frame.setPreferredSize(new Dimension(450, 812));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Statistieken");
        frame.setContentPane(new statistics().mainview);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setPreferredSize(new Dimension(450, 812));
    }
}

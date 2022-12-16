package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LeapYearGUI extends JFrame {
    private JPanel panelmain;
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JLabel inputYearLabel;
    public LeapYearGUI() throws Exception{
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent AE) {

                try {
                    int year = Integer.parseInt(tfYear.getText());
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        JOptionPane.showMessageDialog(panelmain, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(panelmain, "Not a leap year");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(panelmain, "Invalid input");
                }
            }
        });
    }
    public static void main(String[] args) throws Exception{
        LeapYearGUI app = new LeapYearGUI();

        app.setContentPane(app.panelmain);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");

    }
}






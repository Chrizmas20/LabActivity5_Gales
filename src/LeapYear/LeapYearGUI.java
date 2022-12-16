package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panelmain;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();

        app.setContentPane(app.panelmain);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");

       // JTextField tfYear = new JTextField(1);
        //JButton btnChecker = new JButton("Check");


    }

}



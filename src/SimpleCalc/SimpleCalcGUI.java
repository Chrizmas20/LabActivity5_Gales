package SimpleCalc;

import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() throws Exception{
        cbOperations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent AE) {

                }

        });
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent AE) {
                try {
                    int result=0;
                    int num1 = Integer.parseInt(tfNumber1.getText());
                    int num2 = Integer.parseInt(tfNumber2.getText());

                    if (cbOperations.getSelectedItem().equals("+")) {
                        result=num1+num2;
                        lblResult.setText(Integer.toString(result));

                    } else if (cbOperations.getSelectedItem().equals("-")){
                        result=num1-num2;
                        lblResult.setText(Integer.toString(result));

                    }else if (cbOperations.getSelectedItem().equals("*")){
                        result=num1*num2;
                        lblResult.setText(Integer.toString(result));

                    }else if (cbOperations.getSelectedItem().equals("/")){
                        result=num1/num2;
                        lblResult.setText(Integer.toString(result));
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(panel1, "ERROR!");
                }
            }
        });
        }

        public static void main(String[] args) throws Exception{
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setSize(700, 450);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");

    }
}


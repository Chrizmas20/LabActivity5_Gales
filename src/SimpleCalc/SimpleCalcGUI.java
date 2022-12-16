package SimpleCalc;


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

    public SimpleCalcGUI() {
        cbOperations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent AE) {

                }

        });
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent AE) {
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

            }
        });
        }

        public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setContentPane(app.panel1);
        app.setSize(700, 450);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");

    }
}


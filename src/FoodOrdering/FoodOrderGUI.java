package FoodOrdering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cSundae;
    private JCheckBox cTea;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    private List<JRadioButton> discount;
    private List<JCheckBox> food;

    public FoodOrderGUI() {
        discount = new ArrayList<>();
        discount.add(rbNone);
        discount.add(rb5);
        discount.add(rb10);
        discount.add(rb15);
        food = new ArrayList<>();
        food.add(cPizza);
        food.add(cBurger);
        food.add(cSoftDrinks);
        food.add(cFries);
        food.add(cSundae);
        food.add(cTea);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent AE) {

                    int count_food = 0;
                    double price = 0;
                    for (JCheckBox cb : food) {
                        if (cb.isSelected()) {
                            if (cb.getText().equals("Pizza")) {
                                price += 100;
                                count_food++;
                            } else if (cb.getText().equals("Burger")) {
                                price += 80;
                                count_food++;
                            } else if (cb.getText().equals("Fries")) {
                                price += 65;
                                count_food++;
                            } else if (cb.getText().equals("Soft Drinks")) {
                                price += 55;
                                count_food++;
                            } else if (cb.getText().equals("Tea")) {
                                price += 50;
                                count_food++;
                            } else if (cb.getText().equals("Sundae")) {
                                price += 40;
                                count_food++;
                            }
                        }
                    }

                    int count_discount = 0;
                    for (JRadioButton rb : discount) {
                        if (rb.isSelected()) {
                            if (rb.getText().equals("None")) {
                                JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", price));
                                count_discount++;
                            } else if (rb.getText().equals("5% Off")) {
                                JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", price * .95));
                                count_discount++;
                            } else if (rb.getText().equals("10% Off")) {
                                JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", price * .90));
                                count_discount++;
                            } else if (rb.getText().equals("15% Off")) {
                                JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", price * .85));
                                count_discount++;
                            }
                        }
                    }
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.panel1);
        app.setSize(700, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Food Ordering System");


    }
}




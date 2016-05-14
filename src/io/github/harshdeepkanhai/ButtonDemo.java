package io.github.harshdeepkanhai;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ZANGETSU on 14-05-2016.
 */
public class ButtonDemo {
    private JTextField textField1;
    private JTextField textField2;
    private JButton clickMeButton;
    private JLabel jLabel3;
    private JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonDemo");
        frame.setContentPane(new ButtonDemo().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public ButtonDemo() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = textField1.getText();
                    int age = Integer.parseInt(textField2.getText());
                    jLabel3.setText("Name is: "+name+" and Age is: "+age);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null ,"Error");
                }
            }
        });
    }
}

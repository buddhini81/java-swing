/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundbutton;

/**
 *
 * @author buddhinis
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Test {

    public Test() {
        initComponents();
    }

    private void initComponents() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextField tf = new JTextField("");

        RoundedButton rb = new RoundedButton("Go","images\\tr_icon_1.jpg");
        rb.setBackground(Color.decode("#CA3C3C"));
        rb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(frame, "You said: " + tf.getText());
            }
        });

        frame.add(tf, BorderLayout.NORTH);
        frame.add(rb);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Test();
            }
        });
    }
}
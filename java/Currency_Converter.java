package java;
// Java program to convert from 
// inr to the dollar and vice versa
// using Java Swing

import javax.swing.*;
import java.awt.event.*;

public class Currency_Converter extends JFrame {
    
    // Function to convert from rupee to dollar and vice versa
    
    public static void  converter() {

        // creating a new frame with using JFrame
        JFrame f = new JFrame("CONVERTOR");


        // creating two labels
        JLabel l1, l2;

        // creating two text fields
        // one for rupee and one for dollar
        JTextField t1, t2;

        // creating three buttons
        JButton b1, b2, b3;

        // Naming the labels and setting
        // the bounds of the labels
        l1 = new JLabel("Rupees:");
        l1.setBounds(20, 40, 60, 30);
        l2 = new JLabel("Dollars:");
        l2.setBounds(170,40,99,30);

        // Initializing the text fields with 
        // 0 by default and setting the 
        // bounds of the text fields
        t1 = new JTextField("0");
        t1.setBounds(80,40,50,30);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30 );

        // creating a button for INR,
        // one button for the Dollar
        // and one button to close
        // and setting the bounds
        b1 = new JButton("INR");
        b1.setBounds(50,80,60,15);
        b2 = new JButton("Dollar");
        b2.setBounds(190,80,90,15);
        b3 = new JButton("Close");
        b3.setBounds(150,150,80,30);

        //Adding action listener
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d = Double.parseDouble(t1.getText());

                // converting rupees to dollars
                double d1 = (d/ 87.04);

                // Getting the string value of the 
                // calculated value
                String str1 = String.valueOf(d1);

                // Placing it in the text box
                t2.setText(str1);
            }
        });

        // adding action listener
        b2.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                // converting to dollar
                double d2 = Double.parseDouble(t2.getText());

                //converting Dollars to rupees
                double d3 = (d2 * 87.04);

                // Getting the string value of the 
                // calculated value
                String str2 = String.valueOf(d3);

                // placing the string value in the text box
                t1.setText(str2);

            }
        });

        // adding action listener to close the frame
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0); 
            }
        });


        // adding the created objects
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    // Driver code
    public static void main(String[] args) {
        converter();
    }
}
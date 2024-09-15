package GUI;
import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class Jpanel {
    public static void main(String[] args) {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JPanel redPanel = new JPanel();
    JPanel bluePanel = new JPanel();
    JPanel greenPanel = new JPanel();
    ImageIcon image = new ImageIcon("GUI/Liked.jpg");

    label.setText("Hello World");
    label.setIcon(image); 
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setBounds(100, 100, 75, 75);

    redPanel.setBackground(Color.red);
    redPanel.setBounds(0, 0, 250, 250);
    redPanel.setLayout(new BorderLayout());

    bluePanel.setBackground(Color.blue);
    bluePanel.setBounds(250, 0, 250, 250);
    bluePanel.setLayout(null);

    greenPanel.setBackground(Color.green);
    greenPanel.setBounds(0, 250, 500, 250);
    greenPanel.setLayout(null);

    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000,1000);
    frame.setLayout(null);
    frame.setVisible(true);
    greenPanel.add(label);
    frame.add(redPanel);
    frame.add(bluePanel);
    frame.add(greenPanel);


    }
}


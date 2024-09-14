package GUI;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Jframe {
    public static void main(String[]args){

        
        ImageIcon logo = new ImageIcon("GUI/Logo.jfif");
        ImageIcon image = new ImageIcon("GUI/Image1.jpg");
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        
        label.setText("Hello World");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);

        
        
        frame.setIconImage(logo.getImage());
        //frame.getContentPane().setBackground(new Color(0,0,128));

    }
}

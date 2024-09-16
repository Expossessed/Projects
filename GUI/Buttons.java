package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Buttons extends JFrame implements ActionListener{

    JButton button = new JButton();
    JLabel label;
    Buttons(){
        ImageIcon icon = new ImageIcon("GUI/Liked.jpg");
        ImageIcon icon1 = new ImageIcon("GUI/Image1.jpg");
        
        label = new JLabel();
        label.setIcon(icon1);
        label.setBounds(50, 500, 500, 500);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 500, 300);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Times New Roman", Font.BOLD, 25));
        button.setIconTextGap(-5);
        button.setForeground(Color.BLUE);
        button.setBackground(Color.GREEN);
        button.setBorder(BorderFactory.createEtchedBorder());
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);
        this.add(label);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            //System.out.println("Poo");
            //button.setEnabled(false);
            label.setVisible(true);
        }

    }

}

package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Buttons extends JFrame implements ActionListener{

    JButton button = new JButton();
    Buttons(){

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,1000);
        this.setLayout(null);
        this.setVisible(true);
        this.add(button);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("Poo");

        }

    }

}

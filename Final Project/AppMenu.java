import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;


public class AppMenu {
    protected ArrayList<String> menu;
    protected ArrayList<Double> price;
    public AppMenu(){
        menu = new ArrayList<String>();
        price = new ArrayList<Double>();
    }

    public void display(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(1015,798);
        frame.setLayout(null);

        JPanel header = new JPanel();
        header.setOpaque(false);
        JButton burger = new JButton();
        ImageIcon burgerimg = new ImageIcon("burger.png");
        Image resizedburg = burgerimg.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon resizedburger = new ImageIcon(resizedburg);

        burger.setIcon(resizedburger);
        burger.setBounds(10, 10 , 40, 40);
        burger.setContentAreaFilled(false);
        burger.setBorderPainted(false);
        burger.setFocusPainted(true);
        burger.setFocusable(false);
        burger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "napindot ang burger button");
            }
        });
        
        header.add(burger);

        JButton account = new JButton();
        ImageIcon accountimg = new ImageIcon("account.png");
        Image resizedaccount = accountimg.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon resizedacc = new ImageIcon(resizedaccount);

        account.setIcon(resizedacc);
        account.setBounds(940, 10 , 40, 40);
        account.setContentAreaFilled(false);
        account.setBorderPainted(false);
        account.setFocusPainted(true);
        account.setFocusable(false);
        account.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame, "napindot ang account button");
            }
        });

        header.add(account);

        header.setBounds(0,0,1000,60);
        header.setLayout(new BorderLayout());
        header.setOpaque(false);
        ImageIcon headerbg = new ImageIcon("Header.jpg");
        Image resizedhead = headerbg.getImage().getScaledInstance(1000, 60, Image.SCALE_SMOOTH);
        ImageIcon resizedheader = new ImageIcon(resizedhead);
        JLabel headerlabel = new JLabel();
        
        headerlabel.setBounds(0,0,1000,60);
        headerlabel.setIcon(resizedheader);
        headerlabel.setVerticalAlignment(JLabel.TOP);
        headerlabel.setHorizontalAlignment(JLabel.CENTER);
        header.add(headerlabel, BorderLayout.CENTER);
        
        JPanel menu = new JPanel();
        menu.setBounds(0,60,1000,700);
        menu.setLayout(new BorderLayout());
        ImageIcon menubg = new ImageIcon("Menubg.jpg");
        Image resizedbg = menubg.getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
        ImageIcon resizedmenu = new ImageIcon(resizedbg);
        JLabel menulabel = new JLabel();

        menulabel.setBounds(0,0,1000,700);
        menulabel.setIcon(resizedmenu);
        menulabel.setVerticalAlignment(JLabel.TOP);
        menulabel.setHorizontalAlignment(JLabel.CENTER);
        menu.add(menulabel, BorderLayout.CENTER);


        frame.add(menu);
        frame.add(header);

        /*JButton button = new JButton();
        button.setBounds(400, 700 , 200, 50);
        button.setText("Place Order");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Times New Roman", Font.BOLD, 25));
        button.setForeground(Color.BLUE);
        button.setBackground(Color.MAGENTA);
        button.setBorder(BorderFactory.createEtchedBorder());
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Order Placed!");
            }
        });
        

        frame.add(button);*/

        frame.setVisible(true);
        
        
    }


}

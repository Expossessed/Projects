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
        //FRAME
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(1015,798);
        frame.setLayout(null);

        //HEADER
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
        
        //BODY
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


        JPanel list = new JPanel();
        list.setBounds(70,115,400,600);
        list.setLayout(new BorderLayout());
        list.setBackground(Color.WHITE);

        JPanel food1 = new JPanel();
        JPanel food2 = new JPanel();
        JPanel food3 = new JPanel();
        JPanel food4 = new JPanel();
        JPanel food5 = new JPanel();
        JPanel food6 = new JPanel();
        JPanel food7 = new JPanel();
        JPanel food8 = new JPanel();
        JPanel food9 = new JPanel();
        JPanel food10 = new JPanel();

        food1.setBounds(0,0,400,60);
        food1.setLayout(null);
        food1.setBackground(Color.BLUE);
        food2.setBounds(0,60,400,60);
        food2.setLayout(null);
        food2.setBackground(Color.GREEN);
        food3.setBounds(0,120,400,60);
        food3.setLayout(null);
        food3.setBackground(Color.BLUE);
        food4.setBounds(0,180,400,60);
        food4.setLayout(null);
        food4.setBackground(Color.GREEN);
        food5.setBounds(0,240,400,60);
        food5.setLayout(null);
        food5.setBackground(Color.BLUE);
        food6.setBounds(0,300,400,60);
        food6.setLayout(null);
        food6.setBackground(Color.GREEN);
        food7.setBounds(0,360,400,60);
        food7.setLayout(null);
        food7.setBackground(Color.BLUE);
        food8.setBounds(0,420,400,60);
        food8.setLayout(null);
        food8.setBackground(Color.GREEN);
        food9.setBounds(0,480,400,60);
        food9.setLayout(null);
        food9.setBackground(Color.BLUE);
        food10.setBounds(0,540,400,60);
        food10.setLayout(null);
        food10.setBackground(Color.GREEN);


        list.add(food1);
        list.add(food2);
        list.add(food3);
        list.add(food4);
        list.add(food5);
        list.add(food6);
        list.add(food7);
        list.add(food8);
        list.add(food9);
        list.add(food10);

        JPanel total = new JPanel();
        total.setBounds(625,115,300,500);
        total.setLayout(new BorderLayout());
        total.setBackground(Color.WHITE);


        frame.add(total);
        frame.add(list);
        frame.add(menu);
        frame.add(header);
        
        frame.setVisible(true);
        
        
    }


}

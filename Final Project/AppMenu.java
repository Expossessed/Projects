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
        list.setLayout(null);
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
        ImageIcon addimg = new ImageIcon("ADD.png");
        Image resizedadd = addimg.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        ImageIcon resizedADD = new ImageIcon(resizedadd);
        
        ImageIcon removeimg = new ImageIcon("REMOVE.png");
        Image resizedremove = removeimg.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        ImageIcon resizedREMOVE = new ImageIcon(resizedremove);

        food1.setBounds(0,0,400,60);
        food1.setLayout(null);
        JTextArea tArea1 = new JTextArea("BBQ Pulled Pork Sandwich\nP180");
        tArea1.setBounds(5, 5, 300, 60);
        tArea1.setEditable(false);
        tArea1.setOpaque(false);
        tArea1.setFocusable(false);
        tArea1.setFont(new Font("Times New Roman", 0, 20));
        food1.add(tArea1);
        JButton add1 = new JButton();
        add1.setIcon(resizedADD);
        add1.setBounds(360, 17, 24, 24);
        add1.setContentAreaFilled(false);
        add1.setBorderPainted(false);
        add1.setFocusPainted(true);
        add1.setFocusable(false);
        JButton remove1 = new JButton();
        remove1.setIcon(resizedREMOVE);
        remove1.setBounds(320, 17, 24, 24);
        remove1.setContentAreaFilled(false);
        remove1.setBorderPainted(false);
        remove1.setFocusPainted(true);
        remove1.setFocusable(false);
        food1.add(remove1);
        food1.add(add1);
        food1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        
        food2.setBounds(0,60,400,60);
        food2.setLayout(null);
        JTextArea tArea2 = new JTextArea("Pork Ribs (Full Rack)\nP550");
        tArea2.setBounds(5, 5, 300, 60);
        tArea2.setEditable(false);
        tArea2.setOpaque(false);
        tArea2.setFocusable(false);
        tArea2.setFont(new Font("Times New Roman", 0, 20));
        food2.add(tArea2);
        JButton add2 = new JButton();
        add2.setIcon(resizedADD);
        add2.setBounds(360, 17, 24, 24);
        add2.setContentAreaFilled(false);
        add2.setBorderPainted(false);
        add2.setFocusPainted(true);
        add2.setFocusable(false);
        JButton remove2 = new JButton();
        remove2.setIcon(resizedREMOVE);
        remove2.setBounds(320, 17, 24, 24);
        remove2.setContentAreaFilled(false);
        remove2.setBorderPainted(false);
        remove2.setFocusPainted(true);
        remove2.setFocusable(false);
        food2.add(remove2);
        food2.add(add2);
        food2.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        food3.setBounds(0,120,400,60);
        food3.setLayout(null);
        JTextArea tArea3 = new JTextArea("Grilled Pork Chop\nP320");
        tArea3.setBounds(5, 5, 300, 60);
        tArea3.setEditable(false);
        tArea3.setOpaque(false);
        tArea3.setFocusable(false);
        tArea3.setFont(new Font("Times New Roman", 0, 20));
        food3.add(tArea3);
        JButton add3 = new JButton();
        add3.setIcon(resizedADD);
        add3.setBounds(360, 17, 24, 24);
        add3.setContentAreaFilled(false);
        add3.setBorderPainted(false);
        add3.setFocusPainted(true);
        add3.setFocusable(false);
        JButton remove3 = new JButton();
        remove3.setIcon(resizedREMOVE);
        remove3.setBounds(320, 17, 24, 24);
        remove3.setContentAreaFilled(false);
        remove3.setBorderPainted(false);
        remove3.setFocusPainted(true);
        remove3.setFocusable(false);
        food3.add(remove3);
        food3.add(add3);
        food3.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        food4.setBounds(0,180,400,60);
        food4.setLayout(null);
        JTextArea tArea4 = new JTextArea("Pork Tenderloin Medallions\nP370");
        tArea4.setBounds(5, 5, 300, 60);
        tArea4.setEditable(false);
        tArea4.setOpaque(false);
        tArea4.setFocusable(false);
        tArea4.setFont(new Font("Times New Roman", 0, 20));
        food4.add(tArea4);
        JButton add4 = new JButton();
        add4.setIcon(resizedADD);
        add4.setBounds(360, 17, 24, 24);
        add4.setContentAreaFilled(false);
        add4.setBorderPainted(false);
        add4.setFocusPainted(true);
        add4.setFocusable(false);
        JButton remove4 = new JButton();
        remove4.setIcon(resizedREMOVE);
        remove4.setBounds(320, 17, 24, 24);
        remove4.setContentAreaFilled(false);
        remove4.setBorderPainted(false);
        remove4.setFocusPainted(true);
        remove4.setFocusable(false);
        food4.add(remove4);
        food4.add(add4);
        food4.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        food5.setBounds(0,240,400,60);
        food5.setLayout(null);
        JTextArea tArea5 = new JTextArea("Pork Belly Bites\nP220");
        tArea5.setBounds(5, 5, 300, 60);
        tArea5.setEditable(false);
        tArea5.setOpaque(false);
        tArea5.setFocusable(false);
        tArea5.setFont(new Font("Times New Roman", 0, 20));
        food5.add(tArea5);
        JButton add5 = new JButton();
        add5.setIcon(resizedADD);
        add5.setBounds(360, 17, 24, 24);
        add5.setContentAreaFilled(false);
        add5.setBorderPainted(false);
        add5.setFocusPainted(true);
        add5.setFocusable(false);
        JButton remove5 = new JButton();
        remove5.setIcon(resizedREMOVE);
        remove5.setBounds(320, 17, 24, 24);
        remove5.setContentAreaFilled(false);
        remove5.setBorderPainted(false);
        remove5.setFocusPainted(true);
        remove5.setFocusable(false);
        food5.add(remove5);
        food5.add(add5);
        food5.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        food6.setBounds(0,300,400,60);
        food6.setLayout(null);
        JTextArea tArea6 = new JTextArea("Sweet & Sour Pork Stir-Fry\nP250");
        tArea6.setBounds(5, 5, 300, 60);
        tArea6.setEditable(false);
        tArea6.setOpaque(false);
        tArea6.setFocusable(false);
        tArea6.setFont(new Font("Times New Roman", 0, 20));
        food6.add(tArea6);
        JButton add6 = new JButton();
        add6.setIcon(resizedADD);
        add6.setBounds(360, 17, 24, 24);
        add6.setContentAreaFilled(false);
        add6.setBorderPainted(false);
        add6.setFocusPainted(true);
        add6.setFocusable(false);
        JButton remove6 = new JButton();
        remove6.setIcon(resizedREMOVE);
        remove6.setBounds(320, 17, 24, 24);
        remove6.setContentAreaFilled(false);
        remove6.setBorderPainted(false);
        remove6.setFocusPainted(true);
        remove6.setFocusable(false);
        food6.add(remove6);
        food6.add(add6);
        food6.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        food7.setBounds(0,360,400,60);
        food7.setLayout(null);
        JTextArea tArea7 = new JTextArea("Crispy Pork Schnitzel\nP290");
        tArea7.setBounds(5, 5, 300, 60);
        tArea7.setEditable(false);
        tArea7.setOpaque(false);
        tArea7.setFocusable(false);
        tArea7.setFont(new Font("Times New Roman", 0, 20));
        food7.add(tArea7);
        JButton add7 = new JButton();
        add7.setIcon(resizedADD);
        add7.setBounds(360, 17, 24, 24);
        add7.setContentAreaFilled(false);
        add7.setBorderPainted(false);
        add7.setFocusPainted(true);
        add7.setFocusable(false);
        JButton remove7 = new JButton();
        remove7.setIcon(resizedREMOVE);
        remove7.setBounds(320, 17, 24, 24);
        remove7.setContentAreaFilled(false);
        remove7.setBorderPainted(false);
        remove7.setFocusPainted(true);
        remove7.setFocusable(false);
        food7.add(remove7);
        food7.add(add7);
        food7.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        food8.setBounds(0,420,400,60);
        food8.setLayout(null);
        JTextArea tArea8 = new JTextArea("Pork Carnitas Tacos (3 pcs)\nP180");
        tArea8.setBounds(5, 5, 300, 60);
        tArea8.setEditable(false);
        tArea8.setOpaque(false);
        tArea8.setFocusable(false);
        tArea8.setFont(new Font("Times New Roman", 0, 20));
        food8.add(tArea8);
        JButton add8 = new JButton();
        add8.setIcon(resizedADD);
        add8.setBounds(360, 17, 24, 24);
        add8.setContentAreaFilled(false);
        add8.setBorderPainted(false);
        add8.setFocusPainted(true);
        add8.setFocusable(false);
        JButton remove8 = new JButton();
        remove8.setIcon(resizedREMOVE);
        remove8.setBounds(320, 17, 24, 24);
        remove8.setContentAreaFilled(false);
        remove8.setBorderPainted(false);
        remove8.setFocusPainted(true);
        remove8.setFocusable(false);
        food8.add(remove8);
        food8.add(add8);
        food8.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        food9.setBounds(0,480,400,60);
        food9.setLayout(null);
        JTextArea tArea9 = new JTextArea("Pork Sausage Links (2 pcs)\nP150");
        tArea9.setBounds(5, 5, 300, 60);
        tArea9.setEditable(false);
        tArea9.setOpaque(false);
        tArea9.setFocusable(false);
        tArea9.setFont(new Font("Times New Roman", 0, 20));
        food9.add(tArea9);
        JButton add9 = new JButton();
        add9.setIcon(resizedADD);
        add9.setBounds(360, 17, 24, 24);
        add9.setContentAreaFilled(false);
        add9.setBorderPainted(false);
        add9.setFocusPainted(true);
        add9.setFocusable(false);
        JButton remove9 = new JButton();
        remove9.setIcon(resizedREMOVE);
        remove9.setBounds(320, 17, 24, 24);
        remove9.setContentAreaFilled(false);
        remove9.setBorderPainted(false);
        remove9.setFocusPainted(true);
        remove9.setFocusable(false);
        food9.add(remove9);
        food9.add(add9);
        food9.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        food10.setBounds(0,540,400,60);
        food10.setLayout(null);
        JTextArea tArea10 = new JTextArea("Stuffed Pork Loin\nP400");
        tArea10.setBounds(5, 5, 300, 60);
        tArea10.setEditable(false);
        tArea10.setOpaque(false);
        tArea10.setFocusable(false);
        tArea10.setFont(new Font("Times New Roman", 0, 20));
        food10.add(tArea10);
        JButton add10 = new JButton();
        add10.setIcon(resizedADD);
        add10.setBounds(360, 17, 24, 24);
        add10.setContentAreaFilled(false);
        add10.setBorderPainted(false);
        add10.setFocusPainted(true);
        add10.setFocusable(false);
        JButton remove10 = new JButton();
        remove10.setIcon(resizedREMOVE);
        remove10.setBounds(320, 17, 24, 24);
        remove10.setContentAreaFilled(false);
        remove10.setBorderPainted(false);
        remove10.setFocusPainted(true);
        remove10.setFocusable(false);
        food10.add(remove10);
        food10.add(add10);
        food10.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));


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

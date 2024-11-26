import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;


public class AppMenu {
    protected ArrayList<String> menu;
    protected ArrayList<Double> price;
    private static double orderTotal = 0.0;
    private static JLabel totalLabel = new JLabel("Total: P0.00");
    
    public AppMenu(){
        menu = new ArrayList<String>();
        price = new ArrayList<Double>();
    }
    private static JTextArea orderDetailsArea = new JTextArea();
    
    private static void addToOrder(String item, double price) {
        orderDetailsArea.append(item + " - P" + price + "\n");
        orderTotal += price;
        totalLabel.setText(String.format("%.2f", orderTotal));
    }

    public void display(){
        JPanel orderPanel = new JPanel(new BorderLayout());
        orderPanel.setLayout(new BoxLayout(orderPanel,BoxLayout.Y_AXIS));  
        orderPanel.setBounds(5, 5, 288, 270);  
        orderPanel.setBackground(Color.WHITE);
        

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
        String name1 = "BBQ Pulled Pork Sandwich";
        double P1 = 180.00;
        JTextArea tArea1 = new JTextArea(name1 +"\nP"+ P1);
        tArea1.setBounds(5, 5, 300, 60);
        tArea1.setOpaque(false);
        tArea1.setFocusable(false);
        tArea1.setFont(new Font("Comic Sans MS", 0, 20));
        food1.add(tArea1);
        JButton add1 = new JButton();
        add1.setIcon(resizedADD);
        add1.setBounds(360, 17, 24, 24);
        add1.setContentAreaFilled(false);
        add1.setBorderPainted(false);
        add1.setFocusPainted(true);
        add1.setFocusable(false);
        add1.addActionListener(e -> addToOrder(name1, P1));
        add1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name1+"    P"+String.format("%.2f",P1));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        String name2 = "Pork Ribs (Full Rack)";
        double P2 = 550.00;
        JTextArea tArea2 = new JTextArea(name2 +"\nP"+ P2);
        tArea2.setBounds(5, 5, 300, 60);
        tArea2.setEditable(false);
        tArea2.setOpaque(false);
        tArea2.setFocusable(false);
        tArea2.setFont(new Font("Comic Sans MS", 0, 20));
        food2.add(tArea2);
        JButton add2 = new JButton();
        add2.setIcon(resizedADD);
        add2.setBounds(360, 17, 24, 24);
        add2.setContentAreaFilled(false);
        add2.setBorderPainted(false);
        add2.setFocusPainted(true);
        add2.setFocusable(false);
        add2.addActionListener(e -> addToOrder(name2, P2));
        add2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name2+"    P"+String.format("%.2f",P2));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        String name3 = "Grilled Pork Chop";
        double P3 = 320.00;
        JTextArea tArea3 = new JTextArea(name3 +"\nP"+ P3);
        tArea3.setBounds(5, 5, 300, 60);
        tArea3.setEditable(false);
        tArea3.setOpaque(false);
        tArea3.setFocusable(false);
        tArea3.setFont(new Font("Comic Sans MS", 0, 20));
        food3.add(tArea3);
        JButton add3 = new JButton();
        add3.setIcon(resizedADD);
        add3.setBounds(360, 17, 24, 24);
        add3.setContentAreaFilled(false);
        add3.setBorderPainted(false);
        add3.setFocusPainted(true);
        add3.setFocusable(false);
        add3.addActionListener(e -> addToOrder(name3, P3));
        add3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name3+"    P"+String.format("%.2f",P3));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        String name4 = "Pork Tenderloin Medallions";
        double P4 = 370.00;
        JTextArea tArea4 = new JTextArea(name4 +"\nP"+ P4);
        tArea4.setBounds(5, 5, 300, 60);
        tArea4.setEditable(false);
        tArea4.setOpaque(false);
        tArea4.setFocusable(false);
        tArea4.setFont(new Font("Comic Sans MS", 0, 20));
        food4.add(tArea4);
        JButton add4 = new JButton();
        add4.setIcon(resizedADD);
        add4.setBounds(360, 17, 24, 24);
        add4.setContentAreaFilled(false);
        add4.setBorderPainted(false);
        add4.setFocusPainted(true);
        add4.setFocusable(false);
        add4.addActionListener(e -> addToOrder(name4, P4));
        add4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name4+"    P"+String.format("%.2f",P4));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        String name5 = "Pork Belly Bites";
        double P5 = 220.00;
        JTextArea tArea5 = new JTextArea(name5 +"\nP"+ P5);
        tArea5.setBounds(5, 5, 300, 60);
        tArea5.setEditable(false);
        tArea5.setOpaque(false);
        tArea5.setFocusable(false);
        tArea5.setFont(new Font("Comic Sans MS", 0, 20));
        food5.add(tArea5);
        JButton add5 = new JButton();
        add5.setIcon(resizedADD);
        add5.setBounds(360, 17, 24, 24);
        add5.setContentAreaFilled(false);
        add5.setBorderPainted(false);
        add5.setFocusPainted(true);
        add5.setFocusable(false);
        add5.addActionListener(e -> addToOrder(name5, P5));
        add5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name5+"    P"+String.format("%.2f",P5));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        String name6 = "Sweet & Sour Pork Stir-Fry";
        double P6 = 250.00;
        JTextArea tArea6 = new JTextArea(name6 +"\nP"+ P6);
        tArea6.setBounds(5, 5, 300, 60);
        tArea6.setEditable(false);
        tArea6.setOpaque(false);
        tArea6.setFocusable(false);
        tArea6.setFont(new Font("Comic Sans MS", 0, 20));
        food6.add(tArea6);
        JButton add6 = new JButton();
        add6.setIcon(resizedADD);
        add6.setBounds(360, 17, 24, 24);
        add6.setContentAreaFilled(false);
        add6.setBorderPainted(false);
        add6.setFocusPainted(true);
        add6.setFocusable(false);
        add6.addActionListener(e -> addToOrder(name6, P6));
        add6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name6+"    P"+String.format("%.2f",P6));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        String name7 = "Crispy Pork Schnitzel";
        double P7 = 290.00;
        JTextArea tArea7 = new JTextArea(name7 +"\nP"+ P7);
        tArea7.setBounds(5, 5, 300, 60);
        tArea7.setEditable(false);
        tArea7.setOpaque(false);
        tArea7.setFocusable(false);
        tArea7.setFont(new Font("Comic Sans MS", 0, 20));
        food7.add(tArea7);
        JButton add7 = new JButton();
        add7.setIcon(resizedADD);
        add7.setBounds(360, 17, 24, 24);
        add7.setContentAreaFilled(false);
        add7.setBorderPainted(false);
        add7.setFocusPainted(true);
        add7.setFocusable(false);
        add7.addActionListener(e -> addToOrder(name7, P7));
        add7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name7+"    P"+String.format("%.2f",P7));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        String name8 = "Pork Carnitas Tacos (3 pcs)";
        double P8 = 180.00;
        JTextArea tArea8 = new JTextArea(name8 +"\nP"+ P8);
        tArea8.setBounds(5, 5, 300, 60);
        tArea8.setEditable(false);
        tArea8.setOpaque(false);
        tArea8.setFocusable(false);
        tArea8.setFont(new Font("Comic Sans MS", 0, 20));
        food8.add(tArea8);
        JButton add8 = new JButton();
        add8.setIcon(resizedADD);
        add8.setBounds(360, 17, 24, 24);
        add8.setContentAreaFilled(false);
        add8.setBorderPainted(false);
        add8.setFocusPainted(true);
        add8.setFocusable(false);
        add8.addActionListener(e -> addToOrder(name8, P8));
        add8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name8+"    P"+String.format("%.2f",P8));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        String name9 = "Pork Sausage Links (2 pcs)";
        double P9 = 150.00;
        JTextArea tArea9 = new JTextArea(name9 +"\nP"+ P9);
        tArea9.setBounds(5, 5, 300, 60);
        tArea9.setEditable(false);
        tArea9.setOpaque(false);
        tArea9.setFocusable(false);
        tArea9.setFont(new Font("Comic Sans MS", 0, 20));
        food9.add(tArea9);
        JButton add9 = new JButton();
        add9.setIcon(resizedADD);
        add9.setBounds(360, 17, 24, 24);
        add9.setContentAreaFilled(false);
        add9.setBorderPainted(false);
        add9.setFocusPainted(true);
        add9.setFocusable(false);
        add9.addActionListener(e -> addToOrder(name9, P9));
        add9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name9+"    P"+String.format("%.2f",P9));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        String name10 = "Stuffed Pork Loin";
        double P10 = 400.00;
        JTextArea tArea10 = new JTextArea(name10 +"\nP"+ P10);
        tArea10.setBounds(5, 5, 300, 60);
        tArea10.setEditable(false);
        tArea10.setOpaque(false);
        tArea10.setFocusable(false);
        tArea10.setFont(new Font("Comic Sans MS", 0, 20));
        food10.add(tArea10);
        JButton add10 = new JButton();
        add10.setIcon(resizedADD);
        add10.setBounds(360, 17, 24, 24);
        add10.setContentAreaFilled(false);
        add10.setBorderPainted(false);
        add10.setFocusPainted(true);
        add10.setFocusable(false);
        add10.addActionListener(e -> addToOrder(name10, P10));
        add10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name10+"    P"+String.format("%.2f",P10));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });
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
        total.setLayout(null);
        total.setBackground(Color.WHITE);
        total.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        
        MatteBorder sideborders = new MatteBorder(0,2,0,2,Color.BLACK);
        JPanel Tpanel = new JPanel();
        Tpanel.setBounds(0, 0, 300, 60);
        Tpanel.setLayout(null);
        Tpanel.setBorder(sideborders);
        Tpanel.setBackground(Color.WHITE);
        JPanel Orders = new JPanel();   
        Orders.setBounds(0, 70, 300, 280);
        Orders.setLayout(null);
        Orders.setBorder(sideborders);
        Orders.setBackground(Color.WHITE);
        JPanel Tamount = new JPanel();
        Tamount.setBounds(0, 350, 300, 130);
        Tamount.setLayout(null);
        Tamount.setBorder(sideborders);
        Tamount.setBackground(Color.WHITE);
        

        
        JLabel Title = new JLabel();
        Title.setBounds(5, 5, 200, 60);
        Title.setLayout(null);
        Title.setOpaque(false);
        Title.setHorizontalAlignment(JLabel.LEFT);
        Title.setText("Total");
        Title.setFont(new Font("Helvetica", 0, 30));
        

        JLabel Totalamt = new JLabel();
        Totalamt.setBounds(5, 5, 290, 60);
        Totalamt.setLayout(null);
        Totalamt.setOpaque(false);
        Totalamt.setHorizontalAlignment(JLabel.LEFT);
        Totalamt.setVerticalTextPosition(JLabel.CENTER);
        Totalamt.setText("Total Amount");
        Totalamt.setFont(new Font("Helvetica", 0, 23));
        MatteBorder Totalamtbrdr = new MatteBorder(3,0,0,0,Color.GRAY);
        Totalamt.setBorder(Totalamtbrdr);

        
        //TOTAL AMOUNT
        totalLabel.setBounds(180, 5, 100, 60);
        totalLabel.setLayout(null);
        totalLabel.setOpaque(false);
        totalLabel.setHorizontalAlignment(JLabel.RIGHT);
        totalLabel.setVerticalTextPosition(JLabel.CENTER);
        totalLabel.setFont(new Font("Helvetica", Font.BOLD, 16));

        JButton plcOrder = new JButton();
        plcOrder.setBounds(160,75,120,40);
        plcOrder.setText("Place Order");
        plcOrder.setBackground(new Color(255,149,0));
        plcOrder.setForeground(new Color(101,85,143));
        plcOrder.setBorderPainted(false);
        plcOrder.setFocusPainted(true);
        plcOrder.setFocusable(false);
        plcOrder.setHorizontalTextPosition(JButton.CENTER);
        plcOrder.setVerticalTextPosition(JButton.CENTER);
        plcOrder.setFont(new Font("Helvetica", Font.BOLD, 15));
        




        Tpanel.add(Title);
        Orders.add(orderPanel);
        Orders.add(orderDetailsArea);
        Tamount.add(Totalamt);
        Tamount.add(totalLabel);
        Tamount.add(plcOrder);
        total.add(Tpanel);
        total.add(Orders);
        total.add(Tamount);


        frame.add(total);
        frame.add(list);
        frame.add(menu);
        frame.add(header);
        
        frame.setVisible(true);
        
        
    }


}

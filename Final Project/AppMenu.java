import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AppMenu {
    ArrayList<String> allOrders = new ArrayList<>();
    private static double orderTotal = 0.0;
    private int count1 = 1;
    private int count2 = 1;
    private int count3 = 1;
    private int count4 = 1;
    private int count5 = 1;
    private int count6 = 1;
    private int count7 = 1;
    private int count8 = 1;
    private int count9 = 1;
    private int count10 = 1;
    private static JLabel totalLabel = new JLabel("Total: P0.00");
    
    public AppMenu(){
    }
    
    private void addToOrder(String item, double price) {
        orderTotal += price;
        totalLabel.setText(String.format("%.2f", orderTotal));
    }

    private void minusToOrder(String item, double price) {
        if (price <= orderTotal) {
            orderTotal -= price;
        }
        totalLabel.setText(String.format("%.2f", orderTotal));
    }



    public void display(){
        JPanel orderPanel = new JPanel(new BorderLayout());
        orderPanel.setLayout(new BoxLayout(orderPanel,BoxLayout.Y_AXIS));  
        orderPanel.setBackground(Color.WHITE);

        JScrollPane scroll = new JScrollPane(orderPanel);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(5, 5, 288, 270);


        

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

        ImageIcon addimg = new ImageIcon("ADD.png");
        Image resizedadd = addimg.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        ImageIcon resizedADD = new ImageIcon(resizedadd);
        
        ImageIcon removeimg = new ImageIcon("REMOVE.png");
        Image resizedremove = removeimg.getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
        ImageIcon resizedREMOVE = new ImageIcon(resizedremove);

        JPanel[] foods = new JPanel[10];
        int foodsY = 0;
        for(int i = 0; i < foods.length;i++){
            foods[i] = new JPanel();
            foods[i].setLayout(null);
            foods[i].setBounds(0,foodsY,400,60);
            foodsY+=60;
        }

        JButton[] add = new JButton[10];
        for(int i = 0; i < foods.length;i++){
            add[i] = new JButton();
            add[i].setBounds(360, 17, 24, 24);
            add[i].setContentAreaFilled(false);
            add[i].setBorderPainted(false);
            add[i].setFocusPainted(true);
            add[i].setFocusable(false);
            add[i].setIcon(resizedADD);
        }

        JButton[] remove = new JButton[10];
        for(int i = 0; i < foods.length;i++){
            remove[i] = new JButton();
            remove[i].setBounds(320, 17, 24, 24);
            remove[i].setContentAreaFilled(false);
            remove[i].setBorderPainted(false);
            remove[i].setFocusPainted(true);
            remove[i].setFocusable(false);
            remove[i].setIcon(resizedREMOVE);
        }

        JTextArea[] tArea = new JTextArea[10];
        String[] name = new String[10];
        double[] price = new double[10];
        for(int i = 0; i < tArea.length;i++){
            tArea[i] = new JTextArea();
            tArea[i].setLayout(null);
            tArea[i].setBounds(5, 5, 300, 60);
            tArea[i].setEditable(false);
            tArea[i].setOpaque(false);
            tArea[i].setFocusable(false);
            tArea[i].setFont(new Font("Comic Sans MS", 0, 20));
        }

        name[0] = "BBQ Pulled Pork Sandwich";
        price[0] = 180.00;
        tArea[0].setText(name[0] +"\nP"+ price[0]);
        add[0].addActionListener(e -> addToOrder(name[0], price[0]));
        add[0].addActionListener(e -> {
                JLabel food = new JLabel();
                JLabel counter = new JLabel();
                food.setSize(300,60);
                food.setText(name[0]+"    P"+String.format("%.2f",price[0]));
                food.setHorizontalAlignment(JLabel.LEFT);
                food.setFont(new Font("Comic Sans MS", 0, 10));
                counter.setText("("+count1+")");
                counter.setHorizontalAlignment(JLabel.RIGHT);
                counter.setFont(new Font("Comic Sans MS", 0, 10));
                if (count1 == 1) {
                    orderPanel.add(food);
                }
                orderPanel.remove(counter);
                orderPanel.add(counter);
                count1++;
        });
        remove[0].addActionListener(e -> minusToOrder(name[0], price[0]));
        remove[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[0]+"    P"+String.format("%.2f",price[0]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.remove(food);
            }
        });
        
        name[1] = "Pork Ribs (Full Rack)";
        price[1] = 550.00; 
        tArea[1].setText(name[1] +"\nP"+ price[1]);       
        add[1].addActionListener(e -> addToOrder(name[1], price[1]));
        add[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[1]+"    P"+String.format("%.2f",price[1]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });

        
        name[2] = "Grilled Pork Chop";
        price[2] = 320.00;
        tArea[2].setText(name[2] +"\nP"+ price[2]);
        add[2].addActionListener(e -> addToOrder(name[2], price[2]));
        add[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[2]+"    P"+String.format("%.2f",price[2]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });

        name[3] = "Pork Tenderloin Medallions";
        price[3] = 370.00;
        tArea[3].setText(name[3] +"\nP"+ price[3]);
        add[3].addActionListener(e -> addToOrder(name[3], price[3]));
        add[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[3]+"    P"+String.format("%.2f",price[3]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });

        name[4] = "Pork Belly Bites";
        price[4] = 220.00;
        tArea[4].setText(name[4] +"\nP"+ price[4]);
        add[4].addActionListener(e -> addToOrder(name[4], price[4]));
        add[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[4]+"    P"+String.format("%.2f",price[4]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });


        name[5] = "Sweet & Sour Pork Stir-Fry";
        price[5] = 250.00;
        tArea[5].setText(name[5] +"\nP"+ price[5]);
        add[5].addActionListener(e -> addToOrder(name[5], price[5]));
        add[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[5]+"    P"+String.format("%.2f",price[5]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });


        name[6] = "Crispy Pork Schnitzel";
        price[6] = 290.00;
        tArea[6].setText(name[6] +"\nP"+ price[6]);
        add[6].addActionListener(e -> addToOrder(name[6], price[6]));
        add[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[6]+"    P"+String.format("%.2f",price[6]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });


        name[7] = "Pork Carnitas Tacos (3 pcs)";
        price[7] = 180.00;
        tArea[7].setText(name[7] +"\nP"+ price[7]);
        add[7].addActionListener(e -> addToOrder(name[7], price[7]));
        add[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[7]+"    P"+String.format("%.2f",price[7]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });


        name[8] = "Pork Sausage Links (2 pcs)";
        price[8] = 150.00;
        tArea[8].setText(name[8] +"\nP"+ price[8]);
        add[8].addActionListener(e -> addToOrder(name[8], price[8]));
        add[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[8]+"    P"+String.format("%.2f",price[8]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });

        name[9] = "Stuffed Pork Loin";
        price[9] = 400.00;
        tArea[9].setText(name[9] +"\nP"+ price[9]);
        add[9].addActionListener(e -> addToOrder(name[9], price[9]));
        add[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f){
                JLabel food = new JLabel();
                food.setSize(300,60);
                food.setText(name[9]+"    P"+String.format("%.2f",price[9]));
                food.setFont(new Font("Comic Sans MS", 0, 10));
                orderPanel.add(food);
            }
        });

        for(int i = 0; i < foods.length;i++){
            foods[i].add(tArea[i]);
            foods[i].add(remove[i]);
            foods[i].add(add[i]);
            foods[i].setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
            list.add(foods[i]);
        }

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
        Orders.add(scroll);
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

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        frame.setSize(1015,1000);
        frame.setLayout(null);

        JPanel header = new JPanel();
        header.setBounds(0,0,1000,60);
        header.setLayout(null);
        header.setOpaque(false);
        ImageIcon headerbg = new ImageIcon("Header.jpg");
        Image resizedhead = headerbg.getImage().getScaledInstance(1000, 60, Image.SCALE_SMOOTH);
        ImageIcon resizedheader = new ImageIcon(resizedhead);
        JLabel headerlabel = new JLabel();
        
        headerlabel.setBounds(0,0,1000,60);
        headerlabel.setIcon(resizedheader);
        headerlabel.setVerticalAlignment(JLabel.TOP);
        headerlabel.setHorizontalAlignment(JLabel.CENTER);
        header.add(headerlabel);

        header.add(headerlabel, BorderLayout.CENTER);
        
        JPanel menu = new JPanel();
        menu.setBounds(0,60,1000,700);
        menu.setLayout(null);
        ImageIcon menubg = new ImageIcon("Menubg.jpg");
        Image resizedbg = menubg.getImage().getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
        ImageIcon resizedmenu = new ImageIcon(resizedbg);
        JLabel menulabel = new JLabel();

        menulabel.setBounds(0,0,1000,700);
        menulabel.setIcon(resizedmenu);
        menulabel.setVerticalAlignment(JLabel.TOP);
        menulabel.setHorizontalAlignment(JLabel.CENTER);
        menu.add(menulabel);

        menu.add(menulabel, BorderLayout.CENTER);
        frame.add(menu);
        frame.add(header);

        JButton button = new JButton();
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
        

        frame.add(button);

        frame.setVisible(true);
        
        
    }


}

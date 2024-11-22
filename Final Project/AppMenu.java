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
        frame.setSize(1000,1000);
        frame.setLayout(null);

        JPanel menu = new JPanel();
        menu.setBounds(0,0,1000,680);
        menu.setLayout(new BorderLayout());

        ImageIcon menubg = new ImageIcon("Menubg.jpg");
        Image resizedbg = menubg.getImage().getScaledInstance(1000, 680, Image.SCALE_SMOOTH);
        ImageIcon resizedmenu = new ImageIcon(resizedbg);
        JLabel label = new JLabel();

        label.setIcon(resizedmenu);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        menu.add(label, BorderLayout.CENTER);
        frame.add(menu);

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

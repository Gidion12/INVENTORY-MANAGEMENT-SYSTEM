
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Registration extends javax.swing.JFrame {

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;
    JPasswordField p1;
    JButton b1,b2;
   
    public Registration() {
        initComponents();
        
        JLabel L=new JLabel("WELCOME TO OUR PRODUCTS INVENTORY SYSTEM");
        L.setBounds(100,0,550,40);
        L.setFont(new Font("serif",Font.BOLD,20));
        L.setForeground(Color.blue);
        add(L);
        
        l1=new JLabel("Enter First Name");
        l1.setBounds(100,100,200,25);
        add(l1);
        
        b1=new JButton("LOGIN");
        b1.setBounds(300,400,150,30);
        b1.setFont(new Font("serif",Font.ROMAN_BASELINE,20));
        add(b1);
        
        l3=new JLabel("Enter Last Name");
        l3.setBounds(100,150,200,25);
        add(l3);
        
         l4=new JLabel("Enter your Email");
        l4.setBounds(100,200,200,25);
        add(l4);
        
         l5=new JLabel("Enter your Phone NO:");
        l5.setBounds(100,250,200,25);
        add(l5);
        
         l6=new JLabel("Enter your Address");
        l6.setBounds(100,300,200,25);
        add(l6);
        
        l2=new JLabel("Enter Password");
        l2.setBounds(100,350,200,25);
        add(l2);
        
        t1=new JTextField();
        t1.setBounds(250,100,200,25);
        add(t1);
        
        t2=new JTextField();
        t2.setBounds(250,150,200,25);
        add(t2);
        
        t3=new JTextField();
        t3.setBounds(250,200,200,25);
        add(t3);
        
        t4=new JTextField();
        t4.setBounds(250,250,200,25);
        add(t4);
        
          t5=new JTextField();
        t5.setBounds(250,300,200,25);
        add(t5);
        
        p1=new JPasswordField();
        p1.setBounds(250,350,200,25);
        add(p1);
        
        
        
        setBounds(300,0,800,800);
        setBackground(Color.YELLOW);
        setLayout(null);
        setVisible(true);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                new Registration();
                
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

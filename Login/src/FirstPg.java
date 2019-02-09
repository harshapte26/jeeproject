

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Barter Logistics
 */
public class FirstPg extends javax.swing.JFrame {
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
double width = screenSize.getWidth();
double height = screenSize.getHeight();
int x=  (int) Math.round(width);
int y = (int) Math.round(height);
int x1=(int) Math.round(0.5*x);
int x2=(int) Math.round(0.3*x);
int y1=(int) Math.round(0.1*y);
int y2=(int) Math.round(y-y1);
int gx=(int) Math.round(0.01*x);
int gy=(int) Math.round(0.02*y);
int logox=(int) Math.round(((y1-(2*gy))*5.91));
int y3=(int) Math.round(0.05*y);
int  btnx=(int) Math.round(0.08*x);
int x3=(int) Math.round(0.22*x);
int x4=(int) Math.round(0.3*x1);
int x5=(int) Math.round(0.5*(x1-(2*gx)));
int x6=(int) Math.round(0.5*x1);
int x7=(int) Math.round(0.3*x);
int y6=(int) Math.round(y1+0.07*y);
int y7=(int) Math.round(y1+0.2*y);
int y8=(int) Math.round(0.02*x);
int y9=(int) Math.round(y7+y1);
int x9=(int) Math.round(x7+(0.1*x));
int gyl1=(int) Math.round(0.005*y);
int gyl2=(int) Math.round(0.05*y);
int y10=(int) Math.round(y-(8*gy));
int x10=(int) Math.round(x7+(0.15*x));
int x11=(int) Math.round(0.1*x);
int f1=(int) Math.round(0.015*y);
int f2=(int) Math.round(0.022*y);
int f3=(int) Math.round(0.03*y);
int f4=(int) Math.round(0.04*y);

PreparedStatement pst1 = null;
ResultSet rs= null;

//JButton btn;

   public FirstPg() { 
       
       
 JFrame window = new JFrame("JEE TEST PREP | LOGIN");
 ImageIcon imgicon = new ImageIcon("img/icon.png");
 window.setIconImage(imgicon.getImage());

 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBounds(0, 0, x, y1);
    panel.setBackground(new java.awt.Color(204,255,153));
    window.add(panel);
    
    JPanel panelf = new JPanel();
    panelf.setLayout(null);
    panelf.setBounds(0, (y-y1), x, y1);
     panelf.setBackground(new java.awt.Color(204,255,153));
    
     
     JLabel label1= new JLabel();
     JLabel label2= new JLabel("JEE TEST PREP");
     JLabel label3= new JLabel("LOGIN");
       
    BufferedImage img = null;
    
    try{
    img=ImageIO.read(new File("img/logofinal.png"));
    
   
    
   
    label1.setBounds(gx, gy,logox , (y1-(2*gy)));

    Image logo = img.getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon img1 = new ImageIcon(logo);
    
    label1.setIcon(img1);
    
    
    label2.setBounds((x-(gx*15)),gyl1,logox , (y1-(2*gy)));
    label2.setFont(new Font(("Serif"),Font.PLAIN,f2));

    
    label3.setBounds((x-(gx*15)),gyl2,logox , (y1-(2*gy)));
    label3.setFont(new Font(("Serif"),Font.PLAIN,f2));
    }
     catch(IOException e){
    }
    
    

    
    JPanel panel2= new JPanel();
    panel2.setBounds(0, y1,x ,y2 );

    panel2.setBackground(new java.awt.Color(255,255,255));
    
    JLabel login=new JLabel("LOGIN", SwingConstants.CENTER);
    login.setForeground (new java.awt.Color(0,102,204));
    login.setBounds(x1-x3,y6,2*x3,2*y8);
    login.setFont(new Font("Serif",Font.PLAIN,f4));

    
    JLabel labeluname=new JLabel();
    labeluname.setText("USERNAME");
    labeluname.setForeground (new java.awt.Color(0,102,204));
    labeluname.setBounds(x7,y7,x2,y8);
    labeluname.setFont(new Font("Serif",Font.PLAIN,f2));

    
    
    JLabel labelpass=new JLabel();
    labelpass.setText("PASSWORD");
    labelpass.setForeground (new java.awt.Color(0,102,204));
    labelpass.setBounds(x7,y9,x2,y8);
    labelpass.setFont(new Font("Serif",Font.PLAIN,f2));

    
    
    JTextField jfu= new JTextField("100001");
    jfu.setBounds(x9,y7,x3,y8);

     
    JTextField jfp= new JPasswordField("admin");
    jfp.setBounds(x9,y9,x3,y8);

    
    JButton btn = new JButton("Submit");
    btn.setBounds(x10,(y9+y1),x11,2*y8);
    btn.setBackground(new java.awt.Color(204,255,153));
    btn.setFont(new Font(("Serif"),Font.PLAIN,f2));
    window.add(btn);
   
    
    JLabel label4= new JLabel("All copyrights reserved © Subodh Classes 2018 - Designed & Developed by Barter Technologies",SwingConstants.CENTER);
    
    label4.setBounds(x1-x2,(y-5*gy),(2*x2) , (2*gy));
    final URI uri;
        try {
            uri = new URI("http://barterlogistics.in");
       
    label4.addMouseListener(new MouseListener(){
     
     @Override
     public void mouseClicked(MouseEvent e) {
         
         if(Desktop.isDesktopSupported()) {
             try {
                 Desktop.getDesktop().browse(uri); /* TODO: error handling */
             } catch (IOException ex) {
                 Logger.getLogger(FirstPg.class.getName()).log(Level.SEVERE, null, ex);
             }
    } else { /* TODO: error handling */ }
         
     }

     @Override
     public void mousePressed(MouseEvent e) {
         
     }

     @Override
     public void mouseReleased(MouseEvent e) {
         
     }

     @Override
     public void mouseEntered(MouseEvent e) {
      window.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     }

     @Override
     public void mouseExited(MouseEvent e) {
      window.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
     }
    });
     } catch (URISyntaxException ex) {
            Logger.getLogger(FirstPg.class.getName()).log(Level.SEVERE, null, ex);
        }
    label4.setFont(new Font(("Serif"),Font.PLAIN,f1)); 
    
    window.add(login);
    window.add(jfu);   
    window.add(labeluname); 
    window.add(labelpass);
    window.add(jfp);
    
    //window.add(invalid);
    window.add(label4);
    window.add(panelf);
    window.add(panel2);
    panel.add(label1);
    panel.add(label2);
    panel.add(label3);
    
    window.setVisible(true);
    window.setSize(x,y);
    window.setResizable(false);
     String path = (new File("")).getAbsolutePath();
            String url = "jdbc:sqlite:"+path+"/testseries.db";
            //System.out.println(url);
    
    btn.addActionListener(new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent ae){
       
       window.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    String value1=jfu.getText();
    String value2=jfp.getText();
    
       try {
           Class.forName("org.sqlite.JDBC");
          
           Connection conn1= DriverManager.getConnection(url);
          pst1=conn1.prepareStatement("SELECT * from uspasid where username=?;");
          pst1.setString(1, value1);
           
           rs  = pst1.executeQuery(); 
           
           if(rs.next()==(false)){
                   window.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                   JOptionPane.showMessageDialog(null,"Invalid login name or password","Error",JOptionPane.ERROR_MESSAGE);       
           }else{
           //System.out.println(pst1);        
               if(rs.getString("username")==(null)){
                   window.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                   JOptionPane.showMessageDialog(null,"Invalid login name or password","Error",JOptionPane.ERROR_MESSAGE);
               }else if(!rs.getString("password").equals(value2)){
                   window.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                   JOptionPane.showMessageDialog(null,"Invalid login name or password","Error",JOptionPane.ERROR_MESSAGE);
               }else if(rs.getString("password").equals(value2)){
                   
                    SelectPg s=new SelectPg();
                    conn1.close();
                    window.dispose();
                    
               }
               conn1.close();
           }
             
       } catch (SQLException | ClassNotFoundException ex) {
           Logger.getLogger(FirstPg.class.getName()).log(Level.SEVERE, null, ex); 
       
       } 
      
    }
    });
}
   public static void main(String[] args ){
        
           FirstPg firstPg = new FirstPg();
 
       
    }
}




import java.awt.Color;
//import com.itextpdf.text.Image;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 *
 * @author Aishu
 */



public class SelectPg extends JFrame{
    
    String choice1 = new String();
    String choice2 = new String();
    PreparedStatement pst1 = null, pst2=null, pst3=null;
ResultSet rs= null, rs2=null, rs3=null;
List topiclist = new ArrayList();
List rlist = new ArrayList();
String topicNames[];
String repNames[] = {""};
JComboBox<String> ptop = new JComboBox<String>();
String choices = new String();
String choices1 = new String();

String[] subch = { "Choose Subject","Physics","Chemistry", "Maths"};
    JComboBox<String> subj = new JComboBox<String>(subch);
     JButton btns = new JButton("Start");
     
    String[] psubch = { "Choose Subject", "Physics","Chemistry", "Maths"};
    JComboBox<String> psub = new JComboBox<String>(psubch);
    String[] pstdch = { "Choose Standard", "11","12"};
    JComboBox<String> pstd = new JComboBox<String>(pstdch);
    JButton pbtn = new JButton("Start");
    
    String[] replist = { "Choose Test", "Full Portion Test","Subjectwise Test"};
    JComboBox<String> repch = new JComboBox<String>(replist);
    JButton rbtn = new JButton("Download");
    
    JComboBox<String> files = new JComboBox<String>();
    Connection conn =null;
    String path=null;
    
    public SelectPg(){
        setResizable(true);
 setLayout(null);   
setDefaultCloseOperation(javax.swing. WindowConstants.EXIT_ON_CLOSE);
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
int x3=(int) Math.round(0.2*x);
int x4=(int) Math.round(0.3*x1);
int x5=(int) Math.round(0.5*(x1-(2*gx)));
int x6=(int) Math.round(0.5*x1);
int x7=(int) Math.round(0.27*x);
int y6=(int) Math.round(y1+0.2*y);
int y7=(int) Math.round(y1+0.3*y);
int y8=(int) Math.round(0.04*y);
int y9=(int) Math.round(y7+0.5*y1);
int x9=(int) Math.round(x7+(0.1*x));
int gyl1=(int) Math.round(0.005*y);
int gyl2=(int) Math.round(0.05*y);
int y10=(int) Math.round(y-(8*gy));
int x10=(int) Math.round(x1+(0.25*x));
int x11=(int) Math.round(0.03*x);
int x12=(int) Math.round(0.08*x);
int x13 = (int) Math.round(0.04*x);
int f1=(int) Math.round(0.015*y);
int f2=(int) Math.round(0.022*y);
int f3=(int) Math.round(0.03*y);
int y11=(int) Math.round(y1+0.03*y);


 path = (new File("")).getAbsolutePath();
            String url = "jdbc:sqlite:"+path+"/testseries.db";
            //System.out.println(url);
        try {
            Class.forName("org.sqlite.JDBC");
            conn= DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SelectPg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 
 JFrame window2 = new JFrame("JEE TEST PREP | MENU");
 ImageIcon imgicon = new ImageIcon("img/icon.png");
 window2.setIconImage(imgicon.getImage());

 JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBounds(0, 0, x, y1);
     panel.setBackground(new java.awt.Color(204,255,153));
    window2.add(panel);
       
    BufferedImage img = null;
    //BufferedImage imgx=null;
   // BufferedImage imgz=null;
    try{
    img=ImageIO.read(new File("img/logofinal.png"));
   // imgx=ImageIO.read(new File("img/123.jpg"));
   // imgz=ImageIO.read(new File("img/1.png"));
    }
    catch(Exception e){
    }
    
     JLabel label1= new JLabel();
    label1.setBounds(gx, gy,logox , (y1-(2*gy)));
   
    Image logo = img.getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon img1 = new ImageIcon(logo);
    
    label1.setIcon(img1);
    
    JLabel label2= new JLabel("JEE TEST PREP");
    label2.setBounds((x-(gx*15)),gyl1,logox , (y1-(2*gy)));
    label2.setFont(new Font(("Serif"),Font.PLAIN,f2));
 
    
    JLabel label3= new JLabel("MENU");
    label3.setBounds((x-(gx*15)),gyl2,logox , (y1-(2*gy)));
    label3.setFont(new Font(("Serif"),Font.PLAIN,f2));
  
   JLabel label5= new JLabel("SELECT THE TEST", SwingConstants.CENTER);
    label5.setBounds((x1-x2),2*y1,2*x2,y8);
    label5.setFont(new Font(("Serif"),Font.PLAIN,f3));
   
    JPanel panel2= new JPanel();
    panel2.setBounds(0, y1,x ,y2 );
  
    panel2.setBackground(new java.awt.Color(255,255,255));
    
    JPanel panelf = new JPanel();
    panelf.setLayout(null);
    panelf.setBounds(0, (y-y1-gy), x, y1+gy);
     panelf.setBackground(new java.awt.Color(204,255,153));
    
    JButton full = new JButton("Full Syllabus Test");
    full.setBounds(x13,y6,x3,y1);
 
    full.setFont(new Font(("Serif"),Font.PLAIN,f3));
    full.setBackground(new java.awt.Color(204,230,255));
    full.setOpaque(true);
    full.setBorder(null);
    
    JButton sub = new JButton("Subjectwise Test");
    sub.setBounds(2*x13+x3,y6,x3,y1);

    sub.setFont(new Font(("Serif"),Font.PLAIN,f3));
    sub.setBackground(new java.awt.Color(204,230,255));
    sub.setOpaque(true);
    sub.setBorder(null);
    
    JButton top = new JButton("Topicwise Practice");
    top.setBounds(3*x13+2*x3,y6,x3,y1);
    top.setFont(new Font(("Serif"),Font.PLAIN,f3));
    top.setBackground(new java.awt.Color(204,230,255));
    top.setOpaque(true);
    top.setBorder(null);
    
    JButton rep = new JButton("Report");
    rep.setBounds(4*x13+3*x3,y6,x3,y1);

    rep.setFont(new Font(("Serif"),Font.PLAIN,f3));
    rep.setBackground(new java.awt.Color(204,230,255));
    rep.setOpaque(true);
    rep.setBorder(null);

    
    subj.setBounds(2*x13+x3,y9,x3,y8);
    subj.setFont(new Font(("Serif"),Font.PLAIN,f2));
    subj.setBackground(Color.white);
    
    btns.setBounds(2*x13+x3,(y9+2*y1),x3,y8);
    btns.setFont(new Font(("Serif"),Font.PLAIN,f2));
    btns.setBackground(new java.awt.Color(204,255,153)); 
   
    
    
    psub.setBounds(3*x13+2*x3,y9,x3,y8);
    psub.setFont(new Font(("Serif"),Font.PLAIN,f2));
    psub.setBackground(Color.white);
    
    pstd.setBounds(3*x13+2*x3,y9+y1,x3,y8);
    pstd.setFont(new Font(("Serif"),Font.PLAIN,f2));
    pstd.setBackground(Color.white);
    
    repch.setBounds(4*x13+3*x3,y9,x3,y8);
    repch.setFont(new Font(("Serif"),Font.PLAIN,f2));
    repch.setBackground(Color.white);
    
    files.setBounds(4*x13+3*x3,(y9+y1),x3,y8);
    files.setFont(new Font(("Serif"),Font.PLAIN,f2));
    files.setBackground(Color.white);
    
    String[] ptopch = (String[]) topicNames;
    
    ptop.setVisible(false);
    ptop.setBounds(3*x13+2*x3,(y9+2*y1),x3,y8);
    ptop.setFont(new Font(("Serif"),Font.PLAIN,f2));
    ptop.setBackground(Color.white);
    
     pbtn.setBounds(3*x13+2*x3,(y9+3*y1),x3,y8);
 
    pbtn.setFont(new Font(("Serif"),Font.PLAIN,f2));
    pbtn.setBackground(new java.awt.Color(204,255,153)); 
    
    rbtn.setBounds(4*x13+3*x3,(y9+2*y1),x3,y8);

    rbtn.setFont(new Font(("Serif"),Font.PLAIN,f2));
    rbtn.setBackground(new java.awt.Color(204,255,153)); 


    
    JButton logout = new JButton("Logout");
    logout.setBounds((x-(gx*12)),(y-3*gy-y8),x12,y8);

    logout.setFont(new Font(("Serif"),Font.PLAIN,f2));
    logout.setBackground(Color.RED);
    logout.setForeground(Color.white);
    logout.setOpaque(true);
    logout.setBorder(null);
    
    psub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if("Choose Subject".equals(psub.getSelectedItem().toString())){
               pstd.setVisible(false);
               ptop.setVisible(false);
               pbtn.setVisible(false);
               
               } else {
               pstd.setVisible(true);         
                }
            }
    });
     
    pstd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                
                if("Choose Standard".equals(pstd.getSelectedItem().toString())){
               ptop.setVisible(false);
              
               pbtn.setVisible(false);
               
           } else {
                ptop.setVisible(false);
                JComboBox pstd = (JComboBox) event.getSource();

                Object selected = psub.getSelectedItem();
               
               if(selected.toString().equals("Physics")) {
                    
                        choice1 = "P";
                        
               }
               else if(selected.toString().equals("Chemistry")) {
                    
                        choice1 = "C";
                        
               }
               else if(selected.toString().equals("Maths")) {
                    
                        choice1 = "M";
                        
               }
                    
               String choice2 = pstd.getSelectedItem().toString();
                    try{
                        
        
        pst1=conn.prepareStatement("SELECT topicname from topiclist where subjectcode=? AND standard = ?;");
        pst1.setString(1,choice1);
        pst1.setString(2, choice2);
        
        rs=pst1.executeQuery();
     
 }
    catch( Exception f){ 
    }

            topiclist.clear();
            topiclist.add("Choose Topic");
        
        try {
            while (rs.next()) {
                topiclist.add(rs.getString(1));
                topicNames = (String[]) topiclist.toArray(new String[topiclist.size()]);
               
            }       } catch (SQLException ex) {
            Logger.getLogger(SelectPg.class.getName()).log(Level.SEVERE, null, ex);   
        }
       
        
        ptop.setVisible(true);
        ptop.setModel(new DefaultComboBoxModel((Object[]) topicNames));
    
                }
                
            } 
        });
    
                        
    
    
   
    
    logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                FirstPg fp=new FirstPg();
                window2.dispose();
            }
    });
    
    
    JLabel label4= new JLabel("All copyrights reserved © Subodh Classes 2018 - Designed & Developed by Barter Technologies",SwingConstants.CENTER);
    
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
      window2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     }

     @Override
     public void mouseExited(MouseEvent e) {
      window2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
     }
    });
    } catch (URISyntaxException ex) {
            Logger.getLogger(SelectPg.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    label4.setBounds(x1-x2,(y-5*gy),(2*x2) , (gy));

    label4.setFont(new Font(("Serif"),Font.PLAIN,f1));
    
    subj.setVisible(false);
    btns.setVisible(false);
    rbtn.setVisible(false);
    psub.setVisible(false);
    pbtn.setVisible(false);
    repch.setVisible(false);
    files.setVisible(false);
    pstd.setVisible(false);
    window2.add(files);
    window2.add(repch);
    window2.add(logout);
    window2.add(subj);
    window2.add(btns);
    window2.add(rbtn);
    window2.add(full);
    window2.add(sub);
    window2.add(top);
  //  window2.add(report);
    window2.add(pstd);
    window2.add(psub);
    window2.add(ptop);
    window2.add(pbtn);
    window2.add(rep);
    window2.add(label4);
    window2.add(label5);
    window2.add(panelf);
    window2.add(panel2);
     panel.add(label1);
    panel.add(label2);
    panel.add(label3);
    
    
     window2.setVisible(true);
    window2.setSize(x,y);
    window2.setResizable(false);
    
    full.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
       visibility();
       full.setBackground(new java.awt.Color(204,255,153));
      top.setBackground(new java.awt.Color(204,230,255)); 
            sub.setBackground(new java.awt.Color(204,230,255));
            rep.setBackground(new java.awt.Color(204,230,255)); 
            
      int res = JOptionPane.showConfirmDialog(window2, "Starting Full Portion Test Now", "Full Test", JOptionPane.OK_CANCEL_OPTION);
      if(res == JOptionPane.CLOSED_OPTION){
          
      }
      if(res == JOptionPane.OK_OPTION){
      window2.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
      Start3 s3=new Start3();
      window2.dispose();
      }
      
    //s.setVisible(true);
    
   }
    });
    
    
    sub.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            visibility();
            subj.setVisible(true);
            sub.setBackground(new java.awt.Color(204,255,153)); 
            full.setBackground(new java.awt.Color(204,230,255));
            top.setBackground(new java.awt.Color(204,230,255));
            rep.setBackground(new java.awt.Color(204,230,255)); 
        }
    });
    
     subj.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               if("Choose Subject".equals(subj.getSelectedItem().toString())){
               btns.setVisible(false);
              
               
               
           } else {
                
            choices = subj.getSelectedItem().toString();
            btns.setVisible(true);
            }
            }
     });
     
      rep.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            visibility();
            sub.setBackground(new java.awt.Color(204,230,255));
            top.setBackground(new java.awt.Color(204,230,255));
            full.setBackground(new java.awt.Color(204,230,255));
            rep.setBackground(new java.awt.Color(204,255,153)); 
            repch.setVisible(true);
            
            
        }
    });
      
      repch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            choices1 = repch.getSelectedItem().toString();
            
            if(choices1=="Full Portion Test")
            {
                choices1="1";
            }
            if(choices1=="Subjectwise Test")
            {
                choices1="2";
            }
            if(choices1=="Choose Test"){
                files.setVisible(false);
                return;
            }
           
            
                     
        try{
        //Class.forName("org.sqlite.JDBC");
       // Connection conn= DriverManager.getConnection("jdbc:sqlite:testseries.db");
        pst3=conn.prepareStatement("SELECT file_name, marks from report_table where test_type=? order by id desc;");
        pst3.setString(1,choices1);
        
        rs=pst3.executeQuery();
       
 }
    catch(      SQLException f){
    }
            
            rlist.clear();
            rlist.add("Choose Report");
                   
        
        try {
            while (rs.next()) {
                if(choices1=="1"){
                    rlist.add(rs.getString(1)+"-"+String.valueOf(rs.getInt(2))+"/360");
                } 
                if(choices1=="2"){
                    rlist.add(rs.getString(1)+"-"+String.valueOf(rs.getInt(2))+"/120");
                } 
                repNames = (String[]) rlist.toArray(new String[rlist.size()]);
                
            }       } catch (SQLException ex) {
            Logger.getLogger(SelectPg.class.getName()).log(Level.SEVERE, null, ex);   
        }
       
       
        if(repNames.length>1){
        files.setModel(new DefaultComboBoxModel((Object[]) repNames));
        }else{
            
        }
                
            
            files.setVisible(true); 
            
            }
     });
      
      files.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            //System.out.println(files.getSelectedItem().toString());
        
               rbtn.setVisible(true);
            
        }
    });
      
      rbtn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            
            choices1 = files.getSelectedItem().toString().substring(0, 17);
           //System.out.println(path+"/reports/"+choices1+".pdf");
            try {
           
        File pdfFile = new File(path+"/reports/"+choices1+".pdf");
        if (pdfFile.exists()) {

            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(pdfFile);
            }
        } 
      } catch (Exception ex) {
        ex.printStackTrace();
      }
        }
    });
      
      
    
    btns.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
    //JOptionPane.showMessageDialog(window2, "Choice is :" + choices);
    int res = JOptionPane.showConfirmDialog(window2, "Starting Subjectwise Test: " + choices, "Subjectwise Test", JOptionPane.OK_CANCEL_OPTION);
      if(res == JOptionPane.CLOSED_OPTION){
          
      }
      if(res == JOptionPane.OK_OPTION){
      window2.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
      Start2 s=new Start2(choices);
      window2.dispose();
      }
    
   }
    });
     
     top.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            visibility();
            top.setBackground(new java.awt.Color(204,255,153)); 
            full.setBackground(new java.awt.Color(204,230,255));
            sub.setBackground(new java.awt.Color(204,230,255));
            rep.setBackground(new java.awt.Color(204,230,255)); 
            psub.setVisible(true);
        }
    });
     
     ptop.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            if("Choose Topic".equals(ptop.getSelectedItem().toString())){
               pbtn.setVisible(false);
           } else {
               pbtn.setVisible(true);
            }
        }
    });
     
    pbtn.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent ae){
       
               choices = psub.getSelectedItem().toString(); 
               choice1 = ptop.getSelectedItem().toString();
               
               try{
        //Class.forName("org.sqlite.JDBC");
        //Connection conn= DriverManager.getConnection("jdbc:sqlite:testseries.db");
        pst2=conn.prepareStatement("SELECT subjectcode, topiccode from topiclist where topicname = ? AND standard=?;");
        pst2.setString(1,choice1);
        pst2.setString(2, pstd.getSelectedItem().toString());
        
        rs2=pst2.executeQuery();
        
        try {
            while (rs2.next()) {
                choices = rs2.getString("subjectcode");
                choice1 = rs2.getString("topiccode");
               
            }       } catch (SQLException ex) {
            Logger.getLogger(SelectPg.class.getName()).log(Level.SEVERE, null, ex);   
        }
     
 }
    catch( Exception f){
    }
               
       Start1 s=new Start1(choices, choice1);
    //
    window2.dispose();
   }
    });
    }
    public void updatecombo(){
        ptop.removeAllItems();
        files.removeAllItems();
    }
    public void visibility(){
    subj.setVisible(false);
    btns.setVisible(false);
    rbtn.setVisible(false);
    psub.setVisible(false);
    ptop.setVisible(false);
    pstd.setVisible(false);
    pbtn.setVisible(false);
    
    repch.setVisible(false);
    files.setVisible(false);
    }
}



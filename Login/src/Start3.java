
import com.itextpdf.text.Chunk;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfEncryptor;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import java.awt.Cursor;
import java.io.IOException;
import java.security.Security;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.jce.provider.BouncyCastleProvider;


public class Start3 extends JFrame {

static JFrame window = new JFrame("JEE TEST PREP | FULL PORTION TEST");
static  JLabel questionlb = new JLabel("QCode:",SwingConstants.CENTER);
static JLabel subject = new JLabel("P",SwingConstants.CENTER);
static  JLabel topic = new JLabel("1",SwingConstants.CENTER);
static JLabel questionno = new JLabel("1",SwingConstants.CENTER);
static    JTextArea jt = new JTextArea();
static JRadioButton opt1= new JRadioButton();
static JRadioButton opt2= new JRadioButton();
static  JRadioButton opt3= new JRadioButton();
static JRadioButton opt4= new JRadioButton();
static ButtonGroup optbtn = new ButtonGroup();

static PreparedStatement pst=null,pst1=null,pst2=null,pst3=null,pst4=null,pst5=null,pst6=null,pst7=null,pst8=null,pst9=null,pst10=null,pst11=null,pst12=null,pst13=null,pst14=null, pst15=null, pst16=null, pst17=null, pst18=null, pst19=null,pst20=null,pst21=null,pst22=null,pst23=null, pst24=null;
static ResultSet rs= null,rs1=null,rs2=null,rs3=null,rs5=null,rs6=null,rs7=null, rs8=null;
Connection conn = null;
static  JTextArea solutionText = new JTextArea();
static JPanel panel = new JPanel();
static JPanel panel2= new JPanel();
static JLabel label1= new JLabel();
static JLabel timelbl = new JLabel("00:00:00");
static JButton btn = new JButton("SKIP");
//static JButton btn1 = new JButton("SUBMIT");    
static JButton btn2 = new JButton("NEXT");
static JButton btnsub1 = new JButton("PHYSICS");
static JButton btnsub2 = new JButton("CHEMISTRY");
static JButton btnsub3 = new JButton("MATHS");
static JButton btnend = new JButton("END TEST");
static JButton btnnext = new JButton("NEXT");
static JButton btnprev = new JButton("PREVIOUS");
static JLabel labelq= new JLabel();
static JLabel labela= new JLabel();
static JLabel labels1= new JLabel();
static JPanel panel1= new JPanel();
static String clickedanswer="";
//Image for Question Answer And Solution
static BufferedImage imgq = null;
static BufferedImage imgo=null;
static BufferedImage imgs=null;
static BufferedImage ximg=null;
static JButton[] n=null;
// String str1=null;
//Getting ScreenSize
static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
static double width = screenSize.getWidth();
static double height = screenSize.getHeight();

//Co-Ordinate System
static int x=  (int) Math.round(width);
static int y = (int) Math.round(height);
static int x1=(int) Math.round(0.7*x);
static int x2=(int) Math.round(0.3*x);
static int y1=(int) Math.round(0.1*y);
static int y2=(int) Math.round(y-y1);
static int gx=(int) Math.round(0.01*x);
static int gy=(int) Math.round(0.025*y);
static int logox=(int) Math.round(((y1-(2*gy))*5.91));
static int y3=(int) Math.round(0.05*y);
static int  btnx=(int) Math.round(0.08*x);
static int x3=(int) Math.round(0.22*x);
static int x4=(int) Math.round(0.2*x1);
static int x5=(int) Math.round(0.5*(x1-(2*gx)));
static int x6=(int) Math.round(0.5*x1);
static int gx2=(int) Math.round(3*gx);
static int gy2=(int) Math.round(1.5*gy);
static int f1=(int) Math.round(0.015*y);
static int f2=(int) Math.round(0.022*y);
static int f3=(int) Math.round(0.05*y);
static int x7=(int) Math.round(0.5*x2);

static Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
static Border margin = new EmptyBorder(5,5,5,5);
static int counter=0;
static int counter2=0;
static int value;
static int i;
static int qcounter=90;
static int qremainder=30;
static int a,b,c;
static int count;
static Rectangle rv; 
public ActionListener ae1;
Timer timer = new Timer(1000, ae1);
static boolean stoprequest;
String selectans = "";
String path = null; 

public Start3()
{
    ImageIcon imgicon = new ImageIcon("img/icon.png");
 window.setIconImage(imgicon.getImage());

     
    //rv.setBounds((x1+2*gx),(y1+25*gy),(11*gx),(gy2));
   
    path = (new File("")).getAbsolutePath();
            String url = "jdbc:sqlite:"+path+"/testseries.db";
   
    try{
        
        Class.forName("org.sqlite.JDBC");
        conn= DriverManager.getConnection(url);
        pst5=conn.prepareStatement("drop table if exists temp_tbl;");
        pst5.executeUpdate();
        pst6=conn.prepareStatement("CREATE TABLE temp_tbl (\n" +
                                    "    id          INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                                    "    subjectcode VARCHAR,\n" +
                                    "    topiccode   INTEGER,\n" +
                                    "    questionno  INTEGER,\n" +
                                    "    question    VARCHAR,\n" +
                                    "    qimage      VARCHAR,\n" +
                                    "    op1         VARCHAR,\n" +
                                    "    op2         VARCHAR,\n" +
                                    "    op3         VARCHAR,\n" +
                                    "    op4         VARCHAR,\n" +
                                    "    optimage    VARCHAR,\n" +
                                    "    ca          VARCHAR,\n" +
                                    "    solution    VARCHAR,\n" +
                                    "    solimage    VARCHAR,\n" +
                                    "    checkq      INTEGER,\n" +
                                    "    qcolor      VARCHAR,\n" +
                                    "    chkans      VARCHAR,\n" +
                                    "    marks       DECIMAL\n"+
                                    ");");
        pst6.executeUpdate();
        pst7=conn.prepareStatement("INSERT INTO temp_tbl(subjectcode,topiccode,questionno,question,qimage,op1,op2,op3,op4, optimage,ca,solution,solimage,checkq,qcolor,chkans,marks)\n" +
                                    "SELECT subjectcode, topiccode,questionno,question,qimage,op1,op2,op3,op4,optimage,ca,solution,solimage,checkq,qcolor,'NULL', '0.0' FROM question_full\n" +
                                    "where subjectcode = 'P' AND checkq = 0 ORDER BY RANDOM() LIMIT 0,30;");
        pst7.executeUpdate();
        pst8=conn.prepareStatement("INSERT INTO temp_tbl(subjectcode,topiccode,questionno,question,qimage,op1,op2,op3,op4, optimage,ca,solution,solimage,checkq,qcolor,chkans,marks)\n" +
                                    "SELECT subjectcode, topiccode,questionno,question,qimage,op1,op2,op3,op4,optimage,ca,solution,solimage,checkq,qcolor,'NULL', '0.0' FROM question_full\n" +
                                    "where subjectcode = 'C' AND checkq = 0 ORDER BY RANDOM() LIMIT 0,30;");
        pst8.executeUpdate();
        pst9=conn.prepareStatement("INSERT INTO temp_tbl(subjectcode,topiccode,questionno,question,qimage,op1,op2,op3,op4, optimage,ca,solution,solimage,checkq,qcolor,chkans,marks)\n" +
                                    "SELECT subjectcode, topiccode,questionno,question,qimage,op1,op2,op3,op4,optimage,ca,solution,solimage,checkq,qcolor,'NULL', '0.0' FROM question_full\n" +
                                    "where subjectcode = 'M' AND checkq = 0 ORDER BY RANDOM() LIMIT 0,30;");
        pst9.executeUpdate();
        //pst17=conn.prepareStatement("ALTER TABLE temp_tbl ADD chkans VARCHAR(10);");
          //pst22=conn.prepareStatement("ALTER TABLE temp_tbl ADD marks decimal(1,0) DEFAULT 0.0;");
          pst24 = conn.prepareStatement("Select count(id) from temp_tbl;");

        
        //pst17.executeUpdate();
        //pst22.executeUpdate();
        rs8 = pst24.executeQuery(); 
        while(rs8.next()){
                count = Integer.parseInt(rs8.getString(1)); 
                
            } 
    } catch (SQLException | ClassNotFoundException ex) {
        Logger.getLogger(Start3.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    
    window.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    JOptionPane.showMessageDialog(window, "Are you sure you want to end the test?");
                    closingtest();
                }
    });
    
    //End Test Logic
    btnend.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to  end the test ?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                
                closingtest();
                
                 SelectPg S = new SelectPg();
                 window.dispose();                 
            }
        }
    });
    
    a=3;
    b=0;
    c=0;  

    newthr.start();
    btn.setOpaque(true);
    btn.setBorder(null);
 
     btn2.setOpaque(true);
    btn2.setBorder(null);
    
     btnnext.setOpaque(true);
    btnnext.setBorder(null);
    
     btnprev.setOpaque(true);
    btnprev.setBorder(null);
    
     btnsub1.setOpaque(true);
    btnsub1.setBorder(null);
     btnsub2.setOpaque(true);
    btnsub2.setBorder(null);
     btnsub3.setOpaque(true);
    btnsub3.setBorder(null);
    
     btnend.setOpaque(true);
    btnend.setBorder(null);
 

//Subject 1 Button
btnsub1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(n[1].getText().equals("1")){
                n[1].doClick();
                
            }
            else{
                btnprev.doClick();
            }
        }
});

//Subject 2 Button
btnsub2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(n[1].getText().equals("1")){
                n[31].doClick();
                
            }
            else{
                btnprev.doClick();
                n[31].doClick();
            }
        }
});

//Subject 3 Button
btnsub3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(n[1].getText().equals("61")){
                n[1].doClick();
                
            }
            else{
                btnnext.doClick();
                
            }
        }
});
 
try{
    //Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/testseries","root","root123");
        pst12=conn.prepareStatement("UPDATE temp_tbl set qcolor='G' where id=? ");
        pst13=conn.prepareStatement("UPDATE temp_tbl set qcolor='Y' where id=? ");
        
} catch (SQLException ex) {
        Logger.getLogger(Start3.class.getName()).log(Level.SEVERE, null, ex);
}
        //NEXT QUESTION BUTTON
    btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.         
            counter=Integer.parseInt(questionno.getText());
            
            try {
                pst12.setString(1, questionno.getText());
                pst12.execute();
                
               
            } catch (SQLException ex1) {
                Logger.getLogger(Start3.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
           
            
            
            if(counter>60){
             counter = counter - 60;
         }
            try{
            //Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/testseries","root","root123");
            pst18 = conn.prepareStatement("UPDATE temp_tbl SET chkans = ? WHERE id = ?;");
            pst18.setString(2, questionno.getText());
            
            if(opt1.isSelected()){        
            int x = 0; 
            x = Integer.parseInt(questionno.getText()); 
            if(x>=61){
                x=x-60;
            }
            pst18.setString(1, "A");
            pst18.execute();
            n[x].setBackground(Color.green);
            x = Integer.parseInt(questionno.getText()); 
            counter=Integer.parseInt(questionno.getText());
            
            questionno.setText(String.valueOf(counter+1));
            
            question(counter+1);
            adding();
            }    
            else if(opt2.isSelected()){
          
            x = Integer.parseInt(questionno.getText()); 
            if(x>=61){
                x=x-60;
            }
            pst18.setString(1, "B");
            pst18.execute();
            n[x].setBackground(Color.green);
            x = Integer.parseInt(questionno.getText()); 
            counter=Integer.parseInt(questionno.getText());
            questionno.setText(String.valueOf(counter+1));
            question(counter+1);
            adding();
            }
             else if(opt3.isSelected()){
           
            x = Integer.parseInt(questionno.getText()); 
            if(x>=61){
                x=x-60;
            }
            pst18.setString(1, "C");
            pst18.execute();
            n[x].setBackground(Color.green);
            x = Integer.parseInt(questionno.getText()); 
            counter=Integer.parseInt(questionno.getText());
            questionno.setText(String.valueOf(counter+1));
            question(counter+1);
            adding();
            }
             else if(opt4.isSelected()){
           
            x = Integer.parseInt(questionno.getText()); 
            if(x>=61){
                x=x-60;
            }
            pst18.setString(1, "D");
            pst18.execute();
            n[x].setBackground(Color.green);
            x = Integer.parseInt(questionno.getText()); 
            counter=Integer.parseInt(questionno.getText());
            questionno.setText(String.valueOf(counter+1));
            question(counter+1);
            adding();
            }
             else{
                  JOptionPane.showMessageDialog(window, "Please Select An Option or Skip The Question");
                 
             }
            counter=0;
            }
            catch (SQLException ex1) {
                Logger.getLogger(Start3.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    });
    
    //SKIP QUESTION BUTTON
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            int x = Integer.parseInt(questionno.getText());
         
            try {
                pst13.setString(1, questionno.getText());
                pst13.execute();
                
            } catch (SQLException ex1) {
                Logger.getLogger(Start3.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
             if(count == x){
                JOptionPane.showMessageDialog(window, "End of Test");
                questionno.setText(String.valueOf(x-1));
            }
            
            if(x>60){
             x = x - 60;
         }
            
            if(n[x].getBackground()==Color.green){
             
         }else{
          n[x].setBackground(Color.yellow);   
         }
         
         counter=Integer.parseInt(questionno.getText())+1;
        
        
        questionno.setText(String.valueOf(counter));
        question(counter);
        adding();
        counter=0;
        }
    });

    jt.setFont(new Font("Serif",Font.PLAIN,f2));
    jt.setCaretPosition(0);
    jt.setEditable(false);
    jt.setLineWrap(true);
    jt.setBounds(gx,(2*y1+gy),(x1-(2*gx)),(y1));
 
    panel.setLayout(null);
    panel.setBounds(0, 0, x, y1);
    panel.setBackground(new java.awt.Color(204,255,153));
        
//Logo Of Company
    label1.setBounds(gx, gy,logox , (y1-(2*gy)));
    try{
        ximg=ImageIO.read(new File("img/logofinal.png"));
    }
    catch(IOException e8){
    }
    Image logo = ximg.getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon img1 = new ImageIcon(logo);
    label1.setIcon(img1);
        
//White Panel  
    panel1.setBounds(0, y1,x1 ,y2 );
    panel1.setBackground(Color.WHITE);
        
//Question Pallete Panel
    panel2.setBounds(x1, y1,x2 ,y2 );
    panel2.setBackground(new java.awt.Color(246,246,246));    
        
              
 //Question Id Start
    questionlb.setBounds(x1+gx, y1+4*gy, 7*gx, y3);
    questionlb.setFont(new Font("Serif", Font.PLAIN,f2));
    questionlb.setBorder(border);
    subject.setBounds(x1+8*gx, y1+4*gy, 7*gx, y3);
    subject.setFont(new Font("Serif", Font.PLAIN,f2));
    subject.setBorder(border);
    topic.setBounds(x1+15*gx, y1+4*gy, 7*gx, y3);
    topic.setBorder(border);
    topic.setFont(new Font("Serif", Font.PLAIN,f2));
    questionno.setBounds(x1+22*gx, y1+4*gy, 7*gx, y3);
    questionno.setFont(new Font("Serif", Font.PLAIN,f2));
    questionno.setBorder(border);
//Question Id End
 
// Button Generation
    
        n= new JButton[61];
    
     
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(e.getSource() instanceof JButton){
            String s1 = ((JButton) e.getSource()).getText();
           
            question(Integer.parseInt(s1));
            
            adding();
            }
        }
    };
     
    for(int i=1;i<61;i++){
     
        n[i]=new JButton();
        n[i].addActionListener(listener);
    }
    
     
    try{
        String match1="";
        
        
        match1=questionno.getText();
        //  Class.forName("com.mysql.jdbc.Driver");
        //Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/testseries","root","root123");
        pst3=conn.prepareStatement("SELECT qcolor from temp_tbl where id=?");
        pst3.setString(1,match1);
        
        for(int j=1;j<=6;j++){          

            for(int k=1;k<=10;k++){
                //int value=0;
                value=(k-1)*6+(j);
                if(value<=61){
                    pst3.setString(1,String.valueOf(value));
                    rs2=pst3.executeQuery();
                    n[value].setBounds((x1+j*4*gx),(y1+5*gy+k*2*gy),(gx2),(gy2));
                    n[value].setMargin(new Insets(0,0,0,0));
                    n[value].setFont(new Font("Serif",Font.PLAIN,f1));
                    n[value].setText(""+value);
                    n[value].setBackground(null);
                     n[value].setOpaque(true);
                     n[value].setBorder(null);
                    window.add(n[value]);
                }
                //n.setName("n"+(value));
            }
        }
    }
    catch(SQLException e3){
    }
     
    btnnext.addActionListener(new ActionListener() {   
    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(n[60].getText());
            value=a+1;
            int qrem1=30;
            
            if(qremainder<61){
                qrem1=qremainder;
            }
            
        try{
            for( i=value;i<value+qrem1;i++){
                pst3.setString(1, String.valueOf(i));

                rs2=pst3.executeQuery();
                n[i-value+1].setText(""+i);
                n[i-value+1].setOpaque(true);
                     n[i-value+1].setBorder(null);
                
                
                while(rs2.next()){              
                    
                    if(rs2.getString("qcolor").equals("G")){
                        n[i-value+1].setBackground(Color.GREEN);
                    }
                
                    if(rs2.getString("qcolor").equals("Y")){
                        n[i-value+1].setBackground(Color.yellow);         
                    }
            
                    if(rs2.getString("qcolor").equals("B")){
                        n[i-value+1].setBackground(null);
                    }
                }
            }
        }
        catch(SQLException e4){
        }
        
        qremainder=qremainder-60;
        if(qremainder<1){
           
           btnnext.setVisible(false);
           for(i=(61-(qremainder*-1));i<61;i++){
           n[i].setVisible(false);
           }
           
       }
       
       btnprev.setVisible(true);

      
        value=i-1;
      n[1].doClick();
       }
   });
     btnnext.setVisible(true);
     btnprev.setVisible(true);
     if(qcounter<=60){
     btnnext.setVisible(false);
   
     }
     if(Integer.parseInt(n[1].getText())==1){
     btnprev.setVisible(false);
     }
     try{
     if(qremainder<1){
     btnnext.setVisible(false);

     }
     
     
     }
     catch(Exception e6){
     }
     
     btnprev.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
           int a=(Integer.parseInt(n[1].getText()));
        // int  b=a-60+1;
         int x=1;
         
         try{
             for(i=a-60;i<a;i++){
             
         pst3.setString(1, String.valueOf(i));
         rs2=pst3.executeQuery();
        
         if(i>0){
             n[x].setText(""+(i));
             }
            
          while(rs2.next()){
         if(rs2.getString("qcolor").equals("G")){
          n[x].setBackground(Color.GREEN);
          
           }
            if(rs2.getString("qcolor").equals("Y")){
          n[x].setBackground(Color.yellow);
          
           }
            if(rs2.getString("qcolor").equals("B")){
            n[x].setBackground(null);
            }
            
          
          } 
            n[x].setOpaque(true);
            n[x].setBorder(null);
          if(x<60)
            {
              x++; 
            }
         
             n[value].setOpaque(true);
                     n[value].setBorder(null);
             }
         
         }
         catch(SQLException e5){
}
         
        qremainder=qremainder+60;
        for(i=qremainder+1;i<61;i++){
        n[i].setVisible(true);
        }
        btnnext.setVisible(true);
        if(Integer.parseInt(n[1].getText())==1){
        btnprev.setVisible(false);
        }
        n[1].doClick();
        }
         
        });
   
     //NEXT BUTTON
      btnnext.setBounds((x1+16*gx),(7*y1+4*gy),(11*gx),(gy2));
        btnnext.setMargin(new Insets(0,0,0,0));
      btnnext.setFont(new Font(("Serif"),Font.PLAIN,f2));
        //PREVIOUS BUTTON
      btnprev.setBounds((x1+4*gx),(7*y1+4*gy),(11*gx),(gy2));
      btnprev.setMargin(new Insets(0,0,0,0));
      btnprev.setFont(new Font(("Serif"),Font.PLAIN,f2));
        
      timelbl.setBounds((x1),(y1+gy),(x2),(gy2));
      timelbl.setFont(new Font(("Serif"),Font.PLAIN,f3));
      //timelbl.setBorder(new CompoundBorder(border, margin));
      timelbl.setHorizontalAlignment(JLabel.CENTER);
       timelbl.setForeground(Color.BLACK);
      
     //Question Image
        labelq.setBorder(new CompoundBorder(border, margin));
        labela.setBorder(new CompoundBorder(border, margin));
        labels1.setBorder(new CompoundBorder(border, margin));
        
        // Subject 1 button UI
        btnsub1.setBounds((4*gx),(y1+2*gy),(11*gx),(gy2));
        btnsub1.setMargin(new Insets(0,0,0,0));
        btnsub1.setFont(new Font(("Serif"),Font.PLAIN,f2));
        
        // Subject 2 button UI
        btnsub2.setBounds((20*gx),(y1+2*gy),(11*gx),(gy2));
        btnsub2.setMargin(new Insets(0,0,0,0));
        btnsub2.setFont(new Font(("Serif"),Font.PLAIN,f2));
        
        // Subject 3 button UI
        btnsub3.setBounds((36*gx),(y1+2*gy),(11*gx),(gy2));
        btnsub3.setMargin(new Insets(0,0,0,0));
        btnsub3.setFont(new Font(("Serif"),Font.PLAIN,f2));

        btnend.setBounds((x1+x7-6*gx),((3*gy)+(6*y1)+(4*y3)),(12*gx),(2*gy));
        btnend.setMargin(new Insets(0,0,0,0));
      btnend.setFont(new Font(("Serif"),Font.PLAIN,f2));
      btnend.setBackground(Color.red);
      btnend.setForeground(Color.white);
    
      //First Option
    opt1.setBounds(gx,((6*y1)),x1-2*gx,y3 );
    opt2.setBounds(gx,((6*y1)+y3),x1-2*gx,y3 );
    opt3.setBounds(gx,((6*y1)+(2*y3)),x1-2*gx,y3 );
    opt4.setBounds(gx,((6*y1)+(3*y3)),x1-2*gx,y3 );

   opt1.setFont(new Font("Serif",Font.PLAIN,f2));
   opt1.setBackground(Color.WHITE);      
   opt2.setFont(new Font("Serif",Font.PLAIN,f2));
   opt2.setBackground(new java.awt.Color(246,246,246));
   //Third Option
      opt3.setFont(new Font("Serif",Font.PLAIN,f2));
   opt3.setBackground(Color.WHITE);
   //Fourth Option
      opt4.setFont(new Font("Serif",Font.PLAIN,f2));
   opt4.setBackground(new java.awt.Color(246,246,246));
 
 
        btn.setBounds(gx,((3*gy)+(6*y1)+(4*y3)),btnx,y3);
        btn.setMargin(new Insets(0,0,0,0));
        btn.setFont(new Font(("Serif"),Font.PLAIN,f2));
        btn.setBackground(Color.yellow);
      
 
        btn2.setBounds((x1-btnx-gx),((3*gy)+(6*y1)+(4*y3)),btnx,y3);
        btn2.setMargin(new Insets(0,0,0,0));
        btn2.setFont(new Font(("Serif"),Font.PLAIN,f2));
        btn2.setBackground(Color.green);


 //Solution Text
             solutionText.setEditable(false);
             solutionText.setLineWrap(true);
             solutionText.setBounds(gx, (6*gy+6*y1+4*y3),x5 , (y2-4*gy-4*y1-4*y3));
             solutionText.setFont(new Font("Serif",Font.PLAIN,f2));
   

   
    
      
    question(1); 
     adding();
     
    
         window.setVisible(true);
      window.setSize(x,y);
      window.setResizable(false);
 

if(count<90){
            JOptionPane.showMessageDialog(window, "You have completed all Full Portion Tests");
            window.dispose();
            SelectPg s = new SelectPg(); 
        }

    }

//function for adding elements
    private static void adding(){
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //window.add(s);
  // window.add(op1);
  // window.add(op2);
  // window.add(op3);
   //window.add(op4);
   window.remove(timelbl);
  
   window.remove(label1);
      window.remove(panel);
      window.remove(questionlb);
      window.remove(subject);
      window.remove(topic);
      window.remove(questionno);
      
      
   
     window.remove(btn);
      //window.remove(btn1);
      window.remove(btn2);
      window.remove(solutionText);
      
     window.remove(btnnext);
      window.remove(btnprev);
      
      window.remove(jt);
      
      window.remove(labelq);
      window.remove(labela);
      window.remove(labels1);
      
      
      window.remove(opt1);
      window.remove(opt3);
      window.remove(opt4);
      window.remove(opt2);
     window.remove(panel2);
     window.remove(panel1);
   
   
   window.add(timelbl);
  
   window.add(label1);
      window.add(panel);
      window.add(questionlb);
      window.add(subject);
      window.add(topic);
      window.add(questionno);
      
      
   
     window.add(btn);
      //window.add(btn1);
      window.add(btn2);
      window.add(btnsub1);
      window.add(btnsub2);
      window.add(btnsub3);
      window.add(solutionText);
      
     window.add(btnnext);
      window.add(btnprev);
      window.add(btnend);
      window.add(jt);
      
      window.add(labelq);
      window.add(labela);
      window.add(labels1);
      
      
      window.add(opt1);
      window.add(opt3);
      window.add(opt4);
      window.add(opt2);
     window.add(panel2);
     window.add(panel1);
     
   
//     window.setComponentZOrder(timelbl, 1);
//     window.setComponentZOrder(label1, 1);
//     window.setComponentZOrder(questionlb, 1);
//     window.setComponentZOrder(subject, 1);
//     window.setComponentZOrder(topic, 1);
//     window.setComponentZOrder(questionno, 1);
//     window.setComponentZOrder(btnnext, 1);
//     window.setComponentZOrder(btnprev, 1);
//     window.setComponentZOrder(btn, 1);
//     window.setComponentZOrder(btn2, 1);
//     window.setComponentZOrder(solutionText, 1);
//     window.setComponentZOrder(jt, 1);
     
   
    }
    
Thread newthr = new Thread(){
    @Override
    public void run(){         
       DecimalFormat df = new DecimalFormat("00");
   
        a=3;
        b=0;
        c=0;
    
        try{
            for(a=2;a>=0;a--){
                for(b=59;b>=0;b--){
                    for(c=59;c>=0;c--){
                        
                        if(b<=10){
                            timelbl.setForeground(Color.ORANGE); 
                        }
                        if(b<=5){
                            timelbl.setForeground(Color.RED); 
                        }
                        
                        timer.start();
                        newthr.sleep(1000);
                        timelbl.setText(df.format(a)+":"+df.format(b)+":"+df.format(c));

                        timelbl.paintImmediately(timelbl.getVisibleRect());
                        
                        timer.stop();
                    }
                }
            }
        }
        catch( InterruptedException f){
        }
    };
};

    public void question(int num)
    {
         if(num>=91){
                JOptionPane.showMessageDialog(window, "End of Test");
                
                n[1].doClick(); 
            }
        if(num>=1&&num<=30){
            btnsub1.setBackground(Color.yellow);
            btnsub2.setBackground(Color.CYAN);
            btnsub3.setBackground(Color.CYAN);
        }
        else if(num>=31&&num<=60){
            btnsub2.setBackground(Color.yellow);
            btnsub1.setBackground(Color.CYAN);            
            btnsub3.setBackground(Color.CYAN);
        }
        else if(num>=61&&num<=90){
            btnsub3.setBackground(Color.yellow);
            btnsub1.setBackground(Color.CYAN);
            btnsub2.setBackground(Color.CYAN);
        }
        
        optbtn.clearSelection();
        optbtn.add(opt1);
        optbtn.add(opt2);
        optbtn.add(opt3);
        optbtn.add(opt4);
      //  window.remove(labels);
        //question function
                     String match1="";
                     String match2="";
                     String match3="";
                     String match4="";
                     String match5="";
                     String match6="";
                     //match3=questionno.getText();

                     //match2=topic.getText();
                     
                     
                     
                     //String clickedanswer="";
        
    //Database Logic
        try{
                //Class.forName("com.mysql.jdbc.Driver");
                //Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/testseries","root","root123");
                pst = conn.prepareStatement("SELECT *  from temp_tbl where id = ?");
               pst.setString(1, String.valueOf(num));

              
                Statement stmt = conn.createStatement();
                

                rs= pst.executeQuery();
            while (rs.next())
            {                 
         //       String s=rs.getString("qimage");
                   jt.setText(rs.getString("question"));
                   opt1.setText(rs.getString("op1"));
                   opt2.setText(rs.getString("op2"));
                   opt3.setText(rs.getString("op3"));
                   opt4.setText(rs.getString("op4"));
                   subject.setText(rs.getString("subjectcode"));
                   topic.setText(rs.getString("topiccode"));
                   questionno.setText(rs.getString("id"));
                   match3 = rs.getString("id");
                   match2 = rs.getString("topiccode");
                   match1=rs.getString("subjectcode");
                   match4 = rs.getString("qimage");
                   match5 = rs.getString("optimage");
                   match6 = rs.getString("solimage");
                pst1=conn.prepareStatement("UPDATE question set qcolor='G' where id=?");
                pst10=conn.prepareStatement("UPDATE temp_tbl set qcolor='G' where id=?");
                pst2=conn.prepareStatement("UPDATE question set qcolor='R' where id=?");
                pst11=conn.prepareStatement("UPDATE temp_tbl set qcolor='R' where id=?");
                
                pst1.setString(1,match3);

                pst10.setString(1,match3);
  
                pst2.setString(1,match3);

                pst11.setString(1,match3);
                
                
                opt1.setActionCommand("A");
                opt2.setActionCommand("B");
                opt3.setActionCommand("C");
                opt4.setActionCommand("D");
               // clickedanswer=optbtn.getSelection().getActionCommand();
           clickedanswer=rs.getString("ca");
                   
      //Question Image
            
                if("img/NULL".equals("img/"+match4) ){
                    labelq.setVisible(false);
                }
                else{
                    
                   imgq=ImageIO.read(new File("img/"+match4));
                    labelq.setBounds(gx, (2*y1+2*gy+y3),(x1-(2*gx)) , (2*y1-2*gy));
                    Image logo1 = imgq.getScaledInstance(imgq.getWidth(), imgq.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon img2 = new ImageIcon(logo1);
                    labelq.setIcon(img2);
                    
                    labelq.setVisible(true);
                }
                //Option Image
                if("img/NULL".equals("img/"+match5) ){
                    labela.setVisible(false);
                    opt1.setBounds(gx,((2*gy)+(5*y1)),x1-2*gx,y3 );
                    opt2.setBounds(gx,((3*gy)+(5*y1)+y3),x1-2*gx,y3 );
                    opt3.setBounds(gx,((4*gy)+(5*y1)+(2*y3)),x1-2*gx,y3 );
                    opt4.setBounds(gx,((5*gy)+(5*y1)+(3*y3)),x1-2*gx,y3 );                    
                }
                else{
                    jt.setBounds(gx,(2*y1+gy),(x1-(2*gx)),(y3));
                    if(jt.getText().length()<=2){
                        jt.setText("Refer image below");
                    }
                    opt1.setBounds(gx,((2*gy)+(5*y1)),x4,y3 );
                    opt2.setBounds(gx,((3*gy)+(5*y1)+y3),x4,y3 );
                    opt3.setBounds(gx,((4*gy)+(5*y1)+(2*y3)),x4,y3 );
                    opt4.setBounds(gx,((5*gy)+(5*y1)+(3*y3)),x4,y3 );
                    
                    imgo=ImageIO.read(new File("img/"+match5));
                    labela.setBounds(gx+x4, ((2*gy)+(5*y1)),(x1-x4-(2*gx)) , ((4*y3)+3*gy));
                    Image logo2 = imgo.getScaledInstance(labela.getWidth()-gx, labela.getHeight()-gy, Image.SCALE_SMOOTH);
                    ImageIcon img3 = new ImageIcon(logo2);
                    labela.setIcon(img3);
                    labela.setVisible(true);
                }
                
            }
        
        
        }
        catch(IOException | SQLException e)
        {
        }
        checkedans(num);
        
     //question end
    }

public void closingtest(){
    window.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
  
    Security.addProvider(new BouncyCastleProvider());
                    try {
                        //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testseries","root","root123");
                       
                        
                         pst16=conn.prepareStatement("update temp_tbl set checkq = '1' where qcolor = 'G';");
                          pst16.executeUpdate();
                        pst14=conn.prepareStatement("update question_full \n" +
                                                    "set qcolor = (select qcolor from temp_tbl where temp_tbl.subjectcode = question_full.subjectcode AND temp_tbl.topiccode = question_full.topiccode AND temp_tbl.questionno = question_full.questionno); ");
                        pst14.executeUpdate(); 
                        pst15 = conn.prepareStatement("update question_full \n" +
                                                    "set checkq = (select checkq from temp_tbl where temp_tbl.subjectcode = question_full.subjectcode AND temp_tbl.topiccode = question_full.topiccode AND temp_tbl.questionno = question_full.questionno); "); 
                        pst15.executeUpdate();
                        pst17 = conn.prepareStatement("update question_full set qcolor = 'B' where question_full.qcolor  IS NULL ;"); 
                        pst17.executeUpdate();
                         pst17 = conn.prepareStatement("update question_full set checkq = '0' where question_full.checkq  IS NULL ;"); 
                        pst17.executeUpdate();
                        pst22=conn.prepareStatement("UPDATE temp_tbl set marks=(case when chkans=ca then 4 when length(chkans) > 2 then 0 else -1 end)");
                        pst22.executeUpdate();
                        pst23=conn.prepareStatement("SELECT SUM(marks) from temp_tbl");
                        rs7=pst23.executeQuery();
                       
                    } catch (SQLException ex) {
                        Logger.getLogger(Start3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    //pdf generation logic goes here
                            com.itextpdf.text.Document document = new com.itextpdf.text.Document();
                com.itextpdf.text.Font blueFont = FontFactory.getFont(FontFactory.HELVETICA, 20, com.itextpdf.text.Font.NORMAL, new CMYKColor(255, 0, 0, 0));
        com.itextpdf.text.Font redFont = FontFactory.getFont(FontFactory.COURIER, 18, com.itextpdf.text.Font.BOLD, new CMYKColor(0, 255, 0, 0));
        com.itextpdf.text.Font yellowFont = FontFactory.getFont(FontFactory.COURIER, 14, com.itextpdf.text.Font.BOLD, new CMYKColor(0, 0, 255, 0));
                 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HHmmss");  
                        LocalDateTime now = LocalDateTime.now();  
      try
      {
             //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testseries","root","root123");
             pst20= conn.prepareStatement("SELECT * from temp_tbl");
             rs6=pst20.executeQuery();
             
             String marks="";
             while(rs7.next()){
             marks=rs7.getString("SUM(marks)");
             
             }
             
             String file_name=dtf.format(now);
         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(path+"/reports/"+"orignal"+file_name+".pdf"));
         
        
         document.open();
         dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         com.itextpdf.text.Image image1 = com.itextpdf.text.Image.getInstance("img//logofinal.png");
            image1.setAbsolutePosition(60f, 800f);
            image1.scaleAbsolute(130, 30);

            document.add(image1);
           
            Paragraph paragraph = new Paragraph("JEE Report",blueFont);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
                        
                        DottedLineSeparator separator = new DottedLineSeparator();
                         //separator.setPercentage(59500f / 523f);
                         Chunk linebreak = new Chunk(separator);
                         document.add(linebreak); 
                        
                        paragraph = new Paragraph("Date :"+dtf.format(now));
                        paragraph.setSpacingAfter(20f);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
                        
                        paragraph = new Paragraph("Total Marks :"+ marks+"/360",redFont);
                         paragraph.setSpacingAfter(20f);
                        paragraph.setAlignment(Element.ALIGN_LEFT);
            document.add(paragraph);
            
      
            //for(i=1;i<=90;i++){
                while(rs6.next()){
                    
                paragraph = new Paragraph("Q. No."+rs6.getString("id"));
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               
               paragraph = new Paragraph(rs6.getString("question"));
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               
               String imagee1= rs6.getString("qimage");
               String imagee2=rs6.getString("optimage");
               String imagee3=rs6.getString("solimage");
          
               if(!"NULL".equals(imagee1)){
               com.itextpdf.text.Image imageee1 = com.itextpdf.text.Image.getInstance("img//"+imagee1);
               document.add(imageee1);
               }
               
                paragraph = new Paragraph("(A) "+rs6.getString("op1"));
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               paragraph = new Paragraph("(B) "+rs6.getString("op2"));
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               paragraph = new Paragraph("(C) "+rs6.getString("op3"));
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               paragraph = new Paragraph("(D) "+rs6.getString("op4"));
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               if(!"NULL".equals(imagee2)){
               com.itextpdf.text.Image imageee2 = com.itextpdf.text.Image.getInstance("img//"+imagee2);
               document.add(imageee2);
               }
               paragraph = new Paragraph("Selected Answer :"+rs6.getString("chkans"));
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
               paragraph = new Paragraph("Correct Answer: "+rs6.getString("ca"));
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
                paragraph = new Paragraph("Solution: "+rs6.getString("solution"));
               paragraph.setAlignment(Element.ALIGN_LEFT);
               document.add(paragraph);
                if(!"NULL".equals(imagee3)){
               com.itextpdf.text.Image imageee3 = com.itextpdf.text.Image.getInstance("img//"+imagee3);
               document.add(imageee3);
               } 
                document.add(linebreak);
                }
            
            document.close();
            
          writer.close();
          
          PdfReader reader;
		FileOutputStream out;
		PdfStamper stamper;
            reader = new PdfReader(path+"/reports/"+"orignal"+file_name+".pdf");
            out = new FileOutputStream(path+"/reports/"+file_name+".pdf");
        stamper = new PdfStamper(reader, out);
         stamper.setEncryption("".getBytes(), "12345".getBytes(), PdfWriter.ALLOW_ASSEMBLY, PdfWriter.STANDARD_ENCRYPTION_128);
         stamper.close();
         reader.close();
         out.close();
         
         File real =new File(path+"/reports/"+"orignal"+file_name+".pdf");
    real.delete();
          
     pst21=conn.prepareStatement("INSERT into report_table(file_name,date,time,test_type, marks) values(?,?,?,?,?)");
     pst21.setString(1,file_name);
      dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
     pst21.setString(2,dtf.format(now) );
     dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
     pst21.setString(3,dtf.format(now) );
     pst21.setInt(4,1);
      pst21.setInt(5, Integer.parseInt(marks)); 
     pst21.execute();
     
     
     
      } catch (DocumentException | FileNotFoundException e)
      {Logger.getLogger(SelectPg.class.getName()).log(Level.SEVERE, null, e);
      } catch (IOException ex) {
                    Logger.getLogger(SelectPg.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {   
        Logger.getLogger(Start3.class.getName()).log(Level.SEVERE, null, ex);
    }   
      
}

public void checkedans(int qnum)
{
    try {
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testseries","root","root123");
         pst19 = conn.prepareStatement("Select chkans From temp_tbl where id = ?"); 
         pst19.setString(1, String.valueOf(qnum));
         rs5 = pst19.executeQuery();
         
         while(rs5.next()){
             selectans = rs5.getString("chkans");
             if("A".equalsIgnoreCase(selectans)){
                 opt1.setSelected(true);
                 opt2.setSelected(false);
                 opt3.setSelected(false);
                 opt4.setSelected(false);
                 
             }
             if("B".equalsIgnoreCase(selectans)){
                 opt1.setSelected(false);
                 opt2.setSelected(true);
                 opt3.setSelected(false);
                 opt4.setSelected(false);
             }
             if("C".equalsIgnoreCase(selectans)){
                 opt1.setSelected(false);
                 opt2.setSelected(false);
                 opt3.setSelected(true);
                 opt4.setSelected(false);
             }
             if("D".equalsIgnoreCase(selectans)){
                 opt1.setSelected(false);
                 opt2.setSelected(false);
                 opt3.setSelected(false);
                 opt4.setSelected(true);
             }
            
         }
    } catch (SQLException ex) {
        Logger.getLogger(Start3.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    
}


}

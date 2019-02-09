import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.Rectangle;
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
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Start1 extends JFrame {

static JFrame window = new JFrame("JEE TEST PREP | TOPICWISE PRACTICE");

static  JLabel questionlb = new JLabel("QCode:",SwingConstants.CENTER);
static JLabel subject = new JLabel("",SwingConstants.CENTER);
static  JLabel topic = new JLabel("",SwingConstants.CENTER);
static JLabel questionno = new JLabel("1",SwingConstants.CENTER);
static    JTextArea jt = new JTextArea();
static JRadioButton opt1= new JRadioButton();
static JRadioButton opt2= new JRadioButton();
static  JRadioButton opt3= new JRadioButton();
static JRadioButton opt4= new JRadioButton();
static ButtonGroup optbtn = new ButtonGroup();


static PreparedStatement pst=null,pst1=null,pst2=null,pst3=null,pst4=null, pst5=null, pst6=null, pst7=null, pst8 = null;
static ResultSet rs= null,rs1=null,rs2=null,rs3=null,rs4=null;
static  JTextArea solutionText = new JTextArea();
static JPanel panel = new JPanel();
static JPanel panel2= new JPanel();
static JLabel label1= new JLabel();
static JLabel timelbl = new JLabel("00:00:00");
static JButton btn = new JButton("SKIP");
static JButton btn1 = new JButton("SUBMIT");    
static JButton btn2 = new JButton("NEXT");
static JLabel answer = new JLabel("ANswer chk", SwingConstants.CENTER); 

static JButton btnnext = new JButton("NEXT");
static JButton btnprev = new JButton("PREVIOUS");
static JButton btnend = new JButton("EXIT");
static JLabel labelq= new JLabel();
static JLabel labela= new JLabel();
static JLabel labels1= new JLabel();
static JLabel labels2= new JLabel();
static JPanel panel1= new JPanel();
static String clickedanswer="";
static String selans="";
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
static int y4=(int) Math.round(0.15*y);

static int gx=(int) Math.round(0.01*x);
static int gy=(int) Math.round(0.028*y);
static int y5 = (int) Math.round(3.5*y1);
static int logox=(int) Math.round(((y1-(2*gy))*5.91));
static int y3=(int) Math.round(0.05*y);
static int  btnx=(int) Math.round(0.08*x);
static int x3=(int) Math.round(0.22*x);
static int x4=(int) Math.round(0.3*x1);
static int x5=(int) Math.round(0.5*(x1-(2*gx)));
static int x6=(int) Math.round(0.5*x1);
static int x7=(int) Math.round(0.5*x2);
static int x8=(int) Math.round(0.5*(x1-3*btnx-3*gx))+2*gx+2*btnx;
static int gx2=(int) Math.round(3*gx);
static int gy2=(int) Math.round(1.5*gy);
static int f1=(int) Math.round(0.015*y);
static int f2=(int) Math.round(0.022*y);
static int f3=(int) Math.round(0.05*y);
static int f4 = (int) Math.round(0.018*y);

static Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
static Border margin = new EmptyBorder(5,5,5,5);
static int counter=0;
static int counter2=0;
static int value;
static int i;
static int qcounter;
static int qremainder;
static int a,b,c;
static Rectangle rv; 
public ActionListener ae1;
Timer timer = new Timer(1000, ae1);
static boolean stoprequest;




public Start1(String choices,  String choice1)
{
   ImageIcon imgicon = new ImageIcon("img/icon.png");
 window.setIconImage(imgicon.getImage());


    //rv.setBounds((x1+2*gx),(y1+25*gy),(11*gx),(gy2));
   subject.setText(choices);
   topic.setText(choice1);
   
    question();
  
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn3= DriverManager.getConnection("jdbc:sqlite:testseries.db");
        pst4=conn3.prepareStatement("SELECT COUNT(id) from question where subjectcode=? and topiccode=?" );
        pst4.setString(1, choices);
        pst4.setString(2, choice1);

        rs3=pst4.executeQuery();
        //qcounter=91;
            while(rs3.next()){
        qcounter=Integer.parseInt(rs3.getString("COUNT(id)"));
        }
             
    }
    catch( Exception f){
        f.printStackTrace();
    }
    
    qremainder=qcounter-60;
//createGUI();      
    btn2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.                               
            counter=Integer.parseInt(questionno.getText());
            counter2=counter+1;
            questionno.setText(String.valueOf(counter2));
            counter2=0;
            question();
            adding();
        }
    });

    jt.setFont(new Font("Serif",Font.PLAIN,f2));
    jt.setCaretPosition(0);
    jt.setEditable(false);
    jt.setLineWrap(true);
    jt.setBounds(gx,(y1+gy),(x1-(2*gx)),(3*y1));
 
    panel.setLayout(null);
    panel.setBounds(0, 0, x, y1);
    panel.setBackground(new java.awt.Color(204,255,153));
        
//Logo Of Company
    label1.setBounds(gx, gy,logox , (y1-(2*gy)));
    try{
        ximg=ImageIO.read(new File("img/logofinal.png"));
    }
    catch(Exception e8){
        e8.printStackTrace();
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
    if(qcounter>60){
        n= new JButton[61];
    }
    else{
        n=new JButton[qcounter+1];
    }
     
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(e.getSource() instanceof JButton){
            String s1 = ((JButton) e.getSource()).getText();
            questionno.setText(s1);
            question();
            adding();
            
            
            }
        }
    };
     
    for(int i=1;i<61 && i<=qcounter  ;i++){
     
        n[i]=new JButton();
        n[i].addActionListener(listener);
    }
    
    //exit button logic
    btnend.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to exit ?","Warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                
                //Pdf generation logic goes here 
                
                
                 SelectPg S = new SelectPg();
                 window.dispose();                 
            }
        }
    });

     
    try{
        String match1="";
        String match2="";
        //String match3="";
        match1=choices;
        match2=choice1;
        // match3=questionno.getText();
        Class.forName("org.sqlite.JDBC");
        Connection conn1= DriverManager.getConnection("jdbc:sqlite:testseries.db");
        pst3=conn1.prepareStatement("SELECT qcolor from question where subjectcode=? AND topiccode=? AND questionno=?");
        pst3.setString(1,match1);
        pst3.setString(2, match2);
        
        for(int j=1;j<=6;j++){          

            for(int k=1;k<=10;k++){
                //int value=0;
                value=(k-1)*6+(j);
                if(value<=qcounter){
                    pst3.setString(3,String.valueOf(value));
                    rs2=pst3.executeQuery();
                    n[value].setBounds((x1+j*4*gx),(y1+5*gy+k*2*gy),(gx2),(gy2));
                    n[value].setMargin(new Insets(0,0,0,0));
                    n[value].setFont(new Font("Serif",Font.PLAIN,f1));
                    n[value].setText(""+value);
                    n[value].setBackground(null);
                    
                    while(rs2.next()){
                        
                        if(rs2.getString("qcolor").equals("G")){
                            n[value].setBackground(Color.GREEN);
                           
                        }
                        
                        if (rs2.getString("qcolor").equals("R")){
                            n[value].setBackground(Color.RED);
                            
                        }
                         if (rs2.getString("qcolor").equals("Y")){
                            n[value].setBackground(Color.yellow);
                            
                        }
                        
                       
                    }
                    n[value].setOpaque(true);
                    n[value].setBorder(null);
                    window.add(n[value]);
                }
                //n.setName("n"+(value));
            }
        }
    }
    catch(Exception e3){
    }
     
    btnnext.addActionListener(new ActionListener() {
      
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(n[60].getText());
            value=a+1;
            int qrem1=60;
            
            if(qremainder<61){
                qrem1=qremainder;
            }
            
        try{
            for( i=value;i<value+qrem1;i++){
                pst3.setString(3, String.valueOf(i));

                rs2=pst3.executeQuery();
                n[i-value+1].setText(""+i);
                
                while(rs2.next()){              
                    
                    if(rs2.getString("qcolor").equals("G")){
                        n[i-value+1].setBackground(Color.GREEN);
                    }
                
                    if(rs2.getString("qcolor").equals("R")){
                        n[i-value+1].setBackground(Color.RED);         
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
        catch(Exception e4){
            e4.printStackTrace();
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
        public void actionPerformed(ActionEvent ae){
           int a=(Integer.parseInt(n[1].getText()));
        // int  b=a-60+1;
         int x=1;
         
         try{for(i=a-60;i<a;i++)
         {
             
         pst3.setString(3, String.valueOf(i));
         rs2=pst3.executeQuery();
        
         if(i>0){
             n[x].setText(""+(i));
             }
            
          while(rs2.next()){
         if(rs2.getString("qcolor").equals("G")){
          n[x].setBackground(Color.GREEN);
          
           }
            if(rs2.getString("qcolor").equals("R")){
          n[x].setBackground(Color.RED);
          
           }
            if(rs2.getString("qcolor").equals("Y")){
          n[x].setBackground(Color.yellow);
          
           }
            if(rs2.getString("qcolor").equals("B")){
            n[x].setBackground(null);
            }
            
          
          } 
          if(x<60)
            {
              x++; 
            }
         }}
         catch(Exception e5){
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


        btn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae){
            try {
                Class.forName("org.sqlite.JDBC");
                Connection conn= DriverManager.getConnection("jdbc:sqlite:testseries.db");
                pst5 = conn.prepareStatement("SELECT qcolor  from question WHERE subjectcode=? AND topiccode=? AND questionno=? ");
                 
                String match1, match2, match3;
                match1 = subject.getText(); 
                match2 = topic.getText(); 
                match3 = questionno.getText();
                pst5.setString(1, match1);
                pst5.setString(2, match2);
                pst5.setString(3, match3);
                rs4= pst5.executeQuery();
               
                int mult = (int) (qcounter/60);
                
                int value2 = Integer.parseInt(match3)-mult*60;
                
                pst6=conn.prepareStatement("Update question set qcolor = 'Y' WHERE subjectcode=? AND topiccode=? AND questionno=?;");
                
                
                while(rs4.next()){
                    String color = rs4.getString("qcolor");
                    
                    if(color.equals("B")){
                        n[value2].setBackground(Color.yellow); 
                        
                        pst6.setString(1, match1);
                        pst6.setString(2, match2);
                        pst6.setString(3, match3);
                        System.out.println(pst6);
                        pst6.executeUpdate(); 
                    }
                }
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Start1.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
            counter=Integer.parseInt(questionno.getText());
            counter2=counter+1;
            questionno.setText(String.valueOf(counter2));
            counter2=0;
            question();
            adding();
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
        
        //exit button
         btnend.setBounds((x1+x7-6*gx),(7*y1+7*gy),(12*gx),(2*gy));
        btnend.setMargin(new Insets(0,0,0,0));
      btnend.setFont(new Font(("Serif"),Font.PLAIN,f2));
      btnend.setBackground(Color.red);
      btnend.setForeground(Color.white);
      
      //Answer Check Label 
     answer.setBounds(x8-2*btnx,((3*gy)+(y5)+(4*y3)),4*btnx,y3);
    answer.setFont(new Font("Serif", Font.BOLD,f4));
    answer.setBorder(border);

      //First Option
   

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
 
 //Skip
        btn.setBounds(gx,((3*gy)+(y5)+(4*y3)),btnx,y3);
        btn.setMargin(new Insets(0,0,0,0));
        btn.setFont(new Font(("Serif"),Font.PLAIN,f2));
        btn.setBackground(Color.yellow);
      //submit
        btn1.setBounds((btnx+2*gx),((3*gy)+(y5)+(4*y3)),btnx,y3);
        btn1.setMargin(new Insets(0,0,0,0));
        btn1.setFont(new Font(("Serif"),Font.PLAIN,f2));
        btn1.setBackground(Color.green); 
      
        //next
        btn2.setBounds((x1-btnx-gx),((3*gy)+(y5)+(4*y3)),btnx,y3);
        btn2.setMargin(new Insets(0,0,0,0));
        btn2.setFont(new Font(("Serif"),Font.PLAIN,f2));
        btn2.setBackground(new java.awt.Color(102,178,255));
    
   // JLabel qimage = new JLabel("Qimage");


 //Solution Text
             solutionText.setEditable(false);
             solutionText.setLineWrap(true);
             solutionText.setBounds(gx, (6*gy+4*y1+4*y3),x5 , (y2-4*gy-4*y1-4*y3));
             solutionText.setFont(new Font("Serif",Font.PLAIN,f2));
   
//Solution Image
       
    //    Image logo3 = imgz.getScaledInstance(labels.getWidth()-gx, labels.getHeight()-gy, Image.SCALE_SMOOTH);
     //   ImageIcon imgs= new ImageIcon(logo3);
        
       // labels.setIcon(imgs);
 
   
    
 
     
    adding();
    
         window.setVisible(true);
      window.setSize(x,y);
      window.setResizable(false);
 



    }

//function for adding elements
    private static void adding() {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  // window.add(s);
  // window.add(op1);
  // window.add(op2);
  // window.add(op3);
   //window.add(op4);
   window.add(timelbl);
   window.add(label1);
      window.add(panel);
      window.add(questionlb);
      window.add(subject);
      window.add(topic);
      window.add(questionno);
      window.add(btnend);
      window.add(btnnext);
      window.add(btnprev);
   //  window.add(labelq);
    
    // window.add(labela);
     // window.add(labels);
     window.add(btn);
      window.add(btn1);
      window.add(btn2);
      window.add(answer);
      window.add(solutionText);
     
  window.add(opt1);
     window.add(opt3);
      window.add(opt4);
      window.add(opt2);
      window.add(jt);
      window.add(panel2);
     window.add(panel1);
    }
    
Thread newthr = new Thread(){
    public void run(){         
       DecimalFormat df = new DecimalFormat("00");
   
        a=0;
        b=0;
        c=0;
    
        try{
            for(a=0;a<=60;a++){
                for(b=0;b<=59;b++){
                    for(c=0;c<=59;c++){
                        
                        if(b>=1&&c>=30){
                            timelbl.setForeground(Color.ORANGE); 
                        }
                        if(b>=2){
                            timelbl.setForeground(Color.RED); 
                        }
                        
                        timer.start();
                        timelbl.setText(df.format(a)+":"+df.format(b)+":"+df.format(c));
         
                        timelbl.paintImmediately(timelbl.getVisibleRect());
                        newthr.sleep(1000);
                        timer.stop();
                    }
                }
            }
        }
        catch( Exception f){
        }
    };
};

    public void question()
    {
        answer.setVisible(false);
        optbtn.clearSelection();
        optbtn.add(opt1);
        optbtn.add(opt2);
        optbtn.add(opt3);
        optbtn.add(opt4);
        labels1.setVisible(false);
        labels2.setVisible(false);
      //  window.remove(labels);
        //question function
                     String match1="";
                     String match2="";
                     String match3="";
                     String match4="";
                     String match5="";
                     String match6="";
                     
                     match1=subject.getText();
                     match2=topic.getText();
                     match3=questionno.getText();
                     //String clickedanswer="";
        
    //Database Logic
        try{
                Class.forName("org.sqlite.JDBC");
                Connection conn= DriverManager.getConnection("jdbc:sqlite:testseries.db");
                pst = conn.prepareStatement("SELECT *  from question WHERE subjectcode=? AND topiccode=? AND questionno=? ");
                pst1=conn.prepareStatement("UPDATE question set qcolor='G' where subjectcode=? AND topiccode=? AND questionno=?");
                pst2=conn.prepareStatement("UPDATE question set qcolor='R' where subjectcode=? AND topiccode=? AND questionno=?");
                pst7 = conn.prepareStatement("UPDATE question set selanswer=? where subjectcode=? AND topiccode=? AND questionno=?");
                pst8 = conn.prepareStatement("UPDATE question set checkq = 1 where subjectcode=? AND topiccode=? AND questionno=?");
                pst1.setString(1,match1);
                pst1.setString(2,match2);
                pst1.setString(3,match3);
                pst2.setString(1,match1);
                pst2.setString(2,match2);
                pst2.setString(3,match3);
                pst7.setString(2,match1);
                pst7.setString(3,match2);
                pst7.setString(4,match3);
                pst8.setString(1,match1);
                pst8.setString(2,match2);
                pst8.setString(3,match3);
                Statement stmt = conn.createStatement();
                pst.setString(1,match1);
                pst.setString(2,match2);
                pst.setString(3,match3);
                rs= pst.executeQuery();
                
                
            while (rs.next())
            {  

         //       String s=rs.getString("qimage");
                    jt.setText(rs.getString("question"));
                   opt1.setText(rs.getString("op1"));
                   opt2.setText(rs.getString("op2"));
                   opt3.setText(rs.getString("op3"));
                   opt4.setText(rs.getString("op4"));
               
                opt1.setActionCommand("A");
                opt2.setActionCommand("B");
                opt3.setActionCommand("C");
                opt4.setActionCommand("D");
                
                match4 = rs.getString("qimage");
                match5 = rs.getString("optimage");
                match6 = rs.getString("solimage");
               // clickedanswer=optbtn.getSelection().getActionCommand();
           clickedanswer=rs.getString("ca");
           selans = rs.getString("selanswer"); 
          if("A".equalsIgnoreCase(selans)){
                 opt1.setSelected(true);
                 opt2.setSelected(false);
                 opt3.setSelected(false);
                 opt4.setSelected(false);
                 opt1.setEnabled(false);
                 opt2.setEnabled(false);
                 opt3.setEnabled(false);
                 opt4.setEnabled(false);
                 btn1.setEnabled(false);
                 
                 if(optbtn.getSelection().getActionCommand().equalsIgnoreCase(clickedanswer)){
                                        
                               
                                        
                                        answer.setText("CORRECT ANSWER");                            
                                        answer.setForeground(Color.green);
                                        answer.setVisible(true);
                                        
                                        
                                        //  optbtn.clearSelection();
                                    }
                                    else
                                    {
                                        
                                       
                                        answer.setText("WRONG ANSWER. CORRECT ANSWER: " + clickedanswer);
                                        answer.setForeground(Color.red);
                                        answer.setVisible(true);
                                        //optbtn.clearSelection();
                                    }
                 
                 if(!rs.getString("solimage").equals("NULL")){
                 labels1.setVisible(true);
                 labels2.setVisible(true);
                 }
             }
          else if("B".equalsIgnoreCase(selans)){
                 opt1.setSelected(false);
                 opt2.setSelected(true);
                 opt3.setSelected(false);
                 opt4.setSelected(false);
                 opt1.setEnabled(false);
                 opt2.setEnabled(false);
                 opt3.setEnabled(false);
                 opt4.setEnabled(false);
                 btn1.setEnabled(false);
                 if(!rs.getString("solimage").equals("NULL")){
                 labels1.setVisible(true);
                 labels2.setVisible(true);
                 if(optbtn.getSelection().getActionCommand().equalsIgnoreCase(clickedanswer)){
                                        
                               
                                        
                                        answer.setText("CORRECT ANSWER");                            
                                        answer.setForeground(Color.green);
                                        answer.setVisible(true);
                                        
                                        
                                        //  optbtn.clearSelection();
                                    }
                                    else
                                    {
                                        
                                       
                                        answer.setText("WRONG ANSWER. CORRECT ANSWER: " + clickedanswer);
                                        answer.setForeground(Color.red);
                                        answer.setVisible(true);
                                        //optbtn.clearSelection();
                                    }
                 }
             }
          else if("C".equalsIgnoreCase(selans)){
                 opt1.setSelected(false);
                 opt2.setSelected(false);
                 opt3.setSelected(true);
                 opt4.setSelected(false);
                 opt1.setEnabled(false);
                 opt2.setEnabled(false);
                 opt3.setEnabled(false);
                 opt4.setEnabled(false);
                 btn1.setEnabled(false);
                 if(!rs.getString("solimage").equals("NULL")){
                 labels1.setVisible(true);
                 labels2.setVisible(true);
                 if(optbtn.getSelection().getActionCommand().equalsIgnoreCase(clickedanswer)){
                                        
                               
                                        
                                        answer.setText("CORRECT ANSWER");                            
                                        answer.setForeground(Color.green);
                                        answer.setVisible(true);
                                        
                                        
                                        //  optbtn.clearSelection();
                                    }
                                    else
                                    {
                                        
                                       
                                        answer.setText("WRONG ANSWER. CORRECT ANSWER: " + clickedanswer);
                                        answer.setForeground(Color.red);
                                        answer.setVisible(true);
                                        //optbtn.clearSelection();
                                    }
                 }
             }
          else if("D".equalsIgnoreCase(selans)){
                 opt1.setSelected(false);
                 opt2.setSelected(false);
                 opt3.setSelected(false);
                 opt4.setSelected(true);
                 opt1.setEnabled(false);
                 opt2.setEnabled(false);
                 opt3.setEnabled(false);
                 opt4.setEnabled(false);
                 btn1.setEnabled(false);
                 if(!rs.getString("solimage").equals("NULL")){
                 labels1.setVisible(true);
                 labels2.setVisible(true);
                 if(optbtn.getSelection().getActionCommand().equalsIgnoreCase(clickedanswer)){
                                        
                               
                                        
                                        answer.setText("CORRECT ANSWER");                            
                                        answer.setForeground(Color.green);
                                        answer.setVisible(true);
                                        
                                        
                                        //  optbtn.clearSelection();
                                    }
                                    else
                                    {
                                        
                                       
                                        answer.setText("WRONG ANSWER. CORRECT ANSWER: " + clickedanswer);
                                        answer.setForeground(Color.red);
                                        answer.setVisible(true);
                                        //optbtn.clearSelection();
                                    }
                 }
             }
             else{
                  btn1.setEnabled(true);
                  opt1.setEnabled(true);
                 opt2.setEnabled(true);
                 opt3.setEnabled(true);
                 opt4.setEnabled(true);
                 labels1.setVisible(false);
                 labels2.setVisible(false);
                 if(optbtn.getSelection().getActionCommand().equalsIgnoreCase(clickedanswer)){
                                        
                               
                                        
                                        answer.setText("CORRECT ANSWER");                            
                                        answer.setForeground(Color.green);
                                        answer.setVisible(true);
                                        
                                        
                                        //  optbtn.clearSelection();
                                    }
                                    else
                                    {
                                        
                                       
                                        answer.setText("WRONG ANSWER. CORRECT ANSWER: " + clickedanswer);
                                        answer.setForeground(Color.red);
                                        answer.setVisible(true);
                                        //optbtn.clearSelection();
                                    }
             }
           
           btn1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            window.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                            if(opt1.isSelected()||opt2.isSelected()||opt3.isSelected()||opt4.isSelected()){
                            try{
                                //                       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                pst7.setString(1, optbtn.getSelection().getActionCommand());
                                pst7.executeUpdate();
                                pst8.executeUpdate();
                                }
                            catch(SQLException ex){
                                Logger.getLogger(Start1.class.getName()).log(Level.SEVERE, null, ex);}
                                
                                int c;
                                if(qcounter>60){
                                    c=60;
                                    
                                }
                                else{
                                    c=qcounter;
                                }
                                int a=Integer.parseInt(n[c].getText());
                                int b=Integer.parseInt(questionno.getText());
                                int x=c-(a-b);
                                
                                labels1.setVisible(true);
                                labels2.setVisible(true);
                                
                                try{
                                    if(optbtn.getSelection().getActionCommand().equalsIgnoreCase(clickedanswer)){
                                        
                                        pst1.execute();
                                        n[x].setBackground(Color.GREEN);
                                        answer.setText("CORRECT ANSWER");                            
                                        answer.setForeground(Color.green);
                                        answer.setVisible(true);
                                        
                                        
                                        //  optbtn.clearSelection();
                                    }
                                    else
                                    {
                                        n[x].setBackground(Color.RED);
                                        pst2.execute();
                                        answer.setText("WRONG ANSWER. CORRECT ANSWER: " + clickedanswer);
                                        answer.setForeground(Color.red);
                                        answer.setVisible(true);
                                        //optbtn.clearSelection();
                                    }
                                    
                                    
                              
                                }
                                catch(SQLException e1){
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(window, "Please Select An Option or Skip The Question");
                            }
                            window.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                        }
                    });
                   
      //if((rs.getString("qimage")).equals("NULL")){
                if("img/NULL".equals("img/"+match4) ){
                
               window.remove(labelq);
                   window.remove(labela);
                      
                    opt1.setBounds(gx,((y5)),x1-2*gx,y3 );
                    opt2.setBounds(gx,((y5)+y3),x1-2*gx,y3 );
                    opt3.setBounds(gx,((y5)+(2*y3)),x1-2*gx,y3 );
                    opt4.setBounds(gx,((y5)+(3*y3)),x1-2*gx,y3 );
                    window.remove(labels1);
                    window.remove(labels2);
      
          
      }
                // if(rs.getString("solimage")==null){
                     //if(){
               //window.remove(labels);
               //labels.setIcon(null);
              // window.add(labels);
        //      window.remove(labels);  
              //labels.setVisible(false);
    
              //  }
               // }
                
      
    //  if(rs.getString("qimage").equals("NO")){
      else{
     // if(rs.getString("qimage")!=null){       
                  //  window.remove(labelq);
              imgq=ImageIO.read(new File("img/"+match4));
              if(!("img/NULL").equals("img/"+match5)){
               imgo=ImageIO.read(new File("img/"+match5));
              labela.setBounds(gx+x4, ((2*gy)+(y5)),(x1-x4-(2*gx)) , ((4*y3)));
              Image logo2=imgo.getScaledInstance(labela.getWidth()-gx, labela.getHeight()-gy, Image.SCALE_SMOOTH);
              ImageIcon img4 = new ImageIcon(logo2);
               labela.setIcon(img4);
              }
             if(!("img/NULL").equals("img/"+match6)){ imgs=ImageIO.read(new File("img/"+match6));
             labels1.setBounds(x6, (6*gy+y5+4*y3),x5 , (y2-4*gy-4*y1-4*y3));
             labels2.setBounds(gx, (6*gy+y5+4*y3),x5 , (y2-4*gy-4*y1-4*y3));
             Image logo3=imgs.getScaledInstance(labels1.getWidth(), labels1.getHeight(), Image.SCALE_SMOOTH);
              ImageIcon img5 = new ImageIcon(logo3);
            labels1.setIcon(img5);
            labels2.setText(rs.getString("solution"));
            labels2.setFont(new Font(("Serif"),Font.PLAIN,f2));
             }
             
              opt1.setBounds(gx,((2*gy)+(y5)),x4,y3 );
              opt2.setBounds(gx,((2*gy)+(y5)+y3),x4,y3 );
              opt3.setBounds(gx,((2*gy)+(y5)+(2*y3)),x4,y3 );
              opt4.setBounds(gx,((2*gy)+(y5)+(3*y3)),x4,y3 );
              labelq.setBounds(gx, (2*y1+gy),(x1-(2*gx)) , (y4));
             
              
             
              
              Image logo1 = imgq.getScaledInstance(labelq.getWidth()-gx, labelq.getHeight()-gy, Image.SCALE_SMOOTH);
              
              ImageIcon img2 = new ImageIcon(logo1);
             
             
              labelq.setIcon(img2);
             
              
        
                
              
             window.add(labelq);
        
            window.add(labela);
          window.add(labels1);
          window.add(labels2);
       //     }
      }
      
      //}
      //else{

     
    //  }
            
            
            }
        
        
        }
        catch(Exception e)
        {
        }

   //   if(stoprequest==true){
     //     newthr.interrupt();
      //}
      stoprequest=false;
      
      a=0;
                       b=0;
                       c=0;  
                       if(!newthr.isAlive()){
                       newthr.start();    
                       }
                      
     //question end
    }


}

 
 




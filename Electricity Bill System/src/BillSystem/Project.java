package BillSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Project(){
    	 super("Electricity Biling System");
    	 
    	 setSize(1920,1030);
    	 
    	 //Adding background image
    	 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/i5.jpg"));
    	 Image i2 = i1.getImage().getScaledInstance(1900,950,Image.SCALE_DEFAULT);
    	 ImageIcon ic1 = new ImageIcon(i2);
    	 JLabel l1 = new JLabel(ic1);
    	 add(l1);
    	 
    	 //first column
    	 JMenuBar mb = new JMenuBar();
    	 JMenu master = new JMenu("Master");
    	 JMenuItem m1 = new JMenuItem("New Customer");
    	 JMenuItem m2 = new JMenuItem("Customer Details");
    	 JMenuItem m3 = new JMenuItem("Deposit Details");
    	 master.setForeground(Color.BLUE);
    	 
    	 //..............customer Details............
    	 m1.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/cl.png"));
    	 Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 m1.setIcon(new ImageIcon(image1));
    	 m1.setMnemonic('D');
    	 m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
    	 m1.setBackground(Color.WHITE);
    	 
    	 //...............Meter Details..............
    	 m2.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icons/md.jpg"));
    	 Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 m2.setIcon(new ImageIcon(image2));
    	 m2.setMnemonic('M');
    	 m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
    	 m2.setBackground(Color.WHITE);
    	 
    	 //...............Deposit Details................
    	 m3.setFont(new Font("monoplaced",Font.PLAIN,12));
    	 ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icons/dp.png"));
    	 Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 m3.setIcon(new ImageIcon(image3));
    	 m3.setMnemonic('N');
    	 m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
    	 m3.setBackground(Color.WHITE);
    	 
    	 m1.addActionListener(this);
    	 m2.addActionListener(this);
    	 m3.addActionListener(this); 
    	 
    	 //.........................................................
    	 
    	 //second column
    	 JMenu user = new JMenu("User");
    	 JMenuItem u1 = new JMenuItem("Pay Bill");
    	 JMenuItem u2 = new JMenuItem("Calculate Bill");
    	 JMenuItem u3 = new JMenuItem("Last Bill");    	
    	 user.setForeground(Color.RED);
    	 
    	 //....................Pay Bill...............................
    	 u1.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon ui1 = new ImageIcon(ClassLoader.getSystemResource("icons/pay1.png"));
    	 Image uii1 = ui1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 u1.setIcon(new ImageIcon(uii1));
    	 u1.setMnemonic('P');
    	 u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
    	 u1.setBackground(Color.WHITE);
    	 
    	 //.....................Bill Details.........................
    	 u2.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon ui2 = new ImageIcon(ClassLoader.getSystemResource("icons/calcbill.png"));
    	 Image uii2 = ui2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 u2.setIcon(new ImageIcon(uii2));
    	 u2.setMnemonic('B');
    	 u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
    	 u2.setBackground(Color.WHITE);
    	 
    	 //......................Last Bill.............................
    	 u3.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon ui3 = new ImageIcon(ClassLoader.getSystemResource("icons/pay.png"));
    	 Image uii3 = ui3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 u3.setIcon(new ImageIcon(uii3));
    	 u3.setMnemonic('L');
    	 u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
    	 u3.setBackground(Color.WHITE);
    	 
    	 u1.addActionListener(this);
    	 u2.addActionListener(this);
    	 u3.addActionListener(this);
    	 
    	 //.............................................................
    	 
    	 //third column
    	 JMenu report = new JMenu("Report");
    	 JMenuItem r1 = new JMenuItem("Generate Bill");
    	 report.setForeground(Color.BLUE);
    	 
    	 //..................report....................
    	 r1.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon ri1 = new ImageIcon(ClassLoader.getSystemResource("icons/cb.png"));
    	 Image rii1 = ri1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 r1.setIcon(new ImageIcon(rii1));
    	 r1.setMnemonic('R');
    	 r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
    	 r1.setBackground(Color.WHITE);
    	 
    	 r1.addActionListener(this);
    	 
    	 //..................................................
    	 
    	 //fourth column
    	 JMenu utility = new JMenu("Utility");
    	 JMenuItem ut1 = new JMenuItem("Notepad");
    	 JMenuItem ut2 = new JMenuItem("Calculator");
    	 JMenuItem ut3 = new JMenuItem("Web Browser");    	
    	 utility.setForeground(Color.RED);
    	 
    	 //....................Notepad...............................
    	 ut1.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon uti1 = new ImageIcon(ClassLoader.getSystemResource("icons/np.jpg"));
    	 Image utii1 = uti1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 ut1.setIcon(new ImageIcon(utii1));
    	 ut1.setMnemonic('C');
    	 ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
    	 ut1.setBackground(Color.WHITE);
    	 
    	 //.....................Calculator.........................
    	 ut2.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon uti2 = new ImageIcon(ClassLoader.getSystemResource("icons/c.png"));
    	 Image utii2 = uti2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 ut2.setIcon(new ImageIcon(utii2));
    	 ut2.setMnemonic('X');
    	 ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
    	 ut2.setBackground(Color.WHITE);
    	 
    	 //......................Web Browser.............................
    	 ut3.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon uti3 = new ImageIcon(ClassLoader.getSystemResource("icons/wb.png"));
    	 Image utii3 = uti3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 ut3.setIcon(new ImageIcon(utii3));
    	 ut3.setMnemonic('W');
    	 ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
    	 ut3.setBackground(Color.WHITE);
    	 
    	 ut1.addActionListener(this);
    	 ut2.addActionListener(this);
    	 ut3.addActionListener(this);
    	 
    	 //..............................................................
    	 
    	 //fifth column
    	 JMenu exit = new JMenu("Exit");
    	 JMenuItem ex = new JMenuItem("Exit");
    	 exit.setForeground(Color.BLUE);
    	 
    	 //..........................exit................................
    	 ex.setFont(new Font("monospaced",Font.PLAIN,12));
    	 ImageIcon ex1 = new ImageIcon(ClassLoader.getSystemResource("icons/exit.png"));
    	 Image exx1 = ex1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	 ex.setIcon(new ImageIcon(exx1));
    	 ex.setMnemonic('E');
    	 ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
    	 ex.setBackground(Color.WHITE);
    	 
    	 ex.addActionListener(this);
    	 
    	 //.............................................................
    	 
    	 master.add(m1);
    	 master.add(m2);
    	 master.add(m3);
    	 
    	 user.add(u1);
    	 user.add(u2);
    	 user.add(u3);
    	 
    	 report.add(r1);
    	 
    	 utility.add(ut1);
    	 utility.add(ut2);
    	 utility.add(ut3);
    	 
    	 exit.add(ex);
    	 
    	 mb.add(master);
    	 mb.add(user);
    	 mb.add(report);
    	 mb.add(utility);
    	 mb.add(exit);
    	 
    	 setJMenuBar(mb);
    	 
    	 setFont(new Font("Senserif",Font.BOLD,16));
    	 setLayout(new FlowLayout());
    	 setVisible(false);
    	 
    }
     
     public void actionPerformed(ActionEvent ae) {
    	 String msg = ae.getActionCommand();
    	 if(msg.equals("Customer Details")) {
    	     new Customer_details().setVisible(true);
    	 }else if(msg.equals("New Customer")) {
    		 new New_customer().setVisible(true);
    	 }else if(msg.equals("Calculate Bill")) {
    		 new Calculate_bill().setVisible(true);
    	 }else if(msg.equals("Pay Bill")) {
    		 //new Pay_bill().setVisible(true);
    	 }else if(msg.equals("Notepad")) {
    		 try {
    			 Runtime.getRuntime().exec("notepad.exe");
    		 }catch(Exception e) {}
    	 }else if(msg.equals("Calculator")) {
    		 try {
    			 Runtime.getRuntime().exec("calc.exe");
    		 }catch(Exception e) {}
    	 }else if(msg.equals("Web Browser")) {
    		 try {
    			 Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
    		 }catch(Exception e) {}
    	 }else if(msg.equals("Exit")) {
    		 System.exit(0);
    	 }else if(msg.equals("Generate Bill")) {
    		 new Generate_bill().setVisible(true);
    	 }
      }
     
     public static void main(String[] args) {
    	 new Project().setVisible(true);
     }
}

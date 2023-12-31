package BillSystem;

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Customer_details extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTable t1;
	JButton b1;
	String x[] = {"CName","Meter no","Address","State","City","Email","Phone"};
	String y[][] = new String[20][7];
	int i=0,j=0;
	Customer_details(){
		super("Customer Details");
		setSize(900,350);
		setLocation(200,200);
		
		try {
			Conn c1 = new Conn();
			String s1 = "select * from emp";
			ResultSet rs = c1.s.executeQuery(s1);
			while(rs.next()) {
				y[i][j++] = rs.getString("Name");
				y[i][j++] = rs.getString("MeterNo");
				y[i][j++] = rs.getString("Address");
				y[i][j++] = rs.getString("State");
				y[i][j++] = rs.getString("City");
				y[i][j++] = rs.getString("Email");
				y[i][j++] = rs.getString("Phone");
				i++;
				j = 0;
			}
			t1 = new JTable(y,x);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		b1 = new JButton("Print");
		add(b1,"South");
		JScrollPane sp = new JScrollPane(t1);
		add(sp);
		b1.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			t1.print();
		}catch(Exception e) {}
	}
	
	public static void main(String[] args) {
		new Customer_details().setVisible(true);
	}
   
}

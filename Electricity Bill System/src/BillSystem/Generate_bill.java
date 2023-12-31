package BillSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Generate_bill extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1;
	JTextField tf;
	JTextArea t1;
	JButton b1;
	Choice c1;
	JPanel p1;

	Generate_bill() {
		setSize(500, 750);
		setLayout(new BorderLayout());

		p1 = new JPanel(new GridLayout());
		l1 = new JLabel("Generate Bill");
		tf = new JTextField();
		c1 = new Choice();

		c1.add("January");
		c1.add("Feburary");
		c1.add("March");
		c1.add("April");
		c1.add("May");
		c1.add("June");
		c1.add("July");
		c1.add("August");
		c1.add("September");
		c1.add("October");
		c1.add("November");
		c1.add("December");

		t1 = new JTextArea(50, 15);
		JScrollPane jsp = new JScrollPane(t1);
		t1.setFont(new Font("Senserif", Font.ITALIC, 18));

		b1 = new JButton("Generate Bill");

		p1.add(l1);
		p1.add(tf);
		p1.add(c1);

		add(p1, "North");
		add(jsp, "Center");
		add(b1, "South");

		b1.addActionListener(this);

		setLocation(350, 40);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {

			Conn c = new Conn();
			
			String month = c1.getSelectedItem();
			String msg = "Select * from bill where MeterNo = "+tf.getText();
			ResultSet rs = c.s.executeQuery(msg);

			if (rs.next()) {
				t1.setText("\tReliance Power Limited\nELECTRICITY BILL FOR THE MONTH OF " + month + " ,2022\n\n\n");

				rs = c.s.executeQuery("select * from emp where MeterNo =" + tf.getText());

				if (rs.next()) {
					t1.append("\n    Customer Name : " + rs.getString("Name"));
					t1.append("\n    Meter No. : " + rs.getString("MeterNo"));
					t1.append("\n    Address : " + rs.getString("Address"));
					t1.append("\n    State : " + rs.getString("State"));
					t1.append("\n    City : " + rs.getString("City"));
					t1.append("\n    Email : " + rs.getString("Email"));
					t1.append("\n    Phone Number : " + rs.getString("Phone"));
					t1.append("\n-------------------------------------------------");
					t1.append("\n");
				}

				rs = c.s.executeQuery("Select * from tax");

				if (rs.next()) {
					t1.append("\n Meter Location : " + rs.getString("MeterLocation"));
					t1.append("\n Meter Type : " + rs.getString("MeterType"));
					t1.append("\n Phase Code : " + rs.getString("PhaseCode"));
					t1.append("\n Bill Type : " + rs.getString("BillType"));
					t1.append("\n Days : " + rs.getString("Days"));
					t1.append("\n ------------------------------------------------");
					t1.append("\n");
					t1.append("\n Meter Rent : " + rs.getString("MeterRent"));
					t1.append("\n MCB Rent : " + rs.getString("McbRent"));
					t1.append("\n GST% : " + rs.getString("Gst"));
					t1.append("\n");

				}

				rs = c.s.executeQuery("select * from bill where MeterNo = " + tf.getText());

				if (rs.next()) {
					t1.append("\n     Current Month :\t" + rs.getString("Month"));
					t1.append("\n     Units Consumed :\t" + rs.getString("Units"));
					t1.append("\n     Total Charges :\t" + rs.getString("Bill"));
					t1.append("\n ------------------------------------------------");
					t1.append("\n     TOTAL PAYABLE :\t" + rs.getString("Bill"));
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Meter No.");
			}

		} catch (Exception ae) {
			System.out.println("Error :" + ae);
		}
	}

	public static void main(String[] args) {
		new Generate_bill().setVisible(true);
	}

}

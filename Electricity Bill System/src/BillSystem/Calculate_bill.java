package BillSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

import javax.swing.*;

public class Calculate_bill extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2;
	Choice c1, c2;
	JButton b1, b2;
	JPanel p;

	Calculate_bill() {

		p = new JPanel();
		p.setLayout(new GridLayout(4, 2, 30, 30));
		p.setBackground(Color.WHITE);

		l1 = new JLabel("Calculate Electricity Bill");
		l2 = new JLabel("Meter No.");
		l3 = new JLabel("Units Consumed");
		l5 = new JLabel("Month");

		t1 = new JTextField();
		t2 = new JTextField();

//		c1 = new Choice();
//		c1.add("1001");
//		c1.add("1002");
//		c1.add("1003");
//		c1.add("1004");
//		c1.add("1005");
//		c1.add("1006");
//		c1.add("1007");

		c2 = new Choice();
		c2.add("January");
		c2.add("Feburary");
		c2.add("March");
		c2.add("April");
		c2.add("May");
		c2.add("June");
		c2.add("July");
		c2.add("August");
		c2.add("September");
		c2.add("october");
		c2.add("November");
		c2.add("December");

		b1 = new JButton("Submit");
		b2 = new JButton("Cancel");

		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/caall.jpg"));
		Image i2 = i1.getImage().getScaledInstance(180, 270, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l4 = new JLabel(i3);

		l1.setFont(new Font("Senserif", Font.PLAIN, 26));
		// Move the label to center
		l1.setHorizontalAlignment(JLabel.CENTER);

		p.add(l2);
		p.add(t2);
		p.add(l5);
		p.add(c2);
		p.add(l3);
		p.add(t1);
		p.add(b1);
		p.add(b2);

		setLayout(new BorderLayout(30, 30));
		add(l1, "North");
		add(p, "Center");
		add(l4, "West");

		b1.addActionListener(this);
		b2.addActionListener(this);

		getContentPane().setBackground(Color.WHITE);
		setSize(650, 500);
		setLocation(300, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Conn c1 = new Conn();
		String msg = e.getActionCommand();
		String a = t2.getText();
		String b = t1.getText();
		String c = c2.getSelectedItem();

		if (msg.equals("Cancel")) {
			setVisible(false);
		} else {
			try {
				int p1 = Integer.parseInt(b);
				int p2 = p1 * 7;
				int p3 = p2 + 50 + 12 + 102 + 20 + 50;
				String mcheck = "Select MeterNo from emp where MeterNo = " + a;
				ResultSet rs = c1.s.executeQuery(mcheck);

				if (rs.next()) {
					String q = "insert into bill values('" + a + "','" + c + "','" + b + "','" + p3 + "')";
					c1.s.executeUpdate(q);
					JOptionPane.showMessageDialog(null, "Bill Updated");
				} else {
					JOptionPane.showMessageDialog(null, "Meter No. is Invalid");
				}
			} catch (Exception e1) {
				System.out.println("error " + e1);
			}
		}
	}

	public static void main(String[] args) {
		new Calculate_bill().setVisible(true);
		;
	}

}

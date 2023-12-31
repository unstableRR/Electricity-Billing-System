package BillSystem;

import java.awt.*;
import javax.swing.*;

public class Pay_bill extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Pay_bill() {
		JEditorPane j = new JEditorPane();
		j.setEditable(false);

		try {
			j.setPage("https://paytm.com//electricity-bill-payment");
		} catch (Exception e) {
			j.setContentType("text/html");
			j.setText("<html>Could not load</html>");
		}

		JScrollPane scrollPane = new JScrollPane(j);
		JFrame p = new JFrame("Payment Portal");
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.getContentPane().add(scrollPane);
		p.setPreferredSize(new Dimension(800, 600));
		p.setSize(800, 800);
		p.setLocation(250, 120);
		p.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Pay_bill().setVisible(true);
	}
}

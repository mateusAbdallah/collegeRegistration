package collegeRegistration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class Main implements ActionListener {

	private JFrame frame;
	private JLabel title, label1, label2, label3;
	private JTextField field1, field2, field3;
	private JButton btnAdd, btnDelete, btnUpdate, btnSearch;
	//private JTable table;
	
	
	
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		obj.form();

	}
	
	public void form() throws IOException{
		
		//create the frame
		frame = new JFrame("College Sign In");
		frame.setLayout(new GridLayout(6,0));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create panel 1
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,0));		
		title = new JLabel("Registration", SwingConstants.CENTER);
		title.setFont(new Font("Verdana", Font.CENTER_BASELINE, 30));
		
		p1.add(title);
		frame.add(p1);
		
		//create panel 2
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3,2));
		label1 = new JLabel("Full name:");
		field1 = new JTextField(20);
		label2 = new JLabel("Student ID:");
		field2 = new JTextField(20);
		label3 = new JLabel("Program:");
		field3 = new JTextField(20);
		
		p2.add(label1);
		p2.add(field1);
		p2.add(label2);
		p2.add(field2);
		p2.add(label3);
		p2.add(field3);
		frame.add(p2);
		
		JPanel p3 = new JPanel();
		btnAdd = new JButton("Add");
		btnDelete = new JButton("Delete");
		btnUpdate = new JButton("Update");
		btnSearch = new JButton("Search");
		
		p3.add(btnAdd);
		p3.add(btnDelete);
		p3.add(btnUpdate);
		p3.add(btnSearch);
		frame.add(p3);
		
		
		
		frame.setSize(700,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

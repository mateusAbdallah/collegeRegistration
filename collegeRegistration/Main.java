package collegeRegistration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class Main implements ActionListener {

	private JFrame frame;
	private JLabel label1, label2, label3, label4;
	private JTextField field1, field2;
	
	
	
	
	public static void main(String[] args) throws IOException {
		Main obj = new Main();
		obj.form();

	}
	
	public void form() throws IOException{
		
		frame = new JFrame("Registration");
		frame.setLayout(new GridLayout(6,0));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		frame.setSize(700,500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

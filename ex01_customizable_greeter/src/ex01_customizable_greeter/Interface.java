package ex01_customizable_greeter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Interface() {
	    setTitle("CUSTOMIZABLE GREETER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setComponents();
		
	}
	
	public void setComponents() {
		
		JLabel lblNewLabel = new JLabel("Enter your name");
		lblNewLabel.setBounds(54, 44, 115, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(54, 82, 171, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Say hi!");
		btnNewButton.setBounds(54, 136, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Hello "+textField.getText()+"!");
			}
		});
				
	}
	
	
}

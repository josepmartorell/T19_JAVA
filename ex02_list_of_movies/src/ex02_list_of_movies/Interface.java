package ex02_list_of_movies;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;



	/**
	 * Create the frame.
	 */
	public Interface() {
		setTitle("LIST OF MOVIES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 563);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		setComponents();

	}
	
	public void setComponents() {
		
		JLabel lblNewLabel = new JLabel("Enter a title film");
		lblNewLabel.setBounds(29, 57, 86, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(27, 82, 372, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(26, 113, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Films");
		lblNewLabel_1.setBounds(31, 219, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(28, 244, 371, 22);
		contentPane.add(comboBox);
		
		btnNewButton.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
                if (textField.getText().compareTo("")!=0)
                {	
                	comboBox.addItem(textField.getText());
                	textField.setText("");
                }
			}
		});	
		
	}

}

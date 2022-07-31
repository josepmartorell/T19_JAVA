package ex04_mini_calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorInterface extends JFrame {

	private JPanel contentPane;
	private JTextField text;
	private JTextField text_1;
	private JTextField text_2;

	/**
	 * Create the frame.
	 */
	public CalculatorInterface() {
		setTitle("MINI CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 240);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		setComponents();	

	}
	
	public void setComponents() {
		
		JLabel label = new JLabel("OPERA 1");
		label.setBounds(194, 35, 67, 13);
		contentPane.add(label);
		
		text = new JTextField();
		text.setBounds(288, 32, 184, 19);
		contentPane.add(text);
		text.setColumns(10);
		
		JLabel label_1 = new JLabel("OPERA 2");
		label_1.setBounds(194, 64, 67, 13);
		contentPane.add(label_1);
		
		text_1 = new JTextField();
		text_1.setBounds(288, 61, 184, 19);
		contentPane.add(text_1);
		text_1.setColumns(10);
		
		JLabel label_2 = new JLabel("RESULT");
		label_2.setBounds(195, 101, 67, 13);
		contentPane.add(label_2);
		
		text_2 = new JTextField();
		text_2.setEditable(false);
		text_2.setBounds(288, 98, 184, 19);
		contentPane.add(text_2);
		text_2.setColumns(10);
		
		JButton button = new JButton("ADDITION");
		button.setBounds(494, 31, 106, 21);
		contentPane.add(button);
		
		button.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				if ((text != null) && (text_1 != null)) {
					Double result =((Double.parseDouble(text.getText()))+(Double.parseDouble(text_1.getText())));
					String val = String.valueOf(result);
					text_2.setText(val);
				}else {
					clear();
				}
			}
		});
		
		JButton button_1 = new JButton("SUBTRACTION");
		button_1.setBounds(494, 66, 107, 21);
		contentPane.add(button_1);
		
		button_1.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				if ((text != null) || (text_1 != null)) {
					Double result =((Double.parseDouble(text.getText()))-(Double.parseDouble(text_1.getText())));
					String val = String.valueOf(result);
					text_2.setText(val);
				}else {
					clear();
				}
			}
		});
		
		JButton button_2 = new JButton("MULTIPLICATION");
		button_2.setBounds(494, 97, 107, 21);
		contentPane.add(button_2);
		
		button_2.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				if ((text != null) || (text_1 != null)) {
					Double result =((Double.parseDouble(text.getText()))*(Double.parseDouble(text_1.getText())));
					String val = String.valueOf(result);
					text_2.setText(val);
				}else {
					clear();
				}
			}
		});
		
		JButton button_3 = new JButton("DIVISION");
		button_3.setBounds(494, 128, 106, 21);
		contentPane.add(button_3);
		
		button_3.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				if ((text != null) || (text_1 != null)) {
					Double result =((Double.parseDouble(text.getText()))/(Double.parseDouble(text_1.getText())));
					String val = String.valueOf(result);
					text_2.setText(val);
				}else {
					clear();
				}
			}
		});
		
		JButton button_4 = new JButton("ABOUT");
		button_4.setBounds(10, 31, 161, 21);
		contentPane.add(button_4);
		
		button_4.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "CREDITS: Andrew, Philip & Joseph development", "Mini cALcuLtoR" , JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		JButton btnOff = new JButton("OFF");
		btnOff.setBounds(494, 160, 106, 21);
		contentPane.add(btnOff);
		
		btnOff.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				System.exit(ABORT);
			}
		});
		
		JButton button_5 = new JButton("CLEAR");
		button_5.setBounds(387, 160, 85, 21);
		contentPane.add(button_5);
		
		button_5.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				clear();
				text_2.setText("");
			}
		});
	
	}
	
	public void clear() {
		text.setText("");
		text_1.setText("");		
	}

	
}

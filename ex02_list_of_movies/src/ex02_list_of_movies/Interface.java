package ex02_list_of_movies;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Interface extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public Interface() {
		setTitle("LIST OF MOVIES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
	}

}

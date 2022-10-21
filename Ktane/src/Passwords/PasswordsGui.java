package Passwords;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;

public class PasswordsGui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordsGui window = new PasswordsGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PasswordsGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 100));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel firstLabel = new JLabel("1st Character");
		firstLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstLabel.setPreferredSize(new Dimension(75, 13));
		firstLabel.setMinimumSize(new Dimension(70, 13));
		firstLabel.setMaximumSize(new Dimension(70, 13));
		firstLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_1.add(firstLabel);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel thrdLabel = new JLabel("3rd Character");
		thrdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		thrdLabel.setPreferredSize(new Dimension(75, 13));
		thrdLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_2.add(thrdLabel);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel ffthLabel = new JLabel("5th Character");
		ffthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ffthLabel.setPreferredSize(new Dimension(75, 13));
		ffthLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(ffthLabel);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		textField = new JTextField();
		panel_4.add(textField);
		textField.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5);
		
		textField_1 = new JTextField();
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel.add(panel_6);
		
		textField_2 = new JTextField();
		panel_6.add(textField_2);
		textField_2.setColumns(10);
	}

}

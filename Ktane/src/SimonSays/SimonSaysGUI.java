package SimonSays;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JTextPane;

public class SimonSaysGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimonSaysGUI window = new SimonSaysGUI();
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
	public SimonSaysGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_6.getLayout();
		flowLayout.setHgap(0);
		panel_3.add(panel_6);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setPreferredSize(new Dimension(40, 38));
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton.setIcon(new javax.swing.ImageIcon(SimonSaysGUI.class.getResource("/Icons/WiresBlueSquare40x40.png")));
		panel_6.add(btnNewButton);
		
		JPanel panel_7 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_7.getLayout();
		flowLayout_1.setHgap(60);
		panel_3.add(panel_7);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2.setIcon(new javax.swing.ImageIcon(SimonSaysGUI.class.getResource("/Icons/WiresRedSquare40x40.png")));
		btnNewButton_2.setPreferredSize(new Dimension(40, 38));
		panel_7.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setPreferredSize(new Dimension(40, 38));
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setIcon(new javax.swing.ImageIcon(SimonSaysGUI.class.getResource("/Icons/WiresYellowSquare40x40.png")));
		panel_7.add(btnNewButton_1);
		
		JPanel panel_5 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_5.getLayout();
		flowLayout_2.setHgap(0);
		panel_3.add(panel_5);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setPreferredSize(new Dimension(40, 38));
		btnNewButton_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_3.setIcon(new javax.swing.ImageIcon(SimonSaysGUI.class.getResource("/Icons/SimonSaysGreenSquare40x40.png")));
		panel_5.add(btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(70, 34, 198, 19);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("Valider");
		btnNewButton_5.setBounds(284, 33, 85, 21);
		panel_4.add(btnNewButton_5);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(70, 63, 299, 51);
		panel_4.add(textPane);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("SIMON SAYS");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_2.getLayout();
		flowLayout_3.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("Cancel");
		panel_2.add(btnNewButton_4);
	}
}

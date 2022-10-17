package Button;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

import GUIModulesFeatures.BombInfo;

import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonGUI {

	public JFrame frame;
	private static BombInfo bombInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonGUI window = new ButtonGUI(bombInfo);
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
	public ButtonGUI(BombInfo bombInfo) {
		this.bombInfo = bombInfo;
		initialize(this.bombInfo);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(BombInfo bombInfo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 215);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("BUTTON");
		lblNewLabel.setFont(new Font("Open Sans", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JComboBox<ButtonColor> comboBox = new JComboBox<ButtonColor>();
		comboBox.setModel(new javax.swing.DefaultComboBoxModel<ButtonColor>(ButtonColor.values()));
		comboBox.setBounds(84, 10, 80, 21);
		comboBox.setPreferredSize(new Dimension(50, 21));
		panel_4.add(comboBox);
		
		JComboBox<ButtonText> comboBox_1 = new JComboBox<ButtonText>();
		comboBox_1.setModel(new javax.swing.DefaultComboBoxModel<ButtonText>(ButtonText.values()));
		comboBox_1.setBounds(174, 10, 80, 21);
		comboBox_1.setPreferredSize(new Dimension(50, 21));
		panel_4.add(comboBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFocusable(false);
		textPane.setBounds(52, 5, 333, 32);
		panel_3.add(textPane);
		
		JButton btnNewButton_1 = new JButton("Valider");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button button = new Button((ButtonColor) comboBox.getSelectedItem(), (ButtonText) comboBox_1.getSelectedItem(), bombInfo);
				textPane.setText(button.solveModule());
			}
		});
		btnNewButton_1.setBounds(264, 10, 85, 21);
		panel_4.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(220, 220, 220));
		FlowLayout flowLayout = (FlowLayout) panel_2.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		panel_2.add(btnNewButton);
	}

}

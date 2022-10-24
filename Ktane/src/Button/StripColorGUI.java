package Button;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Wires.WiresGUI;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StripColorGUI {

	public JFrame frame;
	public static Button button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StripColorGUI window = new StripColorGUI(button);
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
	public StripColorGUI(Button button) {
		this.button = button;
		initialize(this.button);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param button 
	 */
	private void initialize(Button button) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 220);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Selectionner la couleur de la bande");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFocusable(false);
		textPane.setBounds(68, 0, 301, 47);
		panel_3.add(textPane);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(220, 220, 220));
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(panel_4, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(button.releasingHeldButton(StripColor.BLUE));
			}
		});
		btnNewButton.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresBlueSquare40x40.png")));
		btnNewButton.setMargin(new Insets(0, 0, 0, 0));
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(button.releasingHeldButton(StripColor.YELLOW));
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresYellowSquare40x40.png")));
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		panel_2.add(btnNewButton_1);
		
		JButton btnOther = new JButton("Other");
		btnOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText(button.releasingHeldButton(StripColor.OTHER));
			}
		});
		btnOther.setPreferredSize(new Dimension(48, 44));
		btnOther.setMinimumSize(new Dimension(40, 40));
		btnOther.setMaximumSize(new Dimension(40, 40));
		btnOther.setMargin(new Insets(0, 0, 0, 0));
		panel_2.add(btnOther);
	}
}

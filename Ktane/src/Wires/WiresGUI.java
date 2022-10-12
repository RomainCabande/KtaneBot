package Wires;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import GUIModulesFeatures.BombInfo;
import GUIModulesFeatures.MainGUI;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class WiresGUI {

	public JFrame frame;
	private JTextField displayColorTextField;
	private JTextPane displaySolutionTextPane;
	private static BombInfo bombInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WiresGUI window = new WiresGUI(bombInfo);
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
	public WiresGUI(BombInfo bombInfo) {
		this.bombInfo = bombInfo;
		initialize(this.bombInfo);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(BombInfo bombInfo) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel topLabelPanel = new JPanel();
		topLabelPanel.setBackground(SystemColor.menu);
		topLabelPanel.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		frame.getContentPane().add(topLabelPanel, BorderLayout.NORTH);
		
		JLabel topLabel = new JLabel("WIRES");
		topLabel.setFont(new Font("Open Sans", Font.BOLD, 15));
		topLabelPanel.add(topLabel);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(SystemColor.menu);
		bottomPanel.setBorder(new LineBorder(new Color(128, 128, 128), 2));
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(SystemColor.menu);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFils wires = new MainFils(bombInfo, displayColorTextField.getText());
				displaySolutionTextPane.setText(wires.cutWire());
			}
		});
		buttonPanel.add(btnOK);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		buttonPanel.add(btnCancel);
		
		JPanel middlePanel = new JPanel();
		middlePanel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(middlePanel, BorderLayout.CENTER);
		middlePanel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel colorBtnPanel = new JPanel();
		colorBtnPanel.setMaximumSize(new Dimension(32767, 10));
		colorBtnPanel.setBackground(SystemColor.menu);
		middlePanel.add(colorBtnPanel);
		
		JButton btnRed = new JButton("");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayColorTextField.setText(displayColorTextField.getText() + "R");
			}
		});
		btnRed.setMargin(new Insets(0, 0, 0, 0));
		btnRed.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresRedSquare40x40.png")));
		colorBtnPanel.add(btnRed);
		
		JButton btnBlue = new JButton("");
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayColorTextField.setText(displayColorTextField.getText() + "B");
			}
		});
		btnBlue.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresBlueSquare40x40.png")));
		btnBlue.setMargin(new Insets(0, 0, 0, 0));
		colorBtnPanel.add(btnBlue);
		
		JButton btnWhite = new JButton("");
		btnWhite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayColorTextField.setText(displayColorTextField.getText() + "W");
			}
		});
		btnWhite.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresWhiteSquare40x40.png")));
		btnWhite.setMargin(new Insets(0, 0, 0, 0));
		colorBtnPanel.add(btnWhite);
		
		JButton btnYellow = new JButton("");
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayColorTextField.setText(displayColorTextField.getText() + "J");
			}
		});
		btnYellow.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresYellowSquare40x40.png")));
		btnYellow.setMargin(new Insets(0, 0, 0, 0));
		colorBtnPanel.add(btnYellow);
		
		JButton btnBlack = new JButton("");
		btnBlack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayColorTextField.setText(displayColorTextField.getText() + "N");
			}
		});
		btnBlack.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresBlackSquare40x40.png")));
		btnBlack.setMargin(new Insets(0, 0, 0, 0));
		colorBtnPanel.add(btnBlack);
		
		JPanel displayColorPanel = new JPanel();
		displayColorPanel.setBackground(SystemColor.menu);
		middlePanel.add(displayColorPanel);
		displayColorPanel.setLayout(null);
		
		displayColorTextField = new JTextField();
		displayColorTextField.setLocation(42, 11);
		displayColorTextField.setSize(new Dimension(355, 20));
		displayColorPanel.add(displayColorTextField);
		displayColorTextField.setColumns(10);
		
		JButton btnDeleteColors = new JButton("Delete");
		btnDeleteColors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayColorTextField.setText("");
			}
		});
		btnDeleteColors.setBounds(176, 36, 89, 23);
		displayColorPanel.add(btnDeleteColors);
		
		JPanel displaySolutionPanel = new JPanel();
		middlePanel.add(displaySolutionPanel);
		displaySolutionPanel.setLayout(null);
		
		displaySolutionTextPane = new JTextPane();
		displaySolutionTextPane.setBounds(41, 5, 356, 65);
		displaySolutionPanel.add(displaySolutionTextPane);
	}
	
}

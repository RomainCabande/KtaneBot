package Wires;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import GUIModulesFeatures.BombInfo;
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
	 * Create the application.
	 */
	public WiresGUI(BombInfo bombInfo) {
		WiresGUI.bombInfo = bombInfo;
		initialize(WiresGUI.bombInfo);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(BombInfo bombInfo) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 348);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel topLabelPanel = new JPanel();
		topLabelPanel.setBackground(SystemColor.menu);
		frame.getContentPane().add(topLabelPanel, BorderLayout.NORTH);
		
		JLabel topLabel = new JLabel("WIRES");
		topLabel.setFont(new Font("Open Sans", Font.BOLD, 15));
		topLabelPanel.add(topLabel);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(SystemColor.menu);
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(SystemColor.menu);
		bottomPanel.add(buttonPanel, BorderLayout.EAST);
		
		JButton btnOK = new JButton("OK");
		buttonPanel.add(btnOK);
		validateBtnAL(btnOK);
		
		JButton btnCancel = new JButton("Cancel");
		buttonPanel.add(btnCancel);
		closeWindowAL(btnCancel);
		
		JPanel middlePanel = new JPanel();
		middlePanel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(middlePanel, BorderLayout.CENTER);
		middlePanel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel colorBtnPanel = new JPanel();
		colorBtnPanel.setMaximumSize(new Dimension(32767, 10));
		colorBtnPanel.setBackground(SystemColor.menu);
		middlePanel.add(colorBtnPanel);
		
		JButton btnRed = new JButton("");
		btnRed.setMargin(new Insets(0, 0, 0, 0));
		btnRed.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresRedSquare40x40.png")));
		colorBtnPanel.add(btnRed);
		setColorBtnAL(btnRed, "R");
		
		JButton btnBlue = new JButton("");
		btnBlue.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresBlueSquare40x40.png")));
		btnBlue.setMargin(new Insets(0, 0, 0, 0));
		colorBtnPanel.add(btnBlue);
		setColorBtnAL(btnBlue, "B");
		
		JButton btnWhite = new JButton("");
		btnWhite.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresWhiteSquare40x40.png")));
		btnWhite.setMargin(new Insets(0, 0, 0, 0));
		colorBtnPanel.add(btnWhite);
		setColorBtnAL(btnWhite, "W");
		
		JButton btnYellow = new JButton("");
		btnYellow.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresYellowSquare40x40.png")));
		btnYellow.setMargin(new Insets(0, 0, 0, 0));
		colorBtnPanel.add(btnYellow);
		setColorBtnAL(btnYellow, "J");
		
		JButton btnBlack = new JButton("");
		btnBlack.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresBlackSquare40x40.png")));
		btnBlack.setMargin(new Insets(0, 0, 0, 0));
		colorBtnPanel.add(btnBlack);
		setColorBtnAL(btnBlack, "N");
		
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
		btnDeleteColors.setBounds(176, 36, 89, 23);
		displayColorPanel.add(btnDeleteColors);
		deleteColorsAL(btnDeleteColors);
		
		JPanel displaySolutionPanel = new JPanel();
		middlePanel.add(displaySolutionPanel);
		displaySolutionPanel.setLayout(null);
		
		displaySolutionTextPane = new JTextPane();
		displaySolutionTextPane.setBounds(41, 5, 356, 65);
		displaySolutionPanel.add(displaySolutionTextPane);
	}
	
	public void closeWindowAL(JButton btn) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
	}
	
	public void validateBtnAL(JButton btn) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFils wires = new MainFils(bombInfo, displayColorTextField.getText());
				displaySolutionTextPane.setText(wires.cutWire());
			}
		});
	}
	
	public void setColorBtnAL(JButton btn, String color) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayColorTextField.setText(displayColorTextField.getText() + color);
			}
		});
	}
	
	public void deleteColorsAL(JButton btn) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayColorTextField.setText("");
			}
		});
	}
	
}

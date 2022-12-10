package Button;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
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
	public BombInfo bombInfo;
	public JComboBox<ButtonColor> colorComboBox;
	public JComboBox<ButtonText> wordComboBox;
	public JTextPane displayTextPane;

	/**
	 * Create the application.
	 */
	public ButtonGUI(BombInfo bombInfo) {
		this.bombInfo = bombInfo;
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 215);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		
		JLabel titleLabel = new JLabel("BUTTON");
		titleLabel.setFont(new Font("Open Sans", Font.BOLD, 15));
		topPanel.add(titleLabel);
		
		JPanel middlePanel = new JPanel();
		frame.getContentPane().add(middlePanel, BorderLayout.CENTER);
		middlePanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel comboBoxesPanel = new JPanel();
		middlePanel.add(comboBoxesPanel);
		comboBoxesPanel.setLayout(null);
		
		this.colorComboBox = new JComboBox<ButtonColor>();
		colorComboBox.setModel(new javax.swing.DefaultComboBoxModel<ButtonColor>(ButtonColor.values()));
		colorComboBox.setBounds(84, 10, 80, 21);
		colorComboBox.setPreferredSize(new Dimension(50, 21));
		comboBoxesPanel.add(colorComboBox);
		
		this.wordComboBox = new JComboBox<ButtonText>();
		wordComboBox.setModel(new javax.swing.DefaultComboBoxModel<ButtonText>(ButtonText.values()));
		wordComboBox.setBounds(174, 10, 80, 21);
		wordComboBox.setPreferredSize(new Dimension(50, 21));
		comboBoxesPanel.add(wordComboBox);
		
		JPanel displayPanel = new JPanel();
		middlePanel.add(displayPanel);
		displayPanel.setLayout(null);
		
		this.displayTextPane = new JTextPane();
		displayTextPane.setEditable(false);
		displayTextPane.setFocusable(false);
		displayTextPane.setBounds(52, 5, 333, 32);
		displayPanel.add(displayTextPane);
		
		JButton validateBtn = new JButton("Valider");
		validateBtn.setBounds(264, 10, 85, 21);
		comboBoxesPanel.add(validateBtn);
		validateBtnAL(validateBtn);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(220, 220, 220));
		FlowLayout fl_bottomPanel = (FlowLayout) bottomPanel.getLayout();
		fl_bottomPanel.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		JPanel bottomBtnPanel = new JPanel();
		FlowLayout fl_bottomBtnPanel = (FlowLayout) bottomBtnPanel.getLayout();
		fl_bottomBtnPanel.setVgap(0);
		fl_bottomBtnPanel.setHgap(0);
		fl_bottomBtnPanel.setAlignment(FlowLayout.RIGHT);
		bottomPanel.add(bottomBtnPanel);
		
		JButton closeBtn = new JButton("Close");
		bottomBtnPanel.add(closeBtn);
		btnALCloseFrame(closeBtn, frame);
	}

	public void validateBtnAL(JButton b) {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button button = new Button((ButtonColor) colorComboBox.getSelectedItem(), (ButtonText) wordComboBox.getSelectedItem(), bombInfo);
				displayTextPane.setText(button.solveModule());
			}
		});
	}
	
	public void btnALCloseFrame(JButton b, JFrame f) {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
	}
}

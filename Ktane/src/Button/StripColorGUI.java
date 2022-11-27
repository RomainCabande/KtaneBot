package Button;

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
import java.awt.Color;

public class StripColorGUI extends ActionListenerController{

	public JFrame frame;
	public Button button;

	/**
	 * Create the application.
	 */
	public StripColorGUI(Button button) {
		this.button = button;
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 220);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(220, 220, 220));
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		
		JLabel titleLabel = new JLabel("Selectionner la couleur de la bande");
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		topPanel.add(titleLabel);
		
		JPanel middlePanel = new JPanel();
		frame.getContentPane().add(middlePanel, BorderLayout.CENTER);
		middlePanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel buttonsPanel = new JPanel();
		middlePanel.add(buttonsPanel);
	
		JPanel displayPanel = new JPanel();
		middlePanel.add(displayPanel);
		displayPanel.setLayout(null);
		
		JTextPane displayTextPane = new JTextPane();
		displayTextPane.setEditable(false);
		displayTextPane.setFocusable(false);
		displayTextPane.setBounds(68, 0, 301, 47);
		displayPanel.add(displayTextPane);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(220, 220, 220));
		FlowLayout fl_bottomPanel = (FlowLayout) bottomPanel.getLayout();
		fl_bottomPanel.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		JButton cancelBtn = new JButton("Cancel");
		bottomPanel.add(cancelBtn);
		ActionListenerController.btnALCloseFrame(cancelBtn, frame);
		
		JButton btnBlue = new JButton("");
		btnBlue.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresBlueSquare40x40.png")));
		btnBlue.setMargin(new Insets(0, 0, 0, 0));
		buttonsPanel.add(btnBlue);
		ActionListenerController.btnALSetText(btnBlue, displayTextPane, button.releasingHeldButton(StripColor.BLUE));
		
		JButton btnYellow = new JButton("");
		btnYellow.setIcon(new ImageIcon(WiresGUI.class.getResource("/Icons/WiresYellowSquare40x40.png")));
		btnYellow.setMargin(new Insets(0, 0, 0, 0));
		buttonsPanel.add(btnYellow);
		ActionListenerController.btnALSetText(btnYellow, displayTextPane, button.releasingHeldButton(StripColor.YELLOW));
		
		JButton btnOther = new JButton("Other");
		btnOther.setPreferredSize(new Dimension(48, 44));
		btnOther.setMinimumSize(new Dimension(40, 40));
		btnOther.setMaximumSize(new Dimension(40, 40));
		btnOther.setMargin(new Insets(0, 0, 0, 0));
		buttonsPanel.add(btnOther);
		ActionListenerController.btnALSetText(btnOther, displayTextPane, button.releasingHeldButton(StripColor.OTHER));
	}
}

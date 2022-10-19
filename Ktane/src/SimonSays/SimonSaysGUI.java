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

import GUIModulesFeatures.BombInfo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimonSaysGUI {

	public JFrame frame;
	private JTextField displayTextField;
	private static BombInfo bombInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimonSaysGUI window = new SimonSaysGUI(bombInfo);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param bombInfo2 
	 */
	public SimonSaysGUI(BombInfo bombInfo) {
		this.bombInfo = bombInfo;
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
		
		JPanel middlePanel = new JPanel();
		frame.getContentPane().add(middlePanel, BorderLayout.CENTER);
		middlePanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel buttonPanel = new JPanel();
		middlePanel.add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel firstRowButtonPanel = new JPanel();
		FlowLayout fl_firstRowButtonPanel = (FlowLayout) firstRowButtonPanel.getLayout();
		fl_firstRowButtonPanel.setHgap(0);
		buttonPanel.add(firstRowButtonPanel);
		
		JButton blueButton = new JButton("");
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayTextField.setText(displayTextField.getText() + "B");
			}
		});
		blueButton.setPreferredSize(new Dimension(40, 38));
		blueButton.setMargin(new Insets(0, 0, 0, 0));
		blueButton.setIcon(new javax.swing.ImageIcon(SimonSaysGUI.class.getResource("/Icons/WiresBlueSquare40x40.png")));
		firstRowButtonPanel.add(blueButton);
		
		JPanel secondRowButtonPanel = new JPanel();
		FlowLayout fl_secondRowButtonPanel = (FlowLayout) secondRowButtonPanel.getLayout();
		fl_secondRowButtonPanel.setHgap(60);
		buttonPanel.add(secondRowButtonPanel);
		
		JButton redButton = new JButton("");
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayTextField.setText(displayTextField.getText() + "R");
			}
		});
		redButton.setMargin(new Insets(0, 0, 0, 0));
		redButton.setIcon(new javax.swing.ImageIcon(SimonSaysGUI.class.getResource("/Icons/WiresRedSquare40x40.png")));
		redButton.setPreferredSize(new Dimension(40, 38));
		secondRowButtonPanel.add(redButton);
		
		JButton yellowButton = new JButton("");
		yellowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayTextField.setText(displayTextField.getText() + "Y");
			}
		});
		yellowButton.setPreferredSize(new Dimension(40, 38));
		yellowButton.setMargin(new Insets(0, 0, 0, 0));
		yellowButton.setIcon(new javax.swing.ImageIcon(SimonSaysGUI.class.getResource("/Icons/WiresYellowSquare40x40.png")));
		secondRowButtonPanel.add(yellowButton);
		
		JPanel thirdRowButtonPanel = new JPanel();
		FlowLayout fl_thirdRowButtonPanel = (FlowLayout) thirdRowButtonPanel.getLayout();
		fl_thirdRowButtonPanel.setHgap(0);
		buttonPanel.add(thirdRowButtonPanel);
		
		JButton greenButton = new JButton("");
		greenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayTextField.setText(displayTextField.getText() + "G");
			}
		});
		greenButton.setPreferredSize(new Dimension(40, 38));
		greenButton.setMargin(new Insets(0, 0, 0, 0));
		greenButton.setIcon(new javax.swing.ImageIcon(SimonSaysGUI.class.getResource("/Icons/SimonSaysGreenSquare40x40.png")));
		thirdRowButtonPanel.add(greenButton);
		
		JPanel displayPanel = new JPanel();
		middlePanel.add(displayPanel);
		displayPanel.setLayout(null);
		
		displayTextField = new JTextField();
		JTextField displayTextFieldColors = displayTextField;
		displayTextFieldColors.setBounds(70, 34, 198, 19);
		displayPanel.add(displayTextFieldColors);
		displayTextFieldColors.setColumns(10);
		
		JTextPane displayTextPane = new JTextPane();
		displayTextPane.setBounds(70, 63, 299, 51);
		displayPanel.add(displayTextPane);
		
		JButton validateButton = new JButton("Valider");
		validateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimonSays simon = new SimonSays(displayTextField.getText(), bombInfo);
				displayTextPane.setText(simon.solveModule());
			}
		});
		validateButton.setBounds(284, 33, 85, 21);
		displayPanel.add(validateButton);
		
		JPanel topPanel = new JPanel();
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel titleLabel = new JLabel("SIMON SAYS");
		titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		topPanel.add(titleLabel);
		
		JPanel bottomPanel = new JPanel();
		FlowLayout fl_bottomPanel = (FlowLayout) bottomPanel.getLayout();
		fl_bottomPanel.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		bottomPanel.add(cancelButton);
	}
}

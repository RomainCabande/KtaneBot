package WhosOnFirst;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class WhosOnFirstGUI {

	public JFrame frame;
	private JTextField displayTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WhosOnFirstGUI window = new WhosOnFirstGUI();
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
	public WhosOnFirstGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 375);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel topPanel = new JPanel();
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		
		JLabel titleLabel = new JLabel("WHO'S ON FIRST");
		titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		topPanel.add(titleLabel);
		
		JPanel bottomPanel = new JPanel();
		FlowLayout fl_bottomPanel = (FlowLayout) bottomPanel.getLayout();
		fl_bottomPanel.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Cancel");
		bottomPanel.add(btnNewButton);
		
		JPanel middlePanel = new JPanel();
		frame.getContentPane().add(middlePanel, BorderLayout.CENTER);
		middlePanel.setLayout(null);
		
		JPanel selectionPanel = new JPanel();
		selectionPanel.setBounds(0, 0, 436, 242);
		selectionPanel.setPreferredSize(new Dimension(10, 400));
		middlePanel.add(selectionPanel);
		selectionPanel.setLayout(null);
		
		JLabel topWordLabel = new JLabel("Top Word");
		topWordLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		topWordLabel.setBounds(189, 10, 57, 19);
		selectionPanel.add(topWordLabel);
		
		JLabel topLeftLabel = new JLabel("Top Left");
		topLeftLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		topLeftLabel.setBounds(94, 67, 70, 19);
		selectionPanel.add(topLeftLabel);
		
		JLabel topRightLabel = new JLabel("Top Right");
		topRightLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		topRightLabel.setBounds(293, 67, 70, 19);
		selectionPanel.add(topRightLabel);
		
		JLabel middleLeftLabel = new JLabel("Middle Left");
		middleLeftLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		middleLeftLabel.setBounds(87, 115, 70, 19);
		selectionPanel.add(middleLeftLabel);
		
		JLabel middleRightLabel = new JLabel("Middle Right");
		middleRightLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		middleRightLabel.setBounds(287, 115, 70, 19);
		selectionPanel.add(middleRightLabel);
		
		JLabel bottomLeftLabel = new JLabel("Bottom Left");
		bottomLeftLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		bottomLeftLabel.setBounds(85, 163, 70, 19);
		selectionPanel.add(bottomLeftLabel);
		
		JLabel bottomRightLabel = new JLabel("Bottom Right");
		bottomRightLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		bottomRightLabel.setBounds(286, 163, 77, 19);
		selectionPanel.add(bottomRightLabel);
		
		JComboBox<TopWord> TWcomboBox = new JComboBox<TopWord>();
		TWcomboBox.setModel(new DefaultComboBoxModel<TopWord>(TopWord.values()));
		TWcomboBox.setBounds(150, 28, 135, 18);
		selectionPanel.add(TWcomboBox);
		
		JComboBox<MiddleWord> TLcomboBox = new JComboBox<MiddleWord>();
		TLcomboBox.setModel(new DefaultComboBoxModel<MiddleWord>(MiddleWord.values()));
		TLcomboBox.setBounds(49, 85, 135, 18);
		selectionPanel.add(TLcomboBox);
		
		JComboBox<MiddleWord> MLcomboBox = new JComboBox<MiddleWord>();
		MLcomboBox.setModel(new DefaultComboBoxModel<MiddleWord>(MiddleWord.values()));
		MLcomboBox.setBounds(49, 133, 135, 18);
		selectionPanel.add(MLcomboBox);
		
		JComboBox<MiddleWord> BLcomboBox = new JComboBox<MiddleWord>();
		BLcomboBox.setModel(new DefaultComboBoxModel<MiddleWord>(MiddleWord.values()));
		BLcomboBox.setBounds(49, 181, 135, 18);
		selectionPanel.add(BLcomboBox);
		
		JComboBox<MiddleWord> TRcomboBox = new JComboBox<MiddleWord>();
		TRcomboBox.setModel(new DefaultComboBoxModel<MiddleWord>(MiddleWord.values()));
		TRcomboBox.setBounds(254, 84, 135, 18);
		selectionPanel.add(TRcomboBox);
		
		JComboBox<MiddleWord> MRcomboBox = new JComboBox<MiddleWord>();
		MRcomboBox.setModel(new DefaultComboBoxModel<MiddleWord>(MiddleWord.values()));
		MRcomboBox.setBounds(254, 132, 135, 18);
		selectionPanel.add(MRcomboBox);
		
		JComboBox<MiddleWord> BRcomboBox = new JComboBox<MiddleWord>();
		BRcomboBox.setModel(new DefaultComboBoxModel<MiddleWord>(MiddleWord.values()));
		BRcomboBox.setBounds(254, 180, 135, 18);
		selectionPanel.add(BRcomboBox);
		
		JButton validateButton = new JButton("Validate");
		validateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WhosOnFirst whos = new WhosOnFirst((TopWord) TWcomboBox.getSelectedItem(), (MiddleWord) TLcomboBox.getSelectedItem(), (MiddleWord) MLcomboBox.getSelectedItem(), (MiddleWord) BLcomboBox.getSelectedItem(), (MiddleWord) TRcomboBox.getSelectedItem(), (MiddleWord) MRcomboBox.getSelectedItem(), (MiddleWord) BRcomboBox.getSelectedItem());
				displayTextField.setText(whos.solveModule());
			}
		});
		validateButton.setBounds(177, 209, 82, 21);
		selectionPanel.add(validateButton);
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBounds(0, 243, 436, 38);
		middlePanel.add(displayPanel);
		displayPanel.setLayout(null);
		
		displayTextField = new JTextField();
		displayTextField.setBounds(118, 10, 200, 19);
		displayTextField.setPreferredSize(new Dimension(100, 19));
		displayPanel.add(displayTextField);
		displayTextField.setColumns(10);
	}
}

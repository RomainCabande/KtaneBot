package ComplicatedWires;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

import Wires.WiresGUI;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import GUIModulesFeatures.BombInfo;

public class ComplicatedWiresGUI {

	public JFrame frmComplicatedwires;
	private static BombInfo bombeInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComplicatedWiresGUI window = new ComplicatedWiresGUI(bombeInfo);
					window.frmComplicatedwires.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComplicatedWiresGUI(BombInfo bombeInfo) {
		this.bombeInfo = bombeInfo;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmComplicatedwires = new JFrame();
		frmComplicatedwires.setTitle("ComplicatedWires");
		frmComplicatedwires.setBounds(100, 100, 450, 300);
		frmComplicatedwires.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmComplicatedwires.getContentPane().setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel NorthPanel = new JPanel();
		frmComplicatedwires.getContentPane().add(NorthPanel);
		NorthPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel ConfirmPanel = new JPanel();
		NorthPanel.add(ConfirmPanel, BorderLayout.SOUTH);
		
		JButton ConfirmBtn = new JButton("confirm");
		
		ConfirmPanel.add(ConfirmBtn);
		
		JPanel rightNothingPanel = new JPanel();
		NorthPanel.add(rightNothingPanel, BorderLayout.WEST);
		
		JPanel leftNothingPanel = new JPanel();
		NorthPanel.add(leftNothingPanel, BorderLayout.EAST);
		
		JPanel choiceBtnPanel = new JPanel();
		NorthPanel.add(choiceBtnPanel, BorderLayout.CENTER);
		choiceBtnPanel.setLayout(new GridLayout(2, 3, 0, 0));
		
		JToggleButton RedBtn = new JToggleButton("");
		choiceBtnPanel.add(RedBtn);
		RedBtn.setIcon(new ImageIcon(ComplicatedWiresGUI.class.getResource("/Icons/WiresRedSquare40x40.png")));

		
		JToggleButton StarBtn = new JToggleButton("★");
		StarBtn.setFont(new Font("Serif", Font.PLAIN, 45));
		choiceBtnPanel.add(StarBtn);
		
		JToggleButton RedBlueBtn = new JToggleButton("");
		
		choiceBtnPanel.add(RedBlueBtn);
		RedBlueBtn.setIcon(new ImageIcon(ComplicatedWiresGUI.class.getResource("/Icons/RedAndBlueStripes.png")));

		
		JToggleButton BlueBtn = new JToggleButton("");
		choiceBtnPanel.add(BlueBtn);
		BlueBtn.setIcon(new ImageIcon(ComplicatedWiresGUI.class.getResource("/Icons/WiresBlueSquare40x40.png")));

		
		JToggleButton LedBtn = new JToggleButton("");
		choiceBtnPanel.add(LedBtn);
		LedBtn.setIcon(new ImageIcon(ComplicatedWiresGUI.class.getResource("/Icons/LedImage.png")));

		
		JToggleButton WhiteBtn = new JToggleButton("");
		WhiteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(WhiteBtn.isSelected()) {
					RedBlueBtn.setEnabled(false);
					RedBtn.setEnabled(false);
					BlueBtn.setEnabled(false);
				}else {
					RedBlueBtn.setEnabled(true);
					RedBtn.setEnabled(true);
					BlueBtn.setEnabled(true);
					WhiteBtn.setEnabled(true);
				}
			}
		});
		choiceBtnPanel.add(WhiteBtn);
		WhiteBtn.setIcon(new ImageIcon(ComplicatedWiresGUI.class.getResource("/Icons/WiresWhiteSquare40x40.png")));

		
		JPanel SouthPanel = new JPanel();
		frmComplicatedwires.getContentPane().add(SouthPanel);
		SouthPanel.setLayout(new BorderLayout(0, 0));
		SouthPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel cancelPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) cancelPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		SouthPanel.add(cancelPanel, BorderLayout.SOUTH);
		
		JButton cancelBtn = new JButton("cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmComplicatedwires.dispose();
			}
		});
		cancelPanel.add(cancelBtn);
		
		RedBlueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(RedBlueBtn.isSelected()) {
					WhiteBtn.setEnabled(false);
					RedBtn.setEnabled(false);
					BlueBtn.setEnabled(false);
				}else {
					RedBlueBtn.setEnabled(true);
					RedBtn.setEnabled(true);
					BlueBtn.setEnabled(true);
					WhiteBtn.setEnabled(true);
				}
			}
		});
		
		RedBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(RedBtn.isSelected()) {
					WhiteBtn.setEnabled(false);
					RedBlueBtn.setEnabled(false);
					BlueBtn.setEnabled(false);
				}else {
					RedBlueBtn.setEnabled(true);
					RedBtn.setEnabled(true);
					BlueBtn.setEnabled(true);
					WhiteBtn.setEnabled(true);
				}
			}
		});
		
		BlueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BlueBtn.isSelected()) {
					WhiteBtn.setEnabled(false);
					RedBtn.setEnabled(false);
					RedBlueBtn.setEnabled(false);
				}else {
					RedBlueBtn.setEnabled(true);
					RedBtn.setEnabled(true);
					BlueBtn.setEnabled(true);
					WhiteBtn.setEnabled(true);
				}
			}
		});
		
		JPanel PrintPanel = new JPanel();
		SouthPanel.add(PrintPanel, BorderLayout.CENTER);
		PrintPanel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel topPrintPanel = new JPanel();
		PrintPanel.add(topPrintPanel);
		topPrintPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel wireLabel = new JLabel("");
		wireLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		topPrintPanel.add(wireLabel);
		
		JPanel BotomPrintPanel = new JPanel();
		PrintPanel.add(BotomPrintPanel);
		BotomPrintPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel printLabel = new JLabel("");
		printLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		BotomPrintPanel.add(printLabel);
		
		ConfirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Colors color = null;
				Boolean led = false;
				Boolean star = false;
				if(RedBtn.isSelected()) {
					color = Colors.RED;
				}
				if(BlueBtn.isSelected()) {
					color = Colors.BLUE;
				}
				if(RedBlueBtn.isSelected()) {
					color = Colors.RED_BLUE;
				}
				if(WhiteBtn.isSelected()) {
					color = Colors.WHITE;
				}
				if(LedBtn.isSelected()) {
					led = true;
				}
				if(StarBtn.isSelected()) {
					star = true;
				}
				if(color == null) {
					printLabel.setText("Select color");
					wireLabel.setText("");
				}
				ComplicatedWires cw = new ComplicatedWires(bombeInfo);
				cw.setInfos(color, led, star);
				String retLed = " ";
				String retStar = " ";
				if(led)retLed = " Led";
				if(star)retStar = "Star";
				if(color != null && cw.chekAll() == true) {
					printLabel.setText("Cut");
					wireLabel.setText("Wire : " + color + retLed + retStar);

					
				}else if(color != null && cw.chekAll() == false) {
					printLabel.setText("Don't Cut");
					wireLabel.setText("Wire : " + color + retLed + retStar);
				}
				BlueBtn.setSelected(false);
				RedBlueBtn.setSelected(false);
				WhiteBtn.setSelected(false);
				StarBtn.setSelected(false);
				LedBtn.setSelected(false);
				RedBtn.setSelected(false);
				RedBlueBtn.setEnabled(true);
				RedBtn.setEnabled(true);
				BlueBtn.setEnabled(true);
				WhiteBtn.setEnabled(true);
			}
		});
		
	}
	
}

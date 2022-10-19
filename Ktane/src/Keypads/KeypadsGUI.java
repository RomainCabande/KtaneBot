package Keypads;

import java.awt.EventQueue;
import Keypads.MainKeypads;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class KeypadsGUI {

	private HashSet<enumSignes> signes;
	private JFrame frmKeypads;
	private static final int fontSigneTaille = 18;
	private ArrayList<JToggleButton> tglb;
	private static final ArrayList<enumSignes> signesList = new ArrayList<enumSignes>(Arrays.asList(enumSignes.values()));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeypadsGUI window = new KeypadsGUI();
					window.frmKeypads.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KeypadsGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	    tglb = new ArrayList<JToggleButton>();
	    signes = new HashSet<enumSignes>();

	    
		frmKeypads = new JFrame();
		frmKeypads.setTitle("Keypads");
		frmKeypads.setBounds(100, 100, 542, 348);
		frmKeypads.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKeypads.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 508, 189);
		frmKeypads.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 9, 0, 0));
		
		JLabel answerLabel = new JLabel("");
		answerLabel.setBounds(20, 209, 402, 21);
		frmKeypads.getContentPane().add(answerLabel);
		
		JButton confirmbt = new JButton("confirm");
		confirmbt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<enumSignes> arraySignes= new ArrayList<>(signes);
				MainKeypads ret = new MainKeypads(arraySignes);
				answerLabel.setText(ret.KeySequence());
			}
		});
		confirmbt.setBounds(433, 209, 85, 21);
		frmKeypads.getContentPane().add(confirmbt);
		confirmbt.setEnabled(false);
		
		for(int i = 0; i<27; i++) {
			JToggleButton newtglb = new JToggleButton(signesList.get(i).toString());
			if(i == 9 || i == 22) {
				newtglb.setFont(new Font("Tahomas", Font.PLAIN, fontSigneTaille));
	
			}else {
				newtglb.setFont(new Font("Tahoma", Font.PLAIN, fontSigneTaille));	
			}
			
			panel.add(newtglb);
			tglb.add(newtglb);
			}
		for(int i = 0; i<27; i++) {
			tglb.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for(int j = 0; j<27; j++) {
						if(tglb.get(j).isSelected()) {
							signes.add(signesList.get(j));				
						}else {
							signes.remove(signesList.get(j));
						}
						if(signes.size() == 4) {
							confirmbt.setEnabled(true);
						}else {
							confirmbt.setEnabled(false);
						}
					}
					
				}					
			});
		}

		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmKeypads.dispose();
			}
		});
		btnCancel.setBounds(433, 280, 85, 21);
		frmKeypads.getContentPane().add(btnCancel);

	}
}

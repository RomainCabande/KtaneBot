package MorseCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.List;
import javax.swing.JMenu;
import javax.swing.JList;
import java.awt.Insets;

public class MorseCodeGui {

	public JFrame frmMorsecode;
	private JTextField morseTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MorseCodeGui window = new MorseCodeGui();
					window.frmMorsecode.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MorseCodeGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 *Press "." for dot and "-" for dash |  press ENTER after every character.
	 */
	private void initialize() {
		MorseCode morsecode = new MorseCode();
		frmMorsecode = new JFrame();
		frmMorsecode.setTitle("MorseCode");
		frmMorsecode.setBounds(100, 100, 450, 300);
		frmMorsecode.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmMorsecode.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton cancelBtn = new JButton("cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMorsecode.dispose();
			}
		});
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 70));
		frmMorsecode.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JLabel instructionLabel = new JLabel("Press '.' for dot and '/' for dash | press ENTER after every character.");
		instructionLabel.setPreferredSize(new Dimension(390, 13));
		instructionLabel.setMaximumSize(new Dimension(500, 13));
		panel_3.add(instructionLabel);
		instructionLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(10, 1000));
		panel_1.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		morseTextField = new JTextField();
		panel_2.add(morseTextField);
		morseTextField.setColumns(10);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(10, 100));
		frmMorsecode.getContentPane().add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JList<String> list = new JList<String>();
		panel_4.add(list);
		
		
		
		morseTextField.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent ae){
				  DefaultListModel<String> listAnswers = new DefaultListModel<String>();
				  listAnswers.removeAllElements();
			      String textFieldValue = morseTextField.getText();
			      morseTextField.setText("");
			      MorseTranslator translate = new MorseTranslator();
			      morsecode.addLetter(translate.translateToChar(textFieldValue));
			      ArrayList<String> toPrint = morsecode.testIn();
			      for(int i = 0; i<toPrint.size(); i++) {
			    	  listAnswers.addElement(toPrint.get(i));
			      }
			      list.setModel(listAnswers);
			   }
			});
		
		JButton btnRemoveAll = new JButton("Remove All");
		btnRemoveAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				morsecode.removeAllChar();
				ArrayList<String> toPrint = morsecode.testIn();
				DefaultListModel<String> listAnswers = new DefaultListModel<String>();
				for(int i = 0; i<toPrint.size(); i++) {
					listAnswers.addElement(toPrint.get(i));
			    }
			    list.setModel(listAnswers);
			}
		});
		panel.add(btnRemoveAll);
		panel.add(cancelBtn);

		JButton btnRemove = new JButton("remove last");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				morsecode.removeLastElement();
			    ArrayList<String> toPrint = morsecode.testIn();
				DefaultListModel<String> listAnswers = new DefaultListModel<String>();
				for(int i = 0; i<toPrint.size(); i++) {
					listAnswers.addElement(toPrint.get(i));
			    }
			    list.setModel(listAnswers);
			}
		});
		panel_2.add(btnRemove);
			
		
	}
}

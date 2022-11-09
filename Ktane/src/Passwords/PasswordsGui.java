package Passwords;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import MorseCode.MorseTranslator;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.ComponentOrientation;

public class PasswordsGui {

	private JFrame frame;
	private JTextField firstTextField;
	private JTextField thrdTextField;
	private JTextField ffthTextField;
    Passwords password = new Passwords();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordsGui window = new PasswordsGui();
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
	public PasswordsGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ArrayList<JTextField> textFieldList = new ArrayList<JTextField>(Arrays.asList(firstTextField, thrdTextField, ffthTextField));
		
		JPanel answerPanel = new JPanel();
		frame.getContentPane().add(answerPanel, BorderLayout.CENTER);
		answerPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBottom = new JPanel();
		answerPanel.add(panelBottom, BorderLayout.SOUTH);
		panelBottom.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton cancelBtn = new JButton("cancel");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		
		JPanel panelCenterList = new JPanel();
		answerPanel.add(panelCenterList, BorderLayout.CENTER);
		
		JList<String> answerList = new JList<String>();
		cancelBtn.setHorizontalAlignment(SwingConstants.CENTER);
		cancelBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		panelCenterList.add(answerList, BorderLayout.CENTER);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setPreferredSize(new Dimension(10, 100));
		frame.getContentPane().add(inputPanel, BorderLayout.NORTH);
		inputPanel.setLayout(new GridLayout(2, 3, 0, 0));
		
		JPanel firstLabelPanel = new JPanel();
		inputPanel.add(firstLabelPanel);
		firstLabelPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel firstLabel = new JLabel("1st Character");
		firstLabel.setHorizontalAlignment(SwingConstants.CENTER);
		firstLabel.setPreferredSize(new Dimension(75, 13));
		firstLabel.setMinimumSize(new Dimension(70, 13));
		firstLabel.setMaximumSize(new Dimension(70, 13));
		firstLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		firstLabelPanel.add(firstLabel);
		
		JPanel thrdLabelPanel = new JPanel();
		inputPanel.add(thrdLabelPanel);
		thrdLabelPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel thrdLabel = new JLabel("3rd Character");
		thrdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		thrdLabel.setPreferredSize(new Dimension(75, 13));
		thrdLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		thrdLabelPanel.add(thrdLabel);
		
		JPanel ffthLabelPanel = new JPanel();
		inputPanel.add(ffthLabelPanel);
		ffthLabelPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel ffthLabel = new JLabel("5th Character");
		ffthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ffthLabel.setPreferredSize(new Dimension(75, 13));
		ffthLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ffthLabelPanel.add(ffthLabel);
		
		JPanel firstTextFieldPanel = new JPanel();
		inputPanel.add(firstTextFieldPanel);
		
		textFieldList.add(firstTextField);
		textFieldList.add(thrdTextField);
		textFieldList.add(ffthTextField);
		
		
		
		firstTextField = new JTextField();
		firstTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> listAnswers = actionTextField(firstTextField.getText(), 0);
				DefaultListModel<String> clear = new DefaultListModel<String>();
				answerList.setModel(clear);
				answerList.removeAll();
				answerList.setModel(listAnswers);
			}
		});
		firstTextFieldPanel.add(firstTextField);
		firstTextField.setColumns(10);
		
		JPanel thrdTextFieldPanel = new JPanel();
		inputPanel.add(thrdTextFieldPanel);
		
		thrdTextField = new JTextField();
		thrdTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  DefaultListModel<String> listAnswers = actionTextField(thrdTextField.getText(), 1);
			      answerList.setModel(listAnswers);
			}
		});
		thrdTextFieldPanel.add(thrdTextField);
		thrdTextField.setColumns(10);
		
		JPanel ffthTextFieldPanel = new JPanel();
		inputPanel.add(ffthTextFieldPanel);
		
		ffthTextField = new JTextField();
		ffthTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  DefaultListModel<String> listAnswers = actionTextField(ffthTextField.getText(), 2);
			      answerList.setModel(listAnswers);
			}
		});
		ffthTextFieldPanel.add(ffthTextField);
		ffthTextField.setColumns(10);
		
		JButton rmvBtn = new JButton("remove All");
		rmvBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> voidModel = new DefaultListModel<String>();
				answerList.setModel(voidModel);
				password.refillList();
				firstTextField.setText("");
				thrdTextField.setText("");
				ffthTextField.setText("");
			}
		});
		panelBottom.add(rmvBtn);
		panelBottom.add(cancelBtn);
		
		
	}
	public DefaultListModel<String> actionTextField(String text, int place) {
		 DefaultListModel<String> listAnswers = new DefaultListModel<String>();
		 listAnswers.removeAllElements();
	     String textFieldValue = text;
	     password.addLetter(textFieldValue, place);
	     ArrayList<ArrayList<String>> listWords = password.wordSearch();
	     ArrayList<String> toPrint = new ArrayList<String>();
	     for(int i = 0; i < listWords.size(); i++) {
	    	 toPrint.add(password.charToString(listWords.get(i)));
	     } 
	     for(int i = 0; i<toPrint.size(); i++) {
	    	 listAnswers.addElement(toPrint.get(i));
	     }
	     return listAnswers;
	}

}

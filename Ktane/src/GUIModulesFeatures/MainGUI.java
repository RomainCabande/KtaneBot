package GUIModulesFeatures;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;

import Button.ButtonGUI;
import SimonSays.SimonSaysGUI;
import Wires.MainFils;
import Wires.WiresGUI;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainGUI {

	private JFrame frame;
	private Panel panel_1;
	private Panel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel serialNumberLabel;
	private JTextField serialNumberTextField;
	private JLabel indicatorsLabel;
	private JLabel LitIndicatorsLabel;
	private JLabel UnlitIndicatorsLabel;
	private JPanel panel_5;
	private JLabel batteriesLabel;
	private JLabel AABatteriesLabel;
	private JLabel DBatteriesLabel;
	private JSpinner AABatteriesSpinner;
	private JSpinner DBatteriesSpinner;
	private JSpinner LitIndicatorsSpinner;
	private JSpinner UnlitIndicatorsSpinner;
	private JPanel panel_6;
	private JLabel lblNewLabel;
	private JTextField searchBar;
	private JButton searchBarButton;
	private JPanel panel_7;
	private JButton bombInfoValidateButton;
	private JScrollPane scrollPane;
	public BombInfo bombInfo;
	private JLabel bombInfoStateTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
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
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//added manually
		ModuleList modules = new ModuleList();
		//add modules.searchModule(searchBar.getText()) below inside parenthesis
		JList<String> list = new JList<String>();
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		panel_1 = new Panel();
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_6 = new JPanel();
		panel_6.setBorder(null);
		panel_1.add(panel_6, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("Search Module : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblNewLabel);
		
		searchBar = new JTextField();
		searchBar.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String[] strings = (modules.searchModule(searchBar.getText()));
				DefaultListModel<String> dlm = new DefaultListModel<String>();
				dlm.removeAllElements();
				for(int i = 0; i < strings.length; i++) {
					dlm.addElement(strings[i]);
				}
				list.setModel(dlm);
			}
		});
		
		searchBar.setHorizontalAlignment(SwingConstants.LEFT);
		searchBar.setFont(new Font("Tahoma", Font.BOLD, 12));
		searchBar.setColumns(15);
		searchBar.setBorder(UIManager.getBorder("ComboBox.border"));
		searchBar.setAlignmentY(1.0f);
		searchBar.setAlignmentX(1.0f);
		panel_6.add(searchBar);
		
		searchBarButton = new JButton("");
		searchBarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] strings = (modules.searchModule(searchBar.getText()));
				DefaultListModel<String> dlm = new DefaultListModel<String>();
				dlm.removeAllElements();
				for(int i = 0; i < strings.length; i++) {
					dlm.addElement(strings[i]);
				}
				list.setModel(dlm);
			}
		});
		
		
		searchBarButton.setIcon(new ImageIcon(MainGUI.class.getResource("/Icons/Search15x15.png")));
		searchBarButton.setMaximumSize(new Dimension(20, 21));
		searchBarButton.setMargin(new Insets(1, 1, 1, 1));
		panel_6.add(searchBarButton);
		
		panel_2 = new Panel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 1, 0, 0));
		
		panel_4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_4.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_2.add(panel_4);
		
		serialNumberLabel = new JLabel("Serial number         ");
		serialNumberLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		serialNumberLabel.setHorizontalAlignment(SwingConstants.LEFT);
		serialNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(serialNumberLabel);
		
		serialNumberTextField = new JTextField();
		serialNumberTextField.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		serialNumberTextField.setHorizontalAlignment(SwingConstants.TRAILING);
		serialNumberTextField.setColumns(10);
		panel_4.add(serialNumberTextField);
		
		panel_5 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_5.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_2.add(panel_5);
		
		batteriesLabel = new JLabel("Batteries           ");
		batteriesLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		batteriesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		batteriesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(batteriesLabel);
		
		AABatteriesLabel = new JLabel("AA ");
		AABatteriesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		AABatteriesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(AABatteriesLabel);
		
		AABatteriesSpinner = new JSpinner();
		AABatteriesSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		AABatteriesSpinner.setPreferredSize(new Dimension(40, 20));
		AABatteriesSpinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_5.add(AABatteriesSpinner);
		
		DBatteriesLabel = new JLabel("      D  ");
		DBatteriesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		DBatteriesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_5.add(DBatteriesLabel);
		
		DBatteriesSpinner = new JSpinner();
		DBatteriesSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		DBatteriesSpinner.setPreferredSize(new Dimension(40, 20));
		DBatteriesSpinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_5.add(DBatteriesSpinner);
		
		panel_3 = new JPanel();
		panel_2.add(panel_3);
		FlowLayout fl_panel_3 = new FlowLayout(FlowLayout.LEFT, 5, 5);
		fl_panel_3.setAlignOnBaseline(true);
		panel_3.setLayout(fl_panel_3);
		
		indicatorsLabel = new JLabel("Indicators         ");
		indicatorsLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		indicatorsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		indicatorsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(indicatorsLabel);
		
		LitIndicatorsLabel = new JLabel("Lit ");
		LitIndicatorsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(LitIndicatorsLabel);
		
		LitIndicatorsSpinner = new JSpinner();
		LitIndicatorsSpinner.setPreferredSize(new Dimension(40, 20));
		LitIndicatorsSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		LitIndicatorsSpinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(LitIndicatorsSpinner);
		
		UnlitIndicatorsLabel = new JLabel("  Unlit");
		UnlitIndicatorsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(UnlitIndicatorsLabel);
		
		UnlitIndicatorsSpinner = new JSpinner();
		UnlitIndicatorsSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		UnlitIndicatorsSpinner.setPreferredSize(new Dimension(40, 20));
		UnlitIndicatorsSpinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(UnlitIndicatorsSpinner);
		
		panel_7 = new JPanel();
		panel_2.add(panel_7);
		
		bombInfoValidateButton = new JButton("Valider");
		bombInfoValidateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bombInfo = new BombInfo(serialNumberTextField.getText(), (Integer) AABatteriesSpinner.getValue(), (Integer) DBatteriesSpinner.getValue(), 
										(Integer) LitIndicatorsSpinner.getValue(), (Integer) UnlitIndicatorsSpinner.getValue());
				bombInfoStateTextField.setIcon(new ImageIcon(MainGUI.class.getResource("/Icons/BombInfoGreen10x10.png")));
			}
		});
		bombInfoValidateButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_7.add(bombInfoValidateButton);
		
		bombInfoStateTextField = new JLabel("");
		bombInfoStateTextField.setIcon(new ImageIcon(MainGUI.class.getResource("/Icons/BombInfoRed10x10.png")));
		panel_7.add(bombInfoStateTextField);
		
		scrollPane = new JScrollPane(list);
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				switch (list.getSelectedValue()) {
					case "Wires":
						WiresGUI window = new WiresGUI(bombInfo);
						window.frame.setVisible(true);
						break;
					case "Button":
						ButtonGUI window2 = new ButtonGUI(bombInfo);
						window2.frame.setVisible(true);
						break;
					case "Simon Says":
						SimonSaysGUI window3 = new SimonSaysGUI(bombInfo);
						window3.frame.setVisible(true);
						break;
				}
			}
		});
		
	}
}
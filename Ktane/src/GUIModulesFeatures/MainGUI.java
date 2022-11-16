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
import javax.swing.JOptionPane;
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
import Keypads.Keypads;
import Keypads.KeypadsGUI;
import MorseCode.MorseCodeGui;
import Passwords.PasswordsGui;
import SimonSays.SimonSaysGUI;
import WhosOnFirst.WhosOnFirst;
import WhosOnFirst.WhosOnFirstGUI;
import Wires.MainFils;
import Wires.WiresGUI;

import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.Rectangle;

public class MainGUI {

	private JFrame frame;
	private Panel searchPanel;
	private Panel bombInfoPanel;
	private JPanel indicatorsPanel;
	private JPanel serialNumberPanel;
	private JLabel serialNumberLabel;
	private JTextField serialNumberTextField;
	private JLabel indicatorsLabel;
	private JLabel LitIndicatorsLabel;
	private JLabel UnlitIndicatorsLabel;
	private JPanel batteriesPanel;
	private JLabel batteriesLabel;
	private JLabel AABatteriesLabel;
	private JLabel DBatteriesLabel;
	private JSpinner AABatteriesSpinner;
	private JSpinner DBatteriesSpinner;
	private JSpinner LitIndicatorsSpinner;
	private JSpinner UnlitIndicatorsSpinner;
	private JPanel searchBarAreaPanel;
	private JPanel validatePanel;
	private JButton bombInfoValidateButton;
	private JScrollPane modulesListScrollPane;
	public BombInfo bombInfo;
	private JLabel bombInfoStateTextField;
	private JPanel parallelPortPanel;
	private JLabel parrallelPortLabel;
	private JSpinner parallelPortSpinner;
	private JPanel mainLabelPanel;
	private JLabel mainTitleLabel;
	private JPanel searchBarPanel;
	private JTextField searchBarTextField;
	private JButton searchBarButton;
	private JPanel emptyPanel;
	private JPanel panel;
	private JLabel searchBarLabel;

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
		Border border = new LineBorder(Color.BLACK, 1);
		//add modules.searchModule(searchBarTextField.getText()) below inside parenthesis
		JList<String> list = new JList<String>();
		
		JPanel head = new JPanel();
		head.setBorder(new LineBorder(new Color(192, 192, 192)));
		frame.getContentPane().add(head, BorderLayout.NORTH);
		head.setLayout(new BoxLayout(head, BoxLayout.X_AXIS));
		
		searchPanel = new Panel();
		head.add(searchPanel);
		searchPanel.setLayout(new BorderLayout(0, 0));
		
		searchBarAreaPanel = new JPanel();
		searchBarAreaPanel.setBorder(null);
		searchPanel.add(searchBarAreaPanel, BorderLayout.CENTER);
		searchBarAreaPanel.setLayout(new GridLayout(2, 1, 0, 0));
		
		emptyPanel = new JPanel();
		searchBarAreaPanel.add(emptyPanel);
		emptyPanel.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		emptyPanel.add(panel, BorderLayout.SOUTH);
		
		searchBarLabel = new JLabel("Search By Name");
		searchBarLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(searchBarLabel);
		
		searchBarPanel = new JPanel();
		searchBarAreaPanel.add(searchBarPanel);
		
		searchBarTextField = new JTextField();
		searchBarTextField.setMinimumSize(new Dimension(70, 19));
		searchBarTextField.setPreferredSize(new Dimension(70, 23));
		searchBarTextField.setHorizontalAlignment(SwingConstants.LEFT);
		searchBarTextField.setFont(new Font("Tahoma", Font.BOLD, 12));
		searchBarTextField.setColumns(15);
		searchBarTextField.setAlignmentY(1.0f);
		searchBarTextField.setAlignmentX(1.0f);
		searchBarPanel.add(searchBarTextField);
		searchBarTextField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String[] strings = (modules.searchModule(searchBarTextField.getText()));
				DefaultListModel<String> dlm = new DefaultListModel<String>();
				dlm.removeAllElements();
				for(int i = 0; i < strings.length; i++) {
					dlm.addElement(strings[i]);
				}
				list.setModel(dlm);
			}
		});
		
		searchBarButton = new JButton("");
		searchBarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] strings = (modules.searchModule(searchBarTextField.getText()));
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
		searchBarButton.setMargin(new Insets(0, 0, 0, 0));
		searchBarPanel.add(searchBarButton);
		
		mainLabelPanel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) mainLabelPanel.getLayout();
		flowLayout_1.setVgap(20);
		searchPanel.add(mainLabelPanel, BorderLayout.NORTH);
		
		mainTitleLabel = new JLabel("KTANE BOT");
		mainTitleLabel.setBorder(null);
		mainTitleLabel.setFont(new Font("OCR A Extended", Font.BOLD, 20));
		mainLabelPanel.add(mainTitleLabel);
		mainTitleLabel.setBorder(border);
		
		bombInfoPanel = new Panel();
		head.add(bombInfoPanel);
		bombInfoPanel.setLayout(new GridLayout(5, 1, 0, 0));
		
		serialNumberPanel = new JPanel();
		FlowLayout fl_serialNumberPanel = (FlowLayout) serialNumberPanel.getLayout();
		fl_serialNumberPanel.setAlignment(FlowLayout.LEFT);
		bombInfoPanel.add(serialNumberPanel);
		
		serialNumberLabel = new JLabel("Serial number  ");
		serialNumberLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		serialNumberLabel.setHorizontalAlignment(SwingConstants.LEFT);
		serialNumberLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		serialNumberPanel.add(serialNumberLabel);
		
		serialNumberTextField = new JTextField();
		serialNumberTextField.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		serialNumberTextField.setHorizontalAlignment(SwingConstants.TRAILING);
		serialNumberTextField.setColumns(10);
		serialNumberPanel.add(serialNumberTextField);
		
		batteriesPanel = new JPanel();
		FlowLayout fl_batteriesPanel = (FlowLayout) batteriesPanel.getLayout();
		fl_batteriesPanel.setAlignment(FlowLayout.LEFT);
		bombInfoPanel.add(batteriesPanel);
		
		batteriesLabel = new JLabel("Batteries           ");
		batteriesLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		batteriesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		batteriesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		batteriesPanel.add(batteriesLabel);
		
		AABatteriesLabel = new JLabel("AA ");
		AABatteriesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		AABatteriesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		batteriesPanel.add(AABatteriesLabel);
		
		AABatteriesSpinner = new JSpinner();
		AABatteriesSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		AABatteriesSpinner.setPreferredSize(new Dimension(40, 20));
		AABatteriesSpinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		batteriesPanel.add(AABatteriesSpinner);
		
		DBatteriesLabel = new JLabel("      D  ");
		DBatteriesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		DBatteriesLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		batteriesPanel.add(DBatteriesLabel);
		
		DBatteriesSpinner = new JSpinner();
		DBatteriesSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		DBatteriesSpinner.setPreferredSize(new Dimension(40, 20));
		DBatteriesSpinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		batteriesPanel.add(DBatteriesSpinner);
		
		indicatorsPanel = new JPanel();
		bombInfoPanel.add(indicatorsPanel);
		FlowLayout fl_indicatorsPanel = new FlowLayout(FlowLayout.LEFT, 5, 5);
		fl_indicatorsPanel.setAlignOnBaseline(true);
		indicatorsPanel.setLayout(fl_indicatorsPanel);
		
		indicatorsLabel = new JLabel("Indicators         ");
		indicatorsLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		indicatorsLabel.setHorizontalAlignment(SwingConstants.LEFT);
		indicatorsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		indicatorsPanel.add(indicatorsLabel);
		
		LitIndicatorsLabel = new JLabel("Lit ");
		LitIndicatorsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		indicatorsPanel.add(LitIndicatorsLabel);
		
		LitIndicatorsSpinner = new JSpinner();
		LitIndicatorsSpinner.setPreferredSize(new Dimension(40, 20));
		LitIndicatorsSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		LitIndicatorsSpinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		indicatorsPanel.add(LitIndicatorsSpinner);
		
		UnlitIndicatorsLabel = new JLabel("  Unlit");
		UnlitIndicatorsLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		indicatorsPanel.add(UnlitIndicatorsLabel);
		
		UnlitIndicatorsSpinner = new JSpinner();
		UnlitIndicatorsSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		UnlitIndicatorsSpinner.setPreferredSize(new Dimension(40, 20));
		UnlitIndicatorsSpinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		indicatorsPanel.add(UnlitIndicatorsSpinner);
		
		parallelPortPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) parallelPortPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(6);
		bombInfoPanel.add(parallelPortPanel);
		
		parrallelPortLabel = new JLabel("Parallel Ports   ");
		parrallelPortLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		parallelPortPanel.add(parrallelPortLabel);
		
		parallelPortSpinner = new JSpinner();
		parallelPortSpinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		parallelPortSpinner.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		parallelPortPanel.add(parallelPortSpinner);
		
		validatePanel = new JPanel();
		bombInfoPanel.add(validatePanel);
		
		bombInfoValidateButton = new JButton("Valider");
		bombInfoValidateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bombInfo = new BombInfo(serialNumberTextField.getText(), (Integer) AABatteriesSpinner.getValue(), (Integer) DBatteriesSpinner.getValue(), 
										(Integer) LitIndicatorsSpinner.getValue(), (Integer) UnlitIndicatorsSpinner.getValue(), (Integer) parallelPortSpinner.getValue());
				bombInfoStateTextField.setIcon(new ImageIcon(MainGUI.class.getResource("/Icons/BombInfoGreen10x10.png")));
			}
		});
		bombInfoValidateButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		validatePanel.add(bombInfoValidateButton);
		
		bombInfoStateTextField = new JLabel("");
		bombInfoStateTextField.setIcon(new ImageIcon(MainGUI.class.getResource("/Icons/BombInfoRed10x10.png")));
		validatePanel.add(bombInfoStateTextField);
		
		modulesListScrollPane = new JScrollPane(list);
		frame.getContentPane().add(modulesListScrollPane, BorderLayout.CENTER);
		
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(bombInfo == null) {
					JOptionPane.showMessageDialog(frame, "Error: validate bomb information before proceeding");
				} else {
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
					case "Keypads":
						KeypadsGUI window4 = new KeypadsGUI();
						window4.frmKeypads.setVisible(true);
						break;
					case "Morse Code":
						MorseCodeGui window5 = new MorseCodeGui();
						window5.frmMorsecode.setVisible(true);
						break;
					case "Who's On First":
						WhosOnFirstGUI window6 = new WhosOnFirstGUI();
						window6.frame.setVisible(true);
						break;
					case "Passwords":
						PasswordsGui window7 = new PasswordsGui();
						window7.frmPasswords.setVisible(true);
						break;
					
					}
				}
			}
		});
		
	}
}
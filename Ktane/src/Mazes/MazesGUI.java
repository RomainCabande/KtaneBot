package Mazes;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

public class MazesGUI {

	private JFrame MainPanel;
	private ArrayList<JButton> btns = new ArrayList<JButton>();
	private ArrayList<Boolean> state;
	private Mazes maze;
	private int colStart;
	private int rowStart;
	private int colEnd;
	private int rowEnd;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MazesGUI frame = new MazesGUI();
					frame.MainPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MazesGUI() {
		initialize();
	}

	/**
	 * Create the frame.
	 */
	public void initialize() {
		state = new ArrayList<Boolean>(Arrays.asList(false, false, false));
		
		MainPanel = new JFrame();
		MainPanel.setTitle("Mazes");
		MainPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainPanel.setBounds(100, 100, 350, 450);
		MainPanel.getContentPane().setLayout(null);

		MainPanel.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel TopPanel = new JPanel();
		MainPanel.getContentPane().add(TopPanel, BorderLayout.NORTH);
		TopPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel labelPanel = new JPanel();
		TopPanel.add(labelPanel);
		
		JLabel instructionLabel = new JLabel("Select  the uppest circle");
		labelPanel.add(instructionLabel);
		
		JPanel BotomPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) BotomPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		MainPanel.getContentPane().add(BotomPanel, BorderLayout.SOUTH);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.dispatchEvent(new WindowEvent(MainPanel, WindowEvent.WINDOW_CLOSING));
			}
		});
		
		JButton restartButton = new JButton("restart");
		restartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MazesGUI frame = new MazesGUI();
							frame.MainPanel.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		BotomPanel.add(restartButton);
		BotomPanel.add(btnCancel);
		
		JPanel LeftNBRPanel = new JPanel();
		MainPanel.getContentPane().add(LeftNBRPanel, BorderLayout.WEST);
		LeftNBRPanel.setLayout(new GridLayout(7, 0, 0, 0));
		String textNothing = "";
		JLabel nbrLabelNothing = new JLabel(textNothing);
		LeftNBRPanel.add(nbrLabelNothing);

		for (int i = 1; i < 7; i++) {
			String text = "  " + i + "   ";
			JLabel nbrLabel = new JLabel(text);
			LeftNBRPanel.add(nbrLabel);
		}
		
		JPanel RightNothingPanel = new JPanel();
		MainPanel.getContentPane().add(RightNothingPanel, BorderLayout.EAST);
		
		JPanel ButtonPanel = new JPanel();
		MainPanel.getContentPane().add(ButtonPanel, BorderLayout.CENTER);
		ButtonPanel.setLayout(new GridLayout(7, 6, 0, 0));
		for (int i = 1; i < 7; i++) {
			String text = "  " + i + "   ";
			JLabel nbrLabel = new JLabel(text);
			nbrLabel.setHorizontalAlignment(JLabel.CENTER);
			ButtonPanel.add(nbrLabel);
		}
		for(int i = 1; i <= 36; i++) {
			JButton btn = new JButton();
			ButtonPanel.add(btn);
			btns.add(btn);
		}
		for(int i = 1; i <= 36; i++) {
			if (!(i == 7 || i == 11 || i == 22 || i == 1 || i == 17 || i == 5 || i == 2 || i == 4 || i == 9)) {
				btns.get(i - 1).setEnabled(false);
			}
		}
		
		for (int k = 1; k <= 36; k++) {
			int nbr = k;
			btns.get(k - 1).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (state.get(0) == false && state.get(1) == false && state.get(2) == false) {
						MazesStock mazeStock = new MazesStock();
						int col = nbr % 6;
						int row = ((int) (nbr - col) / 6) + 1;
						System.out.println(col + ";" + row);
						if (col == 1 && row == 2)maze = mazeStock.maze12();
						if (col == 5 && row == 2)maze = mazeStock.maze52();
						if (col == 4 && row == 4)maze = mazeStock.maze44();
						if (col == 1 && row == 1)maze = mazeStock.maze11();
						if (col == 5 && row == 3)maze = mazeStock.maze53();
						if (col == 5 && row == 1)maze = mazeStock.maze51();
						if (col == 2 && row == 1)maze = mazeStock.maze21();
						if (col == 4 && row == 1)maze = mazeStock.maze41();
						if (col == 3 && row == 2)maze = mazeStock.maze32();
						System.out.println(maze);
						state.set(0, true);
						for (int i = 0; i < 36; i++) {
							btns.get(i).setEnabled(true);
						}
						instructionLabel.setText("Press the starting position");
					}else if (state.get(0) == true && state.get(1) == false && state.get(2) == false)	{
						colStart = nbr % 6;
						rowStart = ((int) (nbr - colStart) / 6);
						colStart--;
						if(colStart == -1) {
							colStart = 5;
							rowStart -= 1;
						}
						instructionLabel.setText("Press the end position");
						state.set(1,  true);
						System.out.println(colStart + ";" + rowStart);
					}else if (state.get(0) == true && state.get(1) == true && state.get(2) == false)	{
						colEnd = nbr % 6;
						rowEnd = ((int) (nbr - colEnd) / 6);
						colEnd--;
						if(colEnd == -1) {
							colEnd = 5;
							rowEnd -= 1;
						}
						System.out.println(colEnd + ";" + rowEnd);

						instructionLabel.setText("Drawing...");
						state.set(2,  true);
						maze.setStart(rowStart, colStart);
						maze.setColEnd(colEnd);
						maze.setRowEnd(rowEnd);
						maze.solveSet();
						mazeDrawer drawer = new mazeDrawer(maze, 50);
						drawer.drawEverything();
						System.out.println(maze.getPath());
					}	
				}
			});
		}
	}
}

package Mazes;

import java.util.ArrayList;

public class MazesStock {

	public Mazes maze12() {
		Mazes maze12 = new Mazes(8);

		ArrayList<Block> row1 = new ArrayList<Block>();
		row1.add(new Block(true, false, false, true)); //1-1
		row1.add(new Block(true, false, true, false)); //1-2
		row1.add(new Block(true, true, false, false)); //1-3
		row1.add(new Block(true, false, false, true)); //1-4
		row1.add(new Block(true, false, true, false)); //1-5
		row1.add(new Block(true, true, true, false)); //1-6
		maze12.addRow(1 - 1, row1);
		
		ArrayList<Block> row2 = new ArrayList<Block>();
		row2.add(new Block(false, true, false, true)); //2-1
		row2.add(new Block(true, false, false, true)); //2-2
		row2.add(new Block(false, true, true, false)); //2-3
		row2.add(new Block(false, false, true, true)); //2-4
		row2.add(new Block(true, false, true, false)); //2-5
		row2.add(new Block(true, true, false, false)); //2-6
		maze12.addRow(2 - 1, row2);
		
		ArrayList<Block> row3 = new ArrayList<Block>();
		row3.add(new Block(false, true, false, true)); //3-1
		row3.add(new Block(false, false, true, true)); //3-2
		row3.add(new Block(true, true, false, false)); //3-3
		row3.add(new Block(true, false, false, true)); //3-4
		row3.add(new Block(true, false, true, false)); //3-5
		row3.add(new Block(false, true, false, false)); //3-6
		maze12.addRow(3 - 1, row3);
		
		ArrayList<Block> row4 = new ArrayList<Block>();
		row4.add(new Block(false, true, false, true)); //4-1
		row4.add(new Block(true, false, true, true)); //4-2
		row4.add(new Block(false, false, true, false)); //4-3
		row4.add(new Block(false, true, true, false)); //4-4
		row4.add(new Block(true, false, true, true)); //4-5
		row4.add(new Block(false, true, false, true)); //4-6
		maze12.addRow(4 - 1, row4);
		
		ArrayList<Block> row5 = new ArrayList<Block>();
		row5.add(new Block(false, false, false, true)); //5-1
		row5.add(new Block(true, false, true, false)); //5-2
		row5.add(new Block(true, true, false, false)); //5-3
		row5.add(new Block(true, false, false, true)); //5-4
		row5.add(new Block(true, true, true, false)); //5-5
		row5.add(new Block(false, true, false, true)); //5-6
		maze12.addRow(5 - 1, row5);
		
		ArrayList<Block> row6 = new ArrayList<Block>();
		row6.add(new Block(false, false, true, true)); //6-1
		row6.add(new Block(true, true, true, false)); //6-2
		row6.add(new Block(false, false, true, true)); //6-3
		row6.add(new Block(false, true, true, false)); //6-4
		row6.add(new Block(true, false, true, true)); //6-5
		row6.add(new Block(false, true, true, false)); //6-6
		maze12.addRow(6 - 1, row6);
		
		return maze12;
	}
}
package Mazes;

import java.util.ArrayList;

public class MazesStock {

	public Mazes maze12() {
		Mazes maze12 = new Mazes(6);

		ArrayList<Block> row1 = new ArrayList<Block>();
		row1.add(new Block(true, false, false, true)); //1-1
		row1.add(new Block(true, false, true, false)); //2-1
		row1.add(new Block(true, true, false, false)); //3-1
		row1.add(new Block(true, false, false, true)); //4-1
		row1.add(new Block(true, false, true, false)); //5-1
		row1.add(new Block(true, true, true, false)); //6-1
		maze12.addRow(1 - 1, row1);
	
		ArrayList<Block> row2 = new ArrayList<Block>();
		row2.add(new Block(false, true, false, true)); //1-2
		row2.add(new Block(true, false, false, true)); //2-2
		row2.add(new Block(false, true, true, false)); //3-2
		row2.add(new Block(false, false, true, true)); //4-2
		row2.add(new Block(true, false, true, false)); //5-2
		row2.add(new Block(true, true, false, false)); //6-2
		maze12.addRow(2 - 1, row2);
		
		ArrayList<Block> row3 = new ArrayList<Block>();
		row3.add(new Block(false, true, false, true)); //1-3
		row3.add(new Block(false, false, true, true)); //2-3
		row3.add(new Block(true, true, false, false)); //3-3
		row3.add(new Block(true, false, false, true)); //4-3
		row3.add(new Block(true, false, true, false)); //5-3
		row3.add(new Block(false, true, false, false)); //6-3
		maze12.addRow(3 - 1, row3);
		
		ArrayList<Block> row4 = new ArrayList<Block>();
		row4.add(new Block(false, true, false, true)); //1-4
		row4.add(new Block(true, false, true, true)); //2-4
		row4.add(new Block(false, false, true, false)); //3-4
		row4.add(new Block(false, true, true, false)); //4-4
		row4.add(new Block(true, false, true, true)); //5-4
		row4.add(new Block(false, true, false, false)); //6-4
		maze12.addRow(4 - 1, row4);
		
		ArrayList<Block> row5 = new ArrayList<Block>();
		row5.add(new Block(false, false, false, true)); //1-5
		row5.add(new Block(true, false, true, false)); //2-5
		row5.add(new Block(true, true, false, false)); //3-5
		row5.add(new Block(true, false, false, true)); //4-5
		row5.add(new Block(true, true, true, false)); //5-5
		row5.add(new Block(false, true, false, true)); //6-5
		maze12.addRow(5 - 1, row5);
		
		ArrayList<Block> row6 = new ArrayList<Block>();
		row6.add(new Block(false, false, true, true)); //1-6
		row6.add(new Block(true, true, true, false)); //2-6
		row6.add(new Block(false, false, true, true)); //3-6
		row6.add(new Block(false, true, true, false)); //4-6
		row6.add(new Block(true, false, true, true)); //5-6
		row6.add(new Block(false, true, true, false)); //6-6
		maze12.addRow(6 - 1, row6);
		
		return maze12;
	}
	
	public Mazes maze52() {
		Mazes maze52 = new Mazes(6);

		ArrayList<Block> row1 = new ArrayList<Block>();
		row1.add(new Block(true, false, true, true)); //1-1
		row1.add(new Block(true, false, false, false)); //2-1
		row1.add(new Block(true, true, true, false)); //3-1
		row1.add(new Block(true, false, false, true)); //4-1
		row1.add(new Block(true, false, false, false)); //5-1
		row1.add(new Block(true, true, true, false)); //6-1
		maze52.addRow(1 - 1, row1);
	
		ArrayList<Block> row2 = new ArrayList<Block>();
		row2.add(new Block(true, false, false, true)); //1-2
		row2.add(new Block(false, true, true, false)); //2-2
		row2.add(new Block(true, false, false, true)); //3-2
		row2.add(new Block(false, true, true, false)); //4-2
		row2.add(new Block(false, false, true, true)); //5-2
		row2.add(new Block(true, true, false, false)); //6-2
		maze52.addRow(2 - 1, row2);
		
		ArrayList<Block> row3 = new ArrayList<Block>();
		row3.add(new Block(false, true, false, true)); //1-3
		row3.add(new Block(true, false, false, true)); //2-3
		row3.add(new Block(false, true, true, false)); //3-3
		row3.add(new Block(true, false, false, true)); //4-3
		row3.add(new Block(true, false, true, false)); //5-3
		row3.add(new Block(false, true, false, false)); //6-3
		maze52.addRow(3 - 1, row3);
		
		ArrayList<Block> row4 = new ArrayList<Block>();
		row4.add(new Block(false, false, false, true)); //1-4
		row4.add(new Block(false, true, true, false)); //2-4
		row4.add(new Block(true, false, false, true)); //3-4
		row4.add(new Block(false, true, true, false)); //4-4
		row4.add(new Block(true, true, false, true)); //5-4
		row4.add(new Block(false, true, false, true)); //6-4
		maze52.addRow(4 - 1, row4);
		
		ArrayList<Block> row5 = new ArrayList<Block>();
		row5.add(new Block(false, true, false, true)); //1-5
		row5.add(new Block(true, true, false, true)); //2-5
		row5.add(new Block(false, true, false, true)); //3-5
		row5.add(new Block(true, false, false, true)); //4-5
		row5.add(new Block(false, true, true, false)); //5-5
		row5.add(new Block(false, true, false, true)); //6-5
		maze52.addRow(5 - 1, row5);
		
		ArrayList<Block> row6 = new ArrayList<Block>();
		row6.add(new Block(false, true, true, true)); //1-6
		row6.add(new Block(false, false, true, true)); //2-6
		row6.add(new Block(false, true, true, false)); //3-6
		row6.add(new Block(false, false, true, true)); //4-6
		row6.add(new Block(true, false, true, false)); //5-6
		row6.add(new Block(false, true, true, false)); //6-6
		maze52.addRow(6 - 1, row6);
		
		return maze52;
	}

	public Mazes maze44() {
		Mazes maze52 = new Mazes(6);

		ArrayList<Block> row1 = new ArrayList<Block>();
		row1.add(new Block(true, false, false, true)); //1-1
		row1.add(new Block(true, false, true, false)); //2-1
		row1.add(new Block(true, true, false, false)); //3-1
		row1.add(new Block(true, true, false, true)); //4-1
		row1.add(new Block(true, false, false, true)); //5-1
		row1.add(new Block(true, true, false, false)); //6-1
		maze52.addRow(1 - 1, row1);
	
		ArrayList<Block> row2 = new ArrayList<Block>();
		row2.add(new Block(false, true, true, true)); //1-2
		row2.add(new Block(true, true, false, true)); //2-2
		row2.add(new Block(false, true, false, true)); //3-2
		row2.add(new Block(false, false, true, true)); //4-2
		row2.add(new Block(false, true, true, false)); //5-2
		row2.add(new Block(false, true, false, true)); //6-2
		maze52.addRow(2 - 1, row2);
		
		ArrayList<Block> row3 = new ArrayList<Block>();
		row3.add(new Block(true, false, false, true)); //1-3
		row3.add(new Block(false, true, false, false)); //2-3
		row3.add(new Block(false, true, false, true)); //3-3
		row3.add(new Block(true, false, false, true)); //4-3
		row3.add(new Block(true, true, false, false)); //5-3
		row3.add(new Block(false, true, false, true)); //6-3
		maze52.addRow(3 - 1, row3);
		
		ArrayList<Block> row4 = new ArrayList<Block>();
		row4.add(new Block(false, true, false, true)); //1-4
		row4.add(new Block(false, true, false, true)); //2-4
		row4.add(new Block(false, true, false, true)); //3-4
		row4.add(new Block(false, true, false, true)); //4-4
		row4.add(new Block(false, true, false, true)); //5-4
		row4.add(new Block(false, true, false, true)); //6-4
		maze52.addRow(4 - 1, row4);
		
		ArrayList<Block> row5 = new ArrayList<Block>();
		row5.add(new Block(false, true, false, true)); //1-5
		row5.add(new Block(false, false, true, true)); //2-5
		row5.add(new Block(false, true, true, false)); //3-5
		row5.add(new Block(false, true, false, true)); //4-5
		row5.add(new Block(false, true, false, true)); //5-5
		row5.add(new Block(false, true, false, true)); //6-5
		maze52.addRow(5 - 1, row5);
		
		ArrayList<Block> row6 = new ArrayList<Block>();
		row6.add(new Block(false, false, true, true)); //1-6
		row6.add(new Block(true, false, true, false)); //2-6
		row6.add(new Block(true, false, true, false)); //3-6
		row6.add(new Block(false, true, true, false)); //4-6
		row6.add(new Block(false, false, true, true)); //5-6
		row6.add(new Block(false, true, true, false)); //6-6
		maze52.addRow(6 - 1, row6);
		
		return maze52;
	}

	public Mazes maze11() {
		Mazes maze11 = new Mazes(6);

		ArrayList<Block> row1 = new ArrayList<Block>();
		row1.add(new Block(true, false, false, true)); //1-1
		row1.add(new Block(true, true, false, false)); //2-1
		row1.add(new Block(true, false, true, true)); //3-1
		row1.add(new Block(true, false, true, false)); //4-1
		row1.add(new Block(true, false, true, false)); //5-1
		row1.add(new Block(true, true, false, false)); //6-1
		maze11.addRow(1 - 1, row1);
	
		ArrayList<Block> row2 = new ArrayList<Block>();
		row2.add(new Block(false, true, false, true)); //1-2
		row2.add(new Block(false, true, false, true)); //2-2
		row2.add(new Block(true, false, false, true)); //3-2
		row2.add(new Block(true, false, true, false)); //4-2
		row2.add(new Block(true, false, true, false)); //5-2
		row2.add(new Block(false, true, false, false)); //6-2
		maze11.addRow(2 - 1, row2);
		
		ArrayList<Block> row3 = new ArrayList<Block>();
		row3.add(new Block(false, true, false, true)); //1-3
		row3.add(new Block(false, false, true, true)); //2-3
		row3.add(new Block(false, true, true, false)); //3-3
		row3.add(new Block(true, false, false, true)); //4-3
		row3.add(new Block(true, true, true, false)); //5-3
		row3.add(new Block(false, true, false, true)); //6-3
		maze11.addRow(3 - 1, row3);
		
		ArrayList<Block> row4 = new ArrayList<Block>();
		row4.add(new Block(false, true, false, true)); //1-4
		row4.add(new Block(true, false, true, true)); //2-4
		row4.add(new Block(true, false, true, false)); //3-4
		row4.add(new Block(false, false, true, false)); //4-4
		row4.add(new Block(true, false, true, false)); //5-4
		row4.add(new Block(false, true, false, false)); //6-4
		maze11.addRow(4 - 1, row4);
		
		ArrayList<Block> row5 = new ArrayList<Block>();
		row5.add(new Block(false, false, false, true)); //1-5
		row5.add(new Block(true, false, true, false)); //2-5
		row5.add(new Block(true, false, true, false)); //3-5
		row5.add(new Block(true, false, true, false)); //4-5
		row5.add(new Block(true, true, false, false)); //5-5
		row5.add(new Block(false, true, false, true)); //6-5
		maze11.addRow(5 - 1, row5);
		
		ArrayList<Block> row6 = new ArrayList<Block>();
		row6.add(new Block(false, false, true, true)); //1-6
		row6.add(new Block(true, false, true, false)); //2-6
		row6.add(new Block(true, true, true, false)); //3-6
		row6.add(new Block(true, false, true, true)); //4-6
		row6.add(new Block(false, true, true, false)); //5-6
		row6.add(new Block(false, true, true, true)); //6-6
		maze11.addRow(6 - 1, row6);
		
		return maze11;
	}

	public Mazes maze53() {
		Mazes maze53 = new Mazes(6);

		ArrayList<Block> row1 = new ArrayList<Block>();
		row1.add(new Block(true, false, true, true)); //1-1
		row1.add(new Block(true, false, true, false)); //2-1
		row1.add(new Block(true, false, true, false)); //3-1
		row1.add(new Block(true, false, true, false)); //4-1
		row1.add(new Block(true, false, false, false)); //5-1
		row1.add(new Block(true, true, false, false)); //6-1
		maze53.addRow(1 - 1, row1);
	
		ArrayList<Block> row2 = new ArrayList<Block>();
		row2.add(new Block(true, false, false, true)); //1-2
		row2.add(new Block(true, false, true, false)); //2-2
		row2.add(new Block(true, false, true, false)); //3-2
		row2.add(new Block(true, false, false, false)); //4-2
		row2.add(new Block(false, true, true, false)); //5-2
		row2.add(new Block(false, true, true, true)); //6-2
		maze53.addRow(2 - 1, row2);
		
		ArrayList<Block> row3 = new ArrayList<Block>();
		row3.add(new Block(false, false, false, true)); //1-3
		row3.add(new Block(true, true, false, false)); //2-3
		row3.add(new Block(true, false, true, true)); //3-3
		row3.add(new Block(false, true, true, false)); //4-3
		row3.add(new Block(true, false, false, true)); //5-3
		row3.add(new Block(true, true, false, false)); //6-3
		maze53.addRow(3 - 1, row3);
		
		ArrayList<Block> row4 = new ArrayList<Block>();
		row4.add(new Block(false, true, false, true)); //1-4
		row4.add(new Block(false, false, true, true)); //2-4
		row4.add(new Block(true, false, true, false)); //3-4
		row4.add(new Block(true, true, false, false)); //4-4
		row4.add(new Block(false, true, true, true)); //5-4
		row4.add(new Block(false, true, false, true)); //6-4
		maze53.addRow(4 - 1, row4);
		
		ArrayList<Block> row5 = new ArrayList<Block>();
		row5.add(new Block(false, true, false, true)); //1-5
		row5.add(new Block(true, false, false, true)); //2-5
		row5.add(new Block(true, false, true, false)); //3-5
		row5.add(new Block(false, false, true, false)); //4-5
		row5.add(new Block(true, true, true, false)); //5-5
		row5.add(new Block(false, true, false, true)); //6-5
		maze53.addRow(5 - 1, row5);
		
		ArrayList<Block> row6 = new ArrayList<Block>();
		row6.add(new Block(false, true, true, true)); //1-6
		row6.add(new Block(false, false, true, true)); //2-6
		row6.add(new Block(true, false, true, false)); //3-6
		row6.add(new Block(true, false, true, false)); //4-6
		row6.add(new Block(true, false, true, false)); //5-6
		row6.add(new Block(false, true, true, false)); //6-6
		maze53.addRow(6 - 1, row6);
		
		return maze53;
	}
	
	public Mazes maze51() {
		Mazes maze51 = new Mazes(6);

		ArrayList<Block> row1 = new ArrayList<Block>();
		row1.add(new Block(true, true, false, true)); //1-1
		row1.add(new Block(true, false, false, true)); //2-1
		row1.add(new Block(true, true, false, false)); //3-1
		row1.add(new Block(true, false, true, true)); //4-1
		row1.add(new Block(true, false, false, false)); //5-1
		row1.add(new Block(true, true, false, false)); //6-1
		maze51.addRow(1 - 1, row1);
	
		ArrayList<Block> row2 = new ArrayList<Block>();
		row2.add(new Block(false, true, false, true)); //1-2
		row2.add(new Block(false, true, false, true)); //2-2
		row2.add(new Block(false, true, false, true)); //3-2
		row2.add(new Block(true, false, false, true)); //4-2
		row2.add(new Block(false, true, true, false)); //5-2
		row2.add(new Block(false, true, false, true)); //6-2
		maze51.addRow(2 - 1, row2);
		
		ArrayList<Block> row3 = new ArrayList<Block>();
		row3.add(new Block(false, false, false, true)); //1-3
		row3.add(new Block(false, true, true, false)); //2-3
		row3.add(new Block(false, true, true, true)); //3-3
		row3.add(new Block(false, true, false, true)); //4-3
		row3.add(new Block(true, false, false, true)); //5-3
		row3.add(new Block(false, true, true, false)); //6-3
		maze51.addRow(3 - 1, row3);
		
		ArrayList<Block> row4 = new ArrayList<Block>();
		row4.add(new Block(false, false, true, true)); //1-4
		row4.add(new Block(true, true, false, false)); //2-4
		row4.add(new Block(true, false, false, true)); //3-4
		row4.add(new Block(false, true, false, false)); //4-4
		row4.add(new Block(false, true, false, true)); //5-4
		row4.add(new Block(true, true, false, true)); //6-4
		maze51.addRow(4 - 1, row4);
		
		ArrayList<Block> row5 = new ArrayList<Block>();
		row5.add(new Block(true, false, false, true)); //1-5
		row5.add(new Block(false, true, true, false)); //2-5
		row5.add(new Block(false, true, true, true)); //3-5
		row5.add(new Block(false, true, false, true)); //4-5
		row5.add(new Block(false, false, true, true)); //5-5
		row5.add(new Block(false, true, false, false)); //6-5
		maze51.addRow(5 - 1, row5);
		
		ArrayList<Block> row6 = new ArrayList<Block>();
		row6.add(new Block(false, false, true, true)); //1-6
		row6.add(new Block(true, false, true, false)); //2-6
		row6.add(new Block(true, false, true, false)); //3-6
		row6.add(new Block(false, true, true, false)); //4-6
		row6.add(new Block(true, false, true, true)); //5-6
		row6.add(new Block(false, true, true, false)); //6-6
		maze51.addRow(6 - 1, row6);
		
		return maze51;
	}
}

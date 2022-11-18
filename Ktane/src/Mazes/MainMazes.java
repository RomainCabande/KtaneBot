package Mazes;

import java.util.ArrayList;

public class MainMazes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazesStock maze = new MazesStock();
		Mazes maze12 = maze.maze12();
		//System.out.println(maze12);
		//System.out.println(maze12);
		maze12.solve();
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(4);
		test.add(3);
		System.out.println(test);
	}
}

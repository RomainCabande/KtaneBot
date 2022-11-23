package Mazes;

import java.util.ArrayList;

public class MainMazes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MazesStock maze = new MazesStock();
		//Mazes maze12 = maze.maze12();
		//System.out.println(maze12);
		//System.out.println(maze12);
		/*
		maze12.getPath();
		maze12.printSoluceMaze();
		System.out.println(maze12.getPath());
		*/
		Mazes mazeS= maze.maze32();
		mazeS.solve();
		System.out.println(mazeS);
		mazeDrawer mazeDrawer = new mazeDrawer(mazeS, 50);
		mazeDrawer.drawEverything();

	}	
}

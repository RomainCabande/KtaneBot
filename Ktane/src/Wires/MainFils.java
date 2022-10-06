package Wires;
import javax.swing.JOptionPane;

import GUIModulesFeatures.BombInfo;

public class MainFils {

	public MainFils(BombInfo bombInfo) {
		Fils filSequence = new Fils(bombInfo);
		String listFilsBrute = "";
	
		//Recuperer les couleurs
		listFilsBrute = JOptionPane.showInputDialog("Put wires colors from top to bottom (R=Red,B=Blue,W=White,N=Black,J=Yellow)");
		filSequence.addStringToFil(listFilsBrute);
		System.out.println(filSequence.toString());
		System.out.println("Coupez le " + filSequence.wireToCut(bombInfo) + "e fil");
	}

}
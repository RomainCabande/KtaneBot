package Keypads;

import java.util.ArrayList;

public class MainKeypads {
	private ArrayList<enumSignes> listSignes;
	
	public MainKeypads(ArrayList<enumSignes> listSignes) {
		this.listSignes = listSignes;
	}
	
	public String KeySequence() {
		Keypads keypads = new Keypads(this.listSignes);
		return "Presse : " + keypads.doEverything();
	}

}

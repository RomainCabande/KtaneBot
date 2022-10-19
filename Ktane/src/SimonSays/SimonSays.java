package SimonSays;

import GUIModulesFeatures.BombInfo;

public class SimonSays {
	
	private String sequence;
	private BombInfo bombInfo;
	
	public SimonSays(String sequence, BombInfo bombInfo) {
		this.sequence = sequence;
		this.bombInfo = bombInfo;
	}
	
	public String solveModule() {
		String string = "";
		if(this.bombInfo.isSerialNumberContainsVowel()) {
			for(int i = 0; i < this.sequence.length(); i++) {
				if(this.sequence.charAt(i) == 'R') {
					string += "Blue ";
				} else if(this.sequence.charAt(i) == 'B') {
					string += "Red ";
				} else if(this.sequence.charAt(i) == 'G') {
					string += "Yellow ";
				} else if(this.sequence.charAt(i) == 'Y') {
					string += "Green ";
				}
			}
		} else {
			for(int i = 0; i < this.sequence.length(); i++) {
				if(this.sequence.charAt(i) == 'R') {
					string += "Blue ";
				} else if(this.sequence.charAt(i) == 'B') {
					string += "Yellow ";
				} else if(this.sequence.charAt(i) == 'G') {
					string += "Green ";
				} else if(this.sequence.charAt(i) == 'Y') {
					string += "Red ";
				}
			}
		}
		return string;
	}
	
}

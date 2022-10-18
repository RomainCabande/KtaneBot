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
					string += 'B';
				} else if(this.sequence.charAt(i) == 'B') {
					string += 'R';
				} else if(this.sequence.charAt(i) == 'G') {
					string += 'Y';
				} else if(this.sequence.charAt(i) == 'Y') {
					string += 'G';
				}
			}
		} else {
			for(int i = 0; i < this.sequence.length(); i++) {
				if(this.sequence.charAt(i) == 'R') {
					string += 'B';
				} else if(this.sequence.charAt(i) == 'B') {
					string += 'Y';
				} else if(this.sequence.charAt(i) == 'G') {
					string += 'G';
				} else if(this.sequence.charAt(i) == 'Y') {
					string += 'R';
				}
			}
		}
		return string;
	}
	
}

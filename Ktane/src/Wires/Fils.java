package Wires;
import java.util.LinkedList;
import java.util.List;

import GUIModulesFeatures.BombInfo;
public class Fils {
	
	private List<Character> listeFils;
	
	public Fils(BombInfo bombInfo) {
		this.listeFils = new LinkedList<Character>();
	}
	
	public void addStringToFil(String strFils) {
		if(strFils != null) {
			for(int i = 0; i < strFils.length(); i ++) {
				this.listeFils.add(strFils.charAt(i));
			}
		}
	}
	
	@Override
	public String toString() {
		String s = new String();
		for(int i = 0; i < listeFils.size(); i ++) {
			s = s.concat(listeFils.get(i).toString());
			if(i != listeFils.size() - 1) {
				s = s.concat(", ");
			}
		}
		return s;
	}
	
	public boolean findWireColor(Character color) {
		for(int i = 0; i < this.listeFils.size(); i ++) {
			if(this.listeFils.get(i) == color) {
				return true;
			}
		}
		return false;
	}
	
	public int countWireColorOccurence(Character color) {
		int count = 0;
		for(int i = 0; i < this.listeFils.size(); i ++) {
			if(this.listeFils.get(i) == color) {
				count ++;
			}
		}
		return count;
	}
	
	public boolean findWireColorAtPosition(Character color, int index) {
		return(this.listeFils.get(index - 1) == color);
	}
	
	public int lastWireColorOccurence(Character color) {
		int occurence = 0;
		for(int i = 0; i < this.listeFils.size(); i ++) {
			if(this.listeFils.get(i) == color) {
				occurence = i;
			}
		}
		return occurence;
	}
	
	public int wireToCut(BombInfo bombe) {
		int wireToCut = 0;
		switch(this.listeFils.size()) {
			case 3:
				if(!this.findWireColor('R')) {
					wireToCut = 2;
				} else if(this.findWireColorAtPosition('W', this.listeFils.size())) {
					wireToCut = this.listeFils.size();
				} else if(this.countWireColorOccurence('B') > 1) {
					wireToCut = this.lastWireColorOccurence('B') + 1;
				} else {
					wireToCut = this.listeFils.size();
				}
				break;
			case 4:
				if(this.countWireColorOccurence('R') > 1 && bombe.isLastDigitOfSerialNumberOdd() == true){
					wireToCut = this.lastWireColorOccurence('R') + 1;
				} else if(this.findWireColorAtPosition('J', this.listeFils.size()) && !(this.findWireColor('R'))) {
					wireToCut = 1;
				} else if(this.countWireColorOccurence('B') == 1) {
					wireToCut = 1;
				} else if(this.countWireColorOccurence('J') > 1) {
					wireToCut = this.listeFils.size();
				} else {
					wireToCut = 2;
				}
				break;
			case 5:
				if(this.findWireColorAtPosition('N', this.listeFils.size()) && bombe.isLastDigitOfSerialNumberOdd() == true) {
					wireToCut = 4;
				} else if(this.countWireColorOccurence('R') == 1 && this.countWireColorOccurence('J') > 1) {
					wireToCut = 1;
				} else if(!(this.findWireColor('N'))) {
					wireToCut = 2;
				} else {
					wireToCut = 1;
				}
				break;
			case 6:
				if(this.findWireColor('J') == false && bombe.isLastDigitOfSerialNumberOdd() == true) {
					wireToCut = 3;
				} else if(this.countWireColorOccurence('J') == 1 && this.countWireColorOccurence('W') > 1) {
					wireToCut = 4;
				} else if(this.findWireColor('R') == false) {
					wireToCut = 6;
				} else {
					wireToCut = 4;
				}
				break;
		}
		return wireToCut;
	}
}

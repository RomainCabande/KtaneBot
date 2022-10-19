package Keypads;
import java.util.ArrayList;
import java.util.Arrays;

public class Keypads {
	public static final ArrayList<enumSignes> List1 = new ArrayList<enumSignes>(Arrays.asList(enumSignes.LOLLIPOP, enumSignes.AT, enumSignes.LAMBDA, enumSignes.HP, enumSignes.TTRIANGLE, enumSignes.X, enumSignes.CPRETURN)); 
	public static final ArrayList<enumSignes> List2 = new ArrayList<enumSignes>(Arrays.asList(enumSignes.E2POINTS, enumSignes.LOLLIPOP, enumSignes.CPRETURN, enumSignes.CL, enumSignes.STARW, enumSignes.X, enumSignes.PTSRETURN));
	public static final ArrayList<enumSignes> List3 = new ArrayList<enumSignes>(Arrays.asList(enumSignes.CCIRCLED, enumSignes.DOG, enumSignes.CL, enumSignes.DOUBLEK, enumSignes.R, enumSignes.LAMBDA, enumSignes.STARW));
	public static final ArrayList<enumSignes> List4 = new ArrayList<enumSignes>(Arrays.asList(enumSignes.SIX, enumSignes.P, enumSignes.TB, enumSignes.TTRIANGLE, enumSignes.DOUBLEK, enumSignes.PTSRETURN, enumSignes.SMILEY));
	public static final ArrayList<enumSignes> List5 = new ArrayList<enumSignes>(Arrays.asList(enumSignes.CHANDELIER, enumSignes.SMILEY, enumSignes.TB, enumSignes.CPTS, enumSignes.P, enumSignes.TROIS, enumSignes.STARB));
	public static final ArrayList<enumSignes> List6 = new ArrayList<enumSignes>(Arrays.asList(enumSignes.SIX, enumSignes.E2POINTS, enumSignes.EQUALSB, enumSignes.AE, enumSignes.CHANDELIER, enumSignes.NH, enumSignes.OMEGA));
	private ArrayList<enumSignes> inpSignes;
	private enumSignes Signe1;
	private enumSignes Signe2;
	private enumSignes Signe3;
	private enumSignes Signe4;
	private ArrayList<ArrayList<enumSignes>> listOfList = new ArrayList<ArrayList<enumSignes>>(Arrays.asList(List1, List2, List3, List4, List5, List6));
	
	
	
	public Keypads(enumSignes Signe1, enumSignes Signe2, enumSignes Signe3, enumSignes Signe4) {
		this.Signe1 = Signe1;
		this.Signe2 = Signe2;
		this.Signe3 = Signe3;
		this.Signe4 = Signe4;
		this.inpSignes = new ArrayList<enumSignes>(Arrays.asList(this.Signe1, this.Signe2, this.Signe3, this.Signe4));
	}
	public Keypads(ArrayList<enumSignes> signe) {
		this.inpSignes = new ArrayList<enumSignes>();
		for(int i = 0; i < signe.size(); i++) {
			this.inpSignes.add(signe.get(i));
		}
	}
	
	public ArrayList<enumSignes> searchList() { //SignesInput.searchList();
		int i = 0;
		while(this.listOfList.get(i).containsAll(inpSignes) == false) {
			i++;
		}
		return listOfList.get(i);
	}
	
	public ArrayList<enumSignes> listSorted(ArrayList<enumSignes> fullList){
		ArrayList<enumSignes> retList = new ArrayList<>();
		for(int i = 0; i < fullList.size(); i++) {
			for(int j = 0; j < this.inpSignes.size(); j++) {
				if(fullList.get(i).equals(this.inpSignes.get(j))) {
					retList.add(fullList.get(i));
				}
			}
		}
		return retList;
	}
	
	public ArrayList<enumSignes> doEverything() {
		return listSorted(searchList());
	}

	
}

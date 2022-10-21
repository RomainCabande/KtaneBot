package Passwords;

import java.util.ArrayList;
import java.util.Arrays;

public class Passwords {
	private static final ArrayList<String> words = new ArrayList<String>(Arrays.asList("about after again below could every first found great house large learn never other place plant point right small sound spell still study their there these thing think three water where which world would write".split(" ")));
	private static final ArrayList<ArrayList<String>> listWords =  new ArrayList<ArrayList<String>>() ;
	private ArrayList<String> letters1 = new ArrayList<String>();
	private ArrayList<String> letters3 = new ArrayList<String>();
	private ArrayList<String> letters5 = new ArrayList<String>();
	private boolean isFullL1 = false;
	private boolean isFullL3 = false;
	private boolean isFullL5 = false;
	private ArrayList<ArrayList<String>> listWordsReduced = listWords;

	
	
	public Passwords() {
		for(int i = 0; i < words.size(); i++) {
			ArrayList<String> add = new ArrayList<String>(Arrays.asList(words.get(i).split("")));
			listWords.add(add);
		}
	}
		
	public void addLetter1(String str) {
		this.letters1 = new ArrayList<String>(Arrays.asList(str.split("")));
		isFullL1 = true;
	}
	
	public void addLetter3(String str) {
		this.letters3 = new ArrayList<String>(Arrays.asList(str.split("")));
		isFullL3 = true;
	}
	
	public void addLetter5(String str) {
		this.letters5 = new ArrayList<String>(Arrays.asList(str.split("")));
		isFullL5 = true;
	}

		
	public ArrayList<ArrayList<String>> listWords() {
		return listWords;
	}
	
	public String charToString(ArrayList<String> listChar) {
		String ret = "";
		for(int i = 0; i < listChar.size(); i++) {
			ret += listChar.get(i);
		}
		return ret;
	}
	
	public ArrayList<ArrayList<String>> wordSearch() {
		if(isFullL1 == true) {
			for(int i = listWordsReduced.size()-1; i >= 0; i-- ) {
				if(!letters1.contains(listWordsReduced.get(i).get(0))) {
					listWordsReduced.remove(i);
				}	
			}
		}
		if(isFullL3 == true) {
			for(int i = listWordsReduced.size()-1; i >= 0; i-- ) {
				if(!letters3.contains(listWordsReduced.get(i).get(2))) {
					listWordsReduced.remove(i);
				}	
			}
		}
		if(isFullL5 == true) {
			for(int i = listWordsReduced.size()-1; i >= 0; i-- ) {
				if(!letters5.contains(listWordsReduced.get(i).get(4))) {
					listWordsReduced.remove(i);
				}	
			}
		}
		return listWordsReduced;
	}
	
}

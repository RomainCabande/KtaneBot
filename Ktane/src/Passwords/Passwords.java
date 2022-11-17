package Passwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Passwords {
	private static final ArrayList<String> words = new ArrayList<String>(Arrays.asList("about after again below could every first found great house large learn never other place plant point right small sound spell still study their there these thing think three water where which world would write".split(" ")));
	private static final ArrayList<ArrayList<String>> listWords =  new ArrayList<ArrayList<String>>() ;
	private ArrayList<ArrayList<String>> listLetters = new ArrayList<ArrayList<String>>();
	private ArrayList<Boolean> isFullList = new ArrayList<Boolean>(Arrays.asList(false, false, false));
	private ArrayList<ArrayList<String>> listWordsReduced;

	
	
	public Passwords() {
		for(int i = 0; i < words.size(); i++) {
			ArrayList<String> add = new ArrayList<String>(Arrays.asList(words.get(i).split("")));
			listWords.add(add);
		}
		ArrayList<String> inpt = new ArrayList<String>();
		for(int i = 0; i < 3; i++) {
			listLetters.add(inpt);
		}
		listWordsReduced = new ArrayList<ArrayList<String>>(listWords);
	}

	public void addLetter(String str, int i) {
		HashSet<String> add = new HashSet<String>(Arrays.asList(str.split("")));
		listLetters.set(i, new ArrayList<String>(add));
		isFullList.set(i, true);
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
		for(int j = 0; j < 3; j++) {
			if(isFullList.get(j) == true) {
				for(int i = listWordsReduced.size()-1; i >= 0; i-- ) {
					if(!listLetters.get(j).contains(listWordsReduced.get(i).get(j*2))) {
						this.listWordsReduced.remove(i);
					}	
				}
			}	
		}
		return listWordsReduced;
	}
	
	public void refillList() {
		listWordsReduced.removeAll(listWordsReduced);
		for(int i = 0; i < words.size(); i++) {
			listWordsReduced.add(listWords.get(i));
		}
		System.out.println(listWords);
		System.out.println(listWordsReduced);
	}
}

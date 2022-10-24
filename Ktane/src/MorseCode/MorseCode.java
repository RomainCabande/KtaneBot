package MorseCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class MorseCode {
    private ArrayList<String> letters = new ArrayList<String>();
	private static final ArrayList<String> beats = new ArrayList<String>(Arrays.asList("beats".split(""))); 
	private static final ArrayList<String> bistro = new ArrayList<String>(Arrays.asList("bistro".split(""))); 
	private static final ArrayList<String> bombs = new ArrayList<String>(Arrays.asList("bombs".split("")));
	private static final ArrayList<String> boxes = new ArrayList<String>(Arrays.asList("boxes".split(""))); 
	private static final ArrayList<String> breakv = new ArrayList<String>(Arrays.asList("break".split(""))); 
	private static final ArrayList<String> brick = new ArrayList<String>(Arrays.asList("brick".split(""))); 
	private static final ArrayList<String> flick = new ArrayList<String>(Arrays.asList("flick".split(""))); 
	private static final ArrayList<String> halls = new ArrayList<String>(Arrays.asList("halls".split(""))); 
	private static final ArrayList<String> leaks = new ArrayList<String>(Arrays.asList("leaks".split(""))); 
	private static final ArrayList<String> shell = new ArrayList<String>(Arrays.asList("shell".split(""))); 
	private static final ArrayList<String> slick = new ArrayList<String>(Arrays.asList("slick".split(""))); 
	private static final ArrayList<String> steak = new ArrayList<String>(Arrays.asList("steak".split(""))); 
	private static final ArrayList<String> sting = new ArrayList<String>(Arrays.asList("sting".split(""))); 
	private static final ArrayList<String> strobe = new ArrayList<String>(Arrays.asList("strobe".split(""))); 
	private static final ArrayList<String> trick = new ArrayList<String>(Arrays.asList("trick".split(""))); 
	private static final ArrayList<String> vector = new ArrayList<String>(Arrays.asList("vector".split("")));
	private static final ArrayList<ArrayList<String>> listOfWords = new ArrayList<ArrayList<String>>(Arrays.asList(beats, bistro, bombs, boxes, breakv, brick, flick, halls, leaks, shell, slick, steak, sting, strobe, trick, vector));

    private HashMap<String, String> lettersToFreq = new HashMap<>();
    


	public MorseCode() {
		this.letters = new ArrayList<String>();
		lettersToFreq.put("beats", "3.600");
		lettersToFreq.put("bistro", "3.552");
		lettersToFreq.put("bombs", "3.565");
		lettersToFreq.put("boxes", "3.535");
		lettersToFreq.put("break", "3.575");
		lettersToFreq.put("brick", "3.572");
		lettersToFreq.put("flick", "3.555");
		lettersToFreq.put("halls", "3.515");
		lettersToFreq.put("leaks", "3.542");
		lettersToFreq.put("shell", "3.505");
		lettersToFreq.put("slick", "3.522");
		lettersToFreq.put("steak", "3.582");
		lettersToFreq.put("sting", "3.592");
		lettersToFreq.put("strobe", "3.545");
		lettersToFreq.put("trick", "3.532");
		lettersToFreq.put("vector", "3.595");

		
	}
	
	public void addLetter(String letter) {
		if(!letter.equals("null")) {
			this.letters.add(letter);
		}
	}
	
	public ArrayList<String> testIn() {
		ArrayList<String> ret = new ArrayList<>();
		 ret.add("letters : " + letters);
		for(int i = 0; i < lettersToFreq.size(); i++) {
			if(MorseCode.listOfWords.get(i).containsAll(letters)) {
				ret.add(charToString(MorseCode.listOfWords.get(i))+ ": " + lettersToFreq.get(charToString(MorseCode.listOfWords.get(i))));
			}
			
		}
		return ret;
	}
	
	public String charToString(ArrayList<String> listChar) {
		String ret = "";
		for(int i = 0; i < listChar.size(); i++) {
			ret += listChar.get(i);
		}
		return ret;
	}
	
	public void removeLastElement() {
		this.letters.remove(letters.size() - 1);
	}
	
	public void removeAllChar(){
		for(int i = letters.size(); i > 0; i--) {
			removeLastElement();
		}
	}
	
}

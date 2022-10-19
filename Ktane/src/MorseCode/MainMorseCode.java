package MorseCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class MainMorseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MorseTranslator translate = new MorseTranslator();
		System.out.println(translate.translateToMorse("..."));
	    HashMap<String, Character> train = new HashMap<>();
	    train.put("azerty", 'A');
		final ArrayList<String> beats = new ArrayList<String>(Arrays.asList("beats".split(""))); 
		System.out.println(beats);
		MorseCode test = new MorseCode();
		test.addLetter("h");
		test.addLetter("e");
		test.addLetter("s");
		System.out.println(test.testIn());
	}
}


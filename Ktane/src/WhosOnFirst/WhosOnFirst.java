package WhosOnFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WhosOnFirst {

	private TopWord topWord;
	private List<MiddleWord> listMiddleWords;
	private HashMap<MiddleWord, List<String>> hashmapWordsToClick;

	public WhosOnFirst(TopWord topWord, MiddleWord topLeftWord, MiddleWord middleLeftWord, MiddleWord bottomLeftWord,
			MiddleWord topRightWord, MiddleWord middleRightWord, MiddleWord bottomRightWord) {
		this.topWord = topWord;
		this.listMiddleWords = new ArrayList<MiddleWord>(Arrays.asList(topLeftWord, middleLeftWord, bottomLeftWord,
				topRightWord, middleRightWord, bottomRightWord));
		this.hashmapWordsToClick = new HashMap<MiddleWord, List<String>>();
		this.hashmapWordsToClick.put(MiddleWord.READY, new ArrayList<String>(Arrays.asList("YES", "OKAY", "WHAT", "MIDDLE", "LEFT", "PRESS", "RIGHT", "BLANK", "READY", "NO", "FIRST", "UHHH", "NOTHING", "WAIT")));
		this.hashmapWordsToClick.put(MiddleWord.FIRST, new ArrayList<String>(Arrays.asList("LEFT", "OKAY", "YES", "MIDDLE", "NO", "RIGHT", "NOTHING", "UHHH", "WAIT", "READY", "BLANK", "WHAT", "PRESS", "FIRST")));
		this.hashmapWordsToClick.put(MiddleWord.NO, new ArrayList<String>(Arrays.asList("BLANK", "UHHH", "WAIT", "FIRST", "WHAT", "READY", "RIGHT", "YES", "NOTHING", "LEFT", "PRESS", "OKAY", "NO", "MIDDLE")));
		this.hashmapWordsToClick.put(MiddleWord.BLANK, new ArrayList<String>(Arrays.asList("WAIT", "RIGHT", "OKAY", "MIDDLE", "BLANK", "PRESS", "READY", "NOTHING", "NO", "WHAT", "LEFT", "UHHH", "YES", "FIRST")));
		this.hashmapWordsToClick.put(MiddleWord.NOTHING, new ArrayList<String>(Arrays.asList("UHHH", "RIGHT", "OKAY", "MIDDLE", "YES", "BLANK", "NO", "PRESS", "LEFT", "WHAT", "WAIT", "FIRST", "NOTHING", "READY")));
		this.hashmapWordsToClick.put(MiddleWord.YES, new ArrayList<String>(Arrays.asList("OKAY", "RIGHT", "UHHH", "MIDDLE", "FIRST", "WHAT", "PRESS", "READY", "NOTHING", "YES", "LEFT", "BLANK", "NO", "WAIT")));
		this.hashmapWordsToClick.put(MiddleWord.WHAT, new ArrayList<String>(Arrays.asList("UHHH", "WHAT", "LEFT", "NOTHING", "READY", "BLANK", "MIDDLE", "NO", "OKAY", "FIRST", "WAIT", "YES", "PRESS", "RIGHT")));
		this.hashmapWordsToClick.put(MiddleWord.UHHH, new ArrayList<String>(Arrays.asList("READY", "NOTHING", "LEFT", "WHAT", "OKAY", "YES", "RIGHT", "NO", "PRESS", "BLANK", "UHHH", "MIDDLE", "WAIT", "FIRST")));
		this.hashmapWordsToClick.put(MiddleWord.LEFT, new ArrayList<String>(Arrays.asList("RIGHT", "LEFT", "FIRST", "NO", "MIDDLE", "YES", "BLANK", "WHAT", "UHHH", "WAIT", "PRESS", "READY", "OKAY", "NOTHING")));
		this.hashmapWordsToClick.put(MiddleWord.RIGHT, new ArrayList<String>(Arrays.asList("YES", "NOTHING", "READY", "PRESS", "NO", "WAIT", "WHAT", "RIGHT", "MIDDLE", "LEFT", "UHHH", "BLANK", "OKAY", "FIRST")));
		this.hashmapWordsToClick.put(MiddleWord.MIDDLE, new ArrayList<String>(Arrays.asList("BLANK", "READY", "OKAY", "WHAT", "NOTHING", "PRESS", "NO", "WAIT", "LEFT", "MIDDLE", "RIGHT", "FIRST", "UHHH", "YES")));
		this.hashmapWordsToClick.put(MiddleWord.OKAY, new ArrayList<String>(Arrays.asList("MIDDLE", "NO", "FIRST", "YES", "UHHH", "NOTHING", "WAIT", "OKAY", "LEFT", "READY", "BLANK", "PRESS", "WHAT", "RIGHT")));
		this.hashmapWordsToClick.put(MiddleWord.WAIT, new ArrayList<String>(Arrays.asList("UHHH", "NO", "BLANK", "OKAY", "YES", "LEFT", "FIRST", "PRESS", "WHAT", "WAIT", "NOTHING", "READY", "RIGHT", "MIDDLE")));
		this.hashmapWordsToClick.put(MiddleWord.PRESS, new ArrayList<String>(Arrays.asList("RIGHT", "MIDDLE", "YES", "READY", "PRESS", "OKAY", "NOTHING", "UHHH", "BLANK", "LEFT", "FIRST", "WHAT", "NO", "WAIT")));
		this.hashmapWordsToClick.put(MiddleWord.YOU, new ArrayList<String>(Arrays.asList("SURE", "YOU_ARE", "YOUR", "YOURE", "NEXT", "UH_HUH", "UR", "HOLD", "WHAT_INTERROGATIONMARK", "YOU", "UH_UH", "LIKE", "DONE", "U")));
		this.hashmapWordsToClick.put(MiddleWord.YOU_ARE, new ArrayList<String>(Arrays.asList("YOUR", "NEXT", "LIKE", "UH_HUH", "WHAT_INTERROGATIONMARK", "DONE", "UH_UH", "HOLD", "YOU", "U", "YOURE", "SURE", "UR", "YOU_ARE")));
		this.hashmapWordsToClick.put(MiddleWord.YOUR, new ArrayList<String>(Arrays.asList("UH_UH", "YOU_ARE", "UH_HUH", "YOUR", "NEXT", "UR", "SURE", "U", "YOURE", "YOU", "WHAT_INTERROGATIONMARK", "HOLD", "LIKE", "DONE")));
		this.hashmapWordsToClick.put(MiddleWord.YOURE, new ArrayList<String>(Arrays.asList("YOU", "YOURE", "UR", "NEXT", "UH_UH", "YOU_ARE", "U", "YOUR", "WHAT_INTERROGATIONMARK", "UH_HUH", "SURE", "DONE", "LIKE", "HOLD")));
		this.hashmapWordsToClick.put(MiddleWord.UR, new ArrayList<String>(Arrays.asList("DONE", "U", "UR", "UH_HUH", "WHAT_INTERROGATIONMARK", "SURE", "YOUR", "HOLD", "YOURE", "LIKE", "NEXT", "UH_UH", "YOU_ARE", "YOU")));
		this.hashmapWordsToClick.put(MiddleWord.U, new ArrayList<String>(Arrays.asList("UH_HUH", "SURE", "NEXT", "WHAT_INTERROGATIONMARK", "YOURE", "UR", "UH_UH", "DONE", "U", "YOU", "LIKE", "HOLD", "YOU_ARE", "YOUR")));
		this.hashmapWordsToClick.put(MiddleWord.UH_HUH, new ArrayList<String>(Arrays.asList("UH_HUH", "YOUR", "YOU_ARE", "YOU", "DONE", "HOLD", "UH_UH", "NEXT", "SURE", "LIKE", "YOURE", "UR", "U", "WHAT_INTERROGATIONMARK")));
		this.hashmapWordsToClick.put(MiddleWord.UH_UH, new ArrayList<String>(Arrays.asList("UR", "U", "YOU_ARE", "YOURE", "NEXT", "UH_UH", "DONE", "YOU", "UH_HUH", "LIKE", "YOUR", "SURE", "HOLD", "WHAT_INTERROGATIONMARK")));
		this.hashmapWordsToClick.put(MiddleWord.WHAT_INTERROGATIONMARK, new ArrayList<String>(Arrays.asList("YOU", "HOLD", "YOURE", "YOUR", "U", "DONE", "UH_UH", "LIKE", "YOU_ARE", "UH_HUH", "UR", "NEXT", "WHAT_INTERROGATIONMARK", "SURE")));
		this.hashmapWordsToClick.put(MiddleWord.DONE, new ArrayList<String>(Arrays.asList("SURE", "UH_HUH", "NEXT", "WHAT_INTERROGATIONMARK", "YOUR", "UR", "YOURE", "HOLD", "LIKE", "YOU", "U", "YOU_ARE", "UH_UH", "DONE")));
		this.hashmapWordsToClick.put(MiddleWord.NEXT, new ArrayList<String>(Arrays.asList("WHAT_INTERROGATIONMARK", "UH_HUH", "UH_UH", "YOUR", "HOLD", "SURE", "NEXT", "LIKE", "DONE", "YOU_ARE", "UR", "YOURE", "U", "YOU")));
		this.hashmapWordsToClick.put(MiddleWord.HOLD, new ArrayList<String>(Arrays.asList("YOU_ARE", "U", "DONE", "UH_UH", "YOU", "UR", "SURE", "WHAT_INTERROGATIONMARK", "YOURE", "NEXT", "HOLD", "UH_HUH", "YOUR", "LIKE")));
		this.hashmapWordsToClick.put(MiddleWord.SURE, new ArrayList<String>(Arrays.asList("YOU_ARE", "DONE", "LIKE", "YOURE", "YOU", "HOLD", "UH_HUH", "UR", "SURE", "U", "WHAT_INTERROGATIONMARK", "NEXT", "YOUR", "UH_UH")));
		this.hashmapWordsToClick.put(MiddleWord.LIKE, new ArrayList<String>(Arrays.asList("YOURE", "NEXT", "U", "UR", "HOLD", "DONE", "UH_UH", "WHAT_INTERROGATIONMARK", "UH_HUH", "YOU", "LIKE", "SURE", "YOU_ARE", "YOUR")));
	}

	public MiddleWord getMiddleWordForSolving() {
		MiddleWord wordToReturn;
		switch (this.topWord) {
			case UR:
				wordToReturn = this.listMiddleWords.get(0);
				break;
			case YES: case NOTHING: case LED: case THEY_ARE:
				wordToReturn = this.listMiddleWords.get(1);
				break;
			case NONE: case REED: case LEED: case THEYRE:
				wordToReturn = this.listMiddleWords.get(2);
				break;
			case FIRST: case OKAY: case C:
				wordToReturn = this.listMiddleWords.get(3);
				break;
			case BLANK: case READ: case RED: case YOU: case YOUR: case YOURE: case THEIR:
				wordToReturn = this.listMiddleWords.get(4);
				break;
			default:
				wordToReturn = this.listMiddleWords.get(5);
				break;
		}
		return wordToReturn;
	}
	
	public String solveModule() {
		List<String> list = this.hashmapWordsToClick.get(this.getMiddleWordForSolving()); 
		for(int i = 0; i < this.listMiddleWords.size(); i++) {
			if(list.contains(this.listMiddleWords.get(i).toString())) {
				return list.get(list.indexOf(this.listMiddleWords.get(i).toString()));
			}
		}
		return null;
	}

}

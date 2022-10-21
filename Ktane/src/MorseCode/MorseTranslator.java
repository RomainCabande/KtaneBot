package MorseCode;


import java.util.HashMap;

public class MorseTranslator {

    private HashMap<String, Character> alphabet = new HashMap<>();

    public MorseTranslator() {
        //alphabet.put("/", ' ');
        alphabet.put("./", 'a');
        alphabet.put("/...", 'b');
        alphabet.put("/./.", 'c');
        alphabet.put("/..", 'd');
        alphabet.put(".", 'e');
        alphabet.put("..-.", 'f');
        alphabet.put("//.", 'g');
        alphabet.put("....", 'h');
        alphabet.put("..", 'i');
        alphabet.put(".///", 'j');
        alphabet.put("/./", 'k');
        alphabet.put("./..", 'l');
        alphabet.put("//", 'm');
        alphabet.put("/.", 'n');
        alphabet.put("///", 'o');
        alphabet.put(".//.", 'p');
        alphabet.put("//./", 'q');
        alphabet.put("./.", 'r');
        alphabet.put("...", 's');
        alphabet.put("/", 't');
        alphabet.put("../", 'u');
        alphabet.put(".../", 'v');
        alphabet.put(".//", 'w');
        alphabet.put("/../", 'x');
        alphabet.put("/.//", 'y');
        alphabet.put("//..", 'z');
    }

    
    public String translateToChar(String morseLetter) {
        String translatedSentence = "";
        translatedSentence += alphabet.get(morseLetter);
        return translatedSentence;
    }
}

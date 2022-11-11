package GUIModulesFeatures;

public class Main {

	public static void main(String[] args) {
		
		BombInfo bombInfo = new BombInfo("EYI42ZY7", 2, 2, 2, 2);
		System.out.println(bombInfo.isSerialNumberContainsVowel());
		BombInfo bombInfo2 = new BombInfo("BBBBB315HGGFFD7", 2, 2, 2, 2);
		System.out.println(bombInfo2.isSerialNumberContainsVowel());
	}

}

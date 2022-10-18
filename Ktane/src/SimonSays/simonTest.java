package SimonSays;

import GUIModulesFeatures.BombInfo;

public class simonTest {

	public static void main(String[] args) {
		SimonSays simon = new SimonSays("RBGY", new BombInfo("HORIH8", 2, 2, 2, 2));
		System.out.println(simon.solveModule());
		SimonSays simon2 = new SimonSays("RBGY", new BombInfo("H", 2, 2, 2, 2));
		System.out.println(simon2.solveModule());
	}

}

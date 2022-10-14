package Button;

import GUIModulesFeatures.BombInfo;

public class MainButton {

	public static void main(String[] args) {
		Button button = new Button(ButtonColor.BLUE, ButtonText.DETONATE, new BombInfo("3232G87R", 2, 2, 2, 2));
		System.out.println(button.toString());
		button.solveModule();
	}

}

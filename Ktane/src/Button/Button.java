package Button;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GUIModulesFeatures.BombInfo;

public class Button {
	
	private ButtonColor buttonColor;
	private ButtonText buttonText;
	private BombInfo bombInfo;
	
	public Button(ButtonColor buttonColor, ButtonText buttonText, BombInfo bombInfo) {
		this.buttonColor = buttonColor;
		this.buttonText = buttonText;
		this.bombInfo = bombInfo;
	}
	
	public String toString() {
		return "[" + this.buttonColor + ", " + this.buttonText + "]";
	}
	
	public String solveModule() {
		String string = "";
		JFrame frame = new JFrame("");
		if (this.bombInfo.getBatteriesNumber() > 2) {
			int result = JOptionPane.showConfirmDialog(frame,"Avez-vous un lit indicator FRK ?", "Confirm answer",
		                 JOptionPane.YES_NO_OPTION,
		                 JOptionPane.QUESTION_MESSAGE);
			if(result == JOptionPane.YES_OPTION) {
				string = "Appuyez puis relâchez immédiatement le bouton";
			} else {
				StripColorGUI stripGUI = new StripColorGUI(this);
				stripGUI.frame.setVisible(true);
			}
		} else if(this.bombInfo.getBatteriesNumber() > 1 && this.buttonText == ButtonText.DETONATE) {
			string = "Appuyez puis relâchez immédiatement le bouton";
		} else {
			StripColorGUI stripGUI = new StripColorGUI(this);
			stripGUI.frame.setVisible(true);
		}
		return string;
	}
	
	public String releasingHeldButton(StripColor stripColor) {
		String string = "Relâchez quand le compteur affiche un ";
		if(stripColor == StripColor.BLUE) {
			string += "4";
		} else if (stripColor == StripColor.YELLOW) {
			string += "5";
		} else {
			string += "1";
		}
		return string;
	}
}

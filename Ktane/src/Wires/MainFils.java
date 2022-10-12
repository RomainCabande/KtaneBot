package Wires;

import GUIModulesFeatures.BombInfo;

public class MainFils {
	
	private BombInfo bombInfo;
	private String wiresSequence;
	private Fils wires;

	public MainFils(BombInfo bombInfo, String wiresSequence) {
		this.wires = new Fils(bombInfo);
		this.bombInfo = bombInfo;
		this.wiresSequence= wiresSequence;
	}
	
	public String cutWire() {
		wires.addStringToFil(wiresSequence);
		return "Couper le " + wires.wireToCut(bombInfo) + "e fil";
	}

}
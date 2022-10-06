package GUIModulesFeatures;

public class BombInfo {
	private String serialNumber;
	private int nbAABattery;
	private int nbDBattery;
	private int nbLitIndicator;
	private int nbUnlitIndicator;
	
	public BombInfo(String serialNumber, int nbAABattery, int nbDBattery, int nbLitIndicators, int nbUnlitIndicators) {
		this.serialNumber = serialNumber;
		this.nbAABattery = nbAABattery;
		this.nbDBattery = nbDBattery;
		this.nbLitIndicator = nbLitIndicators;
		this.nbUnlitIndicator = nbUnlitIndicators;
	}
	
	public boolean isLastDigitOfSerialNumberEven() {
		return(this.serialNumber.charAt(4) % 2 == 0);
	}
	
	public boolean isLastDigitOfSerialNumberOdd() {
		return(this.serialNumber.charAt(4) % 2 != 0);
	}
	
	//A refaire car le 5e est maybe pas tjr le dernier chiffre du serial number
	public int getLastDigitSerialNumber() {
		return this.serialNumber.charAt(4);
	}
	
	public String toString() {
		return "[" + this.serialNumber + ", AA Batteries : " + this.nbAABattery + ", D Batteries : " + this.nbDBattery + ", Lit Indicators : " + this.nbLitIndicator + ", Unlit Indicators : " + this.nbUnlitIndicator + "]"; 
	}
}
	
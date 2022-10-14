package GUIModulesFeatures;

import java.util.Arrays;
import java.util.List;

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
		return(this.getLastDigitSerialNumber() % 2 == 0);
	}
	
	public boolean isLastDigitOfSerialNumberOdd() {
		return(this.getLastDigitSerialNumber() % 2 != 0);
	}
	
	public int getLastDigitSerialNumber() {
		String stringNoNumbers = "";
		stringNoNumbers = this.serialNumber.replaceAll("[^0-9]+", " ");
		List<String> list = Arrays.asList(stringNoNumbers.trim().split(""));
		return Integer.parseInt(list.get(list.size()-1));
	}
	
	public int getAABatteries() {
		return this.nbAABattery;
	}
	
	public int getDBatteries() {
		return this.nbDBattery;
	}
	
	public int getLitIndicators() {
		return this.nbLitIndicator;
	}
	
	public int getUnliIndicators() {
		return this.nbUnlitIndicator;
	}
	
	public int getBatteriesNumber() {
		return this.nbAABattery + this.nbDBattery;
	}
	
	public String toString() {
		return "[" + this.serialNumber + ", AA Batteries : " + this.nbAABattery + ", D Batteries : " + this.nbDBattery + ", Lit Indicators : " + this.nbLitIndicator + ", Unlit Indicators : " + this.nbUnlitIndicator + "]"; 
	}
}
	
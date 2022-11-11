package ComplicatedWires;

import GUIModulesFeatures.BombInfo;


public class ComplicatedWires {
	private BombInfo bombInfo;
	private Boolean led;
	private Boolean star;
	private Colors color;
	

	
	public ComplicatedWires(BombInfo bombInfo) {
		this.bombInfo = bombInfo;
	}
	
	public Boolean checkBlue(Boolean led, Boolean star) {
		boolean ret = false;
		if(led == true && bombInfo.doesParallelPort() == true || led == false && star == false && bombInfo.isLastDigitOfSerialNumberEven()) {
			ret = true;
		}
		return ret;
	}
	
	public Boolean checkRed(Boolean led, Boolean star) {
		boolean ret = false;
		if(led == true && bombInfo.getBatteriesNumber() >= 2 || led == false && (star == true || (star == false && bombInfo.isLastDigitOfSerialNumberEven()))){
			ret = true;
		}
		return ret;
	}
	
	public Boolean checkRedAndBlue(Boolean led, Boolean star) {
		boolean ret = false;
		if(led == true && bombInfo.isLastDigitOfSerialNumberEven() || led == false && ((star == true && bombInfo.doesParallelPort()) || (star == false && bombInfo.isLastDigitOfSerialNumberEven()))) {
			ret = true;
		}
		return ret;
	}
	
	public Boolean checkWhite(Boolean led, Boolean star) {
		boolean ret = false;
		if(led == true && star == true && bombInfo.getBatteriesNumber() >= 2 || led == false) {
			ret = true;
		}
		return ret;
	}
	
	public void setInfos(Colors color, Boolean led, Boolean star) {
		this.color = color;
		this.led = led;
		this.star = star;
	}
	
	public Boolean chekAll() {
		Boolean ret = false;
		if(this.color.equals(Colors.RED) || this.color.equals(Colors.RED_WHITE))ret = checkRed(this.led, this.star);
		if(this.color.equals(Colors.BLUE) || this.color.equals(Colors.BLUE_WHITE))ret = checkBlue(this.led, this.star);
		if(this.color.equals(Colors.RED_BLUE))ret = checkRedAndBlue(this.led, this.star);
		if(this.color.equals(Colors.WHITE))ret = checkWhite(this.led, this.star);
		return ret;
	}
}

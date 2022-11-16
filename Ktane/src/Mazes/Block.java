package Mazes;

public class Block {

	private Boolean northBlock;
	private Boolean eastBlock;
	private Boolean southBlock;
	private Boolean westBlock;

	public Block(Boolean northBlock, Boolean eastBlock, Boolean southBlock, Boolean westBlock) {
		this.northBlock = northBlock;
		this.eastBlock = eastBlock;
		this.southBlock = southBlock;
		this.westBlock = westBlock;
	}

	/**
	 * @return the northBlock
	 */
	public Boolean getNorthBlock() {
		return northBlock;
	}

	/**
	 * @return the eastBlock
	 */
	public Boolean getEastBlock() {
		return eastBlock;
	}

	/**
	 * @return the southBlock
	 */
	public Boolean getSouthBlock() {
		return southBlock;
	}

	/**
	 * @return the westBlock
	 */
	public Boolean getWestBlock() {
		return westBlock;
	}
	
	

}

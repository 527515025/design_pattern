package com.abstractFactory.human;

/**
 * 创造人的工厂
 * 
 * @author yangyibo
 *
 */
public interface HumanFatory {
	/**
	 * 制造黄种人
	 * @return
	 */
	public Human createYellowHuman();

	/**
	 * 制造黑种人
	 * @return
	 */
	public Human createBlackHuman();
	
	/**
	 * 制造白种人
	 * @return
	 */
	public Human createWhiteHuman();
}

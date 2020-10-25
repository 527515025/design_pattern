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
	 Human createYellowHuman();

	/**
	 * 制造黑种人
	 * @return
	 */
	 Human createBlackHuman();
	
	/**
	 * 制造白种人
	 * @return
	 */
	 Human createWhiteHuman();
}

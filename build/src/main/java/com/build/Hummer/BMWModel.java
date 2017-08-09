package com.build.Hummer;

/**
 * 
 * @author yangyibo
 *
 */
public class BMWModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("宝马车跑起来咯。。。");
	}

	@Override
	protected void stop() {
		System.out.println("宝马车要停车了，但是没有车位怎么办？");
	}

	@Override
	protected void alarm() {
		System.out.println("宝马车的喇叭声音是这样的啊？");
	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马车引擎声音真霸气。");
		
	}

}

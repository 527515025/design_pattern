package com.build.Hummer;

import java.util.ArrayList;

/**
 * 
 * @author yangyibo
 *
 */
public abstract class CarModel {
	/**
	 * 模型拼装的顺序
 	 */
	private ArrayList<String> sequence = new ArrayList<String>();

	/**
	 * 是模型首先得能启动啊
	 */
	protected abstract void start();

	/**
	 * 能跑还不算，还能停才是真本事
	 */
	protected abstract void stop();

	/**
	 * 喇叭也是要能响的
	 */
	protected abstract void alarm();

	/**
	 * 虽然是假车，没有引擎，但是引擎的声音还是要模仿一下
	 */
	protected abstract void engineBoom();

	/**
	 * 模版方法实现对基本方法的调度 好了车得能跑，不管你是推着跑还是装电池
	 */
	final public void run() {
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("start")) {
				this.start(); //
			} else if (actionName.equalsIgnoreCase("stop")) {
				this.stop(); //
			} else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm(); //
			} else if (actionName.equalsIgnoreCase("engine boom")) {
				this.engineBoom();
			}
		}

	}

	final public void setSequence(ArrayList<String> sequence) {
		this.sequence = sequence;
	}
}

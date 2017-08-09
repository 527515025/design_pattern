package com.template.Hummer;

/**
 * 悍马车的模型
 * 
 * @author yangyibo
 *
 */
public abstract class HummerModel {

	/**
	 * 基本方法由子类实现 是模型首先得能启动啊
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
	 public void run() {

		this.start();
		this.engineBoom();
		if (this.isAlarm()) {
			this.alarm();
		}
		this.stop();
	}

	//钩子方法默认喇叭事会响的 喇叭要不要响由客户控制
	protected boolean isAlarm() {
		return true;
	}
}

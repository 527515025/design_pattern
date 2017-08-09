package com.template.Hummer;

/**
 * 悍马H1 模型
 * 
 * @author yangyibo
 *
 */
public class HummerH1Model extends HummerModel {
	private boolean alarmFlag = true; // 喇叭能不能响


	@Override
	protected void start() {
		System.out.println("悍马H1启动了。。。。");
	}

	@Override
	protected void stop() {
		System.out.println("悍马H1停车。。。。");
	}

	@Override
	protected void alarm() {
		System.out.println("悍马H1鸣喇叭。。。。");
	}

	@Override
	protected void engineBoom() {
		System.out.println("悍马H1引擎发出来轰隆隆的声音。。。。");
	}

	@Override
	protected boolean isAlarm() {
		return this.alarmFlag;
	}

	public void setAlarm(boolean alarmFlag) {
		this.alarmFlag = alarmFlag;
	}


}

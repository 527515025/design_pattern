package com.template.Hummer;

/**
 * 悍马H2模型
 * @author yangyibo
 *
 */
public class HummerH2Model extends HummerModel{

	@Override
	public void start() {
		System.out.println("悍马H2启动了。。。。");
	}

	@Override
	public void stop() {
		System.out.println("悍马H2停车。。。。");
	}

	@Override
	public void alarm() {
		System.out.println("悍马H2鸣喇叭。。。。");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H2引擎发出来轰隆隆的声音。。。。");
	}
	
//	@Override
	protected boolean isAlarm() {
		return false;
	}
	
}

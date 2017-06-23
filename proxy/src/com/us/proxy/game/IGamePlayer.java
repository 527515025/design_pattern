package com.us.proxy.game;

public interface IGamePlayer {
	/**
	 * 登录游戏
	 * 
	 * @param user
	 * @param password
	 */
	public void login(String user, String password); //

	/**
	 * 杀老怪
	 */
	public void killBoss();

	/**
	 * 升级
	 */
	public void upgrade();

}

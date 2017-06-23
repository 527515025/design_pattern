package com.us.proxy.client;

import com.us.proxy.game.GamePlayer;
import com.us.proxy.game.GamePlayerProxy;
import com.us.proxy.game.IGamePlayer;

public class Client2 {
	public static void main(String[] args) {
		// 定义一个痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		// 然后再定义一个代练者  //普通代理，需要知道代理的存在
		IGamePlayer proxy = new GamePlayerProxy(player);
		// 开始打游戏，记下时间戳
		System.out.println("开始时间是：20016-9-25 10:45");
		proxy.login("zhangSan", "password");
		// 开始杀怪
		proxy.killBoss();
		// 升级
		proxy.upgrade();
		// 记录结束游戏时间
		System.out.println("结束时间是：2009-8-26 03:40");
	}
}
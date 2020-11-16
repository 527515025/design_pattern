package com.delayfactory;

import java.util.HashMap;
import java.util.Map;

import com.factory.human.BlackHuman;
import com.factory.human.Human;
import com.factory.human.WhiteHuman;
import com.factory.human.YellowHuman;

/**
 * 实现延迟加载
 * @author yangyibo
 *扩展后可以限制某个实例的个数可应用于数据库连接
 */
public class DelayHumanFactory {
	private static final Map<String, Human> prMap = new HashMap<String, Human>();

	public static synchronized Human createHuman(String type) {
		Human human = null;
		if (prMap.containsKey(type)) {
			human = prMap.get(type);
		} else {
			if(type.equals("yellowHuman"))
			{
				human=new YellowHuman();
			}else if(type.equals("blackHuman"))
			{
				human=new BlackHuman();
			}else
			{
				human=new WhiteHuman();
			}
			prMap.put(type, human);
		}
		return human;

	}
}

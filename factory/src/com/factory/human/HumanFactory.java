package com.factory.human;

/**
 * 创建人类工厂，进行创建人类
 * 
 * @author yangyibo
 *
 */
public class HumanFactory extends AbstractHumanFactory {

	/**
	 * 生产一个人类
	 */
	@SuppressWarnings({ "unchecked" })
	@Override
	public <T extends Human> T creatHuman(Class<T> T) {
		// 定义一个人钟
		Human human = null;
		try {
			// 生产一个人种
			human = (T) Class.forName(T.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("生产人种失败");
			e.printStackTrace();
		}
		return (T) human;
	}

}

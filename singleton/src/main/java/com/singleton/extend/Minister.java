package com.singleton.extend;

/**
 * 
 * @author yangyibo
 *
 */
public class Minister {
		
		public static void main(String[] args) {
			//定义大臣数量
			int ministerNum=5;
			for(int i=0;i<ministerNum;i++)
			{
				Emperor emperor=Emperor.getInstance();
				System.out.println("第"+i+"个大臣参拜的是");
				emperor.say();
			}
		}

}

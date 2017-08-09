package com.singleton.demo;

/**
 * 臣子类，用来拜访皇帝类
 * @author yangyibo
 *
 */
public class Minister {
	
	public static void main(String[] args) {
		for(int day=0;day<3;day++)
		{
			Emperor emperor=Emperor.getInstance();
			emperor.say();
		}
	}

}

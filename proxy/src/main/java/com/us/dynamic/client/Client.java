package com.us.dynamic.client;

import com.us.dynamic.proxy.PursuitProxy;

public class Client {
	public static void main(String[] args) {
		
		String mm="美女小晓";
		PursuitProxy daili=new PursuitProxy("小冤",mm);
		daili.GiveDolls();
		daili.GiveFlowers();
		daili.GiveChocolate();
	}
}
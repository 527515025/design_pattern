package com.us.dynamic.proxy;

public class PursuitProxy implements IPursuit {
	
	private Pursuit pursuit;
	
	public PursuitProxy(String name,String mm) {
		this.pursuit=new Pursuit(name,mm);
	}

	@Override
	public void GiveDolls() {
		pursuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		pursuit.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		pursuit.GiveChocolate();
	}

}

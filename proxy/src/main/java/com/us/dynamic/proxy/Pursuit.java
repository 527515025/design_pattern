package com.us.dynamic.proxy;

public class Pursuit implements IPursuit {
	private String mm;
	private String name;
	public Pursuit(String name,String mm) {
		this.name=name;
		this.mm=mm;
	}
	@Override
	public void GiveDolls() {
		System.out.println(name+"送洋娃娃给"+this.mm);
	}

	@Override
	public void GiveFlowers() {
		System.out.println(name+"送鲜花给"+this.mm);

	}

	@Override
	public void GiveChocolate() {
		System.out.println(name+"送巧克力给"+this.mm);
	}

}

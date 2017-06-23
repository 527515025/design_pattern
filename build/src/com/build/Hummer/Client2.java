package com.build.Hummer;

import java.util.ArrayList;

/**
 * 
 * @author yangyibo
 *
 */
public class Client2 {
	public static void main(String[] args)  {
		BenzModel benz=new BenzModel();
		ArrayList<String> sequence=new ArrayList<>();
		sequence.add("engine boom");
		sequence.add("start"); 
		sequence.add("stop"); 
		benz.setSequence(sequence );
		benz.run();
	}
}
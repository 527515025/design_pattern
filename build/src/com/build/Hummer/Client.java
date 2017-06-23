package com.build.Hummer;

import java.util.ArrayList;

import com.build.Buildr.BMWBuilder;
import com.build.Buildr.BenzBuilder;

/**
 * 
 * @author yangyibo
 *
 */
public class Client {
	public static void main(String[] args) {
		ArrayList<String> sequence = new ArrayList<String>();
		sequence.add("engine boom"); 
		sequence.add("start"); 
		sequence.add("stop"); 
		BenzBuilder benzBuilder = new BenzBuilder(); 
														
		benzBuilder.setSequence(sequence);
		BenzModel benz = (BenzModel) benzBuilder.getCarModel(); 
		benz.run();
		BMWBuilder bmwBuilder = new BMWBuilder();
		bmwBuilder.setSequence(sequence);
		BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
		bmw.run();
	}
}
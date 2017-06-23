package com.build.Buildr;

import java.util.ArrayList;

import com.build.Hummer.BenzModel;
import com.build.Hummer.CarModel;

/**
 * 奔驰车模型
 * @author yangyibo
 *
 */
public class BenzBuilder extends CarBuildr {
	private BenzModel benz = new BenzModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}

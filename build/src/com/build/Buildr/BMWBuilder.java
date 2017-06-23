package com.build.Buildr;

import java.util.ArrayList;

import com.build.Hummer.BMWModel;
import com.build.Hummer.CarModel;

/**
 * 奔驰车模型
 * @author yangyibo
 *
 */
public class BMWBuilder extends CarBuildr {
	private BMWModel BWM = new BMWModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.BWM.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.BWM;
	}

}

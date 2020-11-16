package com.build.domain.builder;

import java.util.ArrayList;

import com.build.domain.model.BmwModel;
import com.build.domain.model.CarModel;

/**
 * 宝马车组装着
 * @author yangyibo
 *
 */
public class BMWBuilder extends CarBuildr {
	private BmwModel BWM = new BmwModel();

	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.BWM.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.BWM;
	}

}

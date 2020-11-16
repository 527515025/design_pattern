package com.build.domain.builder;

import java.util.ArrayList;

import com.build.domain.model.BenzModel;
import com.build.domain.model.CarModel;

/**
 * 奔驰车组装者
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

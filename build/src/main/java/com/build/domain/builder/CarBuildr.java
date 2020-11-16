package com.build.domain.builder;

import java.util.ArrayList;

import com.build.domain.model.CarModel;

/**
 * 汽车组装类
 */
public abstract class CarBuildr {

	/**
	 * 建造一个模型给一个建造顺序
	 * 
	 * @param sequence
	 */
	public abstract void setSequence(ArrayList<String> sequence);

	/**
	 * 得到一个模型
	 * @return
	 */
	public abstract CarModel getCarModel();
}

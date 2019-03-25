package com.sxt.dto;

import com.sxt.pojo.BasicData;

public class BasicDataDto extends BasePage {
	private BasicData basic;

	public BasicData getBasic() {
		return basic;
	}
	public void setBasic(BasicData basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "BasicDataDto [basic=" + basic + "]";
	}
}

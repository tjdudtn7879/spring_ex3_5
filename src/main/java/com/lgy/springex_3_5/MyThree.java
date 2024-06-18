package com.lgy.springex_3_5;

public class MyThree {
	int num;
	Three three;
	
	public void pc() {
		three.process(num);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Three getThree() {
		return three;
	}
	public void setThree(Three three) {
		this.three = three;
	}
	
	
}

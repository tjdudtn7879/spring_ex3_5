package com.lgy.springex_3_5;

public class Three {
	public void process(int num) {
		if (num%3==0) {
			System.out.println("입력된 수 : "+num+"은 3의 배수입니다.");
		} else {
			System.out.println("입력된 수 : "+num+"은 3의 배수가 아닙니다.");			
		}
	}
}

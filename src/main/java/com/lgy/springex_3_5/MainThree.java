package com.lgy.springex_3_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainThree {
	public static void main(String[] args) {
		String configLoc="classpath:threeCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyThree myThree = ctx.getBean("myThree",MyThree.class);
		
		myThree.pc();
	}
}

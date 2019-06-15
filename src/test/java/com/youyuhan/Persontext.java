package com.youyuhan;

import java.util.Date;
import java.util.Random;

import org.junit.Test;

import com.entity.Person;

public class Persontext {
	
	@Test
	public void testadd() {
		
		for(int i =0;i<=10000;i++) {
			Person person = new Person(Hanziutil.zfc1(), Lianxi.getran(0, 100), Hanziutil.zfc(5), new Date());
	System.out.println(person);
		}
		
	}

}

package com.youyuhan;


import java.util.Set;

import org.junit.Test;

public class LianxiTest {

	@Test
	public void testGetran() {
		
	for(int i=0;i<=10;i++) {
		System.out.println( Lianxi.getran(2, 5));
	}
}
	@Test
	public void testGetran1() {
		for(int i =1;i<10;i++) {
			Set set = Lianxi.getran1(1, 10, 5);
			System.out.println(set);
			}
	}
	@Test
	public void testGetran2() {
		for(int i =1;i<10;i++) {
			String getr = Lianxi.getran2();
			System.out.println(getr);
			}
	}
	@Test
	public void testGetran3() {
		for(int i =1;i<10;i++) {
			String getr = Lianxi.getran3(4);
			System.out.println(getr);
			}
	}


	
}

package com.youyuhan;

import static org.junit.Assert.*;

import org.junit.Test;

public class HanziutilTest {

	@Test
	public void testZfc() {
		String zfc = Hanziutil.zfc(2);
		System.out.println(zfc);
	}
	
	@Test
	public void testZfc1() {
		 String zfc1 = Hanziutil.zfc1();
		System.out.println(zfc1);
	}

}

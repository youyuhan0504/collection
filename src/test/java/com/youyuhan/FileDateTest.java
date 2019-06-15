package com.youyuhan;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileDateTest {

	@Test
	public void testGetExtendName() {
		System.out.println(FileDate.getExtendName("aa.doc"));
	}

	@Test
	public void testGetTempDirectory() {
		FileDate.getTempDirectory();
	}

	@Test
	public void testGetUserDirectory() {
		FileDate.getUserDirectory();
	}

}

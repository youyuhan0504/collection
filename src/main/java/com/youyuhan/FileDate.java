package com.youyuhan;

import java.io.File;

public class FileDate {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		return fileName.substring(fileName.lastIndexOf("."));
	  
}
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
		String pr = System.getProperty("java.io.tmpdir");
		System.out.println(pr);
		return new File(pr);
		
	}
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
		String fa = System.getProperty("user.home");
		System.out.println(fa);
		return new File(fa);
		
	}

}

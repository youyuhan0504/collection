package com.youyuhan;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lianxi {
	
	//①获取最小最大区间的随机数；
	public static Integer getran(Integer min,Integer max) {
		Random a=new Random();
		// int i=a.nextInt(max);
		return a.nextInt(max-min+1)+min;
	}
	
	//②获取最 小最大区间多个不重复随机数；
	public static Set getran1(Integer min,Integer max,Integer num) {
		Set<Integer> set=new HashSet<Integer>();
		while(set.size()!=num) {
			Random a=new Random();
			set.add(a.nextInt(max-min+1)+min);
		}
		return set;
	}
	
	//③获取 1 个 1-9,a-Z 之间的随机字符；
	public static String getran2() {
		String str="123456789asdfghjklqwertyuiopmnbvcxz";
		Integer getran = getran(1, str.length()-1);
		return str.charAt(getran)+"";
		
		
	}
	
	//④	返回参数指定个数的随机字符串(应用场景如：验证码)
	public static String getran3(int i) {
		String str="123456789asdfghjklqwertyuiopmnbvcxz";
		String dest="";
		for(int j=0;j<i;j++) {
			Integer index = getran(0, str.length()-1);
			dest+=str.charAt(index);
		}
		return dest;
		
		
	}
}

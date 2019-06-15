package com.youyuhan;

import java.util.Calendar;
import java.util.Date;

public class LxDate {
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//初始Calendar 的对象
				Calendar c = Calendar.getInstance();
				//用传入的日期出实例化日历类.
				c.setTime(src);
				//设置日期
				c.set(Calendar.DAY_OF_MONTH, 1);
				//设置小时
				c.set(Calendar.HOUR_OF_DAY,0);
				//设置分钟
				c.set(Calendar.MINUTE,0);
				//设置妙
				c.set(Calendar.SECOND, 0);
		return c.getTime();
		
	}
	
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src) {
		Calendar c=Calendar.getInstance();
		c.setTime(src);
		//让月份加一
		c.add(Calendar.MONTH, 1);
		c.set(Calendar.DAY_OF_MONTH,1);
		c.set(Calendar.HOUR_OF_DAY,0);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
		
	}
	
	//返回  当前的日期 -  传入的月份    的    日期
	
		public static Date getDateByMonthDiff(Integer month){
			Calendar ca=Calendar.getInstance();
			ca.add(Calendar.MONTH, -month);
			return ca.getTime();
			
		}
}

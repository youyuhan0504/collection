package com.youyuhan;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class LxDateTest {

	/**
	 * 拼接下面根据时间范围查询订单的SQL： String sql = "select * from t_order where
	 * create_time>='{1}' and create_time<='{2}' ";
	 * 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	 * 将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。
	 */
	
	@Test
	public void testDate() {
		//月初
		Date date = LxDate.getDateByInitMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//月末
		Date date2 = LxDate.getDateByFullMonth(new Date());
		
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		
		String string = sql.replace("{1}",df.format(date)).replace("{2}",  df.format(date2));
		System.out.println(string);
	}


	@Test
	public void testGetDateByInitMonth() {
		Date da = LxDate.getDateByInitMonth(new Date());
		SimpleDateFormat ss=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = ss.format(da);
		System.out.println(s);
	}

	@Test
	public void testGetDateByFullMonth() {
		Date date = LxDate.getDateByFullMonth(new Date());
		SimpleDateFormat sa=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sa.format(date);
		System.out.println(format);
	}

	@Test
	public void testGetDateByMonthDiff() {
		Integer month=3;
		Date mo = LxDate.getDateByMonthDiff(month);
		SimpleDateFormat sa=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sa.format(mo);
		System.out.println(format);
	}

}

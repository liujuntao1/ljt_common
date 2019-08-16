package com.bobo.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.ljt.common.utils.DateUtil;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() throws ParseException {
		
		String str ="2017-12-12 12:12:12";
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = DateUtil.getDateByInitMonth(new Date());
		System.out.println(df.format(date));
		
	}

	@Test
	public void testGetDateByFullMonth() throws ParseException {
		
	String str ="2000-02-12 12:12:12";
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date date = DateUtil.getDateByFullMonth(df.parse(str));
		System.out.println(df.format(date));
	}

}

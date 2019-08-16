package com.bobo.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.ljt.common.utils.FileUtil;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		
		
		String file ="aaaa";
		
		String string = FileUtil.getExtendName(file);
		System.out.println(string);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}

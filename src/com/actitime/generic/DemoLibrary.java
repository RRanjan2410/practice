package com.actitime.generic;

import java.io.IOException;

public class DemoLibrary {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		String url=f.getPropertyData("url");
		System.out.println(url);
		f.setExcelData("Sheet1", 1, 11, "skipped");
		System.out.println(f.getExcelData("Sheet1", 1, 11));
	}

}

package com.biz.dbms.config;

public class Lines {
	public static String dLine = "";
	public static String sLine = "";
	
	static {
		String line = String.format("%010d", 0);
		dLine = line.replace("0", "=");
		sLine = line.replace("0", "-");
	}
}

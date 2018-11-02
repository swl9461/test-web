package com.syaccp.easybuy.exception;

import java.io.StringWriter;

public class TestMain {

	public static void main(String[] args) {
		
		
		StringWriter writer  =new StringWriter();
		writer.write("aa");
		writer.write("bb");
		writer.write("cc");
		writer.write("dd");
		String value = writer.toString();
		System.out.println(value);
		
		
		

	}

}

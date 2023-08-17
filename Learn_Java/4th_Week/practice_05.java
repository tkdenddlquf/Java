package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

public class test
{
	public static void main(String[] args) throws Exception
  {
		FileInputStream fis = new FileInputStream("c:\\Temp\\data.txt");
		int ch;
		
		while ( (ch = fis.read()) != -1  )
		{
			System.out.print( (char)ch );
		}
		
		fis.close();
	}
}

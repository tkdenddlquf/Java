package com.practice;

import java.io.FileInputStream;
import java.io.IOException;

public class test
{
	public static void main(String[] args) throws Exception
  {
		FileInputStream fis = new FileInputStream("c:\\Temp\\data.txt");
		
		int ch;
		byte[] bt = new byte[100];
		int i=0;
		
		while ( (ch = fis.read()) != -1  )
		{
			bt[i] =  (byte)ch;
			i++;
		}
    
		System.out.println(new String(bt));
		fis.close();
	}
}

package com.practice;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class test
{
	public static void main(String[] args) throws Exception
  {
		FileReader fReader = new FileReader("c:\\Temp\\data.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		String str = "";

		while ( (str=bReader.readLine()) != null)
		{
			System.out.println(str);
		}

		fReader.close();
		bReader.close();
	}
}

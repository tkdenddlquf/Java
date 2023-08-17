package com.practice;

import java.io.FileWriter;
import java.util.Scanner;

public class test
{
	public static void main(String[] args) throws Exception
  {
		Scanner in = new Scanner(System.in);
		FileWriter fw = new FileWriter("c:\\Temp\\data1.txt");
		String str;
		
		while( (str = in.nextLine()).equals("") == false )
		{
			fw.write(str + "\r\n");
		}

		fw.close();
	}
}

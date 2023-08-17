package com.practice;

import java.io.File;
import java.util.Scanner;

public class test
{
	public static void main(String[] args) throws Exception
{
		Scanner in = new Scanner(new File("c:\\Temp\\data.txt"));
		int sum=0;
		
		while(in.hasNext())
		{
			sum += in.nextInt();
		}

		System.out.println("합=" + sum);
		in.close();
	}
}

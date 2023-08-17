package com.test;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		for (int j = 1; j <= 9; j++)
		{
			for (int i = 2; i <= 9; i++)
			{
					System.out.printf("%d * %d = %2d  ", i, j, j * i);
			}
			System.out.printf("\n");
		}
		
		in.close();
	}
}

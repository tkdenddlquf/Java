package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
  {
		Scanner in = new Scanner(System.in);
		
		System.out.print("월을 입력하세요..>>");
		int month = in.nextInt();

		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.printf("%d월은 31일입니다.", month);
			break;
		case 2:
			System.out.println("2월은 28일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%d월은 30일입니다.", month);
			break;
		}
	}
}

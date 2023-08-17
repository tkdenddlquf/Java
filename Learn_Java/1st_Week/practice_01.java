package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 

		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");
		System.out.println("1. 커피      100원");
		System.out.println("2. 우유      200원");
		System.out.println("3. 콜라      200원");
		System.out.println("=====================");
		System.out.println("돈을 입력하세요...");
		
		int money = in.nextInt();
		System.out.printf("입력한 돈은 %d 원 입니다.", money);
	}
}

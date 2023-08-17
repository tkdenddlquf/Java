package com.practice;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		
		int MENU_1_PRICE = 1500;
		int MENU_2_PRICE = 2000;
		int MENU_3_PRICE = 3000;
				
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");		
		System.out.println("돈을 입력하세요...");
		
		int money = in.nextInt();
		System.out.printf("입력한 돈은 %d 원 입니다.\n", money);
		
		if(money<MENU_1_PRICE)
		{
			System.out.println("돈이 부족합니다.\n");
		}
		else
		{
			System.out.println("=====================");		
			System.out.printf("1. 커피      %d원\n",MENU_1_PRICE);
			System.out.printf("2. 우유      %d원\n",MENU_2_PRICE);
			System.out.printf("3. 콜라      %d원\n",MENU_3_PRICE);
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요.\n");

			int menu = in.nextInt();
			if(menu==1)
			{
				if(money >= MENU_1_PRICE)
				{
					money -= MENU_1_PRICE; // money = money - 100
					System.out.printf("커피를 고르셨습니다..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
				else
				{
					System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
			}
			else if(menu==2)
			{
				if(money >= MENU_2_PRICE)
				{
					money -= MENU_2_PRICE; 
					System.out.printf("우유를 고르셨습니다..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
				else
				{
					System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
			}
			else if(menu==3)
			{
				if(money >= MENU_2_PRICE)
				{
					money -= MENU_3_PRICE; 
					System.out.printf("콜라를 고르셨습니다..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
				else
				{
					System.out.printf("어허 돈이 부족해서 그건 못 뽑는다네..\n");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
				}
			}
		}
	}
}

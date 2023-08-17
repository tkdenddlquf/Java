package com.test;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//int menu_1_Price = 100;
		//int menu_2_Price = 200;
		//int menu_3_Price = 200;
		
		String menu_1_Name = "커피";
		String menu_2_Name = "우유";
		String menu_3_Name = "콜라";
		
		//System.out.println("메뉴를 설정해주세요.\n 1. 이름 : ");
		//String menu_1_Name = in.nextLine();
		System.out.printf("%s의 가격을 설정해주세요.\n 1. 가격 : ", menu_1_Name);
		int menu_1_Price = in.nextInt();

		//System.out.println("메뉴를 설정해주세요.\n 2. 이름 : ");
		//String menu_2_Name = in.nextLine();
		System.out.printf("%s의 가격을 설정해주세요.\n 2. 가격 : " ,menu_2_Name);
		int menu_2_Price = in.nextInt();

		//System.out.println("메뉴를 설정해주세요.\n 3. 이름 : ");
		//String menu_3_Name = in.nextLine();
		System.out.printf("%s의 가격을 설정해주세요.\n 3. 가격 : ", menu_3_Name);
		int menu_3_Price = in.nextInt();
		
		int price = (menu_1_Price < menu_2_Price) ? 
					((menu_1_Price < menu_3_Price) ? menu_1_Price : menu_3_Price) : 
					((menu_2_Price < menu_3_Price) ? menu_2_Price : menu_3_Price);
				
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");
		System.out.println("돈을 입력하세요...");
		
		boolean moneyFlag = true;
		int money = 0;
		
		while(moneyFlag)
		{
			money = money + in.nextInt();
			System.out.printf("입력한 돈은 %d원 입니다.\n", money);
      
			if(money < price)
			{
				System.out.println("돈이 부족합니다.\n");
			}
      
			System.out.println("더 입력하시겠습니까? (Y or N)\n");
			char val = in.next().charAt(0);
			
			switch(val)
			{
			case 'N':
			case 'n':
				moneyFlag = false;
				break;
				
			case 'Y':
			case 'y':
				break;
			}
		}
				
		moneyFlag = true;
		boolean missMenu = false;
		
		while(moneyFlag)
		{
			if (money < price)
			{
				System.out.println("돈이 부족합니다.");
				System.out.printf("잔돈은 %d원 입니다.\n", money);
				break;
			}
			
			System.out.println("=====================");
			System.out.printf("1. %s     %d원\n", menu_1_Name, menu_1_Price);
			System.out.printf("2. %s     %d원\n", menu_2_Name, menu_2_Price);
			System.out.printf("3. %s     %d원\n", menu_3_Name, menu_3_Price);
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요.");
			
			int menu = in.nextInt();
			
			switch(menu)
			{
			case 1:
				if(money >= menu_1_Price)
				{
					money -= menu_1_Price;
					System.out.printf("%s를 고르셨습니다.\n", menu_1_Name);
				}
				else
				{
					System.out.println("돈이 부족합니다.");
				}
				break;
			
			case 2:
				if(money >= menu_2_Price)
				{
					money -= menu_2_Price;
					System.out.printf("%s를 고르셨습니다.\n", menu_2_Name);
				}
				else
				{
					System.out.println("돈이 부족합니다.");
				}
				break;
			
			case 3:
				if(money >= menu_3_Price)
				{
					money -= menu_3_Price;
					System.out.printf("%s를 고르셨습니다.\n", menu_3_Name);
				}
				else
				{
					System.out.println("돈이 부족합니다.");
				}
				break;
			
			default:
				System.out.println("메뉴를 잘 못 고르셨습니다.");
				missMenu = true;
				break;
			}
			
			if (missMenu)
			{
				System.out.printf("%d원이 남았습니다.\n", money);
				System.out.println("다시 고르시겠습니까? (Y or N)\n");
				char val = in.next().charAt(0);
				
				switch(val)
				{
				case 'N':
				case 'n':
					moneyFlag = false;
					break;
					
				case 'Y':
				case 'y':
					missMenu = false;
					break;
				}
			}
			else
			{
				if (money < price)
				{
					System.out.println("돈이 부족합니다.");
					System.out.printf("잔돈은 %d원 입니다.\n", money);
					break;
				}
				else
				{
					System.out.printf("%d원이 남았습니다.\n", money);
					System.out.println("더 고르시겠습니까? (Y or N)\n");
					char val = in.next().charAt(0);
					
					switch(val)
					{
					case 'N':
					case 'n':
						moneyFlag = false;
						break;
						
					case 'Y':
					case 'y':
						break;
					}
				}
			}
		}
		in.close();
	}
}

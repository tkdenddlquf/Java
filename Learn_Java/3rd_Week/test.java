package com.test;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		String[] menuName = {"커피", "우유", "콜라"};
		int[] menuPrice = {0, 0, 0};
		
		for (int i = 0; i < menuName.length; i++)
		{
			System.out.printf("%s의 가격을 설정해주세요.\n %d. 가격 : ", menuName[i], i + 1);
			menuPrice[i] = in.nextInt();
		}
		
		int price = (menuPrice[0] < menuPrice[1]) ? 
					((menuPrice[0] < menuPrice[2]) ? menuPrice[0] : menuPrice[2]) : 
					((menuPrice[1] < menuPrice[2]) ? menuPrice[1] : menuPrice[2]);
				
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
      
			for (int i = 0; i < menuName.length; i++)
			{
				System.out.printf("%d. %s     %d원\n", i + 1, menuName[i], menuPrice[i]);
			}
      
			System.out.printf("%d. 잔돈 반환\n", menuName.length + 1);
			System.out.println("=====================");
			System.out.println("메뉴를 선택해주세요.");
			
			int menu = in.nextInt();
			
			if (menu == menuName.length + 1)
			{
				System.out.printf("잔돈은 %d원 입니다.\n", money);
				break;
			}
			else if (menu < menuName.length + 1 && menu > 0)
			{
				if(money >= menuPrice[menu - 1])
				{
					money -= menuPrice[menu - 1];
					System.out.printf("%s를 고르셨습니다.\n", menuName[menu - 1]);
				}
				else
				{
					System.out.println("돈이 부족합니다.");
				}
			}
			else
			{
				System.out.println("메뉴를 잘 못 고르셨습니다.");
				System.out.println("메뉴를 다시 골라주세요.");
				missMenu = true;
			}
			
			if (!missMenu)
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
						System.out.printf("잔돈은 %d원 입니다.\n", money);
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

package com.practice;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		
    //int MENU_1_PRICE = 1500;
    //int MENU_2_PRICE = 2000;
    //int MENU_3_PRICE = 3000;
		
		int[] menu_price = {1000, 2000, 3000};
		String[] menu_title = {"아메리카노","카페라떼","콜라"};
		int i;
		
		System.out.println("=====================");
		System.out.println("      자판기");
		System.out.println("=====================");		
		
		boolean moneyflag = true;
		int money=0;
		
		while(moneyflag)
		{
			System.out.println("돈을 입력하세요...");
			money = money + in.nextInt();
			System.out.printf("입력한 돈은 %d 원 입니다.\n", money);
      
			if(money<MENU_1_PRICE)
			{
				System.out.println("돈이 부족합니다.\n");
				System.out.println("더 입력하시겠습니까? (Y or N)\n");
				char val = in.next().charAt(0);
        
				switch(val)
				{
				case 'N':
				case 'n':
					moneyflag = false;
					break;
            
				case 'Y':
				case 'y':
					break;
				}
			}
			else
			{
				moneyflag = false;
			}
		}
    
		boolean menuflag = true;
		
		while(menuflag)
		{
			if(money<MENU_1_PRICE)
			{
				System.out.println("돈이 부족합니다.\n");
				break;
				//menuflag = false;
			}
			else
			{
				System.out.println("=====================");
        
				for(i=0;i<menu_title.length;i++)
				{
					System.out.printf("%d %s   %d원\n",i+1, menu_title[i], menu_price[i]);
				}
        
				System.out.printf("%d. 잔돈반환  \n", i);
				System.out.println("=====================");

				int menu;
        
				do
				{
					System.out.println("메뉴를 선택해주세요.\n");
					menu = in.nextInt();
          
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
						if(money >= MENU_3_PRICE)
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
					else if(menu==0)
					{
						menuflag = false;
					}
					else
					{
						menu = -1;
						System.out.printf("메뉴를 잘 못 고르셨습니다.\n");
					}
					
					if(money>=MENU_1_PRICE)
					{
						System.out.println("더 구입하시겠습니까? (Y or N)\n");
						char val = in.next().charAt(0);
            
						switch(val)
						{
						case 'N':
						case 'n':
							menuflag = false;
							break;
                
						case 'Y':
						case 'y':
							break;
						}
					}
					else
					{
						menuflag = false;
					}
				}
          while(menu == -1);
			}
		}
		System.out.printf("잔돈은 %d원 입니다.\n", money);
		System.out.printf("안녕히 가세요.\n");
	}
}

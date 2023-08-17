package com.test;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class test
{
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		int numItems;	
		
		if(isExists)
		{
			Scanner fileIn = new Scanner(file);
			
			numItems = fileIn.nextInt();
			int[] menuNum = new int[numItems];
			String[] menuName = new String[numItems];
			int[] menuPrice = new int[numItems];

			for(int i = 0; i < numItems; i++)
			{
				menuNum[i] = fileIn.nextInt();
				menuName[i] = fileIn.next();
				menuPrice[i] = fileIn.nextInt();
			}
      
			fileIn.close();
			
			int price = 0;
			
			for (int i = 0; i < numItems; i++)
			{
				if (price > menuPrice[i])
				{
					price = menuPrice[i];
				}
			}
					
			System.out.println("돈을 입력하세요...");
			
			boolean moneyFlag = true;
			int money = 0;
			String newMenuName = "";
			int newMenuPrice = 0;
			
			while(moneyFlag)
			{
				money = money + in.nextInt();
        
				if (money == -999)
				{
					FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
					String out = "";
					out = "";
          
					while(true)
					{
						System.out.println("=====================");
						System.out.println("      자판기 편집");
						System.out.println("=====================");
            
						for (int i = 0; i < numItems; i++)
						{
							System.out.printf("%d. %s     %d원\n", menuNum[i], menuName[i], menuPrice[i]);
						}
            
						System.out.printf("%d. 메뉴 추가\n", numItems + 1);
						System.out.printf("%d. 편집 종료\n", numItems + 2);
						System.out.println("=====================");
						System.out.println("편집할 메뉴를 선택해주세요.");
						
						int menu = in.nextInt();
						
						if (menu < numItems + 1 && menu > 0)
						{
							System.out.printf("%d번째 메뉴의 이름과 가격을 입력해주세요.", menu);
							menuName[menu - 1] = in.next();
							menuPrice[menu - 1] = in.nextInt();
						}
						else if (menu == numItems + 1)
						{
							System.out.printf("%d번째 메뉴의 이름과 가격을 입력해주세요.", numItems + 1);
							newMenuName = in.next();
							newMenuPrice = in.nextInt();
							System.out.println("메뉴가 추가되었습니다.");
							break;
						}
						else
						{
							break;
						}
					}

					if (newMenuName != "")
					{
						out = String.format("%d\r\n", numItems + 1);
						fw.write(out);
					}
					else
					{
						out = String.format("%d\r\n", numItems);
						fw.write(out);
					}
					
					for (int i = 0; i < numItems; i++)
					{
						out = String.format("%d %s %d\r\n", i + 1, menuName[i], menuPrice[i] );
						fw.write(out);
					}
					
					if (newMenuName != "")
					{
						out = String.format("%d %s %d\r\n", numItems + 1, newMenuName, newMenuPrice);
						fw.write(out);
					}
					
					moneyFlag = false;
					fw.close();
					in.close();
				}
				else
				{
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
			}
			
			if (money != -999)
			{
				moneyFlag = true;
			}
			
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
				System.out.println("      자판기");
				System.out.println("=====================");
        
				for (int i = 0; i < numItems; i++)
				{
					System.out.printf("%d. %s     %d원\n", menuNum[i], menuName[i], menuPrice[i]);
				}
        
				System.out.printf("%d. 잔돈 반환\n", numItems + 1);
				System.out.println("=====================");
				System.out.println("메뉴를 선택해주세요.");
				
				int menu = in.nextInt();
				
				if (menu == menuName.length + 1)
				{
					System.out.printf("잔돈은 %d원 입니다.\n", money);
					break;
				}
				else if (menu < numItems + 1 && menu > 0)
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
		else
		{
			System.out.println("File Not Found");
			FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
			
			System.out.println("메뉴의 갯수를 입력해주세요.");
			numItems = in.nextInt();
			String out = String.format("%d\r\n", numItems);
			fw.write(out);
			
			String[] menuName = new String[numItems];
			int[] menuPrice = new int[numItems];

			out="";
      
			for (int i = 0; i < numItems; i++)
			{
				System.out.printf("%d번째 메뉴의 이름과 가격을 입력해주세요.", i + 1);
				menuName[i] = in.next();
				menuPrice[i] = in.nextInt();
				out = String.format("%d %s %d\r\n", i + 1, menuName[i], menuPrice[i] );
				fw.write(out);
			}
			
			fw.close();
			in.close();
		}
		
	}
}


package com.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Text_VendingMachine
{
	static int numItems;
  
	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		if(isExists)
		{
			Scanner fileIn = new Scanner(file);
			
			numItems = fileIn.nextInt();
			
			ArrayList<Integer> menuNum = new ArrayList<Integer>();
			ArrayList<String> menuName = new ArrayList<String>();
			ArrayList<Integer> menuPrice = new ArrayList<Integer>();
			ArrayList<Integer> menuCount = new ArrayList<Integer>();

			for(int i = 0; i < numItems; i++)
			{
				menuNum.add(fileIn.nextInt());
				menuName.add(fileIn.next());
				menuPrice.add(fileIn.nextInt());
				menuCount.add(fileIn.nextInt());
			}
      
			fileIn.close();
			
			int price = 0;
			
			for (int i = 0; i < numItems; i++)
			{
				if (price > menuPrice.get(i))
				{
					price = menuPrice.get(i);
				}
			}
			
			Runtime rt = Runtime.getRuntime();
			
			rt.addShutdownHook( // 프로그램 종료 감지
					new Thread()
					{
						public void run()
						{
							FileWriter fw;
              
							try  // 파일 저장
							{
								fw = new FileWriter("c:\\Temp\\menu.txt");
								
								String out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
								fw.write(out);
								
								for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
								{
									out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
									fw.write(out);
								}
								
								fw.close();
							}
							catch (IOException e) // 실패
							{
								e.printStackTrace();
							}
							
						}
					});

			System.out.println("돈을 입력하세요...");
			
			boolean moneyFlag = true;
			int money = 0;
			
			while(moneyFlag)
			{
				String select = in.next();
        
				try 
				{
					money = money + Integer.parseInt(select);
					
					if (money == -999) // -999 입력시 메뉴 편집
					{
						FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
						String out = "";
						
						out = ""; // 초기화
						while(true)
						{
							System.out.println("=====================");
							System.out.println("      자판기 편집");
							System.out.println("=====================");
							for (int i = 0; i < numItems; i++)
							{
								System.out.printf("%d. %s     %d원\n", i + 1, menuName.get(i), menuPrice.get(i));
							}
							System.out.printf("%d. 메뉴 추가\n", numItems + 1);
							System.out.printf("%d. 메뉴 삭제\n", numItems + 2);
							System.out.printf("%d. 편집 종료\n", numItems + 3);
							System.out.println("=====================");
							System.out.println("편집할 메뉴를 선택해주세요.");
							
							select = in.next();
							
							try 
							{
								int menu = Integer.parseInt(select);
								
								if (menu < numItems + 1 && menu > 0)
								{
									System.out.printf("%d번째 메뉴의 이름과 가격, 수량을 입력해주세요.", menu);
									menuName.set(menu - 1, in.next());
									menuPrice.set(menu - 1, in.nextInt());
									menuCount.set(menu - 1, in.nextInt());
								}
								else if (menu == numItems + 1)
								{
									System.out.printf("추가할 %d번째 메뉴의 이름과 가격, 수량을 입력해주세요.", ++numItems);
									menuName.add(in.next());
									menuPrice.add(in.nextInt());
									menuCount.add(in.nextInt());
									System.out.println("메뉴가 추가되었습니다.");
								}
								else if (menu == numItems + 2)
								{
									System.out.printf("삭제할 메뉴를 입력해주세요.");
									int delNum = in.nextInt();
									menuName.remove(delNum - 1);
									menuPrice.remove(delNum - 1);
									menuCount.remove(delNum - 1);
								}
								else
								{
									money += 999;
									System.out.println("돈을 입력하세요...");
									break;
								}
							}
							catch (NumberFormatException exception)
							{
								System.out.println("숫자만 입력해주세요.\n");
							}
						}
						
						out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
						fw.write(out);
						
						for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
						{
							out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
							fw.write(out);
						}
						
						fw.close();
					}
					else
					{
						System.out.printf("입력한 돈은 %d원 입니다.\n", money);
						if(money < price)
						{
							System.out.println("돈이 부족합니다.\n");
						}
						
						boolean moreMoney = true;
						
						while(moreMoney)
						{
							System.out.println("더 입력하시겠습니까? (Y or N)\n");
							char val = in.next().charAt(0);
							
							switch(val)
							{
							case 'N':
							case 'n':
								moneyFlag = false;
								moreMoney = false;
								break;
								
							case 'Y':
							case 'y':
								moreMoney = false;
								break;
								
							default:
								System.out.println("Y와 N중 한가지만 입력해주세요.\n");
								break;
							}
						}
					}
				}
				catch (NumberFormatException exception)
				{
					System.out.println("숫자만 입력해주세요.\n");
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
					if (menuCount.get(i) == 0)
					{
						System.out.printf("%d. %s     %d원 (품절)\n", i + 1, menuName.get(i), menuPrice.get(i));
					}
					else
					{
						System.out.printf("%d. %s     %d원 (%d개 남음)\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
					}
				}
        
				System.out.printf("%d. 잔돈 반환\n", numItems + 1);
				System.out.println("=====================");
				System.out.println("메뉴를 선택해주세요.");
				
				String select = in.next();
        
				try
				{
					int menu = Integer.parseInt(select);
					
					if (menu == numItems + 1) // 잔돈반환
					{
						System.out.printf("잔돈은 %d원 입니다.\n", money);
						break;
					}
					else if (menu < numItems + 1 && menu > 0) // 메뉴 선택
					{
						if(money >= menuPrice.get(menu - 1))
						{
							if (menuCount.get(menu - 1) > 0) // 수량이 1개 이상이라면
							{
								money -= menuPrice.get(menu - 1);
								menuCount.set(menu - 1, menuCount.get(menu - 1) - 1);
								System.out.printf("%s를 고르셨습니다.\n", menuName.get(menu - 1));
                
								try // 로그파일 생성
								{
									LocalDateTime currentDateTime  = LocalDateTime.now(); // 날짜
									FileWriter lfw = new FileWriter("c:\\Temp\\Log.txt", true);
									String out = String.format("%d-%d-%dT%d:%d:%d %d번 물품 %s(%d원)이 %d개 잔돈은 %d원 남았습니다.\r\n", currentDateTime.getYear(), currentDateTime.getMonthValue(), currentDateTime.getDayOfMonth(),
											currentDateTime.getHour(), currentDateTime.getMinute(), currentDateTime.getSecond(), 
											menuNum.get(menu - 1), menuName.get(menu - 1), menuPrice.get(menu - 1), menuCount.get(menu - 1), money);
									
									lfw.append(out);
									lfw.close();
								}
								catch (IOException e1)
								{
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							else // 수량 없음
							{
								System.out.println("수량이 부족합니다.");
							}
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
				catch (NumberFormatException exception)
				{
					System.out.println("숫자만 입력해주세요.\n");
				}
			}
			
			in.close();
		}
		else // 메뉴 파일이 없다면 메뉴파일 생성
		{
			System.out.println("File Not Found");
			FileWriter fw = new FileWriter("c:\\Temp\\menu.txt");
			
			System.out.println("메뉴의 갯수를 입력해주세요.");
			numItems = in.nextInt();
			String out = String.format("%d\r\n", numItems);
			fw.write(out);
			
			String[] menuName = new String[numItems];
			int[] menuPrice = new int[numItems];
			int[] menuCount = new int[numItems];

			out="";
      
			for (int i = 0; i < numItems; i++)
			{
				System.out.printf("%d번째 메뉴의 이름과 가격 그리고 수량을 입력해주세요.", i + 1);
				menuName[i] = in.next();
				String inputText = in.next();
        
				try
				{
					menuPrice[i] = Integer.parseInt(inputText);
					inputText = in.next();
          
					try
					{
						menuCount[i] = Integer.parseInt(inputText);
						out = String.format("%d %s %d\r\n", i + 1, menuName[i], menuPrice[i], menuCount[i]);
						fw.write(out);
					}
					catch (NumberFormatException exception)
					{
						System.out.println("숫자만 입력해주세요.\n");
					}
				}
				catch (NumberFormatException exception)
				{
					System.out.println("숫자만 입력해주세요.\n");
				}
			}
			
			fw.close();
			in.close();
		}
	}
}


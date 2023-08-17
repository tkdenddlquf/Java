package com.practice;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class test
{
	public static void main(String[] args) throws Exception
  {
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		int numItems;		
		
		if(isExists)
		{
			Scanner in = new Scanner(file);			
			numItems = in.nextInt();
			int[] menu_num = new int[numItems];
			String[] menu_title = new String[numItems];
			int[] menu_price = new int[numItems];

			for(int i=0; i<numItems; i++)
			{
				menu_num[i] = in.nextInt();
				menu_title[i] = in.next();
				menu_price[i] = in.nextInt();
			}
      
			in.close();
			
			// select menu
      //for(int i=0; i<numItems; i++)
      //{
      //System.out.printf("%d  %s  %d\n", menu_num[i], menu_title[i], menu_price[i]);
      //}
		}
		else // create menu
		{
			System.out.println("File Not Found");
			FileWriter fw = new FileWriter("c:\\Temp\\data1.txt");
			fw.close();
		}
	}
}

package com.practice;

public class test
{
	public static void main(String[] args)
  {
		int i, j;

		for(i=2;i<=9;i++)
		{
			System.out.printf("%d단\t", i);
		}
    
		System.out.printf("\n");

		for(i=2;i<=9;i++)
		{
			System.out.printf("======\t");
		}
    
		System.out.printf("\n");
		
		for(j=1;j<=9;j++)
		{
			for(i=2;i<=9;i++)
			{
				System.out.printf("%d*%d=%2d\t", i, j, i*j);
			}
      
			System.out.printf("\n");
		}
	}
}

package com.practice;

public class test
{
	public static void main(String[] args)
  {
		int[] aa = new int[2];
		
		try {
			aa[0] = 10/0;
		} 
      
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 범위를 확인하세요.");
		}
      
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나누지 마세요.");
		}
	}
}

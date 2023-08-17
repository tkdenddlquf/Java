package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
  {
		int i;
		Scanner in = new Scanner(System.in);
		int a, b, result;
		double fresult;
		char op;
		boolean flag = true;
		
		while(flag)
		{
			System.out.print("a를 입력하세요..");
			a=in.nextInt();
			System.out.print("b를 입력하세요..");
			b=in.nextInt();
			System.out.print("연산자(+-*/)를 입력하세요..");
			op=in.next().charAt(0);
					
			switch(op)
			{
			case '+':
				result = a+b;
				System.out.printf("결과는 %d\n", result);
				break;
          
			case '-':
				result = a-b;
				System.out.printf("결과는 %d\n", result);
				break;
          
			case '*':
				result = a*b;
				System.out.printf("결과는 %d\n", result);
				break;
          
			case '/':
				fresult = (double)a/(double)b;
				System.out.printf("결과는 %f\n", fresult);
				break;
          
			case 'q':
				flag = false;
				System.out.printf("종료\n");
				break;
			}
		}
	}
}

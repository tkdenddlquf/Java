package com.practice;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
 {
		Scanner in = new Scanner(System.in); 
		int[] score = new int[4];
		int total = 0;
		double average;
		int i;
		String[] title = new String[] {"국어", "영어", "수학", "과학"};
		
		for(i=0;i<4;i++)
		{
			System.out.println(title[i] + "점수를 입력하세요");
			score[i] = in.nextInt();
			total = total + score[i];
		}

		average = (double)total/4.0;
	
		System.out.println(total);
		System.out.println(average);
	}
}

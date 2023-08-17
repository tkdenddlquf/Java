package com.test;

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in); 
		
		int numStudents;
		System.out.print("학생수: ");
		numStudents = in.nextInt();
		int[] score = new int[numStudents];
		int total = 0;
		double average;
		String[] name = new String[numStudents];
		int[] number = new int[numStudents];

		for(int i = 0; i < numStudents; i++)
		{
			number[i] = i + 1;
		}
		
		for(int i = 0; i < numStudents; i++)
		{
			System.out.printf("%d번 학생 이름: ", i + 1);
			name[i] = in.next();
		}
		
		for(int i = 0; i < numStudents; i++)
		{
			System.out.printf("%d번 학생 점수: ", i + 1);
			score[i] = in.nextInt();
			total += score[i]; 
		}

		average = (double)total/(double)numStudents;
		System.out.printf("총점수 %d  평균: %f\n", total, average);

		int maxScore = score[0];
		int maxNo = 0;
		
		for(int i = 1; i < numStudents; i++)
		{
			if(maxScore < score[i])
			{
				maxScore=score[i];
				maxNo = i;
			}
		}
    
		System.out.printf("%d번  %d가 제일 높은 점수입니다.\n", maxNo + 1,maxScore);
	
		int min;
		int temp;
		String temp_2;
		
		for(int i = 0; i < numStudents; i++)
		{
			min = i;
      
			for(int j = i + 1; j < numStudents; j++)
			{
				if(score[min] < score[j])
				{
					min = j;
				}
			}
      
			temp = score[min];
			score[min] = score[i];
			score[i] = temp;
			
			temp_2 = name[min];
			name[min] = name[i];
			name[i] = temp_2;
			
			temp = number[min];
			number[min] = number[i];
			number[i] = temp;
		}
		
		System.out.println("===================================");
		System.out.println("번호\t이름\t점수\t석차");
		System.out.println("===================================");
		
		for(int i = 0; i < numStudents; i++)
		{
			System.out.printf("%d\t%s\t%d\t%d \n", number[i], name[i], score[i], i + 1);		
		}
		
		in.close();
	}
}

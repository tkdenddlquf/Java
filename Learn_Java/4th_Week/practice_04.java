package com.practice;

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
		String[] name = new String[numStudents];
		int[] num = new int[numStudents];
		
		int total = 0;
		double average;
		
		for(int i=0; i<numStudents; i++)
		{
			System.out.printf("%d번 학생 이름: ", i);
			name[i]=in.next() ;
			System.out.printf("%d번 학생 점수: ", i);
			score[i]=in.nextInt();
			total += score[i];
			num[i]=i+1;
		}
    
		average = (double)total/(double)numStudents;
		System.out.printf("총점수 %d  평균: %f\n", total, average);
		
		int maxScore = score[0];
		int maxNo = 0;
    
		for(int i=1;i<numStudents;i++)
		{
			if(maxScore < score[i])
			{
				maxScore=score[i];
				maxNo = i;
			}
		}
		System.out.printf("%d번  %d가 제일 높은 점수입니다.\n", maxNo,maxScore);
		
	
		int min;
		int temp;
		int tempn;
		String temps;
		
		for(int i=0;i<numStudents;i++)
		{
			min = i;
			for(int j=i+1;j<numStudents;j++)
			{
				if(score[min] < score[j])
				{
					min = j;
				}
			}
			temp = score[min];
			score[min]=score[i];
			score[i]=temp;
			
			temps = name[min];
			name[min]=name[i];
			name[i]=temps;
			
			tempn = num[min];
			num[min]=num[i];
			num[i]=tempn;
		}
		
		for(int i=0;i<numStudents;i++)
		{
			System.out.printf("%d  %s  %d\n",num[i], score[i], name[i], i+1);		
		}
	}
}

package com.practice;

public class test
{
	public static void main(String[] args)
  {
		int[][] score = {
					{100,90,80,70},
					{100,95,80,75},
					{100,90,85,60}
				};
		int[] total = new int[3];
		double[] average = new double[3];
		String[] name = {"JeaWon","JeaTwo","JeaThree"};
		int i, j;
    
		for(i=0;i<3;i++)
		{
			total[i]=0;
			for(j=0;j<4;j++)
			{
				total[i] += score[i][j];
			}
			average[i] = (double)total[i]/4.0;
		}
		
		System.out.printf("이름\t국어\t영어\t수학\t과학\t총점\t평균\n");
		System.out.printf("========================================\n");
		for(i=0;i<3;i++)
		{
			System.out.printf("%s\t",name[i]);
			for(j=0;j<4;j++)
			{
				System.out.printf("%d\t",score[i][j]);
			}
			System.out.printf("%d\t",total[i]);
			System.out.printf("%f\n",average[i]);
		}
	}
}

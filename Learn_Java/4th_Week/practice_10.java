package com.practice;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class test
{
	public static void main(String[] args) throws Exception
  {
		Scanner in = new Scanner(new File("c:\\Temp\\data.txt"));
		FileWriter fw = new FileWriter("c:\\Temp\\data1.txt");
		int numStudents;
		numStudents = in.nextInt();
		int[] num = new int[numStudents];
		String[] name = new String[numStudents];
		int[] score = new int[numStudents];
		
		for(int i=0; i<numStudents; i++)
		{
			num[i] = in.nextInt();
			name[i] = in.next();
			score[i] = in.nextInt();
		}

		String out="";

		for(int i=0; i<numStudents; i++)
		{
			out = String.format("%d -- %s -- %d\r\n", num[i], name[i], score[i] );
			fw.write(out);
		}
    
		in.close();
		fw.close();
	}
}

package com.practice;

import java.io.IOException;

public class test
{
	public static void main(String[] args) throws IOException 
  {
		String userName = "abc";
		String input="";
		int key;
		
		while( (key = System.in.read()) != 13)
		{
			input = input + Character.toString(key);
		}
		
		if(input.equals(userName))
		{
			System.out.println(input + "님 어서오세요");
		}
		else
		{
			System.out.println(input + "님은 등록이 안되어 있습니다.");
		}
	}
}

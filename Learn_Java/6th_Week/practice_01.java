package com.practice;

public class test
{
	public static void main(String[] args)
  {
		Car myCar1 = new Car("빨강");
		Car myCar2 = new Car(30);
		Car myCar3 = new Car("보라색", 100);
		
    //myCar1.setColor("빨강");
		
		myCar1.setSpeed(0);
		myCar1.upSpeed(100);
		System.out.printf("Car: %d\n", Car.getCount());
	}
}

class Car
{
	private String color;
	private int speed;
	private static int count = 0;
	
	Car(String color)
	{
		this.color=color;
		this.speed=0;
		count++;
	}
  
	Car(int speed)
	{
		this.color="흰색";
		this.speed=speed;
		count++;
	}
  
	Car(String color, int speed)
	{
		this.color=color;
		this.speed=speed;
		count++;
	}
	
	void upSpeed(int value)
	{
		speed += value;
	}
	
	void downSpeed(int value)
	{
		speed -= value;
	}

	void setColor(String color){this.color = color;}
	String getColor(){return color;}
	
	void setSpeed(int value) {speed = value;}		
	int getSpeed() {return speed;}
	
	static int getCount() {return count;}
}

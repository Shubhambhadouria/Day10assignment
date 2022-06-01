package day10q1;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		
		if(amount>1000)
		{
			return new TajHotel();
		}
		else if(amount>200 && amount <= 1000)
		{
			return new RoadSideHotel();
		}
		else
		{
			System.out.println("Enter a Valid amount");
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		
		int value = sc.nextInt();
		
		Demo d1 = new Demo();
		Hotel h1 = d1.provideFood(value);
		
		if(h1 != null)
		{
			h1.chickenBiryani();
			h1.masalaDosa();
			
			if(h1 instanceof TajHotel)
			{
				TajHotel taj =(TajHotel)h1;
				taj.welcomeDrink();
			}
		}
		
		
		
		
	}


}

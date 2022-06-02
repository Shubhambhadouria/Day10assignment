package day10q2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter History Student Name : ");
		String name = sc.next();
		
		sc.nextLine();
		System.out.println("Enter History Student Address : ");
		String address = sc.nextLine();
	
		System.out.println("Enter History Marks : ");
		int hmarks = sc.nextInt();
		
		System.out.println("Enter Civics Marks : ");
		int cmarks = sc.nextInt();
		
		HistoryStudent h1 = new HistoryStudent(name,address, hmarks, cmarks);
		double x = h1.getPercentage();
		System.out.println("The Percentage of Science Student is : "+x);
		
		
		System.out.println("Enter Science Student Name : ");
		String name1 = sc.next();
		
		sc.nextLine();
		System.out.println("Enter Science Student Address : ");
		String address1 = sc.nextLine();
	
		System.out.println("Enter Physics Marks : ");
		int hmark1 = sc.nextInt();
		
		System.out.println("Enter Chemistry Marks : ");
		int cmarks1 = sc.nextInt();
		
		System.out.println("Enter Maths Marks : ");
		int cmarks2 = sc.nextInt();
		
		
		ScienceStudent s1 = new ScienceStudent(name1,address1,hmark1,cmarks1,cmarks2);
		double y = s1.getPercentage();
		System.out.println("The Percentage of Science Student is : "+y);

	}

}


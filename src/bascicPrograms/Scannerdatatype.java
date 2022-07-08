package bascicPrograms;

import java.util.Scanner;

public class Scannerdatatype {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name");
	String name=scan.nextLine();
		System.out.println("Enter age");
	int age = scan.nextInt();
		System.out.println("Enter Marks");
		int marks = scan.nextInt();
		System.out.println("Enter  percentage");
		float percentage =scan.nextFloat();
		System.out.println("Enter name :"+name +" Enter age :"+age+"marks:"+marks+"percentage:"+percentage);
		
		
		
	}

}

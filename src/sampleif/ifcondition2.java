package sampleif;

import java.util.Scanner;

public class ifcondition2 {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Raju age");
		int rage=scan.nextInt();
		if(rage>=18)
		{
			System.out.println("Raju is eligible for vote");
	}
		else
		{
			System.out.println("Raju is not eligible for vote");
}
}}
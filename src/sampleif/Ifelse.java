package sampleif;

import java.util.Scanner;

public class Ifelse
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a<b)
		{
			System.out.println("A is greater");
			System.out.println("goodmorning");
		}
		else
		{
		System.out.println("B is greater");
		System.out.println("Welcome");
	}

}
}
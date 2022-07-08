package sampleif;

import java.util.Scanner;

public class FindAlphabets {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter character");
		char ch=scan.nextLine().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("It is a Upper Letter");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("It is Lower Letter");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("it is a digits");
		}
		else
		{
			System.out.println("Special Symbol");
		}
	}
}
package bascicPrograms;

import java.util.Scanner;

public class Scannersimpleinterst {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter p,t,r values");
		int p =scan.nextInt();
		int t = scan.nextInt();
		int r =scan.nextInt();
		float si=(float)p*t*r/100;
		System.out.println("Simple interst : " + si);   
	}

}

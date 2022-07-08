package sampleif;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner Input=new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=Input.nextInt();
		int b=Input.nextInt();
		System.out.println("select operator: + - * ");
		
		char variable = Input.next().charAt(0);
		if(variable=='+')
		{
			System.out.println("SUM =" +(a+b));
		}
		else if (variable=='-')
		{
		System.out.println("SUB ="+(a-b));
}
		else if (variable=='*')
		{
			System.out.println("MUL ="+(a*b));
		}
		else
			System.out.println("invalid variable");
	}}


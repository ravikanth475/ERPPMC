package sampleif;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a,b values");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println(" select operator :\nADD + \nSUB-\nMUL *");
	char operator=scan.next().charAt(0);
	if(operator=='+')
	{
		System.out.println("SUM ="+(a+b));
	}
	else if(operator=='-')
	{
		System.out.println("SUB ="+(a-b));
	}
	else if(operator=='*')
	{
		System.out.println("MUL ="+(a*b));
	}
	else
		System.out.println("Invalid operator");
	}
	}
package sampleif;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a,b values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("select operator :\nADD +\nSUB-\nMUL *");
		char operator =scan.next().charAt(0);
		switch(operator)
		{
		default : System.out.println("Invalid operator");
		break;
		case '+' : System.out.println("SUM =" +(a+b));
		break;
		case '-' :System.out.println("ADD ="+(a-b));
		break;
		case '*' :System.out.println("MUL ="+ (a*b));
		break;
		}	
		}
}

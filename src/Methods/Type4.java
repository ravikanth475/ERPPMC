package Methods;

import java.util.Scanner;

public class Type4 {
	
	public int product(int a  , int b) //with return type, with parameter
	{
	return a*b;	
	}
	public static void main(String[] args) {
		Type4 obj2 =new Type4();
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		int c=obj2.product(a,b);
		System.out.println("Type4 Product = "+c);
	}
}
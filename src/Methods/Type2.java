package Methods;

import java.util.Scanner;

public class Type2 {
	public int product() {// with returntype,without parameter
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a*b;
		return c;
	}
		public static void main(String[] args) {
			Type2 x=new Type2();
		    int c=x.product();
			System.out.println("two numbers of the product is"+c);
		}
		
	}



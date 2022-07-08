package Methods;

import java.util.Scanner;

public class Type1 {
	public void add() {  //without return type,without parameter
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Sum of the two numbers" +(a+b));
		System.out.println("sub of two numbers"+(a-b));
	}

	public static void main(String[] args) {
		
		Type1 obj=new Type1();
		obj.add();
	}

}

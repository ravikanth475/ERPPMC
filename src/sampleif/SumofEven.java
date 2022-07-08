package sampleif;

import java.util.Scanner;

public class SumofEven {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter range");
		int lw=scan.nextInt();
		int up=scan.nextInt();
		int sum=0;
		int n=0;
		for(n=lw; n<=up; n++)
		{
			if(n%2==0)
			{
				System.out.println(n);
				sum=sum+n;
			}
		}
		System.out.println("sum of Even numbers" + sum );
			}
		
		
	}



package sampleif;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scan.nextInt();
		int factors=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				factors++;
			}
			System.out.println("Total no of factors"+ factors);
			if(factors==2)
			{
				System.out.println("it is a prime number");
			
		}
			else
		{
			System.out.println("it is a not prime number");
			}
		}
	
}
}

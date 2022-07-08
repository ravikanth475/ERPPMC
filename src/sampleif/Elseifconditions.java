package sampleif;

import java.util.Scanner;

public class Elseifconditions {
	public static void main(String[] args){
	
		Scanner Scan=new Scanner(System.in);
System.out.println("Enter A,B,C values");
    int A=Scan.nextInt();
    int B=Scan.nextInt();
    int C=Scan.nextInt();
    if(A==B&B==C)
    {
    	System.out.println("A,B,C are equal");
    }
    else if(A>B&&A>C)
    {
    	System.out.println( "A is greater ");
    }
    else if(B>C)
    {
    	System.out.println("B is greater");
    }
    else 
    {
    	System.out.println("C is greater");
    }
	}
}




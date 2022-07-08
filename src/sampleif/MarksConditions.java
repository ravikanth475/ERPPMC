package sampleif;

import java.util.Scanner;

public class MarksConditions {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter M,P,C");
		int M=input.nextInt();
		int P=input.nextInt();
		int C=input.nextInt();
		int total=M+P+C;
		float per=(float)total/3;
		System.out.println("Percentage :" + per);
		if(per>=90)
		{
			System.out.println("A grade");
		}
		else if (per>=80&&per<90)
			{
			System.out.println("B grade");
		}
		else if(per>70&&per<80)
		{
			System.out.println("C grade");
		}
		else
			System.out.println("D grade");
		}
	}



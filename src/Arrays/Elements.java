package Arrays;

import java.util.Scanner;

public class Elements {

	public static void main(String[] args) {
		//int marks[]= {6,7,8,9};	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the values");	
	int m=scan.nextInt();
		int marks[]=new int[m];
	System.out.println("enter values");
		for(int i=0;i<marks.length;i++) {
		marks[i]=scan.nextInt();
		}
		for(int x:marks) {
			
        System.out.println(x);
	
		}
}
}
package sampleif;
import java.util.Scanner;
public class PostiveConditions {
public static void main(String[] args) {
Scanner Scan=new Scanner(System.in);
int a=Scan.nextInt();
if(a>0)
{
	System.out.println("A is positive");
}
else if(a<0)
{
	System.out.println("A is negative");
}
else
{
	System.out.println("equal to zero");
}
}
}
	



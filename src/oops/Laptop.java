package oops;

class Phone {
	public void Mobile(int a,int b) {
	System.out.println("ring"+(a*b));
	}
}
public class Laptop extends Phone{
	public void Dell(int a,int b) {
		System.out.println("open"+(a+b));
	}

public static void main(String[] args) {
	Laptop a=new Laptop();
	a.Dell(7,8);
	a.Mobile(9,7);
	
}
}
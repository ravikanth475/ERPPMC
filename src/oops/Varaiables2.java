package oops;

public class Varaiables2 {
	int a=20;
	int b=50;
	static int c=10;
	public void n1() {
		System.out.println("instance varaiable"+(a+b));
	}
public void n2() {
	int x=5;
	int y=2;
	System.out.println("Local avraiable"+(x-y));
}
public static void st() {
	System.out.println("static variable"+c);
}
public static void main(String[] args) {
	Varaiables2 o=new Varaiables2();
	o.n1();
	o.n2();
	Varaiables2.st(); //by using classname
	
}
}

package oops;

public class Methods {
int a=20;
int b=60;
	public void m1() {
		System.out.println("m1 is calling");
	}
	public void m2() {
		
		System.out.println("m2 is multiplication " +(a*b));
	}
	public static void main(String[] args) {
		
	 Methods m=new Methods();
//	m.m1();
	m.m2();
			
		

	}

}

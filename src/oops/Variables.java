package oops;

public class Variables {
	
	int a=10; //instance var and global
	static int b=20; //static variable
	public void m1() {
		//static int d=8;
		System.out.println("calling instance variable"+a); //instance var
	}
    public void m2() {
    	int c=30; //local variable
    	System.out.println("calling local variable"+c);// local var
    }
    public static void st() {
    	System.out.println("calling static variable"+b);
    }
	public static void main(String[] args) {
		
Variables v=new Variables();
v.m1();
v.m2();
Variables.st();						

	}

}

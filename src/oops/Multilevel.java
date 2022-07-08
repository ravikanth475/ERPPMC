package oops;

 class B {
	 int a=2;
	 int b=5;
	 public void SlId() {
		 System.out.println("selenium id ");
	 }
 }
class A extends B{
	int x=9;
	int y=1;
	public void SlWD() {
		System.out.println("selenium web dri ver");
		System.out.println(a+b);
	}
}
  public class Multilevel extends A {
	public void SlRC() {
		
		System.out.println("selenium rc");
		System.out.println(x*y);
		System.out.println(b+a);
	}
	public static void main(String[] args) {
		Multilevel bat= new Multilevel();
		bat.SlId();
		bat.SlWD();
		bat.SlRC();
	}
}

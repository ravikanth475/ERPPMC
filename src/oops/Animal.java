package oops;
class Wild {
	public void dog() {
		System.out.println("bow bow");
	}
}
public class Animal extends Wild {

	public void cat() {
		System.out.println("meow meow");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
 Animal w=new Animal();
 w.cat();
 w.dog();
}
}
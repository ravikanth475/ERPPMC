package Methods;

public class Type3 {
	public void mul(int a,int b) { //without returtype,with parameter
		System.out.println("multiply the two numbers"+(a*b));
	}

	public static void main(String[] args) {
		Type3 z= new Type3();
		z.mul(20,5);
	}
}

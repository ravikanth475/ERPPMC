package oops;

public class polymorphism { //method overloading

	public void add(int a,int b) {
		System.out.println("add two numbers"+(a+b));
	}

	public void add(int a,int b,int c) {
		System.out.println("add three numbers"+(a+b+c));
	}
	public void add(float a, float b) {
		System.out.println("add two numbers"+(a+b));
	}
	public void add(String name) {
		System.out.println("the name is"+name);
	}
	public static void main(String[] args) {
		polymorphism p=new polymorphism();
		p.add("keerthi");
		p.add(1.3f, 1.6f);
		p.add(3, 7);
		p.add(4, 6, 8);

	}

}

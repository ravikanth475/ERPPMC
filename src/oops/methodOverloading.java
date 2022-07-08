package oops;

public class methodOverloading {
	public void add(int a,int b) {
		System.out.println("flowers are dispalyed"+(a*b));
	}
	public void add(float c,float d) {
		System.out.println("animals are displayed"+(c+d));
	}
	public void add(String name) {
		System.out.println("vegetables are displayed"+name);
	}
public static void main(String[] args) {
	methodOverloading T=new methodOverloading ();
	T.add(5, 6);
	T.add(15.5f, 25.6f);
	T.add("Tulasi");
}
}

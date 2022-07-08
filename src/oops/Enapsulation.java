package oops;

public class Enapsulation {
	String name;
	void setName(String nm) {
		this.name=nm;
	}
     String  getName() {
    	 return name;
     }

	public static void main(String[] args) {
		Enapsulation e=new Enapsulation();
		e.setName("tulasi");
		System.out.println(e.getName());

	}

}

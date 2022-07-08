package oops;

public class Encapsulation {
	int empid;
	String name;
    static double salary;
	static double bonus;
	public void disdplay() {
		System.out.println("enter emp id"+ empid);
		System.out.println("enter name"+name);
		System.out.println("enter sal"+salary);
		//System.out.println("enter bonus"+bonus);
	}
	static void bonus() {
		 double bonusamount= (salary *10)/100;
		double totalsalary=bonusamount+salary;
		 System.out.println("total salary:"+totalsalary);
	}
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.empid=1;
		
		e.name="tulasi";
		e.salary=2000;
		e.disdplay();
		Encapsulation.bonus();
	}
	

}

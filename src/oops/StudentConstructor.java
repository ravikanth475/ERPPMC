package oops;

 public class StudentConstructor {
	int no;
	String name;
	StudentConstructor(){
		name="abcd";
		no =87;
	}
	StudentConstructor(String name1,String name2){
		System.out.println("print the two numbers");
	}
	 public static void main(String[] args) {

		 StudentConstructor T=new StudentConstructor();
	 StudentConstructor z=new StudentConstructor();
		System.out.println(T.name);
		System.out.println(T.no);
		System.out.println(z.name);
		
		

	}

}

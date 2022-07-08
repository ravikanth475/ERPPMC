package oops;

public class Constructor {
	Constructor(){
		System.out.println("the default construction");
	}
    Constructor(int a, int b){
    	System.out.println("the addition:"+(a+b));
    }
    Constructor(String nm){
    	System.out.println("the string");
    }
	public static void main(String[] args) {
		Constructor c1=new Constructor();

	}

}

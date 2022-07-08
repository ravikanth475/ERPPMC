package oops;

 class Liberary {
	 public void Pages() {
		 System.out.println("letters");
	 }
 }
	class Book extends Liberary{
		public void Story () {
			System.out.println("Words");
		}
	}
public class Papers extends Book{
		public void Movies() {
			System.out.println("numbers");
	}
	public static void main(String[] args) {
		Papers s=new Papers();
		s.Pages();
		s.Story();
		s.Movies();
		
	}
		
	}
		
		
	




package oops;

 class methodoverriding {
public void add(int a, int b) {
		System.out.println("the adding two number"+(a+b));
	}
public	class ridding extends methodoverriding{
		public void add(int a,int b) {
			System.out.println("adding two number"+(a*b));
		}
	}
	public static void main(String[] args) {
	methodoverriding m=new methodoverriding();
		m.add(2, 6);
		
}
}

package oops;

 
 class  rideiing{
	public void mul(int p, int q) {
		System.out.println("they are freinds"+(p+q));
	}
  }
 class override extends rideiing{
		public void mul(int p,int q) {
			
		System.out.println("they are animals"+(p-q));
	}
 }
public	class MethodOverriding2 extends override{
		public void  mul(int p,int q) {
			System.out.println("they are enimes"+(p*q));
		}
	
		/* class override extends rideiing{
			public void mul(int p,int q) {
				
			System.out.println("they are animals"+(p-q));
		}*/
public static void main(String[] args) {
			
		
			MethodOverriding2 Z=new MethodOverriding2();
			Z.mul(5, 6);
			//Z.mul(7, 9);
			//Z.mul(2,5);
		}
	}
	

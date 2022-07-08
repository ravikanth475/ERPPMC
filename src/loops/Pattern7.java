package loops;

public class Pattern7 {

	public static void main(String[] args) {
		for(int j=1;j<=3;j++ ) {
			for(int i=1;i<=5;i++) {
				if(i==1||j==1||i==5||j==3)
				{
					System.out.print("*");
				}
					else
						System.out.print(" ");
				}
				System.out.println();
				
			}
		}

	}



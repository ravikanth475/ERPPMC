package loops;

public class Pattern5 {

	public static void main(String[] args) {
		for(int j=4;j>=1;j--)
			
		{
			for(int s=4;s>=j;s--)
			{
				System.out.print("  ");
			}
			for(int i=j;i>=1;i--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}

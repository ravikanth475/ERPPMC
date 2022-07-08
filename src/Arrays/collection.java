package Arrays;

public class collection {

	public static void main(String[] args) {
		float totalmarks=0;
        float avg=0;
	
		float grade []= {25.3f,35.2f,45.2f,55.5f,65.5f};
		for(int i=0;i<grade.length;i++) {
			
totalmarks=totalmarks+grade[i];
avg=totalmarks/5;

	}
	
System.out.println(totalmarks);
System.out.println(avg);
}
}
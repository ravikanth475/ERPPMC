package selenium;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
	List info =new ArrayList();
	info.add(123);
	info.add("rab");
	info.add("22.7");
	System.out.println(info);
	int id=(int)info.get(0);
	System.out.println(id);
	
	List <Integer> info1=new ArrayList<Integer>();
	info1.add(12);
	info1.add(45);
	info1.add(546);
	System.out.println(info1);
	System.out.println("for loop");
	for(int i=0;i<info1.size();i++)
	{
		int data=info1.get(i);
		System.out.println(data);
	}
			
	
	

	}

}

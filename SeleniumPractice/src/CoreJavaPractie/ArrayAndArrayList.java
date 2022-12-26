package CoreJavaPractie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String sanjay[] = {"sanjay", "vijay","ajay"};
		System.out.println(sanjay.length);
		
		for(int i = 0; i<sanjay.length; i++)
		{System.out.println(sanjay[i]);}
	System.out.println("*****************************************************************************");

		ArrayList<String> text = new ArrayList();
		
		
		text.add("kmcho");
		text.add("hello");
		
		
		System.out.println(text.get(0));
		System.out.println(text.size());
		
		for (int j =0; j<text.size(); j++) {
			System.out.println(text.get(j));
		}

		
		
		
		
		//************************Use set of collection
		
		
		System.out.println("********Exerciese 16*******************************************************************************");
		
		Set<String> fruits = new HashSet<>();
		
		fruits.add("Apple");
		fruits.add("banana");
		
		System.out.println(fruits.contains("bananna"));
		
		
		
		
		
		
	}

}

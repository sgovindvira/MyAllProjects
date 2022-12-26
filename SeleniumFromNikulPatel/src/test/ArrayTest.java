package test;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// more than 1 values means Array
		
		// 
		
		
		String tools[]= {"Selenium","Testlink","TestRail0", "Junit","TestNG"};
		System.out.println(tools.length);
		/*System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);*/         // Longer way to print all Arrays
		
	

	  /// Shorter way to print Array
		for (int i=0; i<tools.length;i++) {
			System.out.println(tools[i]);
		}

		
		
		
		
		
		String test[]= {"Automation Test", " Manual test"};
		System.out.println(test.length);
		
		for (int a=0; a<test.length; a++) {System.out.println(test[a]);}
		
		
		
		
		
		
		
		
		
		// int array
		
		int number[]= {1,6,10,500,100};
		System.out.println(number.length);
		
		for (int i =0; i<number.length; i++) {System.out.println(number[i]);}
		
		
		
		
		System.out.println("----------------------------------------------------------");
		
		
		
		
		// Using mix values such as Double, INT,numbers
		
		
		
		
		
	Object mix[]= {"Mix", 1,2,3,3.6};
	
	System.out.println(mix.length);
	
	
	for (int b =0; b<mix.length; b++) {System.out.println(mix[b]);}
		
		
		Object mix2[] = {"Sanjay", 1,2,4,5};
		
		System.out.println(mix2.length);
		
		for(int m =0; m<mix2.length; m++) {System.out.println(mix2[m]);}
		
		
		
		

	}

}

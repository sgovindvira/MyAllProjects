package test;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		System.out.println(sum());  // This is step 2
		
		int x = sum(); // step 3
		System.out.println(x);
		
		int y = sum();
		System.out.println(y); // 4 step
		
	
	}

	
	public static int sum() {
		
		int a =1+1;
		return a;    // First step in this class. Method should have return type
		
		
	}
	
}

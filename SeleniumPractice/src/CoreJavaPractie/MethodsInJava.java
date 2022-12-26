package CoreJavaPractie;

public class MethodsInJava {
	
	static MethodsInJava m = new MethodsInJava();// For non statc method we have to create object of class
	static MethodParameters m1 = new MethodParameters(); //  Calling from another class
	
	static void myMethod() {
		System.out.println("Govindvira");
	}
	void secondMethod() {
		System.out.println("Hello");
	}
	
	

	public static void main(String[] args) {
		
		myMethod();  //Static methods we can call directly
		m.secondMethod();
		myMethod();
		
		m1.fullNamewithAge("Sanjay", 20);
		
		
		
		
		
		
	}

}

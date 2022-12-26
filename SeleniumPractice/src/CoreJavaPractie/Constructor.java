package CoreJavaPractie;


public class Constructor {
	
	
	
	//Creat attribute for class
	
	int x;
	
	//Set construtor for class
	
	public Constructor() {
		// set the intial value for class attribute x
		
		x =999999;
	}
	

	public static void main(String[] args) {
		// Note that the constructor name must match the class name, and it cannot have a return type (like void).

		//Also note that the constructor is called when the object is created.
		System.out.println("Hello, I am writing this above the consructor still it will print below it");
		
		Constructor c = new Constructor();
		
		System.out.println(c.x);
		

	}

}

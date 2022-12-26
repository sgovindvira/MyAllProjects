package CoreJavaPractie;

public class MethodParameters {


	static MethodsInJava m = new MethodsInJava(); // Calling from another class
	static Constructor c = new Constructor();





	static void parameter(int RollNumber) {
		System.out.println(RollNumber +" " + "RollNumber");
	}


	static void standard(int Standard)
	{System.out.println(Standard + " "+ "Standard");}


	//Multiple parameter


	static void fullNamewithAge(String name, int age) {
		System.out.println(name + " is " + age + " years old ! " );
	}

	static void city(String city) {
		System.out.println("I live in " + city );
	}
	
	
	static void multiply(int a, int b) {
		System.out.println(a*b );
	}

	public static void main(String[] args) {

		parameter(1);
		parameter(2);
		standard(5);

		m.secondMethod(); // Calling from another class by creating object


		// Multiple Parameter
		fullNamewithAge("Sanjay", 20);
		city("Ranavav");
		multiply(10, 10);
		
		
		
		
		




	}

}

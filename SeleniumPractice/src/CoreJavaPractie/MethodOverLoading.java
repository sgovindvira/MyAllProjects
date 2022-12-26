package CoreJavaPractie;

public class MethodOverLoading {
	
	
	
	
	
	//With method overloading, multiple methods can have the same name with different parameters:
	
	
	static int mymethod(int x, int y) {
		return x + y; }
		
		static double mymethod(double a, double b) {
			return a +b ; }
		
		static void mymethod(String fname, String lname) {
		System.out.println( fname + " and " +lname );	
		}
		
		
		
	
	

	public static void main(String[] args) {
	
		
		
	System.out.println(mymethod(1,2));
	System.out.println(mymethod(10.5, 10.5));
	mymethod("Sanjay", "Govindvira");
	
		
		
		
		
		
		
		
	}

}

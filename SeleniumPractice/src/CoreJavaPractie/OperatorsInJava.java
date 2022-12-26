package CoreJavaPractie;

public class OperatorsInJava {
	public static void main(String[] args) {
		
		
	int a= 10;
	int b =20;
	
	
	//Operators perform actions 
	//Arithmetic operators  +-*/%
		
	
	
	
	//Relational operators == < >>= <= !=
	//Always return boolean
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		
		
		//Logical operators  &&a and, || or,   !not
		//Works between 2 boolean value
		
		
		boolean x = true;
		boolean y = false;
		
		
		System.out.println(x&&y);//False
		System.out.println(x||y); //True
		System.out.println(!x);
		System.out.println(!y);

		
		
		// Increment /decrement operatos
		
		a++; //11
		b--; //19
		System.out.println(a +"  "+ b);
		
		
		//Assigenment operators
		
		// =
		
		
		int c = a;
		System.out.println(c);
		a =b;
		b= c;
		
		System.out.println(a +"  "+ b);
		
	
		

	}
	

}

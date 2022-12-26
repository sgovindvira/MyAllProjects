package CoreJavaPractie;


public class Variables {
	
static Variables t2 = new Variables();

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number = 10;
		char charecter = 'z';
		boolean isValid = false;
		double price = 56.5;
		String text ="this is simple text";
		
		test1();
		t2.test2(); // non static method so we created class objects
		//******************************************Performing newmeric opratin

		int number1 =10, number2=20, number3=0, number5=5;


		number3 = number1+number2;
		System.out.println(number3);

		//************************condintions using boolean

		boolean isPositive = (number1 >0);
		boolean isNegative =(number1<0);
		System.out.println(isPositive  +"  "+   isNegative); 

		boolean isZero = (number1 == 0);
		System.out.println(isZero);







		//************************If else

		if (number1>=1) {System.out.println(number1 +" "+ "is positive");}
		else
			if(number1==0) {System.out.println(number1+ " "+ "is Zero");}
			else {System.out.println(number1 +" "+ "is negative");}


		//use switch to execute code based on the values of a variable		

		int day = 3;
		switch(day) {


		case 1: 
			System.out.println("Monday");
			break;

		case 2: 
			System.out.println("Tueseday");
			break;

		case 3:
			System.out.println("Wednesday");// This is the answer
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;}
		
		
		//String methods
		
		
		int lenght = text.length();
		int posistion = text.indexOf("is");
		String  text1 = text.substring(5);
		
		System.out.println(lenght+ " "+ posistion+" "+ text1);
		System.out.println(text1);
		
		
		


	}
	
	public static void test1() {
		System.out.println("public calling");
	}
	
	
	public void test2() {
		System.out.println("This is non static method so we have to create object");}


}




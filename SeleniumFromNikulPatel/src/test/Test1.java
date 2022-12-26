package test;

import selenium.Test4;

public class Test1 {
	
	

static Test1 t1 =new Test1();
static Test2 t2 =new Test2(); // calling from T2 class
static Test3 t3 = new Test3(); // Calling from T3 class
static Test4 t4 = new Test4();





	public static void main(String[] args) {
	
		System.out.println("I am inside the Main method");
		methodFour();
	   scanMe();
		printMe();
		t1.printMe();
		t1.testMe();
		
		Test2.circle(); // static in T2
		t2.square(); // non static in T1
		
		Test3.blue(); //Static in T3
		t3.red(); // NON - Static in T3
	//	Test3.t3.red     different method
         Test4.bmw();  //Calling from Selenium package
         t4.audi();
       t1.painMe();
         
	
		ArgumentTest.sum(100, 200);
		
		// 5 call blue
		//6 call red

	}

		
	public static void printMe() {
		System.out.println("Print me");
		}
		
		
	
	public static void scanMe() {
		System.out.println("scanme");
		}
	
	
	public static void methodFour() {
		
		System.out.println("I am number 4");
	}
		
		
		// We can not call non static method directly. we need to use objet.  ClassName objectName =new ClassName();
		
		public void painMe() {System.out.println("Paint me");
		}
		// Static - NO object
		//Non-static - object
		
		
		public void testMe() {
			System.out.println("Test me");
		}
		
		
		
		
		
		
	
		
		

	}
	
	
	
	
	
	
	
	
	

	



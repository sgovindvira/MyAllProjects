package Day3SDETQA;

import java.util.Scanner;

public class EvenOrOd {

	public static void main(String[] args) {

		int num = 5;
		
		
		if (num % 2 == 0) {
			System.out.println(num + "is even number");
			
		}
		else {
			System.out.println(num + " "+ "is odd number");
		}
//**********************************************************************************************************************		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int test = sc.nextInt();
		
		
		
		if (test % 2 == 0) {
			System.out.println(test + " " +"is even number");
			
		}
		else {
			System.out.println(test  +  " "  + "is odd number");
		}

	}

}

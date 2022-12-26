package test;

public class ArgumentTest {

	public static void main(String[] args) {
	
		sum(4,5);
		sum(8,9);
		sum(10,20);
		sum (1,3,4);
		sum(2,3,4);
		minus(3,2,1);
		sum3(10,10,10);
		
		
		
		

	}
	
	
	public static void sum(int b, int c) {
		int a = b +c;
		System.out.println(a);
	}

	
	
	public static void sum(int p,int q, int r) {
		int a = p+q+r;
		System.out.println(a); // we can call same method as long argument  are different
	}
	
	
	
	
	
	public static void minus(int s, int v, int g) {
		int d = s-v-g;
		System.out.println(d);
	}
	
	
	////////////Practice///////////

	public static void sum3(int j, int k, int l) {
	int t  = j+k+l;
	System.out.println(t);}
	
}

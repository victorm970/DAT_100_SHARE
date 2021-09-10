package no.hvl.dat100;

public class Metoder_DelB {
	
private static int z= 5;  // static int innenfor klassen metoderdelb.

	public static void main(String[] args) {
	
		int x= 5;
		set(x,10);
		
		System.out.println(x);
		System.out.println(z);
	

	}
	private static void set( int a, int b) {
		a= b;
		z= b;
	}
}

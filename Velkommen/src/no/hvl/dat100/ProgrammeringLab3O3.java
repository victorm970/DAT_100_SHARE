package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class ProgrammeringLab3O3 {

	public static void main(String[] args) {
	
		String intext = showInputDialog("Skriv inn verdi til n: ");
		int n = Integer.parseInt(intext);
	
		if(n>=1) {
		System.out.println("Svaret blir: " + fakultet(n));
		System.out.println("Svaret blir: " + fakultet2(n));
		} else {
			System.out.println("Ugyldig verdi av n.");
		}
	}
	private static int fakultet(int n) {
		
		if(n==1) {
			return n;
		}
		return n*fakultet(n-1);
	}
	
	private static int fakultet2(int n) {
		int s = 1;
		
		while (n > 1) {
			s*=n;
			n--;
		}
		return s;
		
		
	}
}


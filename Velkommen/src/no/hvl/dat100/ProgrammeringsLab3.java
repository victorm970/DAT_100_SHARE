package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import java.lang.Math;

public class ProgrammeringsLab3 {

	public static void main(String[] args) {
		

	
		oppgG1();
		
		
		
	}
	
	private static void oppgG1() {
		String inTxt = showInputDialog("Skriv inn verdi av n: ");
		int n = Integer.parseInt(inTxt);
		
		for(int i =1 ; i<=10;i++) {
			
			if(i!=n) {
				System.out.print(" " + i +" " );
			}
			
		}
		
	}

	private static void oppgG2() {
	
		int a = 20;
		
		while (a<=20 && a>0) {
			System.out.print(" " + a + " ");
			a--;
		}
		
	}

	private static void oppgG3() {
		
		//a og b
		for(int i = 1;i<=20;i++) {
			switch(i) {
			case 1:
				System.out.print("A" + " ");
				break;
			case 2:
				System.out.print("B" + " ");
				break;
			default:
				System.out.print("C" + " ");
			}
			
		}
		
		System.out.println();
		
		//c
		for(int j = 1;j<=20;j++) {
			if(j == 1) {
				System.out.print("A" + " ");
			} else if (j == 2) {
				System.out.print("B" + " ");
			} else if (j>=3 && j<21) {
				System.out.print("C" + " ");
			}
		}
		
		
	}

	private static void oppgB1() {
		
		
		String intext = showInputDialog("Skriv inn nedre greanse: ");
		int nedre = Integer.parseInt(intext);
		String intext2 = showInputDialog("Skriv inn øvre greanse: ");
		int ovre = Integer.parseInt(intext2);
		
		for(int i = nedre; i <=ovre;i++) {
			if(i % 2 != 0) {
				showMessageDialog(null,  i + " " );
			}
		}
		
		}
	
	private static void oppgB2() {
		
		//første metode via math. 
		String intext = showInputDialog("Skriv inn verdi av x: ");
		int x = Integer.parseInt(intext);
		String intext2 = showInputDialog("Skriv inn verdi av n: ");
		int n = Integer.parseInt(intext2);
		System.out.println(Math.pow(x, n));
		
		// andre metode via while.
		String intext3 = showInputDialog("Skriv inn verdi av x2: ");
		double x2 = Double.parseDouble(intext3);
		String intext4 = showInputDialog("Skriv inn verdi av n2: ");
		double n2 = Double.parseDouble(intext4);
		double a= 1.0;
		
		 //multipliser n2 med x så mange ganger n ber om. 
		/*
		 * eksempel: x=2 og n=3 og a=1.0 "start verdi". 
		 * vi går inn i while loop så lenge n !=0
		 * x=2 og n=3
		 * a "som er svar", blir til a * x. så 1*2, deretter --n så vi går ned
		 * x=2 og n=2
		 * a blir til 2*2 fordi a=2 nå og x er samme. 
		 * deretter går vi ned med --n
		 * x=2 og n=1
		 * a blir til 4*2.... etc etc
		 */
			
		while(n2 != 0 ) {  
			a *=x2;
			--n2;
		}
		System.out.println("Svar: " + a);
		
	}
	
}

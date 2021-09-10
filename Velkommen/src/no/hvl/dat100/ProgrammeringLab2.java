package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class ProgrammeringLab2 {

	public static void main(String[] args) {

		OppgB4Endre();

	}
	
	public static void OppgG1() {
		
		// a
		int a, b;
		//b
		a = 5;
		b = 7;
		//c
		System.out.println(" a har verdien: " + a + " og " + " b har verdien: " + b);
		//d
		/* Hvis jeg prøver å endre a fra int til boolean, så får jeg feilmelding 
		 * fordi boolean can bare være true eller false, ikke tall. */
		 
	}

	public static void OppgG2() {
				
				int a, b,c;
				a = 8;
				b = 7;
				c = a+b;
				System.out.println(" c har verdien: " + c);
				
	}

	public static void OppgG4() {
		
		//a
		String text1 = showInputDialog("Skriv inn Tall 1: ");
		int a = parseInt(text1);
		String text2 = showInputDialog("Skriv inn Tall 2: ");
		int b = parseInt(text2);
		if (b == 0 ) {
			System.out.println("b kan ikke være 0.");
		} else {
			int c = a/b;
			System.out.println("a/b blir " + c);
		}
	}

	public static void OppgG5() {
		
		//a og b
		for (int i = 0; i < 5;i++) {
			String text1 = showInputDialog("Gi et tall: ");
			int tall = parseInt(text1);
		System.out.println(tall);
		}
	}

	public static void OppgB1() {
		String text1 = showInputDialog("Skriv radius: ");
		double a = Double.parseDouble(text1);
		double b = (4/3) * PI * pow(a,3);
		
		System.out.println("Volum av kulen blir: " + b);
	}

	public static void OppgB2() {
		
		String inT1 = showInputDialog("Pris: ");
		int pris = parseInt(inT1);
		String inT2 = showInputDialog("Beløp: ");
		int belop = parseInt(inT2);
		
		if (belop > pris) {
			System.out.println("Rest tilbake: " + (belop-pris));
			int tilbake = belop - pris;
			int tiere = tilbake/10;
			
			if (tiere > 0) {
				tilbake = tilbake%10;
				System.out.println("Antall tiere: " + tiere);
			}
			int enere = tilbake /1;
			if (enere > 0) {
				tilbake = tilbake %1;
				System.out.println("Antall enere: " + enere);
			}
		}
		


		}

	public static void OppgB3() {
		String inTxt = showInputDialog("Skriv inn brukernavn: ");
		String inTxt2 = showInputDialog("Skriv inn passord: ");
		String navn = "Tony";
		String pw = "1234";
		
		if(inTxt.equals(navn)) {
			System.out.println("Riktig brukernavn.");
		} else {
			System.out.println("Feil brukernavn.");
		} if (inTxt2.equals(pw)) {
			System.out.println("Riktig passord.");
		} else {
			System.out.println("Feil passord.");}
	}

	public static void OppgB4() {
		String inText = showInputDialog("Skriv inn bruttoinntekt: ");
		int a = parseInt(inText);
		
		
		double b;
		if (a > 0 && a < 184800 ) {
			System.out.println("Ingen trinnskatt.");
		} else if (a >= 184800 && a < 260100) {
			b = a*0.983;
			System.out.println(" Med trinnskatt på 1,7% får vi: " + b);
		} else if (a >= 260100 && a<651250) {
			b = a*0.96;
			System.out.println(" Med trinnskatt på 4% får vi: " + b);
		} else if (a >= 651250 && a < 1021550) {
			b = a*0.868;
			System.out.println(" Med trinnskatt på 13.2% får vi: " + b);
		} else if ( a >= 1021550) {
			b = a*0.838;
			System.out.println(" Med trinnskatt på 16.2% får vi: " + b);
		}
			
		
	}

	public static void OppgB5() {
		
		
		for(int i=0; i<10;i++) {
			String inTxt = showInputDialog("Skriv inn antall poeng: ");
			int a = parseInt(inTxt);
			
			if( a >= 0 && a <= 39) {
				System.out.println("F");
			} else if (a >=40 && a <=49) {
				System.out.println("E.");
			} else if (a >=50 && a <=59) {
				System.out.println("D");
			} else if ( a >= 60 && a <=79) {
				System.out.println("C.");
			} else if ( a >= 80 && a <= 89) {
				System.out.println("B.");
			} else if ( a >= 90 && a <=100) {
				System.out.println("A.");
			} else {
				System.out.println("Ugyldig antall poeng.");
			}
		}
	}

	public static void OppgB4Endre() {
		String tallStreng  = showInputDialog("Inntekt: ");
        int lonn = parseInt(tallStreng);


    if(lonn >=0 && lonn < 164100) {
        double a = 0.0;
    	System.out.println( "Trinnskatten med denne lønnen er: " + a);
    } else if(lonn >= 164100 && lonn < 230950) {
    	double b = lonn * 0.983;
    	System.out.println("Trinnskatten med denne lønnen er: "  + b);
    } else if (lonn >= 230950 && lonn < 580650) {
    	double c = lonn * 0.96;
    	System.out.println("Trinnskatten med denne lønnen er: "  + c);
    } else if( lonn >= 580650  && lonn < 934050) {
    	double d = lonn * 0.868; 
    	System.out.println("Trinnskatten med denne lønnen er: "  + d);
    } else if(lonn >= 934050) {
    	double e = lonn * 0.838;
    	System.out.println("Trinnskatten med denne lønnen er: "  + e);
    } else {
    	System.out.println("Error. Ugyldig tall.");
    }

	}
	
	
}


	
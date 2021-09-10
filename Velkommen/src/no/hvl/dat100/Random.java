package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import java.util.Scanner;
import static java.lang.Integer.*;
import java.lang.Math;
import easygraphics.*;
import static java.lang.Math.*;

public class Random {

	public static void main(String[] args) {
		


	}
	public static void lokkerfor1() {
		//finn ut hvor mange ganger hver situasjon tar sted og summere hvor mange av hver.
		
		int mindre=0;
		int storre=0;
		int lik= 0;
		
		for(int i =0;i<5;i++) {
			String inTxt = showInputDialog("Gi tall: ");
			int a = parseInt(inTxt);
			
			if(a==0) {
				lik++;
				System.out.println("Tallet er lik 0.");
			} else if (a<0) {
				mindre++;
				System.out.println("Tallet er mindre enn 0.");
			} else if (a>0) {
				storre++;
				System.out.println("Tallet er st�rre enn 0.");
			}
		}
		System.out.println("Mindre: " + mindre + " | St�rre: " + storre + " | Lik: " + lik);
	}

	public static void lokkerwhile1() {
		// while (<betingelse>) { <l�kkekropp> };
		// 1. seting etter l�kken.
		// holder p� s� lenge betingelse er sant. Hvis den blir usant, s� hopper den ut av l�kka.
		int tall =1;
		while (tall <=100) {
			System.out.println( tall );
			tall++; //<- oppdatering av kontrollvariabel.
		}
	}

	public static void lokkerwhile2() {
		//les inn et ukjent antall h�yde og beregne gjennomsnitt.
		int sum = 0;
		int antall = 0;
		
		// vi trenger en h�yde f�r vi beginner, s� vi leser det inn via:
		String inTxt = showInputDialog("H�yde?: ");
		int a = parseInt(inTxt);
		
		// betingelse for � g� inn i l�kken?
		
		while (a != 0) {

			sum += a; // til � legget til h�yden i summen. 
			antall++; //�kt med 1.
			 inTxt = showInputDialog("H�yde?: "); //trenger ikke � ha int og string fordi de er deklarert utenfor l�kken.
			 a = parseInt(inTxt);
		}
		double gjennomsnitt = (double) sum/antall; //setter (double) f�r sum/antall slik at sum blir om til double fra int s� vi kan f� n�yaktig beregninger.
		System.out.println("Gjennomsnitt: " + gjennomsnitt);
		
		
		
	}

	public static void lokkerdowhile1() {
		// do-l�kke
		/* do{ <l�kkekropp> } 
		 * while(<betingelse>)
		 * 1. setning etter l�kken.
		 * Velegnet n�r ting skal utf�res MINST en gang.
		 */
		 int antall = 0;
		 int sum = 0;
		 int hoyde = 0;
		 do {
			 String inTxt = showInputDialog("Gi tall: ");
				 hoyde = parseInt(inTxt);
				
				//for � bruke den nye verdien i tilfelle det ikke er 0.
				if (hoyde!=0) {
				sum +=hoyde;
				antall++;
				}
		 } while (hoyde != 0);
		 
		 double gjennomsnitt = (double) sum /antall;
		 System.out.println("Gjennomsnitt: " + gjennomsnitt);
	}
	
	public static void lokkerfor2() {
		//lese inn nedb�r for kvar dag i ei veke og beregne summen. 
		
		final int ANT_DAGER = 7;  // kan bare gi den verdi en gang. 
		/* grunnen til at vi lager en final er fordi hvis jeg vil endre verdien av den 
		 * s� vil den endres overalt herfra. s� hvis jeg endrer 7 til 2, s� vil det bli om til 2
		 * overalt.
		 */
		int sum = 0;
		for(int dagnr=1;dagnr<= ANT_DAGER;dagnr++) {
			int nedbor = parseInt(showInputDialog("Dag: " + dagnr));
			sum += nedbor;
		}
		System.out.println("Samlet nedb�r: " + sum);
	}
	
	public static void lokkerdowhile2(){
		//Leser terningkast helt til summen av alle kastene blir for eksempel 100 eller mer.
		// teller og skriver ut antall kast
		int antall = 0;
		int sum = 0;
		final int GRENSE = 13; // for � oppn� 13. 
		
		do {
			int verdi = parseInt(showInputDialog("Resultat av kast? "));
			antall++; // for � �ke antall etter hver kast.
			sum += verdi; 
		} while (sum < GRENSE); // betingelse til slutt. holder p� s� lenge sum er mindre enn grense. 
	System.out.println("Antall kast for � n� " + GRENSE + " er " + antall);
	}

	





}

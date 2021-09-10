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
				System.out.println("Tallet er større enn 0.");
			}
		}
		System.out.println("Mindre: " + mindre + " | Større: " + storre + " | Lik: " + lik);
	}

	public static void lokkerwhile1() {
		// while (<betingelse>) { <løkkekropp> };
		// 1. seting etter løkken.
		// holder på så lenge betingelse er sant. Hvis den blir usant, så hopper den ut av løkka.
		int tall =1;
		while (tall <=100) {
			System.out.println( tall );
			tall++; //<- oppdatering av kontrollvariabel.
		}
	}

	public static void lokkerwhile2() {
		//les inn et ukjent antall høyde og beregne gjennomsnitt.
		int sum = 0;
		int antall = 0;
		
		// vi trenger en høyde før vi beginner, så vi leser det inn via:
		String inTxt = showInputDialog("Høyde?: ");
		int a = parseInt(inTxt);
		
		// betingelse for å gå inn i løkken?
		
		while (a != 0) {

			sum += a; // til å legget til høyden i summen. 
			antall++; //økt med 1.
			 inTxt = showInputDialog("Høyde?: "); //trenger ikke å ha int og string fordi de er deklarert utenfor løkken.
			 a = parseInt(inTxt);
		}
		double gjennomsnitt = (double) sum/antall; //setter (double) før sum/antall slik at sum blir om til double fra int så vi kan få nøyaktig beregninger.
		System.out.println("Gjennomsnitt: " + gjennomsnitt);
		
		
		
	}

	public static void lokkerdowhile1() {
		// do-løkke
		/* do{ <løkkekropp> } 
		 * while(<betingelse>)
		 * 1. setning etter løkken.
		 * Velegnet når ting skal utføres MINST en gang.
		 */
		 int antall = 0;
		 int sum = 0;
		 int hoyde = 0;
		 do {
			 String inTxt = showInputDialog("Gi tall: ");
				 hoyde = parseInt(inTxt);
				
				//for å bruke den nye verdien i tilfelle det ikke er 0.
				if (hoyde!=0) {
				sum +=hoyde;
				antall++;
				}
		 } while (hoyde != 0);
		 
		 double gjennomsnitt = (double) sum /antall;
		 System.out.println("Gjennomsnitt: " + gjennomsnitt);
	}
	
	public static void lokkerfor2() {
		//lese inn nedbør for kvar dag i ei veke og beregne summen. 
		
		final int ANT_DAGER = 7;  // kan bare gi den verdi en gang. 
		/* grunnen til at vi lager en final er fordi hvis jeg vil endre verdien av den 
		 * så vil den endres overalt herfra. så hvis jeg endrer 7 til 2, så vil det bli om til 2
		 * overalt.
		 */
		int sum = 0;
		for(int dagnr=1;dagnr<= ANT_DAGER;dagnr++) {
			int nedbor = parseInt(showInputDialog("Dag: " + dagnr));
			sum += nedbor;
		}
		System.out.println("Samlet nedbør: " + sum);
	}
	
	public static void lokkerdowhile2(){
		//Leser terningkast helt til summen av alle kastene blir for eksempel 100 eller mer.
		// teller og skriver ut antall kast
		int antall = 0;
		int sum = 0;
		final int GRENSE = 13; // for å oppnå 13. 
		
		do {
			int verdi = parseInt(showInputDialog("Resultat av kast? "));
			antall++; // for å øke antall etter hver kast.
			sum += verdi; 
		} while (sum < GRENSE); // betingelse til slutt. holder på så lenge sum er mindre enn grense. 
	System.out.println("Antall kast for å nå " + GRENSE + " er " + antall);
	}

	





}

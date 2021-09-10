package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import java.util.Scanner;
import static java.lang.Integer.*;
import java.lang.Math;
import java.util.Random;
import easygraphics.*;
import static java.lang.Math.*;

public class Velkommen extends EasyGraphics { // har tatt med easygraphics her for å løse oppg6

	public static void main(String[] args) {
	 launch(args);  //tilhører oppg 6 og public void run()
		
		
	}

	public static void welcome() {
		/** Dette her er en måte å kommentere på
		 * slik kan du bare fortsette å kommentere til du er ferdig.
		 * <- kommer automatisk, så du trenger ikke å implementere dem. 
		 * Bare ha "/**" før og etter -> **/
		
		System.out.println("************"); // ikke 10, men 12 stk. 
		System.out.println("Nå virker det!");
		System.out.println("************"); // ikke 10, men 12 stk. 
		
		//System.out.print("Hei!");
		//System.out.print("	");
		//System.out.print("Testing mellom print og println.");
		
		/**
		 * det ser ut som at hvis du bruker println, så får du ting på en ny linje. Hvis du
		 * bruker print, så får du ting på samme linje **/
	}
	public static void intext() {
		// kalkulator ved hjelp av intext
		
		String inTxt = showInputDialog("Skriv første tallet"); // første tallet
		int a = parseInt(inTxt); // vi bruker parse int til å lagre tall til integer.
		
		String inTxt2 = showInputDialog("Skriv andre tallet"); // andre tallet.
		int b = parseInt(inTxt2); // lagrer andre tallet
		
		int c = a+b;
		System.out.println("Svaret blir " + c + ".");
	}
	public static void ifstatement() {
		// bruk av if
		// teste om tallet du skrev in er 9
		
		String inTxt = showInputDialog("Skriv tall her:");
		int a = parseInt(inTxt);
		
		if ( a == 9 ) {
			System.out.println("Tallet er lik 9");
		} else {
			System.out.println("Tallet er ikke lik 9");
		}
		
	}
	public static void print10tall() {
		
		for (int i = 0; i<=10; i++) { //for løkke som går gjennom tall fra 0 og tom 10 der vi legger til 1 for hver runde.
			System.out.print(i + " "); // for å printe ut.
		}
	}
	public static void oppg1lab1() {
		//oppg 1 fra lab 1 2021 23 aug.
		
		//a
		String intxt = showInputDialog("Skriv inn første tallet du skal summere:" );
		int a = parseInt(intxt);
		
		String intxt2 = showInputDialog("Skriv inn andre tallet du skal summere:" );
		int b = parseInt(intxt2);
		
		int c = a+b;
		
		//b
		String intxt3 = showInputDialog("Skriv inn bredden på rektangelet:" );
		int d = parseInt(intxt3);
		
		String intxt4 = showInputDialog("Skriv inn lengden på rektangelet:" );
		int e = parseInt(intxt4);
		int f= d*e;
		System.out.println("Summen blir: " + c + ". Arealet av rektangelet er: " + f ); 
	}
	public static void oppg2lab1() {
		
		
		//oppg 2 fra lab 1 2021 23 aug.
		String intxt1 = showInputDialog("Skriv inn tall 1: ");
			double a = parseInt(intxt1);
		String intxt2 = showInputDialog("Skriv inn tall 2: ");
			double b = parseInt(intxt2);
		String intxt3 = showInputDialog("Skriv inn tall 3: ");
			double c = parseInt(intxt3);
		String intxt4 = showInputDialog("Skriv inn tall 4: ");
			double d = parseInt(intxt4);
	
			System.out.println("Minste tallet er: " +min(min(min(a,b),c),d));
			
			
			
	}
	public static void oppg3lab1() {
		//oppg 3 fra lab 1 2021 23 aug.
		
		int a,b,c;
		String intxt, intxt2, intxt3;
		intxt = showInputDialog("Dagnummer: ");
		intxt2 = showInputDialog("Månedsnummer: ");
		intxt3 = showInputDialog("Årstall: ");
		a = parseInt(intxt);
		b = parseInt(intxt2);
		c = parseInt(intxt3);
		
		System.out.println(" " + a + ":" + b + ":" + c +"." );
		}
	public static void oppg4lab1() {
		
		//sekunder om til timer, minutter og sekunder.
		
		int hours, minutes, seconds;
		String sec1 = showInputDialog("Gi antall sekunder som skal gjøres om: ");
		int a = parseInt(sec1);
		
		hours = a / 3600;
		minutes = (a % 3600) / 60;
		seconds = a % 60;
		
		System.out.println( hours + " timer, " + minutes + " minutter og " + seconds + " sekunder.");
		
		
	}
	public static void oppg5lab1() {
		
		//finn hva som er feil med koden.
		int a = 5;
	    String s = "Hei";
	  //  b = 4.2;  //her skal det være double.

	    System.out.println(a);
	    System.out.println(s);
	 //   System.out.println(b);   // her er feil pga. b "hva er b? int, boolean, double, string?"
	    System.out.println(s + a + 3);
	    System.out.println(3 + a + s);
	 //   System.out.println(s - "H");  // - er ikke e symbol du kan bruke her. 
	    System.out.println(7 / a);
	    System.out.println(13 - 2 * 5);

	 //   int c = 1578;
	 //   System.out.println(c.length());  // kan ikke brukes på int. kan brukes på string for eks.
	    System.out.println(s.length());
	}
	
	public void run() {
		   
		  // Give a number: 
		  String prosent = showInputDialog("Skriv Prosentverdi: ");
		  double a = Double.parseDouble(prosent);
		  
		  // size of the rectangle "scaling up the main sizes with -a- which is the %.
		  int int1 = (int) (200 * a);   //(int) til å få int ti
		  int int2 = (int) (50 * a);
		  int int3 = (int) (150* a);
		  
		  //y posisjon:
		  int y1 = 350;
		  int y2 = y1 + int2;
		  int y3 = y2 + int2;
		  
		makeWindow("Det franske flagget");

		    setColor(0, 0, 255);
		    fillRectangle(50, 50, 100, 200);
		    setColor(255, 0, 0);
		    fillRectangle(250, 50, 100, 200);
		    setColor(0, 0, 0);
		    drawRectangle(50, 50, 300, 200);

// 6b ,modifiser programmet ovenfor slik dt tegner det tyske flagget og skalerer prosentvis.
		    // 255 255 0 yellow color
		    setColor(0, 0, 0); // 0 0 0 black color
		    fillRectangle(50, y1 , int1, int2);
		    setColor(255, 0, 0); //255 0 0 red color
		    fillRectangle(50, y2, int1, int2);
		    setColor(255,255,0);
		    fillRectangle(50, y3, int1, int2);
		    setColor(0, 0, 0); 
		    drawRectangle(50, y1, int1, int3);

		   
		    
	}



}
	
	
	
	


	
	
	
	
	



package no.hvl.dat100;

import easygraphics.EasyGraphics;
import static javax.swing.JOptionPane.*;

public class Rekke_Hus extends EasyGraphics{

	public static void main(String[] args) {

		launch(args);


/*	Tegn Hus. 
 * Inputs:
 *  antallHus
 * startX og startY 
 * bredde, høyde 
 * avstand mellom hus. 
 */
		

	}

	public void run() {
		makeWindow("Husrekke"); // for å lage selve vinduet. 
		
		// for å skrive inn verdier. 
		String inTxt = showInputDialog("Antall hus: ");
		int anthus = Integer.parseInt(inTxt);
		String inTxt2 = showInputDialog("StartX: ");
		int startxverdi = Integer.parseInt(inTxt2);
		String inTxt3 = showInputDialog("startY: ");
		int startyverdi = Integer.parseInt(inTxt3);
		String inTxt4 = showInputDialog("Bredde: ");
		int breddehus = Integer.parseInt(inTxt4);
		String inTxt5 = showInputDialog("Høyde: ");
		int hoydehus = Integer.parseInt(inTxt5);
		String inTxt6 = showInputDialog("Avstand mellom hus: ");
		int avstandhus = Integer.parseInt(inTxt6);
		
		//tenghusrekke verdier 5 20 200 60 40 10
		tegnHusrekke(anthus,startxverdi,startyverdi,breddehus,hoydehus,avstandhus);
		//tegnTrekant(20,200,10,20);
	}
	private void tegnHusrekke( int antallHus, int startX,
								int startY, int bredde, 
								int hoyde, int avstand) {
		
		for(int husNr=1; husNr<=antallHus;husNr++) {
			
			tegnHus(startX, startY, bredde, hoyde);
			startX= startX+ bredde + avstand;
		}
	}
	private void tegnHus(int x, int y, int bredde, int hoyde) {
		int veggTopp = y- hoyde /2;
		drawRectangle(x, veggTopp, bredde, hoyde/2);
		tegnTrekant(x,veggTopp, bredde, hoyde/2);
	}
	private void tegnTrekant(int x, int y, int bredde, int hoyde) {
		drawLine(x, y, x+bredde, y);
		drawLine(x+bredde, y, x+bredde/2,y-hoyde);
		drawLine(x+bredde/2, y-hoyde, x,y);
	}
}

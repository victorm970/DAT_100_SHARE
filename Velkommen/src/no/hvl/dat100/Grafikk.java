package no.hvl.dat100;

import easygraphics.*;

public class Grafikk extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);

	}

	public void run() {
		makeWindow("Grafikk", 700, 300); //window
		
		// big sized 8
		drawCircle(150,70,60);   // x y size
		drawCircle(150,190,60);
		
		// medium sized 8
		drawCircle(295,100,30);
		drawCircle(295,160,30);
		
		// small sized 8
		drawCircle(500,240,15);
		drawCircle(500,270,15);
		
	}
}


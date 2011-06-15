package de.st48.termomap.main;

import de.st48.termomap.ui.GUI;

public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hier ist was neues... aber hier ist etwas gab neues!");
		// Grafische Oberfläche mit dem Testbild starten
		new GUI(new MyImage());
	}

}

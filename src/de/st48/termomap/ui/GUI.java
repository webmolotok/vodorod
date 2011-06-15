package de.st48.termomap.ui;


import static de.st48.termomap.conf.ConfigUI.H_BUTTONS;
import static de.st48.termomap.conf.ConfigUI.H_SCREEN;
import static de.st48.termomap.conf.ConfigUI.W_BUTTONS;
import static de.st48.termomap.conf.ConfigUI.W_SCREEN;
import static de.st48.termomap.conf.ConfigUI.X_FRAME;
import static de.st48.termomap.conf.ConfigUI.Y_FRAME;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import de.st48.termomap.main.MyImage;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	public GUI(MyImage image){
		setTitle("Termo-Map");
		setLocation(X_FRAME, Y_FRAME);

		// ---- Panels erstellen ----
		
		// Leinwand
		ScreenPanel screen = new ScreenPanel(image, W_SCREEN, H_SCREEN);
		
		// Buttons
		ButtonPanel buttons = new ButtonPanel(W_BUTTONS, H_BUTTONS);
		
		// ---- Panels anzeigen ----
		add(screen, BorderLayout.CENTER);
		add(buttons,BorderLayout.NORTH);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}

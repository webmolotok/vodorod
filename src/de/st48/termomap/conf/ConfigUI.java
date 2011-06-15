package de.st48.termomap.conf;


public class ConfigUI {
	public static final int W_SCREEN = 800;
	public static final int H_SCREEN = 600;

	public static final int W_BUTTONS = W_SCREEN;
	public static final int H_BUTTONS = 32;

	public static final int X_FRAME = 80;
	public static final int Y_FRAME = 80;
	public static final int W_FRAME = W_SCREEN;
	public static final int H_FRAME = H_SCREEN + H_BUTTONS;

	public static final String[] PICT = { 
		ConfigDIR.PictDir() + "pict1.png",
		ConfigDIR.PictDir() + "pict2.png",
		ConfigDIR.PictDir() + "pict3.png"};
	
	public static final int WHITE = -1;
	public static final int RED = -65536;
	public static final int BLACK = -16777216;
}

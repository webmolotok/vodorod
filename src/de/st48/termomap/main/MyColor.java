package de.st48.termomap.main;

import java.awt.Color;

public class MyColor {
	private static final int COLOR_COUNT = 256;
	private static Color[] colorArray;
	private static MyColor instance;

	private MyColor() {
		if(colorArray == null) {
			colorArray = new Color[COLOR_COUNT];
			int r=0,g=10,b=255;
			for (int i = 0; i < COLOR_COUNT; i++) {
				colorArray[i] = new Color(r++,g,b--);
			}
		}
	}

	public static MyColor getInstance() {
		if(instance == null)
			instance = new MyColor();
		return instance;
	}

	public Color getColorAt(int c) {
		return colorArray[c];
	}
}

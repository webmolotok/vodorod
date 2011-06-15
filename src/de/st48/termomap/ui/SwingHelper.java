package de.st48.termomap.ui;

import java.awt.Dimension;

import javax.swing.JComponent;

public class SwingHelper {
	public static void setComponentSize(JComponent comp, int w, int h) {
		comp.setPreferredSize(new Dimension(w,h));
		comp.setMinimumSize(new Dimension(w,h));
		comp.setMaximumSize(new Dimension(w,h));
	}
}

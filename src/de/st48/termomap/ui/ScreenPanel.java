package de.st48.termomap.ui;

import static de.st48.termomap.conf.ConfigUI.H_SCREEN;
import static de.st48.termomap.conf.ConfigUI.W_SCREEN;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import de.st48.termomap.main.MyImage;
import de.st48.termomap.main.Simulation;

@SuppressWarnings("serial")
public class ScreenPanel extends StyledPanel {
	private ImageIcon icon;
	private MyImage image;
	private Simulation simulation;
	private ScreenPanel panel = this;

	public ScreenPanel(MyImage image, int w, int h) {
		super(w, h);
		this.image = image;
		JLabel label = new JLabel();
		icon = new ImageIcon(this.image.getImage());
		label.setIcon(icon);
		simulation = new Simulation(panel);
		
		SwingHelper.setComponentSize(label, W_SCREEN, H_SCREEN);
		MouseListener listener = new MyMouseListener();
		label.addMouseListener(listener);
		add(label);
	}	
	
	public ScreenPanel(String s, int w, int h) {
		super(s, w, h);
	}

	private class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			simulation.run();
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

	}

	public BufferedImage getImage() {
		return image.getImage();
	}
}

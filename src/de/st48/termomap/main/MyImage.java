package de.st48.termomap.main;

import static de.st48.termomap.conf.ConfigUI.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyImage {
	BufferedImage image = null;
	int currentIndex;

	public MyImage() {
		this.currentIndex = 0;
		image = load(PICT[1]);
	}

	public MyImage(String pict) {
		this.currentIndex = 0;
		image = load(pict);
	}

	private BufferedImage load(String pict) {
		try {
			return ImageIO.read(new File(pict));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void next() {
		if(currentIndex==PICT.length-1)
			currentIndex = 0;
		else
			currentIndex++;
		image = load(PICT[currentIndex]);
	}
}

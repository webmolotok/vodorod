package de.st48.termomap.main;

import static de.st48.termomap.conf.ConfigUI.BLACK;
import static de.st48.termomap.conf.ConfigUI.RED;
import static de.st48.termomap.conf.ConfigUI.WHITE;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import de.st48.termomap.ui.ScreenPanel;

public class Simulation {
	private ScreenPanel panel; 

	public Simulation(ScreenPanel panel) {
		this.panel = panel;
	}

	public void run() {
		BufferedImage img = panel.getImage();
		Graphics2D g2 = img.createGraphics();
		int anzahl=255;
		int st = 6;
		int r = st/2;
		int x1, y1;
		int c;
		Random random = new Random();
		MyColor myColor = MyColor.getInstance();
		for(int y = 0; y<img.getHeight(); y+=st)
		{
			for(Integer x = 0; x<img.getWidth();x+=st) {
				int color = img.getRGB(x, y);
				if(color != RED && color != WHITE){
					c=0;
					for(int i=0; i<anzahl; i++){
						x1=x; y1=y;
						color=BLACK; 
						while(color != RED && color != WHITE) {
							x1+=random.nextBoolean()?5:-5;
							y1+=random.nextBoolean()?5:-5;
							color=img.getRGB(x1,y1);
						}
						if(color==RED){
							c+=1;
						}
					}
					System.out.println("Point("+x+","+y+")  c="+c);
					g2.setColor(myColor.getColorAt(c));
					g2.fillOval(x-r, y-r, st, st);
				}
			}
		}
	}
}

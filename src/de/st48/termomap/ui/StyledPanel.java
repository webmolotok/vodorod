package de.st48.termomap.ui;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class StyledPanel extends JPanel {
	public StyledPanel() {
	}

	public StyledPanel(String labeltext, int w, int h) {
		this(w,h);
		JLabel label = new JLabel(labeltext);
		label.setAlignmentX(LEFT_ALIGNMENT);
		add(Box.createVerticalGlue());
		add(label);
	}
	
	public StyledPanel(int w, int h) {
		setBorder(BorderFactory.createEtchedBorder());
		SwingHelper.setComponentSize(this, w, h);
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	}

}

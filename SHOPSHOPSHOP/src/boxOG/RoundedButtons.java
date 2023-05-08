package boxOG;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;

public class RoundedButtons extends JButton {

	public RoundedButtons(String text) {
	    int buttonSize = 150;
	    setPreferredSize(new Dimension(buttonSize, buttonSize));
	    setMinimumSize(new Dimension(buttonSize, buttonSize));
	    setMaximumSize(new Dimension(buttonSize, buttonSize));
	    setBorderPainted(false);
	    setFocusPainted(false);
	    setOpaque(false);
	    
	    setText(text); // set the button text
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 40, 40));
        super.paintComponent(g);
    }
}

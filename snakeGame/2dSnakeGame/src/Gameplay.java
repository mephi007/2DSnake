import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Gameplay extends JPanel{
	private ImageIcon titleImage;
	public Gameplay() {
		
	}
	
	public void paint(Graphics g) {
		//header and gameArea
		
		//titleImage border
		g.setColor(Color.WHITE);
		g.drawRect(24, 10, 851, 55);
		
		//draw titleImage
		titleImage = new ImageIcon("snaketitle.jpg");
		titleImage.paintIcon(this, g, 25, 11);
		
		//border for gameplay area
		g.setColor(Color.WHITE);
		g.drawRect(24, 74, 851, 577);
		
		//draw background for gameplay
		g.setColor(Color.BLACK);
		g.fillRect(25, 75, 850, 575);
	}
}

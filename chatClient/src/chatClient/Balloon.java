package chatClient;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Balloon extends JPanel {
	private static final long serialVersionUID = 1L;
	private StringMetrics stringMetrics;
	private String[] texts;
	private int width;
	private int height;
	private boolean isRight;
	
	public Balloon(String text, int width) {
		this.width = width;
		stringMetrics = new StringMetrics(new Font("궁서", Font.PLAIN, 15));
		texts = stringMetrics.toLineBreakString(text, this.width);
		height = stringMetrics.getHeight()*texts.length+5;
		setPreferredSize(new Dimension(width, height+23));
		isRight = true;
		setBackground(new Color(255,255,255));
	}
	
	public void setRight(boolean b) {
		isRight = b;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		ImageIcon imageIcon;
		int tailWidth;
		if (isRight) {
			imageIcon = new ImageIcon("images/rightTail.png");
			tailWidth = width-23;
			g2.setColor(new Color(128, 255, 128));
		}
		else {
			imageIcon = new ImageIcon("images/leftTail.png");
			tailWidth = 0;
			g2.setColor(new Color(219, 219, 255));
		}
		g2.fillRect(0, 0, width, height);
		g2.setFont(stringMetrics.getFont());
		g2.setColor(new Color(0,0,0));
		for (int i=0; i<texts.length; i++) {
			g2.drawString(texts[i], 5, (stringMetrics.getHeight())*(i+1));
		}
		Image img = imageIcon.getImage();
		g2.drawImage(img, tailWidth, height, 23, 23, this);
	}
}

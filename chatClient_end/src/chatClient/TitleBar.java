package chatClient;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TitleBar extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton minimumButton;
	private JButton closeButton;
	private ImageIcon backgroundImage;
	
	public TitleBar() {
		initMinimumButton();
		initCloseButton();
		
		backgroundImage = new ImageIcon("images/titlebarBackground.png");
		// 드래그하면 창 움직이는 이벤트
		DragListener dragListener = new DragListener(this);
		addMouseListener(dragListener);
		addMouseMotionListener(dragListener);
	}
	
	private void initMinimumButton() {
		minimumButton = new JButton(new ImageIcon("images/normalMinimum.png"));
		minimumButton.setRolloverIcon(new ImageIcon("images/rolloverMinimum.png"));
		minimumButton.setPressedIcon(new ImageIcon("images/pressedMinimum.png"));
		minimumButton.setPreferredSize(new Dimension(26,25));
		minimumButton.setBorderPainted(false);
		minimumButton.setFocusPainted(false);
		minimumButton.setContentAreaFilled(false);
		
		minimumButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(TitleBar.this); //왜인지는 모르겠지만 JFrame을 내부변수로 가지면 동작하지 않는다.
		        topFrame.setExtendedState(JFrame.ICONIFIED);
			}
		});
		
		add(minimumButton);
	}
	
	private void initCloseButton() {
		closeButton = new JButton("x");
		
		closeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		add(closeButton);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage.getImage(), 0, 0, null);
		setOpaque(false);
		super.paintComponent(g);
	}
}

class DragListener extends MouseAdapter {
	private final Container container;
	private Point mouseDownCompCoords = null;
	
	public DragListener(Container container) {
		this.container = container;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseDownCompCoords = null;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseDownCompCoords = e.getPoint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point currCoords = e.getLocationOnScreen();
		// 왜인지는 모르겠지만 JFrame을 내부변수로 가지면 동작하지 않는다.
		JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(container);
		topFrame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
	}
}
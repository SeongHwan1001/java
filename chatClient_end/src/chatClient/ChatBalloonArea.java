package chatClient;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChatBalloonArea extends JPanel{
	private static final long serialVersionUID = 1L;
	private int count;
	private GridBagLayout gridBagLayout;
	private JLabel welcomeMessage;
	
	public ChatBalloonArea() {
		count = 0;
		gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);
		setBackground(new Color(255,255,255));
		initWelcomeMessage();
	}
	
	private void initWelcomeMessage() {
		welcomeMessage = new JLabel("5조 채팅에 오신걸 환영함");
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = count++;
		gbc.weightx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(welcomeMessage, gbc);
	}
	
	public void append(String message, boolean isRight) {
		Balloon balloon = new Balloon(message, 350);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = count++;
		gbc.weightx = 1;
		gbc.fill = GridBagConstraints.NONE;
		if (isRight)
			gbc.anchor = GridBagConstraints.EAST;
		else
			gbc.anchor = GridBagConstraints.WEST;
		balloon.setRight(isRight);
		add(balloon, gbc);
		revalidate();
		repaint();
	}
}

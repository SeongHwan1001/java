package chatClient;

import java.awt.Adjustable;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class ChatPage extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel underBarPanel;
	//private JTextArea chatTextArea;
	private ChatBalloonArea chatBalloonArea;
	private JButton sendButton;
	private JTextField messageTextField;
	private ChatPage.ChatListener chatListener;
	private JScrollPane scrollPane;
	
	public ChatPage() {
		setLayout(new BorderLayout());

		initComponents();
	}

	private void initComponents() {
		initChatBalloonArea();
		initUnderBarPanel();
	}
	
	private void initChatBalloonArea() {
		chatBalloonArea = new ChatBalloonArea();
		scrollPane = new JScrollPane(chatBalloonArea);
		add(scrollPane, BorderLayout.CENTER);
	}
	
	private void initUnderBarPanel() {
		underBarPanel = new JPanel();
		underBarPanel.setLayout(new BorderLayout());
		add(underBarPanel, BorderLayout.SOUTH);
		initMessageTextField();
		initSendButton();
	}

	private void initMessageTextField() {
		messageTextField = new JTextField(10);
		underBarPanel.add(messageTextField, BorderLayout.CENTER);
		messageTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
					sendButtonClick();
			}
		});
	}
	
	private void initSendButton() {
		sendButton = new JButton("전송");
		underBarPanel.add(sendButton, BorderLayout.EAST);
		sendButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendButtonClick();
			}
		});
	}

	public void setChatListner(ChatPage.ChatListener chatListener) {
		this.chatListener = chatListener;
	}
	
	private void sendButtonClick() {
		if (chatListener != null)
			chatListener.onChat(messageTextField.getText());
		messageTextField.setText("");
	}
	
	public void appendMessage(String message, boolean me) {
		chatBalloonArea.append(message, me);
		JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
		verticalScrollBar.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				Adjustable adjustable = e.getAdjustable();
				adjustable.setValue(adjustable.getMaximum());
				verticalScrollBar.removeAdjustmentListener(this);
			}
		});
	}
	
	public interface ChatListener {
		void onChat(String message);
	}
}

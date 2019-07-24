package chatClient;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * GUI인것도 맞지만 컨트롤러의 역할도 함. 대충만든거라 책임분리가 좀개판임
 */
public class ChatGUI extends JFrame implements ClientChatService.ClientChatListener {
	private static final long serialVersionUID = 1L;
	private ClientChatService client;
	private LoginPage loginPage;
	private ChatPage chatPage;
	private CardLayout cardLayout;
	private TitleBar titleBar;
	private JPanel contentWindow;
	
	// Constructor
	public ChatGUI(ClientChatService client) {
		this.client = client;
		getContentPane().setLayout(new BorderLayout());
		initComponents();
		initFrame();
	}

	private void initComponents() {
		initTitleBar();
		initContentWindow();
	}

	private void initTitleBar() {
		titleBar = new TitleBar();
		getContentPane().add(titleBar, BorderLayout.NORTH);
	}

	private void initContentWindow() {
		contentWindow = new JPanel();
		getContentPane().add(contentWindow, BorderLayout.CENTER);
		cardLayout = new CardLayout();
		contentWindow.setLayout(cardLayout);

		initLoginPage();
		initChatPage();
	}

	private void initLoginPage() {
		loginPage = new LoginPage();
		contentWindow.add("Login", loginPage);

		loginPage.setLoginListener(new LoginPage.LoginListener() {
			@Override
			public void onLoginRequest(String id) {
				client.setNickName(id);
				cardLayout.show(contentWindow, "Chat");
			}
		});
	}

	private void initChatPage() {
		chatPage = new ChatPage();
		contentWindow.add("Chat", chatPage);

		chatPage.setChatListner(new ChatPage.ChatListener() {
			@Override
			public void onChat(String message) {
				client.sendMessage(message);
			}
		});
	}

	private void initFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 700);
		setLocation(200, 200);
		setTitle("Bit Chat");
		setUndecorated(true);
		setVisible(true);
	}

	// 메시지수신 콜백
	@Override
	public void onReceiveMessage(String message, boolean me) {
		chatPage.appendMessage(message, me);
	}
}

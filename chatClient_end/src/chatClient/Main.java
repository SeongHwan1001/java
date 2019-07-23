package chatClient;

public class Main {
	public static void main(String[] args) {
		ClientChatService c = new ChatClient();
		ChatGUI gui = new ChatGUI(c);
		c.setClientChatListener(gui);
	}
}

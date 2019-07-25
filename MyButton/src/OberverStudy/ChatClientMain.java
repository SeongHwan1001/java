package OberverStudy;

public class ChatClientMain {
	public static void main(String[] args) {
		IClientChat clientChat = new ChatClient();
		ChatClientGUI gui = new ChatClientGUI(clientChat);
	}
}
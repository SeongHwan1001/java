package chatClient;

/*
 * 코드정리 된것도있고 안된것도 있습니다
 * 클래스이름 대충지어서 뭐하는 클래스인지 알기 힘듭니다.
 */
public class Main {
	public static void main(String[] args) {
		ClientChatService c = new ChatClient();
		ChatGUI gui = new ChatGUI(c);
		c.setClientChatListener(gui);
	}
}

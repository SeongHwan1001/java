package chatClient;

/*
 * 클라이언트 코어가 구현하는 인터페이스임.
 * 클라이언트 코어의 사용자는 메시지를 보낼수도 있지만 받을수도 있음
 * 메시지수신 상태 캐치를 위해 ClientChatListner를 구현해야함
 */
public interface ClientChatService {
	void setNickName(String nickName);
	void sendMessage(String message);
	void setClientChatListener(ClientChatService.ClientChatListener onChatListener);
	void closeSocket();
	
	public interface ClientChatListener {
		void onReceiveMessage(String message, boolean me);
	}
}

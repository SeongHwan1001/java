package chatClient;

import java.io.*;
import java.net.*;

public class ChatClient extends Thread implements ClientChatService {
	private String ip;
	private int port;
	private Socket socket;
	private PrintWriter out;
	private BufferedReader in;
	private String inputMessage;
	private ClientChatListener onChatListener;
	private String nickName;
	
	public ChatClient() {
		ip = "218.39.221.81";
		port = 5000;
		nickName = "";
		requestToConnect();
	}
	
	private void requestToConnect() {
		try {
			socket = new Socket(ip, port);
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			this.out = new PrintWriter(out);
			this.in = new BufferedReader(new InputStreamReader(in));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.start();
	}
	
	@Override
	public void setClientChatListener(ClientChatService.ClientChatListener onChatListener) {
		this.onChatListener = onChatListener;
	}
	
	@Override
	public void sendMessage(String message) {
		out.println(nickName+":"+message);
		out.flush();
	}
	
	@Override
	public void run() {
		try {
			while ((inputMessage = in.readLine()) != null) {
				if (onChatListener != null) {
					boolean me = false;
					if (inputMessage.substring(0,nickName.length()+1).equals(nickName+":"))
						me = true;
					onChatListener.onReceiveMessage(inputMessage, me);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public void closeSocket() {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}

package OberverStudy;

// 설계
public interface IClientChat {
	void sendMessage(String message);
	void addOnRecieveListener(OnRecieveListener onRecieveListener);
}

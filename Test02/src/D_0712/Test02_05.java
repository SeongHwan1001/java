//package D_0712;
//
////6�� �ǽ�
//
//interface Boardgame {
//
//}
//class Janggi implements Boardgame{
//	//�ʵ�
//	Ai i;
//	//������
//	Janggi() { }
//	//�μ��� �ϳ��� ������
//	Janggi(Ai i) {
//		this.i = i;
//	}
//	
//	//�޼ҵ�
//	public void start() {
//		i.func01();
//		System.out.println("�뱹�� �����մϴ�.");
//	}
//	public void play() {
//		i.func01();
//		System.out.println("�뱹�� ����˴ϴ�.");
//	}
//	public void end() {
//		i.func01();
//		System.out.println("�뱹�� ����˴ϴ�.");
//	}
//	public void pan() { // ���丮�Լ�(�Լ����� ������� �Լ�)
//		this.start();
//		this.play();
//		this.end();
//	}
//}
//
//class Badooc implements Boardgame {
//	//�ʵ�
//	Ai i;
//	//������
//	Badooc(Ai i) {
//		this.i = i;
//	}
//	
//	//�޼ҵ�
//	public void start() {
//		i.func01();
//		System.out.println("�ٵ��� �����մϴ�.");
//	}
//	public void play() {
//		i.func01();
//		System.out.println("�ٵ��� ����˴ϴ�.");
//	}
//	public void end() {
//		i.func01();
//		System.out.println("�ٵ��� ����˴ϴ�.");
//	}
//	public void pan() { // ���丮�Լ�(�Լ����� ������� �Լ�)
//		this.start();
//		this.play();
//		this.end();
//	}
//}
//
//interface Ai {
//	abstract void func01();
////	void func01() {
////		System.out.println("�� �̸��� Ai");
////	}
//}
//class Alpago implements Ai {
//	public void func01() {
//		System.out.println("�� �̸��� ���İ�");
//	}
//}
//class Betago implements Ai {
//	public void func01() {
//		System.out.println("�� �̸��� ��Ÿ��");
//	}
//}
//
//public class Test02_05 {
//	public static void main(String[] args) {
////		Janggi ja = new Janggi();
////		ja.start(new Alpago());
////		ja.play(new Alpago());
////		ja.end(new Alpago());
//		
//		Janggi ja1 = new Janggi(new Alpago());
//		ja1.start();
//		Janggi ja2 = new Janggi(new Betago());
//		ja2.play();
//		
//		Badooc ba1 = new Badooc(new Betago());
//		ba1.end();
//		
//	}
//}

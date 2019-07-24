//package D_0712;
//
////6번 실습
//
//interface Boardgame {
//
//}
//class Janggi implements Boardgame{
//	//필드
//	Ai i;
//	//생성자
//	Janggi() { }
//	//인수가 하나인 생성자
//	Janggi(Ai i) {
//		this.i = i;
//	}
//	
//	//메소드
//	public void start() {
//		i.func01();
//		System.out.println("대국을 시작합니다.");
//	}
//	public void play() {
//		i.func01();
//		System.out.println("대국이 진행됩니다.");
//	}
//	public void end() {
//		i.func01();
//		System.out.println("대국이 종료됩니다.");
//	}
//	public void pan() { // 팩토리함수(함수들을 묶어놓은 함수)
//		this.start();
//		this.play();
//		this.end();
//	}
//}
//
//class Badooc implements Boardgame {
//	//필드
//	Ai i;
//	//생성자
//	Badooc(Ai i) {
//		this.i = i;
//	}
//	
//	//메소드
//	public void start() {
//		i.func01();
//		System.out.println("바둑을 시작합니다.");
//	}
//	public void play() {
//		i.func01();
//		System.out.println("바둑이 진행됩니다.");
//	}
//	public void end() {
//		i.func01();
//		System.out.println("바둑이 종료됩니다.");
//	}
//	public void pan() { // 팩토리함수(함수들을 묶어놓은 함수)
//		this.start();
//		this.play();
//		this.end();
//	}
//}
//
//interface Ai {
//	abstract void func01();
////	void func01() {
////		System.out.println("내 이름은 Ai");
////	}
//}
//class Alpago implements Ai {
//	public void func01() {
//		System.out.println("내 이름은 알파고");
//	}
//}
//class Betago implements Ai {
//	public void func01() {
//		System.out.println("내 이름은 베타고");
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

package D_0716;

abstract class Apple04 {
	void func01() {
		System.out.println("func01 call");
	}

	abstract void func02(); // 미구현 - 추상함수
}

class Banana04 extends Apple04 {

	@Override
	void func02() {
		System.out.println("func02 call");
	}

}

public class Ex04 {
	public static void main(String[] args) {
		// Apple04 a4 = new Apple04(); //객체 생성 불가
		Banana04 b = new Banana04();
		b.func01();
		b.func02();
	}
}

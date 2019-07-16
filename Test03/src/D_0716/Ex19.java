package D_0716;

interface Apple19 {
	void func01();
}

// 결국 Banana를 못 사용하기 때문에 함수를 구현 하지 않아도 됨
// 인터페이스 안에 인터페이스를 사용하는 것과 같다.
abstract class Banana19 implements Apple19 {
	public void func01() {
	}
	abstract void func02();
}

public class Ex19 {
	public static void main(String[] args) {
		Banana19 b = new Banana19() {
			@Override
			public void func01() {
				System.out.println("Banana19 func01 call");
			}
			@Override
			public void func02() {
				System.out.println("Banana19 func02 call");
			}
		};
		
		b.func01();
		b.func02();
	}
}

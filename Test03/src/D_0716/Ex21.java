package D_0716;

// 실전에 사용하는 예시 ******
// 이해하고 넘어가기!

class A1 {
	interface B1 {
		void func01();
	}
}

class C1 {
	void func02(A.B ab) {
		//A1.B1
		System.out.println("1 C1 func02 call");
		ab.func01();
	}
}

public class Ex21 {
	public static void main(String[] args) {
		C1 c = new C1();
		
		// 익명 함수로 func02 함수 인수로 코드를 전달해줌
		c.func02(new A.B() {
			@Override
			public void func01() {
				System.out.println("2 C1 func02 call");
			}
		});
	}
}

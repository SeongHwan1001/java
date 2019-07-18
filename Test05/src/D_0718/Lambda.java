package D_0718;

// 실전 코드 예제
interface A {
	void func01();
}

interface B {
	A func02();	// 인터페이스 return
}

public class Lambda {
	public static void main(String[] args) {
		B b1 = new B() {
			@Override
			public A func02() {
				return new A() {
					@Override
					public void func01() {
						System.out.println("실전 예제");
					}
				};
			}
		};
		A a1 = b1.func02();
		a1.func01();
		
		// new class 이름이 없어지고, 함수 이름 껍데기를 벗겨라 -> 람다식 만드는 방법!!!
		// 위 소스를 람다식으로 변경
		// 람다식을 사용하면 슈가 코드가 된다.
		B b2 = () -> () -> System.out.println();
		A a2 = b2.func02();
		a2.func01();
	}
}

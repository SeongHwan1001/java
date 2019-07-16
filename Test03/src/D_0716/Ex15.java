package D_0716;

// Ex14의 응용
// 앞으로 계속 사용할 코드, 익숙해져야 함
// 함수 인수로 코드를 전달했다라고 이해해야 함

interface Apple15 {
	void func01();
}

class Banana15 {
	void func02(Apple15 apple15) {
		System.out.println("<1> Banana func02 call");
		apple15.func01();
	}
}

public class Ex15 {
	public static void main(String[] args) {
		Banana15 b = new Banana15();
		
		// 익명 함수
		// 함수 인수로 코드 전달
		b.func02(new Apple15() {
			@Override
			public void func01() {
				System.out.println("<2> Apple func01 call");
			}
		});
		
		// 함수 인수로 코드 전달
		b.func02(new Apple15() {
			public void func01() {
				System.out.println("<3> Apple func01 call");
			}
		});
		
	}
}

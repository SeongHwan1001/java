package D_0716;
// class와 interface 사이에 함수를 생성하지 않는다.
class Apple17 {
	interface Banana17 {
		void func01();
	}
}

// 1번방법 : 잘 사용하지 않는 방법
// Orenge17은 인터페이스 Banana17의 함수 구현
/*class Orenge17 implements Apple17.Banana17 {
	@Override
	public void func01() {
		System.out.println("Banana func01()");
	}
}*/

public class Ex17 {
	public static void main(String[] args) {
		// 1번 방법
		/*Orenge17 o = new Orenge17();
		o.func01();*/
		
		// 2번 방법 : 익명 클래스
		Apple17.Banana17 ab = new Apple17.Banana17() {
			
			@Override
			public void func01() {
				System.out.println("2번 interface Banana func01()");
			}
		};	
		ab.func01();
	
		// 3번 방법 : 익명 객체
		new Apple17.Banana17() {
			@Override
			public void func01() {
				System.out.println("3번 interface Banana func01()");
			}
		}.func01();
	}
}

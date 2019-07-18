package D_0718;

interface A1 {
	void x();
}

class B11 {
	public void y1(A1 a) {
		a.x();
	}
}

public class Ex02 {
	public static void main(String[] args) {
		B11 b = new B11();
		int i = 10;
		
		// b.y1(a); // 원래 이렇게 사용, 하지만 클래스 생성x
		
		// 익명 함수
		b.y1(new A1() {
			public void x() {
				System.out.println("1 - 1");
			}
		});
		
		// 람다식 구현
		b.y1 ( () -> { System.out.println("1 - 1"); } );
	}

}

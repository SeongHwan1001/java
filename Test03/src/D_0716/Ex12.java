package D_0716;

// 클래스 내부에 클래스
class Apple12 {
	void func01() {
		System.out.println("Apple call");
	}
	class Banana12 {
		void func02() {
			System.out.println("Banana call");
		}
	}
}

public class Ex12 {
	public static void main(String[] args) {
		// Apple 클래스는 평소 사용하는 방법처럼 사용 하면 됨
		Apple12 a = new Apple12();
		a.func01();
		
		// Apple12에 속해있는 Banana class의 함수를 호출하는 방법
		Apple12.Banana12 b = a.new Banana12();
		b.func02();
	}
}

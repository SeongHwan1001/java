package D_0716;

// 인터페이스 안에 class가 존재 할 수 있다.
interface Apple11 {
	void func01();
	class Banana11 {
		void func02() {	
			// 구현 하지 않아도 된다. 어차피 아래에서 오버라이딩을 하기 때문
		}
	}
}

// 안에 있는 클래스를 사용하지 않겠다면 일반적으로 인터페이스 사용 하듯이 사용하면 된다.
class Orenge implements Apple11 {
	@Override
	public void func01() {
		System.out.println("func01 call");
		
	}
}

// Ex10 과는 다르게 클래스를 상속 받기 때문에 extends를 사용함을 주의하라.
class Kiwe extends Apple11.Banana11 {
	@Override
	public void func02() {
		System.out.println("func02 call");
	}
}


public class Ex11 {
	public static void main(String[] args) {
		Orenge o = new Orenge();
		o.func01();
		
		Kiwe k = new Kiwe();
		k.func02();
	}
}

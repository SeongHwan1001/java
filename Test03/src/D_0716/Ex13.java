package D_0716;

interface Apple13 {
	void func01();
}
// 1번 방법에 필요한 class
/*class Banana13 implements Apple {
	@Override
	public void func01() {
		System.out.println("Banana call");
	}
	
}*/
public class Ex13 {
	public static void main(String[] args) {
		// 1번방법 보다는 2번, 3번 방법을 많이 사용함. 특히 2번
		
		// 1번 방법
		/*Banana13 b = new Banana13();
		b.func01();*/
		
		// 2번 방법 <익명 클래스>
		// 인터페이스는 구현 클래스 없이 객체를 생성시킬 수 없지만 생성자 콜 뒤에 스코프을 열어서 함수를 생성해주면 사용이 가능하다.
		// 인터페이스 함수를 구현 할 때는 항상 함수 앞에 public을 붙여줘야 함.
		Apple13 a = new Apple13() { 
			public void func01() {
				System.out.println("Bananaaaa");
			}
		};
		a.func01();	// Bananaaaa 출력
		
		// 3번 방법 <익명객체>
		// 객체가 없기 때문에 메모리가 생성되었다가 바로 사라진다. 그렇게 때문에 스코프 뒤에 도트를 통해서 함수를 호출할 수 있다.
		// 객체의 이름이 존재하지 않기 때문에 익명 객체라고 한다.
		// 함수가 기능을 구현하고 다음에 사용하지 않고 바로 버릴때 사용함.
		new Apple13() {
			public void func01() {
				System.out.println("Banana");
			}
		}.func01();
	}
}

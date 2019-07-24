//package D_0712;
//
////3번 실습
////다형성
//class Apple {
//	// 코드가 없더라고 생성자를 만들어 놓는 것이 일반적이다.
//	Apple() {	}
//	
//	Apple(int n) {
//		
//	}
//	
//	void func01() {
//		System.out.println("<부>함수 1번 call");
//	}
//	void func03() {
//		System.out.println("<부>함수 3번 call");
//	}
//	void func05() {
//		func06();
//		func07();
//	}
//	void func06() { 
//		System.out.println("<부>함수 6번 call");
//	}
//	void func07() { 
//		System.out.println("<부>함수 7번 call");
//	}
//}
//
////상속
//class Orenge extends Apple {	
//	void func02() {
//		System.out.println("<자>함수 2번 call");
//	}
//	void func03() { // 자식함수로 인해 부모함수가 가려졌다하고 표현한다. = 메소드 오버라이딩
//		System.out.println("<자>함수 3번 call");
//	}
//	void func04() { // 4번 함수를 통해서 3번 함수를 호출함. 바로 부모 함수를 호출 할 수 없다.
//		func03();  // 자식 3번 함수 호출
//		super.func03(); // 부모 3번 함수 호출
//	}
//	// 오버라이딩
//	// 오버라이딩 함수는 먼저 자식을 뒤진다. 자식에게 없을 경우에 부모껄 뒤져서 출력한다.
//	// 한마디로 메소드 재정의(오버라이딩)된 함수 부모는 무시된다.
//	void func06() {  
//		System.out.println("<자>함수 6번 call");
//	}
//}
//
//public class Test02_02 {
//	public static void main(String[] args) {
//		// 생성자가 하나라도 존재하면 디폴트 생성자를 생성해 주지 않는다.
//		// 인수전달 시 에러 발생
//		// 그렇기 때문에 디폴트 생성자를 직접 생성해라.
//		Apple a1 = new Apple();
//		Apple a2 = new Apple(10);
//		
//		Orenge a3 = new Orenge();
//		a3.func01();	// 우선 자식에게 먼저 가고 없으면 부모 것을 뒤진다.
//		a3.func02();	
//		a3.func03();	// 자식에게 있는 03번 함수를 부모것을 호출 할 방법 없음
//		a3.func05();
//	}
//}
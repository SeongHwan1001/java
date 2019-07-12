package D_0712;

//2번 실습
//여러개의 클래스 생성은 가능하지만 public은 하나만 붙일 수 있다.
//class Apple {
//	
//	//필드, 초기화는 생성자를 통해 초기화 할 수 있도록 습관시키기
//	int num; 
//	
//	// 생성자 이름은 클래스 이름과 동일해야 함.
//	// 객체가 생성 될 때 단 한번 호출
//	Apple() {
//		System.out.println("생성자 call");
//		System.out.println(this.hashCode()); // 아래의 hashcode와 동일, this = a, 태어났을 때 지시해주는 놈
//		
//		num = 0;
//	}
//	
//	Apple(int a, int b) {
//		
//	}
//	
//	Apple(int num) { // 생성자 매개변수는 필드변수를 초기화 하기 위해 사용 됨
//		this.num = num; // this를 쓰는 것이 정석이다. this는 체이닝기법, 생성자 이외에 사용 할 일이 거의 없다.
//	}
//	
//	void func01() {  // 앞으로 함수명은 func로 통일
//		System.out.println("함수 1번 call");
//	}
//	
//	void func02(int a, int b) {
//		System.out.println(a + b);
//	}
//	
//	int func03() {
//		return 100;
//	}
//	
//	int func04(int a, int b) {
//		return a+b;
//	}
//	
//	Apple func05() {
//		System.out.println("함수 5번 call");
//		return this;
//	}
//	
//	void func06() {
//		System.out.println("함수 6번 call");
//	}
//	// 함수 오버로딩
//	int func06(int a) {
//		return a;
//	}
//	// 함수 오버로딩
//	char func06(char c) {
//		return c;	// return 타입으로 오버로딩 불가능, 알수가 없다.
//	}
//	
//}
//
//public class Test02_01 {
//	public static void main(String[] args) {
//		Apple a = new Apple();
//		System.out.println(a.hashCode()); // hashcode()는 객체의 주민등록 번호느낌
//		a.func01();
//		System.out.println(a.num);
//		a.func02(3, 4);
//		System.out.println(a.func03());
//		System.out.println(a.func04(4, 5));
//		a.func05(); // 자기자신 return
//		a.func05().func05().func06(); // 체이닝 방식, 자주보게 되는 문법 구조
//		
//		// 보통 체이닝 되는 함수는 아래의 방식대로 사용을 한다.
//		a
//		.func05()
//		.func05()
//		.func06();
//		
//	}
//}
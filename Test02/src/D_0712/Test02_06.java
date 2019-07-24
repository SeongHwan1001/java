package D_0712;

////////////////////////////
//7번 실습
//추상화 함수가 하나라도 존재한다면 class 에도 abstract 붙여 줘야 함
//abstract class Animal { 
//	abstract void func01(); // 추상, 반드시 자식에서 만들어주어야 함
//	void func02() {
//		System.out.println("부모 함수 2번 call");
//	}
//}
//
//class Dog extends Animal {
//	void func01() {
//		System.out.println("자식 함수 1번 call");
//	}
//	void func03() {
//		System.out.println("자식 함수 3번 call");
//	}
//}
//public class Test02_06 {
//	public static void main(String[] args) {
//		Dog d = new Dog();
//
//	}
//}
//////////////////////////////////////////////
//interface Animal { 
//	abstract void func01(); // 추상화, 반드시 자식에서 만들어주어야 함
//	abstract void func02();
//}
//
//class Dog implements Animal { // implements를 사용하면 함수는 반드시 public이어야 함
//	public void func01() {
//		System.out.println("자식 함수 1번 call");
//	}
//	public void func02() {
//		System.out.println("자식 함수 2번 call");
//	}
//}
//public class Test02_06 {
//	public static void main(String[] args) {
//	Dog d = new Dog();
//
//	}
//}
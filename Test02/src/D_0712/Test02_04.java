package D_0712;

//5번 실습
//다형성과는 거리가 멀지만 기술적인 부분 실습
//잠재적으로 문제를 일으킬 소지가 있는 소스이다.
//class Apple {
//	
//	//필드
////	Banana ba;
////	Orenge or;
//	Fruit fr;
//	
//	//생성자 주입(injection)
//	Apple(Fruit fr) {
//		this.fr = fr;
//	}
//	
//	//메서드
//	void func01() {
//		fr.func03();
////		ba.func03();
////		or.func03();
//	}
//	void func02() {
//		fr.func03();
////		ba.func03();
////		or.func03();
//	}
//}
//
//class Fruit {
//	void func03() {
//		System.out.println("Fruit 함수 3번 call");
//	}
//}
//
//class Banana extends Fruit {
//	void func03() {
//		System.out.println("Banana 함수 3번 call");
//	}
//}
//
//class Orenge extends Fruit {
//	void func03() {
//		System.out.println("Orenge 함수 3번 call");
//	}
//}
//
//public class Test02_04 {
//	public static void main(String[] args) {
//		//Apple a = new Apple();
//		// 각 함수를 호출 할때마다 새로운 객체를 생성하여 넘기고 있음
//		// 함수의 인수 전달의 오버헤드의 비용은 파일 입출력 다음으로 2번째로 많이 발생함.
//		//a.func01(new Banana());
//		//a.func02(new Banana());
//		
//		// 생성자를 사용함으로써 오버헤드 비용을 줄이고 같은 객체를 사용함.
//		// 다형성을 사용함으로써 반복되는 함수를 재사용 하도록 함
//		Apple a1 = new Apple(new Banana());
//		a1.func01();
//		a1.func02();
//		Apple a2 = new Apple(new Orenge());
//		a2.func01();
//		a2.func02();
//	}
//}
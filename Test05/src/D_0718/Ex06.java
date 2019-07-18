package D_0718;

//2019.07.18(목) 오후 실습
// 람다식 형태에 익숙해지기

// Ex01
// 인터페이스를 익명 함수로 구현
//interface Apple {
//	void func01();
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		// 익명 함수 구현
//		Apple a = new Apple() {
//			@Override
//			public void func01() {
//				System.out.println("Apple call");
//			}
//		};
//		a.func01();
//	}
//}




// Ex02
// 인터페이스를 람다식으로 구현
//interface Apple {
//	void func01();
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		// 람다식 구현 , new Apple()를 점프했다고 생각
//		Apple a = () -> {	// 이 함수가 func01 구현 된 것
//				System.out.println("Apple call");
//		};
//		a.func01();
//	}
//}


// Ex03
// 인수전달이 있는 인터페이스
//interface Apple {
//	void func01(int num);
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		Apple a = (num) -> {	
//				System.out.println("Apple a num : " + num);
//		};
//		a.func01(10);
//		
//		// 인수전달이 한개 일때만 () 생략가능, 실전 코드에서는 모양꼴을 많이 사용한다.
//		Apple b = num -> {	
//			System.out.println("Apple b num : " + num);
//		};
//		b.func01(20);
//		
//		// 실행되는 문장이 단 문장일 때 스코프를 생략 할 수 있다.
//		Apple c = num -> System.out.println("Apple c num : " + num);
//		
//		c.func01(30);
//		
//		// 람다식 코드로 보지 않고 마지막 문장을 그냥 들어 온 코드로 인식한다.
//		Apple cc = num -> 
//			System.out.println("Apple c num : " + num);
//			System.out.println("dmdmdmdmdm");
//		
//		//cc.func01(30); // 주석 처리하고 실행 해 보면 의미 이해
//	}
//}

//Ex04
//인수전달이 2개 있는 인터페이스
//interface Apple {
//	void func01(int n, String s);
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		Apple a = (num, s) -> {	
//				System.out.println("인수1 : " + num + ", 인수2 : " + s);
//		};
//		a.func01(10, "222");
//	}
//}

// Ex05
// 리턴값이 있는 인터페이스
//interface Apple {
//	int func01();
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		Apple a = () -> {	
//				return 100; 
//		};
//		System.out.println("Apple a : " + a.func01());
//		
//		// 단문장일 때 스코프를 생략 할 수 있지만 생략하고자 할 때 return 도 생략을 해야 한다.
//		// 실전에서 아래의 방법을 많이 사용한다.
//		// 아래의 문법 가장 많이 사용되는 문법
//		Apple b = () -> 100; // 가장 많이 사용 *****
//		System.out.println("Apple b : " + b.func01());
//		
//		// 함수안에 함수가 있다.(IIFE 문법이라고 한다.) 후에 한번 찾아보기
//		/* Apple c = () -> {return (100) -> {
//			return 200;
//		}};*/
//	}
//}

//Ex06
//인수전달, 리턴 모두 있는 인터페이스
//interface Apple {
//	int func01(int n);
//}
//
//public class Ex06 {
//	public static void main(String[] args) {
//		Apple a = (n) -> {
//			return 200*n; 
//		};
//		
//		Apple b = n -> 300*n;
//		
//		System.out.println(a.func01(3));
//		System.out.println(a.func01(4));
//	}
//}

//Ex07
interface Apple {
	void func01(int n, String s);
}

class Banana {
	void func02(Apple apple) {
		apple.func01(100, "app");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Banana b = new Banana();
		
		b.func02(new Apple() {
			@Override
			public void func01(int n, String s) {
				System.out.println("n : " + n + ", s : " + s);
			}
		});
		
		b.func02((n, s) -> {
			System.out.println("n : " + n + ", s : " + s);
		});
	}
}







package D_0718;

//EX01
//AOP(spring의 3대 요소)
//public class Ex07 {
//	public static void main(String[] args) {
//		System.out.println(1);
//		
//		try {
//			Thread.sleep(2000); // 잠시 block 코드, 이 문장은 try-catch와 사용해야 함
//			System.out.println("호랑이");
//		} catch (Exception e) {
//
//		}
//		System.out.println(2);
//		
//		System.out.println(1);
//		
//		try {
//			Thread.sleep(2000);
//			System.out.println("코끼리");
//		} catch (Exception e) {
//
//		}
//		System.out.println(2);
//		
//		System.out.println(1);
//		
//		try {
//			Thread.sleep(2000); // 잠시 block 코드, 이 문장은 try-catch와 사용해야 함
//			System.out.println("독수리");
//		} catch (Exception e) {
//
//		}
//		System.out.println(2);
//	}
//}

// EX02
// throws : 함수를 부른 놈이 책임 져라...
//interface T{
//	void func01() throws Exception;
//}
//
//class Aa {
//	void func02(T t) {
//		System.out.println(1);
//		try {
//			t.func01();
//		} catch (Exception e) {
//		}
//		System.out.println(2);
//	}
//	
//	void func01() {
//		func02(new T() {
//			public void func01() throws Exception {
//				Thread.sleep(2000); // 잠시 block 코드, 이 문장은 try-catch와 사용해야 함
//				System.out.println("호랑이");
//			}
//		});
//		func02(new T() {
//			public void func01() throws Exception {
//				Thread.sleep(2000); // 잠시 block 코드, 이 문장은 try-catch와 사용해야 함
//				System.out.println("코끼리");
//			}
//		});
//		func02(new T() {
//			public void func01() throws Exception {
//				Thread.sleep(2000); // 잠시 block 코드, 이 문장은 try-catch와 사용해야 함
//				System.out.println("독수리");
//	
//			}
//		});
//		
//		
//		
//	}
//}
//
//public class Ex07 {
//	public static void main(String[] args) {
//		Aa a = new Aa();
//		a.func01();
//	}
//
//}



// EX03
// throws : 함수를 부른 놈이 책임 져라...
// 꼭 다시해보기!
interface T{
	void func01() throws Exception;
}

class Aa {
	void func02(T t) {
		System.out.println(1);
		try {
			t.func01();
		} catch (Exception e) {
		}
		System.out.println(2);
	}
	
	void func01() {
		func02(() -> {
				Thread.sleep(2000);
				System.out.println("호랑이");
		});
		func02( () -> {
				Thread.sleep(2000);
				System.out.println("코끼리");
		});
		func02( () -> {
				Thread.sleep(2000);
				System.out.println("독수리");
		});
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Aa a = new Aa();
		a.func01();
	}
}
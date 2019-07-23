package D_0723;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// LinkedList 정렬 기법1
class A {
	// 필드
	//int n;
	int n;
	String s;
	// 생성자
	public A(int n, String s) {
		this.n = n;
		this.s = s;
	}
	// 메서드
	void output() {
		System.out.println("num : " + n + ", s : " + s);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		LinkedList<A> list = new LinkedList<A>();
		
		list.add(new A((int)(Math.random()*100) % 100, "호랑이"));
		list.add(new A((int)(Math.random()*100) % 100, "코끼리"));
		list.add(new A((int)(Math.random()*100) % 100, "독수리"));
		list.add(new A((int)(Math.random()*100) % 100, "맘모스"));
		list.add(new A((int)(Math.random()*100) % 100, "코뿔소"));
		
//		list.add(new A(0.23f, "호랑이"));
//		list.add(new A(0.23f, "호랑이"));
//		list.add(new A(0.23f, "호랑이"));
//		list.add(new A(0.23f, "호랑이"));
//		list.add(new A(0.23f, "호랑이"));
		
		System.out.println("정렬 전");
		for (A item : list) {
			item.output();
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("정렬 후");

		// ****
		// 필드가 float인 필드를 이용한 정렬을 하고자 하는 경우에는 Ex02 만을 사용하고
		// 필드가 int인 필드를 이용한 정렬을 하고자 하는 경우 Ex05 번을 자주 사용한다.
		
		// Ex01
//		// 숫자를 기준으로 정렬
//		// Collections는 내부에 static함수가 있기 때문에 객체를 생성하지 않고 바로 메소드를 사용할 수 있다.
//		// Comparator은 인터페이스이기 때문에 함수를 구현해야 한다. -> 익명함수로 구현
//		// Comparator은 위에서 정의해도 되지만 바로 익명함수로 구현해서 사용하는 것이 편하고 좋다.
//		// Comparator은 가장 빠르다는 퀵 정렬을 사용하고 있고 최적화하고 있기 때문에 직접 정렬하는 것보다는 훨씬 빠르다.
//		Collections.sort(list, new Comparator<A>() {
//			// compare 함수를 사용하여 정렬을 어떻게 할 것인지 정의한다.
//			@Override
//			public int compare(A o1, A o2) {
//				// 순차 정렬을 해주는 코드(역방향은 부등호를 변경하거나 return 값을 바꿔주면 됨)
//				// if-else 동등의 개념을 포함 , -1이 있기 때문에 +1로 적어서 동등하게 맞춰준다.
//				if(o1.n > o2.n) // if(o1.n < o2.n) : 역순
//					return +1;	// 양수의 대명사를 +1이라고 본다.
//				else
//					return -1;
//
//			}
//		});

		
		// Ex02
		// Ex01의 compare 함수 안 코드를 삼항 연산자로 변경
//		Collections.sort(list, new Comparator<A>() {
//			// compare 함수를 사용하여 정렬을 어떻게 할 것인지 정의한다.
//			@Override
//			public int compare(A o1, A o2) {
//				return (o1.n > o2.n) ? +1 : -1;
//			}
//			
//		});
		
		
//		// Ex03
//		Collections.sort(list, new Comparator<A>() {
//			@Override
//			public int compare(A o1, A o2) {
//				// o1.n은 양수를, o2.n은 음수를 반환받는 것이기 때문에 Ex01 처럼 if-else를 사용하지 않아도 된다.
//				return o1.n - o2.n;
//
//			}
//		});

		
		
//		// Ex04
//		// Ex03을 람다식으로 변환
//		Collections.sort(list, (o1, o2) -> {
//				// o1.n은 양수를, o2.n은 음수를 반환받는 것이기 때문에 Ex01 처럼 if-else를 사용하지 않아도 된다.
//				return o1.n - o2.n;
//		});
//		

		
		
		// Ex05
		// Ex04를 다른형태의 람다식으로 변환
		// 람다식 안에 코드가 한 줄일 경우 스코프를 생략 할 수 있는데 return도 같이 제거해 주어야 한다.
		Collections.sort(list, (o1, o2) -> o1.n - o2.n );
		
		for (A item : list) {
			item.output();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

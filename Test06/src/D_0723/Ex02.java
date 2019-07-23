package D_0723;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// LinkedList 정렬 기법2
// n1과 n2를 곱한 값의 정렬

class A1 {
	// 필드
	int n1, n2;
	String s;
	// 생성자
	public A1(int n1, int n2, String s) {
		this.n1 = n1;
		this.n2 = n2;
		this.s = s;
	}
	// 메서드
	void output() {
		System.out.println("n1 : " + n1 + ", n2 : " + n2 + ", s : " + s);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		LinkedList<A1> listA = new LinkedList<A1>();
		
		listA.add(new A1(12, 13, "호랑이"));
		listA.add(new A1(10, 11, "코끼리"));
		listA.add(new A1(15, 14, "독수리"));
		listA.add(new A1(8, 10, "맘모스"));
		listA.add(new A1(5, 11, "코뿔소"));

		System.out.println("정렬 전");
		
		for (A1
				item : listA) {
			item.output();
		}
		
		System.out.println("----------------------------------");
		
		// n1과 n2를 곱한 값의 정렬
		
		Collections.sort(listA, new Comparator<A1>() {
			@Override
			public int compare(A1 o1, A1 o2) {

				int r1 = o1.n1 * o1.n2;
				int r2 = o2.n1 * o2.n2;
				if(r1 > r2) 
					return +1;	
				else
					return -1;
	
			}
		});
		System.out.println("정렬 후");
		
		for (A1
				item : listA) {
			item.output();
		}
	}
}

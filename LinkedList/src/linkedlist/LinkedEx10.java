package linkedlist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedEx10 {
	
	static void func01(AbstractList a) {
		
	}
	public static void main(String[] args) {
		// 멘사띠 발표는 list들의 상속관계를 표현하기 위한 예제이다.
		// 멘사띠 발표 
		// EX01
		// AbstractList가 LinkedList의 부모이다. 그렇기 때문에 아래와 같은 형식이 가능하다.
		// 캐스팅 개념이 적용된 것이다.
		// 뒤에 제네릭은 없어도 된다. 알아서 들어간다.
		// 깨알 지식 : 상속관계를 알고 싶다면 F4 단축키
		AbstractList Llist1 = new LinkedList();
		LinkedList Llist2 = new LinkedList();
		ArrayList Llist3 = new ArrayList();
		
		// Llist1, Llist2, Llist3 가 모두 성립할 수 있다.
		// func01 인수가 부모가 되기 때문에 자식으로 다 받는다.
		// 사용자가 어느 것을 사용하든 쉽게 사용 할 수 있다는 장점이 있다.
		func01(Llist1);
		func01(Llist2);
		func01(Llist3);

		Llist1.add("1");
		Llist1.add("2");
		Llist1.add("3");
		
		System.out.println(Llist1);
		
//		ArrayList Alist1 = new ArrayList(Llist1);
//		ArrayList Alist2 = new ArrayList(Llist2);
		
		// 멘사띠 발표 
		// EX02
		Queue q = Llist2;
		
	}
}

package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedEx02 {

	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<Integer>();
		LinkedList<String> link1 = new LinkedList<String>();
		
		link1.add("One");
		link1.add("Two");
		link1.add("Three");
		link1.add("Four");
		link1.add("Five");
		
		for(int i = 0 ; i < 10 ; i++) {
			link.add(i);
		}
		
		System.out.println(link);
		System.out.println(link1);
		
		// iterator : 자바의 컬렉션 프라임워크에서 컬렉션에 저장되어 있는 요소들을
		//			    읽어오는 방법을 표준화 하였는데 그 중 하나가 iterator이다.
		// iterator는 자동으로 index를 관리해주기 때문에, 사용에 편리함이 있을 수 있으나
		// iterator를 열어보면 객체를 만들어 사용하기 때문에 lisk를 이용하는 것보다 느리다.
		
		// iterator는 모든 컬렉션클래스에 데이터를 읽을 때 사용됨
		// 만약 이렇게 표준화가 안된다면 모든 컬렉션클래스에 데이터를 읽는 메서드를 일일이 알아야하고
		// 각각의 컬렉션에 접근하기 힘들어짐
		// iterator은 hasNext(), next(), remove() 3가지다
		Iterator<String> it = link1.iterator();
		
		// hashNext는 다음데이터가 있을 때까지 실행함
		while(it.hasNext()) {
			System.out.println(it.next()); // next는 다음 데이터를 반환
		}
		
		it.remove();
		System.out.println(link1);
	}

}

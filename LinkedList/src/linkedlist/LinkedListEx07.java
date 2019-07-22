package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx07 {
	public static void main(String[] args) {
		// Iterator
		// ListIterator
		// .next().previous()
		// 민현띠 발표
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("190722");
		list.add("Min");
		list.add("Hyun");
		list.add("집 가고 싶다...");
		list.add("나또한...");
		
		ListIterator<String> list_it = list.listIterator(2);
		System.out.println("Before : ");
		System.out.println(list);
		// 정방향 출력
		while(list_it.hasNext()) {
			System.out.print(list_it.next() + " ");
		}System.out.println("\n---------------------------------------");
		
		// 역방향 출력
		System.out.println("after : ");
		while(list_it.hasPrevious()) {
			System.out.print(list_it.previous() + " ");
		}System.out.println("\n---------------------------------------");
		
		// descendingIterator()
		Iterator x = list.descendingIterator();
		System.out.println("descendingIterator : ");
		while(x.hasNext()) {
			System.out.print(x.next() + " ");
		}System.out.println("\n---------------------------------------");
		
		// hasNext(), next()의 사용할 때 삭제나 삽입이 이루어졌을 때 
		// 가리키는 곳이 엉뚱한 곳을 가리킬 수도 있기 때문에 대비해서 코드를 작성해야 한다.
		// 단순히 출력하는 예제라면 문제가 되지는 않는다.

	}

}

package linkedlist;

import java.util.LinkedList;

public class LinkedEx07 {
	public static void main(String[] args) {
		// indexOf(), lastIndexOf()
		// 지훈띠 발표
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("190722");
		list.add("Min");
		list.add("Hyun");
		list.add("집 가고 싶다...");
		list.add("나또한...");
		list.add("Hello");
		
		System.out.println(list);
		// 리스트의 앞에서 부터 찾는다.
		System.out.println(list.indexOf("Hello"));
		// 리스트의 뒤에서 부터 찾는다.
		System.out.println(list.lastIndexOf("Hello"));
		// 리스트에 없기 때문에 -1 반환
		System.out.println(list.indexOf("BYE"));
	}
}

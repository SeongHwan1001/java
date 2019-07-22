package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedEx03 {

	public static void main(String[] args) {
		// 객체나 클래스들만 관리 할 수 있다.
		LinkedList<String> Client = new LinkedList<String>();
		LinkedList<String> Client4 = new LinkedList<String>();
		
		//ex1) item을 1개 추가한다.
		Client.add("신기한");
		Client.add("하정훈");
		Client.add("최은우");
		Client.add("하정훈");
		
		System.out.println(Client);
		
		//ex2) 이름 하정훈이 중복 되었을 때 첫번째에 있는 하정훈이 삭제된다.
		Client.removeFirstOccurrence("하정훈");
		
		// ex4)
		/*Client.clear();
		System.out.println(Client.poll());
		Client.add("100");
		Client.add("200");
		// 맨앞 요소 뺌
		System.out.println(Client.pop());
		System.out.println(Client.poll());*/
		
		// ex4) Client의 해당 요소 데이터가 있는지 보는 함수 boolean으로 반환됨
		for(int i = 0 ; i < 10 ; i++) {
			Client.add("data"+i);
		}
		
		System.out.println(Client);
		System.out.println(Client.contains("data5"));
		System.out.println(Client.contains("data"));
		
		// ex5)
		LinkedList<String> Client2 = new LinkedList<String>();
		
		// ex6)
		LinkedList<Integer> link1 = new LinkedList<Integer>();
		
		link1.add(0);
		link1.add(0);
		link1.add(0);
		link1.add(0);
		link1.add(0);
		
		LinkedList<String> link2 = new LinkedList<String>();
		link2.add("비트");
		link2.add("비트");
		link2.add("비트");
		link2.add("비트");
		
		// 첫번째 출력방식
		System.out.println(link1);
		System.out.println(link2);
		
		// 두번째 출력방식
		for(int i = 0 ; i < link1.size() ; ++i) {
			System.out.print(link1.get(i) + " ");
		}
		System.out.println();
		for(int i = 0 ; i < link2.size() ; ++i) {
			System.out.print(link2.get(i) + " ");
		}
		System.out.println();
		
		// 세번째 출력방식
		ListIterator<Integer> it = link1.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		ListIterator<String> it2 = link2.listIterator();
		while(it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		System.out.println();
		
		
		
		
		Client4.add("최은우");
		Client.retainAll(Client4);
		System.out.println(Client);
		
		
		
		
		
		

	}

}

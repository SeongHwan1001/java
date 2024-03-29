package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedEx01 {
	public static void main(String[] args) throws InterruptedException {
		LinkedList<Integer> link1 = new LinkedList<Integer>();
		LinkedList<Integer> link2 = new LinkedList<Integer>();
		LinkedList<Integer> link3 = new LinkedList<Integer>();
		LinkedList<Integer> link4 = new LinkedList<Integer>();
		LinkedList<Integer> link5 = new LinkedList<Integer>();
		LinkedList<Integer> link6 = new LinkedList<Integer>();
		LinkedList<Integer> link7 = new LinkedList<Integer>();
		LinkedList<Integer> link8 = new LinkedList<Integer>();
		
		LinkedList<Integer> linkT1 = new LinkedList<Integer>();
		LinkedList<Integer> linkT2 = new LinkedList<Integer>();
		LinkedList<Integer> linkT3 = new LinkedList<Integer>();
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			link1.add(i*10);
		}
		for(int j = 0 ; j < 5 ; j++) {
			linkT1.add(j);
			linkT3.add(j*10);
		}
		
		// link1 3번째 요소에 100을 추가
		link1.add(3, 100);
		// LinkedList명만 출력하면 List에 저장되어 있는 모든 데이타가 출력됨
		System.out.println("link1 print : " + link1);
		// size() 함수는 List가 가지고 있는 길이 즉, 크기를 반환해줌
		System.out.println("link1 size : " + link1.size());
		// link1 List에 link List 요소를 모두 복사해서 더함
		link2.addAll(link1);
		System.out.println("link2 print : " + link1);
		
		System.out.println("------------------test1------------------");
		
		linkT1.add(2, 10); // ListT1 2번째 자리에 10을 추가
		linkT1.addFirst(555); // ListT1 맨 앞에 555 추가 
		linkT1.addLast(888); // ListT1 맨 뒤에 888 추가
		System.out.println(linkT1); // ListT1에 저장된 모든 데이터 출력
		System.out.println(linkT1.size()); // ListT1의 size 즉, 크기 출력
		
		// listT2에 listT1을 모두 복사
		linkT2.addAll(linkT1);
		System.out.println(linkT2);
		
		// linkT3의 3번째 요소 부터 linkT1의 모든 요소를 복사해서 넣는다.
		// 만약 linkT3에 요소가 없다면 오류발생
		linkT3.addAll(3, linkT1);
		System.out.println(linkT3);
		
		System.out.println("------------------test1------------------");
		
		for(int i = 0 ; i < 5 ; i++)
			link3.add(i);
		
		// link3.addAll()는 link3T 3에서 부터 link2를 복사해서 추가한다.
		link3.addAll(3, link2);
		// link3 제일 처음에 추가
		link3.addFirst(100);
		// link3 제일 마지막에 추가
		link3.addLast(1000);
		System.out.println("link3 print : " + link3);
		// link1을 link4에 복사
		link4.addAll(link1);
		System.out.println("link4 print : " + link4);
		// link4 list에 있는 모든 데이터를 지움
		link4.clear();
		System.out.println("link4 print : " + link4);
		
		link4.addAll(link1);
		System.out.println("link4 print : " + link4);
		
		link4.clone();	// 이게 뭐죠?
		link4.contains(link2); //이것은 뭐죠?
		
		// link4.element()는 제일 처음 반환 -> 정확하게 무슨 역할을 하는지 알아보기
		System.out.println("link4 print : " + link4.element());
		// link4.equals(link3) -> link3과 link4의 데이터가 같다면 true 다르면 false
		System.out.println("link4 print : " + link4.equals(link5));
		// link4의 5번째 있는 요소를 반환
		System.out.println("link4 print : " + link4.get(5));
		// link4가 비었으면 true, 비어있지 않으면 false
		System.out.println("link4 print : " + link4.isEmpty());
		//link4의 5번째 요소를 제거함
		link4.remove(5);
		System.out.println("link4 print : " + link4);
		// 그냥 remove()를 사용하면 맨 처음에 있는 데이터를 제거함
		link4.remove();
		System.out.println("remove link4 print : " + link4);
		// link4에 있는 모든 데이터 제거
		link4.removeAll(link4);
		System.out.println("link4 print : " + link4);

		link4.addAll(link1);
		// link4의 첫번째 요소 제거
		link4.removeFirst();
		System.out.println("link4 print : " + link4);
		
		link4.removeFirstOccurrence(link1); //뭐죠?
		// link4의 마지막 요소 제거		
		link4.removeLast();
		System.out.println("link4 print : " + link4);
		// link4의 2번째 요소를 50으로 설정한다.
		link4.set(2, 50);
		System.out.println("link4 print : " + link4);
		// link3를 오름차순으로 정렬한다.
		link3.sort(null);
		System.out.println("link3 print : " + link3);
		// link4에 있는 요소와 link3과 중복되는 요소들만 출력한다. 중복제거
		link3.retainAll(link4);
		System.out.println("retain link4 print : " + link4);
		System.out.println("retain link3 print : " + link3);
		// 맨앞 요소에 20 삽입, push
		link4.push(20);
		System.out.println("link4 print : " + link4);
		// 맨 앞 요소 빼냄, pop
		link4.pop();
		System.out.println("link4 print : " + link4);
		// link3 의 요소들 출력
		System.out.println("toString link3 print : " + link3);
		System.out.println(link3.toString());
		// link3의 요수 중 2부터 4까지 추출해서 출력(즉, 0부터5까지 출력);
		System.out.println(link3.subList(2, 4));
		System.out.println("subList link3 print : " + link3);
		// link3의 첫 요소 가져옴
		System.out.println(link3.peek());
		System.out.println("link3 print : " + link3);
		// link3의 첫 요소 가져옴
		System.out.println(link3.peek());
		System.out.println("link7 print : " + link7);
		// link3의 첫 요소 가져옴, 리스트가 비어있으면 null 반환
		System.out.println(link3.peekFirst());
		System.out.println("link6 print : " + link3);
		// link6의 첫 요소 가져옴, 리스트가 비어있으면 null 반환
		System.out.println(link6.peekFirst());
		System.out.println("link6 print : " + link6);
		// link3의 첫 요소를 가져 온 후 삭제함
		System.out.println(link3.poll());
		System.out.println("link3 print : " + link3);
		// link3의 첫 요소를 가져 온 후 삭제함, 리스트 비어있으면 null 반환
		System.out.println(link3.pollFirst());
		System.out.println("link3 print : " + link3);
		// link3의 마지막 요소를 가져 온 후 삭제함, 리스트 비어있으면 null 반환
		System.out.println(link3.pollLast());
		System.out.println("link3 print : " + link3);
		// link3 맨 마지막에 요소 추가
		link3.offer(100);
		System.out.println("offer link3 print : " + link3);
		// link3 맨 마지막에 요소 추가
		link3.offerLast(500);
		System.out.println("link3 print : " + link3);
		// link3 맨 앞에 요소 추가
		link3.offerFirst(200);
		System.out.println("link3 print : " + link3);
		
		System.out.println("....");
		
		System.out.println("link3 print : " + link3.toString());
	}
}

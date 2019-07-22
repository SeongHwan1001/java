import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

class Apple implements Comparable<Apple>{
	int n;
	String s;
	
	public Apple(int n, String s) {
		this.n = n;
		this.s = s;
	}
	
	void output() {
		System.out.println(n + ", "+s);
	}

	@Override
	public int compareTo(Apple a) {
		if(this.n > a.n)
			return 1;
		else if(this.n < a.n)
			return -1;
		else
			return 0;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Apple 관리하는 LikedList
		// 일반적으로 사용하는 예시
		LinkedList<Apple> list = new LinkedList<Apple>();
		// System.out.println(list.size()); // 크기 확인
		
		//Create : 데이터 생성.추가 , 일반적으로 아래 두가지 방법이 사용된다.
		list.add(new Apple(10, "호랑이"));
		
		Apple a1 = new Apple(20, "코끼리");
		list.add(a1);
		
		// Reading : 데이터를 끄집어내는 것
		for (Apple item : list) {
			// System.out.println(item); // 이렇게 출력하면 자신 고유의 번호가 출력된다.
			item.output();
		}
		System.out.println("------------------------------");
		
		// Create
		for(int i = 0 ; i < 5 ; ++i) {
			list.add(new Apple(i*10+20, "독수리"+i));
		}
		
		// Reading
		for (Apple item : list) {
			item.output();
		}
		System.out.println("------------------------------");
		
		// Reading -> 3번째 값 끄집어내기
		list.get(3).output();
		
		System.out.println("------------------------------");
		
		// update : 2번째 인덱스 값 갱신
		list.set(2, new Apple(99, "맘모스"));
		for (Apple item : list) {
			item.output();
		}
		
		System.out.println("------------------------------");
		
		// delete : 삭제
		list.remove(3);
		
		for (Apple item : list) {
			item.output();
		}
		System.out.println("------------------------------");
		
		// Create
		for(int i = 0 ; i < 10 ; ++i) {
			list.add(new Apple((int)(Math.random()*100)%100, "맘모스"+i));
		}
		for (Apple item : list) {
			item.output();
		}
		System.out.println("------------------------------");
		
		// n이 짝수인 것은 제거한 경우(hasNext(), next() 사용)
		ListIterator<Apple> it = list.listIterator();
		while(it.hasNext()) {
			Apple a2 = it.next();
			if((a2.n) % 2 == 0) {
				it.remove();
			}
		}
		for (Apple item : list) {
			item.output();
		}
		System.out.println("------------------------------");
		
		// sort : 남아 있는 숫자를 정렬
		Collections.sort(list);
		
		for (Apple item : list) {
			item.output();
		}
		
		System.out.println("------------------------------");
	}
}

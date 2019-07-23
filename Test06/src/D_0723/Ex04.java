package D_0723;

import java.util.LinkedList;

class D {
	
}

public class Ex04 {
	public static void main(String[] args) {
		LinkedList<D> d1 = new LinkedList<D>();
		LinkedList<D> d2 = new LinkedList<D>();
		LinkedList<D> d3 = new LinkedList<D>();
		
		d1.add(new D());
		d1.add(new D());
		
		//<> 컨테이너라고 한다.
		LinkedList<LinkedList<D>> d4 = new LinkedList<LinkedList<D>>();
		
		// d4는 d1, d2, d3의 링크드 리스트를 관리하기 위함.
		d4.add(d1);
		d4.add(d2);
		d4.add(d3);
		
		// 이것을 for each 문을 사용하고 싶다면
		for (LinkedList<D> linkedList : d4) {
			//이렇게 사용하면 d4의 첫 LinkedList가 나오고 그걸 또 foreach를 사용해서 관리하면 됨
		}
	}
}

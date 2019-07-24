package D_0724;

class Node<T> {
	Node left;
	Node right;
	T num;
	
	Node(T n) {
	   num = n;
	}
}

public class MyLinkedList<T> {
	Node<T> head;
	
	MyLinkedList() {
	   head = null;
	}
	
	// 리스트 추가
	void add(T n) {
	   if (head == null) {
	      head = new Node<T>(n);
	      head.right = head;
	      head.left = head;
	
	   } else {
	      Node<T> node = new Node<T>(n);
	      Node<T> tail = head.left;
	      head.left = node;
	      tail.right = node;
	      node.left = tail;
	      node.right = head;
	   }
	}
	
	// 리스트 삭제
	void delete() {
	   if (head == null)
	      System.out.println("없음");
	   else if (head.right == head && head.left == head)
	      head = null;
	   else {
	      Node nodeDelete = head.left;
	      Node nodePrev = nodeDelete.left;
	      Node nodeNext = nodeDelete.right;
	
	      nodePrev.right = nodeNext;
	      nodeNext.left = nodePrev;
	   }
	}
	
	// 리스트 읽기
	T get(int index) {
	   Node<T> nodeGet = head;
	   for (int i = 0; i < index; i++) {
	      nodeGet = nodeGet.right;
	   }
	   return nodeGet.num;
	}
	
	// 리스트 갱신
	void set(int index, T num) {
	   Node<T> nodeGet = head;
	   for (int i = 0; i < index; i++) {
	      nodeGet = nodeGet.right;
	   }
	   nodeGet.num = num;
	}

	// StringBuilder를 사용하는 이유? what the....
	// 보통 string + string을 사용하는 이와 같은 연산을 하면 새로운 strign을 생성
	// 즉 string 객체를 생성함으로서 메모리 할당과 메모리 해제를 발생시키며 더하는 연산이 많아진다면 성능적으로 별로...
	// 그래서 StringBuilder 사용
	// 이거슨 문자열을 더 할 때 새로운 객체를 생성하는 것이 아니라 기존의 string 객체에 데이터를 더하는 방식을 사용
	// 그렇기 때문에 속도도 빠르며 상대적으로 부하가 적다.
	@Override
	public String toString() {
	   StringBuilder sb = new StringBuilder();
	   sb.append("[");
	   Node nowNode = head;
	   do {
		  sb.append(" ");
	      sb.append(nowNode.num);
	      sb.append(" ");
	      nowNode = nowNode.right;
	   } while (nowNode != head);
	   sb.append("]");
	   return sb.toString();
	}
}
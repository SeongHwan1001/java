package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedEx03 {

	public static void main(String[] args) {
		// ��ü�� Ŭ�����鸸 ���� �� �� �ִ�.
		LinkedList<String> Client = new LinkedList<String>();
		LinkedList<String> Client4 = new LinkedList<String>();
		
		//ex1) item�� 1�� �߰��Ѵ�.
		Client.add("�ű���");
		Client.add("������");
		Client.add("������");
		Client.add("������");
		
		System.out.println(Client);
		
		//ex2) �̸� �������� �ߺ� �Ǿ��� �� ù��°�� �ִ� �������� �����ȴ�.
		Client.removeFirstOccurrence("������");
		
		// ex4)
		/*Client.clear();
		System.out.println(Client.poll());
		Client.add("100");
		Client.add("200");
		// �Ǿ� ��� ��
		System.out.println(Client.pop());
		System.out.println(Client.poll());*/
		
		// ex4) Client�� �ش� ��� �����Ͱ� �ִ��� ���� �Լ� boolean���� ��ȯ��
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
		link2.add("��Ʈ");
		link2.add("��Ʈ");
		link2.add("��Ʈ");
		link2.add("��Ʈ");
		
		// ù��° ��¹��
		System.out.println(link1);
		System.out.println(link2);
		
		// �ι�° ��¹��
		for(int i = 0 ; i < link1.size() ; ++i) {
			System.out.print(link1.get(i) + " ");
		}
		System.out.println();
		for(int i = 0 ; i < link2.size() ; ++i) {
			System.out.print(link2.get(i) + " ");
		}
		System.out.println();
		
		// ����° ��¹��
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
		
		
		
		
		Client4.add("������");
		Client.retainAll(Client4);
		System.out.println(Client);
		
		
		
		
		
		

	}

}

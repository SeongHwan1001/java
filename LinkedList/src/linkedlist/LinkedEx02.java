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
		
		// iterator : �ڹ��� �÷��� �����ӿ�ũ���� �÷��ǿ� ����Ǿ� �ִ� ��ҵ���
		//			    �о���� ����� ǥ��ȭ �Ͽ��µ� �� �� �ϳ��� iterator�̴�.
		// iterator�� �ڵ����� index�� �������ֱ� ������, ��뿡 ������ ���� �� ������
		// iterator�� ����� ��ü�� ����� ����ϱ� ������ lisk�� �̿��ϴ� �ͺ��� ������.
		
		// iterator�� ��� �÷���Ŭ������ �����͸� ���� �� ����
		// ���� �̷��� ǥ��ȭ�� �ȵȴٸ� ��� �÷���Ŭ������ �����͸� �д� �޼��带 ������ �˾ƾ��ϰ�
		// ������ �÷��ǿ� �����ϱ� �������
		// iterator�� hasNext(), next(), remove() 3������
		Iterator<String> it = link1.iterator();
		
		// hashNext�� ���������Ͱ� ���� ������ ������
		while(it.hasNext()) {
			System.out.println(it.next()); // next�� ���� �����͸� ��ȯ
		}
		
		it.remove();
		System.out.println(link1);
	}

}

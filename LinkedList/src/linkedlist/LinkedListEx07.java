package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx07 {
	public static void main(String[] args) {
		// Iterator
		// ListIterator
		// .next().previous()
		// ������ ��ǥ
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("190722");
		list.add("Min");
		list.add("Hyun");
		list.add("�� ���� �ʹ�...");
		list.add("������...");
		
		ListIterator<String> list_it = list.listIterator(2);
		System.out.println("Before : ");
		System.out.println(list);
		// ������ ���
		while(list_it.hasNext()) {
			System.out.print(list_it.next() + " ");
		}System.out.println("\n---------------------------------------");
		
		// ������ ���
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
		
		// hasNext(), next()�� ����� �� ������ ������ �̷������ �� 
		// ����Ű�� ���� ������ ���� ����ų ���� �ֱ� ������ ����ؼ� �ڵ带 �ۼ��ؾ� �Ѵ�.
		// �ܼ��� ����ϴ� ������� ������ ������ �ʴ´�.

	}

}

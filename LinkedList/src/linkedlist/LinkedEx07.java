package linkedlist;

import java.util.LinkedList;

public class LinkedEx07 {
	public static void main(String[] args) {
		// indexOf(), lastIndexOf()
		// ���ƶ� ��ǥ
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("190722");
		list.add("Min");
		list.add("Hyun");
		list.add("�� ���� �ʹ�...");
		list.add("������...");
		list.add("Hello");
		
		System.out.println(list);
		// ����Ʈ�� �տ��� ���� ã�´�.
		System.out.println(list.indexOf("Hello"));
		// ����Ʈ�� �ڿ��� ���� ã�´�.
		System.out.println(list.lastIndexOf("Hello"));
		// ����Ʈ�� ���� ������ -1 ��ȯ
		System.out.println(list.indexOf("BYE"));
	}
}

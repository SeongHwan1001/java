package linkedlist;

import java.util.LinkedList;

public class LinkedEx08 {
	public static void main(String[] args) {
		// ȫ�϶� ��ǥ
		// toArray()
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("190722");
		list.add("Min");
		list.add("Hyun");
		list.add("�� ���� �ʹ�...");
		list.add("������...");
		list.add("Hello");
		
		String[] arr = list.toArray(new String[list.size()]);
		
		for(int i = 0 ; i < arr.length ; ++i) {
			System.out.println(arr[i] + " ");
		}
	}
}

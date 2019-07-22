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
		
		// link1 3��° ��ҿ� 100�� �߰�
		link1.add(3, 100);
		// LinkedList�� ����ϸ� List�� ����Ǿ� �ִ� ��� ����Ÿ�� ��µ�
		System.out.println("link1 print : " + link1);
		// size() �Լ��� List�� ������ �ִ� ���� ��, ũ�⸦ ��ȯ����
		System.out.println("link1 size : " + link1.size());
		// link1 List�� link List ��Ҹ� ��� �����ؼ� ����
		link2.addAll(link1);
		System.out.println("link2 print : " + link1);
		
		System.out.println("------------------test1------------------");
		
		linkT1.add(2, 10); // ListT1 2��° �ڸ��� 10�� �߰�
		linkT1.addFirst(555); // ListT1 �� �տ� 555 �߰� 
		linkT1.addLast(888); // ListT1 �� �ڿ� 888 �߰�
		System.out.println(linkT1); // ListT1�� ����� ��� ������ ���
		System.out.println(linkT1.size()); // ListT1�� size ��, ũ�� ���
		
		// listT2�� listT1�� ��� ����
		linkT2.addAll(linkT1);
		System.out.println(linkT2);
		
		// linkT3�� 3��° ��� ���� linkT1�� ��� ��Ҹ� �����ؼ� �ִ´�.
		// ���� linkT3�� ��Ұ� ���ٸ� �����߻�
		linkT3.addAll(3, linkT1);
		System.out.println(linkT3);
		
		System.out.println("------------------test1------------------");
		
		for(int i = 0 ; i < 5 ; i++)
			link3.add(i);
		
		// link3.addAll()�� link3T 3���� ���� link2�� �����ؼ� �߰��Ѵ�.
		link3.addAll(3, link2);
		// link3 ���� ó���� �߰�
		link3.addFirst(100);
		// link3 ���� �������� �߰�
		link3.addLast(1000);
		System.out.println("link3 print : " + link3);
		// link1�� link4�� ����
		link4.addAll(link1);
		System.out.println("link4 print : " + link4);
		// link4 list�� �ִ� ��� �����͸� ����
		link4.clear();
		System.out.println("link4 print : " + link4);
		
		link4.addAll(link1);
		System.out.println("link4 print : " + link4);
		
		link4.clone();	// �̰� ����?
		link4.contains(link2); //�̰��� ����?
		
		// link4.element()�� ���� ó�� ��ȯ -> ��Ȯ�ϰ� ���� ������ �ϴ��� �˾ƺ���
		System.out.println("link4 print : " + link4.element());
		// link4.equals(link3) -> link3�� link4�� �����Ͱ� ���ٸ� true �ٸ��� false
		System.out.println("link4 print : " + link4.equals(link5));
		// link4�� 5��° �ִ� ��Ҹ� ��ȯ
		System.out.println("link4 print : " + link4.get(5));
		// link4�� ������� true, ������� ������ false
		System.out.println("link4 print : " + link4.isEmpty());
		//link4�� 5��° ��Ҹ� ������
		link4.remove(5);
		System.out.println("link4 print : " + link4);
		// �׳� remove()�� ����ϸ� �� ó���� �ִ� �����͸� ������
		link4.remove();
		System.out.println("remove link4 print : " + link4);
		// link4�� �ִ� ��� ������ ����
		link4.removeAll(link4);
		System.out.println("link4 print : " + link4);

		link4.addAll(link1);
		// link4�� ù��° ��� ����
		link4.removeFirst();
		System.out.println("link4 print : " + link4);
		
		link4.removeFirstOccurrence(link1); //����?
		// link4�� ������ ��� ����		
		link4.removeLast();
		System.out.println("link4 print : " + link4);
		// link4�� 2��° ��Ҹ� 50���� �����Ѵ�.
		link4.set(2, 50);
		System.out.println("link4 print : " + link4);
		// link3�� ������������ �����Ѵ�.
		link3.sort(null);
		System.out.println("link3 print : " + link3);
		// link4�� �ִ� ��ҿ� link3�� �ߺ��Ǵ� ��ҵ鸸 ����Ѵ�. �ߺ�����
		link3.retainAll(link4);
		System.out.println("retain link4 print : " + link4);
		System.out.println("retain link3 print : " + link3);
		// �Ǿ� ��ҿ� 20 ����, push
		link4.push(20);
		System.out.println("link4 print : " + link4);
		// �� �� ��� ����, pop
		link4.pop();
		System.out.println("link4 print : " + link4);
		// link3 �� ��ҵ� ���
		System.out.println("toString link3 print : " + link3);
		System.out.println(link3.toString());
		// link3�� ��� �� 2���� 4���� �����ؼ� ���(��, 0����5���� ���);
		System.out.println(link3.subList(2, 4));
		System.out.println("subList link3 print : " + link3);
		// link3�� ù ��� ������
		System.out.println(link3.peek());
		System.out.println("link3 print : " + link3);
		// link3�� ù ��� ������
		System.out.println(link3.peek());
		System.out.println("link7 print : " + link7);
		// link3�� ù ��� ������, ����Ʈ�� ��������� null ��ȯ
		System.out.println(link3.peekFirst());
		System.out.println("link6 print : " + link3);
		// link6�� ù ��� ������, ����Ʈ�� ��������� null ��ȯ
		System.out.println(link6.peekFirst());
		System.out.println("link6 print : " + link6);
		// link3�� ù ��Ҹ� ���� �� �� ������
		System.out.println(link3.poll());
		System.out.println("link3 print : " + link3);
		// link3�� ù ��Ҹ� ���� �� �� ������, ����Ʈ ��������� null ��ȯ
		System.out.println(link3.pollFirst());
		System.out.println("link3 print : " + link3);
		// link3�� ������ ��Ҹ� ���� �� �� ������, ����Ʈ ��������� null ��ȯ
		System.out.println(link3.pollLast());
		System.out.println("link3 print : " + link3);
		// link3 �� �������� ��� �߰�
		link3.offer(100);
		System.out.println("offer link3 print : " + link3);
		// link3 �� �������� ��� �߰�
		link3.offerLast(500);
		System.out.println("link3 print : " + link3);
		// link3 �� �տ� ��� �߰�
		link3.offerFirst(200);
		System.out.println("link3 print : " + link3);
		
		System.out.println("....");
		
		System.out.println("link3 print : " + link3.toString());
	}
}

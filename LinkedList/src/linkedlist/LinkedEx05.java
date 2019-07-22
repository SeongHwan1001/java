package linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

public class LinkedEx05 {
	public static void main(String[] args) {
		
		System.out.println(1+". ������ ��ũ�� ����Ʈ");
		List<Integer> list = new LinkedList<>();
		for(int i = 0 ; i < 50 ; ++i) {
			int input = (int)(Math.random()*100)%100;
			list.add(input);
			System.out.println(String.format("%d ", input));
		}

		list.sort(null);
		
		System.out.println(2+". ���ĵ� �� ��ũ�� ����Ʈ");
		// �Ϲ������� item�̶�� ������ ����Ѵ�.
		// ó������ �������� ����Ѵٴ� ������ �ִ�.
		for (Integer item : list) {
			System.out.print(item + " ");
		} System.out.println(); // �Ϲ������� �����ڵ带 ���ؼ� ������ �ڿ� �ٿ� ����Ѵ�.
		
		// ���۷����� : ���� �Ʒ��� �����ϱ� ���� �����ϰ� ����Ѵ�.
		System.out.println("---------------------------");
		
		System.out.println(3+". Stack");
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.addAll(list);
		
		Stack<Integer> stack = new Stack<>();
		
		while(list2.size() > 0) {
			int first = list2.removeFirst();
			stack.push(first);
			System.out.print(first + " ");
		}System.out.println();
		
		System.out.println("---------------------------");
		
		System.out.println(4+". Stack pop");
		
		while (stack.size() > 0) {
			System.out.print(stack.pop() + " ");
		}System.out.println();
		
		System.out.println("---------------------------");
		
		System.out.println(5+". Queue");
		
		LinkedList<Integer> list3 = new LinkedList<Integer>();
		list3.addAll(list);
		
		Queue<Integer> queue = new LinkedList<Integer>(list3);
		
		System.out.println(queue);
		
		/*while(list3.size() > 0) {
			int last = list3.removeLast();
			queue.offer(last);
			System.out.print(last + " ");
		}System.out.println();
		*/
		System.out.println("---------------------------");
		
		System.out.println(6+". Queue Poll");
		
		while(queue.size() > 0) {
			System.out.print(queue.poll() + " ");
		}System.out.println();
		
		
		
		
	}
}

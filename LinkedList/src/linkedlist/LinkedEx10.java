package linkedlist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedEx10 {
	
	static void func01(AbstractList a) {
		
	}
	public static void main(String[] args) {
		// ���� ��ǥ�� list���� ��Ӱ��踦 ǥ���ϱ� ���� �����̴�.
		// ���� ��ǥ 
		// EX01
		// AbstractList�� LinkedList�� �θ��̴�. �׷��� ������ �Ʒ��� ���� ������ �����ϴ�.
		// ĳ���� ������ ����� ���̴�.
		// �ڿ� ���׸��� ��� �ȴ�. �˾Ƽ� ����.
		// ���� ���� : ��Ӱ��踦 �˰� �ʹٸ� F4 ����Ű
		AbstractList Llist1 = new LinkedList();
		LinkedList Llist2 = new LinkedList();
		ArrayList Llist3 = new ArrayList();
		
		// Llist1, Llist2, Llist3 �� ��� ������ �� �ִ�.
		// func01 �μ��� �θ� �Ǳ� ������ �ڽ����� �� �޴´�.
		// ����ڰ� ��� ���� ����ϵ� ���� ��� �� �� �ִٴ� ������ �ִ�.
		func01(Llist1);
		func01(Llist2);
		func01(Llist3);

		Llist1.add("1");
		Llist1.add("2");
		Llist1.add("3");
		
		System.out.println(Llist1);
		
//		ArrayList Alist1 = new ArrayList(Llist1);
//		ArrayList Alist2 = new ArrayList(Llist2);
		
		// ���� ��ǥ 
		// EX02
		Queue q = Llist2;
		
	}
}

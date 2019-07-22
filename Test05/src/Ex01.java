import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

class Apple implements Comparable<Apple>{
	int n;
	String s;
	
	public Apple(int n, String s) {
		this.n = n;
		this.s = s;
	}
	
	void output() {
		System.out.println(n + ", "+s);
	}

	@Override
	public int compareTo(Apple a) {
		if(this.n > a.n)
			return 1;
		else if(this.n < a.n)
			return -1;
		else
			return 0;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Apple �����ϴ� LikedList
		// �Ϲ������� ����ϴ� ����
		LinkedList<Apple> list = new LinkedList<Apple>();
		// System.out.println(list.size()); // ũ�� Ȯ��
		
		//Create : ������ ����.�߰� , �Ϲ������� �Ʒ� �ΰ��� ����� ���ȴ�.
		list.add(new Apple(10, "ȣ����"));
		
		Apple a1 = new Apple(20, "�ڳ���");
		list.add(a1);
		
		// Reading : �����͸� ������� ��
		for (Apple item : list) {
			// System.out.println(item); // �̷��� ����ϸ� �ڽ� ������ ��ȣ�� ��µȴ�.
			item.output();
		}
		System.out.println("------------------------------");
		
		// Create
		for(int i = 0 ; i < 5 ; ++i) {
			list.add(new Apple(i*10+20, "������"+i));
		}
		
		// Reading
		for (Apple item : list) {
			item.output();
		}
		System.out.println("------------------------------");
		
		// Reading -> 3��° �� �������
		list.get(3).output();
		
		System.out.println("------------------------------");
		
		// update : 2��° �ε��� �� ����
		list.set(2, new Apple(99, "����"));
		for (Apple item : list) {
			item.output();
		}
		
		System.out.println("------------------------------");
		
		// delete : ����
		list.remove(3);
		
		for (Apple item : list) {
			item.output();
		}
		System.out.println("------------------------------");
		
		// Create
		for(int i = 0 ; i < 10 ; ++i) {
			list.add(new Apple((int)(Math.random()*100)%100, "����"+i));
		}
		for (Apple item : list) {
			item.output();
		}
		System.out.println("------------------------------");
		
		// n�� ¦���� ���� ������ ���(hasNext(), next() ���)
		ListIterator<Apple> it = list.listIterator();
		while(it.hasNext()) {
			Apple a2 = it.next();
			if((a2.n) % 2 == 0) {
				it.remove();
			}
		}
		for (Apple item : list) {
			item.output();
		}
		System.out.println("------------------------------");
		
		// sort : ���� �ִ� ���ڸ� ����
		Collections.sort(list);
		
		for (Apple item : list) {
			item.output();
		}
		
		System.out.println("------------------------------");
	}
}

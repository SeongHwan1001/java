package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Spliterator;

class Shape {
	String name;
	int size;
	
	// �̷� �����ڵ��� ��Ʈ��+����Ʈ+s ������ ���� �밡 �� �� �ִ�. 
	public Shape(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
}

public class LinkedEx09 {
	public static void main(String[] args) {
		// ����� ��ǥ
		// Spliterator()
		// interface �������� ����
		// ����ó�� �� ��
		// ���� : ȥ�� ó�� �ߴ� �� ���� �������� �۾��� �߱� ������ ���ķ� �ϸ� ��뷮 �����͸� ó���ϱ� �����ϴ�.
		
		LinkedList<Shape> list = new LinkedList<Shape>();
		
		for(int i = 0 ; i < 10000 ; ++i) {
			list.add(new Shape("Circle" + i , i));
		}
		
		Spliterator<Shape> split = list.spliterator();
		//split.trySplit(); // �����͵��� �ɰ��� ó���Ѵ�. �Ʒ����� �����带 �̿��ؼ� ���ķ�
		
		ArrayList<Spliterator<Shape>> array = new ArrayList<>();
		array.add(split);
		// split.estimateSize();	// ���� �ڱ� �ڽ��� ��� �����ִ��� Ȯ���ϴ� �Լ��̴�.
		
		int arrayCount = 0;
		
		while(true) {
			arrayCount++;
			array.add(arrayCount, array.get(0).trySplit());
			
			if(array.get(0).estimateSize() == 0) break;
		}
		
		for(int i = 0 ; i < array.size() ; ++i) {
			System.out.println(array.get(i).estimateSize());
		}
		
		int totalSize = array.size();
		int halfsize = totalSize / 2;
		
//		new Thread(new Runnable()  {
//			@Override
//			public void run() {
//				for (int i = 0; i < halfsize; i++) {
//					while(array.get(i).tryAdvance((value) -> printDetaile(value)));
//				}
//			}
//		}).start();
		
		// ���� ���� �� ���ٽ�!! �����⸴
		new Thread(() -> {
				for (int i = 0; i < halfsize; i++) {
					while(array.get(i).tryAdvance((value) -> printDetaile(value)));
				}
		}).start();
		
		
		// ����Ÿ ���
		// while (split.tryAdvance((value) -> printDetaile(value)));
		
	}
	
	static void printDetaile(Shape s) {
		System.out.println("+++++++++++++++++++++++");
		System.out.println("Name : " + s.name);
		System.out.println("Size : " + s.size);
	}
	
}

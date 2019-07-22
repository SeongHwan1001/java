package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Spliterator;

class Shape {
	String name;
	int size;
	
	// 이런 생성자들은 컨트롤+시프트+s 눌러서 쉽게 취가 할 수 있다. 
	public Shape(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	
}

public class LinkedEx09 {
	public static void main(String[] args) {
		// 동희띠 발표
		// Spliterator()
		// interface 형식으로 제공
		// 병렬처리 한 것
		// 장점 : 혼자 처리 했던 것 보다 여러개가 작업을 했기 때문에 병렬로 하면 대용량 데이터를 처리하기 수월하다.
		
		LinkedList<Shape> list = new LinkedList<Shape>();
		
		for(int i = 0 ; i < 10000 ; ++i) {
			list.add(new Shape("Circle" + i , i));
		}
		
		Spliterator<Shape> split = list.spliterator();
		//split.trySplit(); // 데이터들을 쪼개어 처리한다. 아래에서 스레드를 이용해서 병렬로
		
		ArrayList<Spliterator<Shape>> array = new ArrayList<>();
		array.add(split);
		// split.estimateSize();	// 현재 자기 자신이 몇개가 남아있는지 확인하는 함수이다.
		
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
		
		// 위와 동일 한 람다식!! 레츠기릿
		new Thread(() -> {
				for (int i = 0; i < halfsize; i++) {
					while(array.get(i).tryAdvance((value) -> printDetaile(value)));
				}
		}).start();
		
		
		// 데이타 출력
		// while (split.tryAdvance((value) -> printDetaile(value)));
		
	}
	
	static void printDetaile(Shape s) {
		System.out.println("+++++++++++++++++++++++");
		System.out.println("Name : " + s.name);
		System.out.println("Size : " + s.size);
	}
	
}

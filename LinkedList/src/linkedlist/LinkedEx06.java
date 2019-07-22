package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class People implements Comparable<People>{
	int age;
	int height;
	
	public People(int age, int height) {
		this.age =age;
		this.height = height;
	}

	@Override
	public int compareTo(People o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class LinkedEx06 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		//get()
		System.out.println(list.get(2));
//		
//		//set()-
//		list.set(1, "Number");
//		System.out.println(list);
//		
//		//remove
//		System.out.println(list);
//		list.remove();
//		System.out.println(list);
//		
//		list.add("hihihi");
//		
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list);
		
		/*LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(7);
		list.add(3);
		list.add(5);
		list.add(2);
		
		System.out.println(list);
		//list.sort(null);
		Collections.sort(list); // 위의 sort와 동일한 값을 갖는다.
		System.out.println(list);*/
	}
}

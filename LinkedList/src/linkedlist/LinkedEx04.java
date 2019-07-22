package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedEx04 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0 ; i < 50000 ; ++i) {
			list.add("끝");
			arr.add("끝");
		}
		
		long start1 = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; ++i) {
			list.add(50000, "중간");
		}
		long end1 = System.currentTimeMillis();
		
		long start2 = System.currentTimeMillis();
		for(int i = 0 ; i < 10000 ; ++i) {
			list.add(50000, "중간");
		}
		long end2 = System.currentTimeMillis();
		
		System.out.println("arr : " + (end1 - start1)/1000.0);
		System.out.println("list : " + (end2 - start2)/1000.0);

	}

}

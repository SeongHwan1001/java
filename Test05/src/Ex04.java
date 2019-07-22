import java.util.LinkedList;


public class Ex04 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(-1);
		
		for(int i = 0 ; i < 10 ; ++i) {
			list.add(i);
		}
		
		System.out.println(list);
		
		for(int i = 0 ; i < list.size() ; ++i) {
			int rand = (int)(Math.random()*10) % 10;
			list.remove(rand);
			System.out.println(rand);
			list.add(rand, -1);
			
			//list.removeAll(0);
		}
		for(int j = 0 ; j < 10 ; ++j) {
			list.remove((Integer)(-1));
			System.out.println(list.size());
			System.out.println(list);
		}
		
		System.out.println(list);
	}

}

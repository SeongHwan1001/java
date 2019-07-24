package D_0724;

public class Main {
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		
		// 랜덤 값을 이용하여 10개의 값 추가
		for(int i = 0 ; i < 10 ; i++) {
			list.add((int)((Math.random() *100) % 100));
		}
		
		System.out.println("list   print : "+list);
		
		// list 삭제 : 가장 마지막 노드 삭제되도록 구현함
		list.delete();
		System.out.println("delete after : "+list);
		
		// get()
		System.out.println("get(4) print : "+list.get(4));
		
		// set() : update
		list.set(1, 20);
		System.out.println("set(1) print : "+list);
	}
}

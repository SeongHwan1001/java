import java.util.LinkedList;
import java.util.Scanner;

// ��ũ�� ����Ʈ ���
public class Ex03 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> count_list = new LinkedList<Integer>();
		int num;
		int removecount = 0;
		int count = 9;
		Scanner scan = new Scanner(System.in);
		
		for(int s = 0 ; s < 10 ; ++s)
			list.add(s);
		
		while(true) {
			System.out.printf("Ű���� �Է�(99�� ����) : ");
			num = scan.nextInt();
			
			if(num == 99)
				break;
			
			// ���� : ���̴��� �츮����, ���� ī��Ʈ�� ���� for��
			// �׷����� LinkedList�� ����ؾ� �ȴ�.
			// size() ��ŭ ������.
			// ���� �ϰ� ���� rand()
			for(int i = 0 ; i < list.size() ; ++i) {
				// �����ϱ� ���� ���� �ε��� �� ����
				int rand = (int)(Math.random()*10) % 10;
				list.remove(rand);	// ����
				list.add(rand, -1); // ���� ��ġ�� -1 
				
				if(i == list.size()-1) {
					System.out.println(list);
					for(int s = 0 ; s < list.size() ; ++s) {
						if(list.get(s) == (Integer)(-1)) {
							list.remove((Integer)(-1));
							removecount++;
						}
						
					}
						
				}
			}
			System.out.println(list);
			System.out.println("removecount : "+removecount);
			// ����, new�� ���� list.add()
			// ������ ���� �� ��ŭ ����
			for(int j = 0 ; j < removecount ; ++j) {
				list.add(++count);
				
			}
			
			System.out.println(list);
		}
		
		// println ���� printf�� ����ϰڴ�.
		/*System.out.printf("ȣ����");
		System.out.printf("�ڳ���\n");
		System.out.printf("��\n����");
		System.out.printf("��%d��%d��\n", 10, 20);
		// %03d�� d�� ���ڴ� �ڸ����� �ǹ��Ѵ�. �ڸ����� ������ 0���� ä���.
		System.out.printf("��%03d��%03d��\n", 10, 20);
		// %3d�� d�� ���ڴ� �ڸ����� �ǹ��Ѵ�. �ڸ� ���� ������ �������� �д�.
		System.out.printf("��%3d��%3d��", 10, 20); */
		
		System.out.printf("�����մϴ���!!!!!");
	}
}

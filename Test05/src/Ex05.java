import java.util.LinkedList;
import java.util.Scanner;

class Pair {
	int num;
	int count;
	
	public Pair(int num, int count) {
		this.num = num;
		this.count = count;
	}
	
	void outout_num() {
		System.out.printf("%3d", num);
	}
	void outout_count() {
		System.out.printf("%3d", count);
	}
}

// ��ũ�� ����Ʈ ���
public class Ex05 {
	public static void main(String[] args) {
		LinkedList<Pair> arr_list = new LinkedList<Pair>();
		int input = 0;
		int num = 0;

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Ű���� �Է�(99�� ����) : ");
			input = scan.nextInt();
			
			if(input == 99)
				break;
			
			
			//int rand = (int)(Math.random()*2) % 2;
			//System.out.println(rand);
			// ���� : ���̴��� �츮����, ���� ī��Ʈ�� ���� for��
			// �׷����� LinkedList�� ����ؾ� �ȴ�.
			// size() ��ŭ ������.
			// ���� �ϰ� ���� rand()

			for(int i = 0 ; i < arr_list.size() ; ++i) {
				int rand = (int)(Math.random()*2) % 2;
				
				arr_list.get(i).count++;
				//1�̸� ����
				if(rand == 1) {
					arr_list.remove(i--);
				}
			}
			
			int size = arr_list.size();
			// ����, new�� ���� list.add()
			// ������ ���� �� ��ŭ ����
			for(int j = 0 ; j < 10-size ; ++j) {
					arr_list.add(new Pair(num++, 0));
			}
			
			
			
			for (Pair item : arr_list) {
				item.outout_num();
			}System.out.println();
			for (Pair item : arr_list) {
				item.outout_count();
			}System.out.println();
			
			
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
		
		//System.out.printf("�����մϴ���!!!!!");
	}
}

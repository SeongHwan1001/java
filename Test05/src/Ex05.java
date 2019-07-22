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

// 링크드 리스트 사용
public class Ex05 {
	public static void main(String[] args) {
		LinkedList<Pair> arr_list = new LinkedList<Pair>();
		int input = 0;
		int num = 0;

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("키보드 입력(99는 종료) : ");
			input = scan.nextInt();
			
			if(input == 99)
				break;
			
			
			//int rand = (int)(Math.random()*2) % 2;
			//System.out.println(rand);
			// 갱신 : 죽이느냐 살리느냐, 또한 카운트를 위한 for문
			// 그럴러면 LinkedList를 사용해야 된다.
			// size() 만큼 도세요.
			// 랜덤 하게 제거 rand()

			for(int i = 0 ; i < arr_list.size() ; ++i) {
				int rand = (int)(Math.random()*2) % 2;
				
				arr_list.get(i).count++;
				//1이면 제거
				if(rand == 1) {
					arr_list.remove(i--);
				}
			}
			
			int size = arr_list.size();
			// 생성, new를 통한 list.add()
			// 위에서 제거 된 만큼 생성
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
		
		
		// println 말고 printf를 사용하겠다.
		/*System.out.printf("호랑이");
		System.out.printf("코끼리\n");
		System.out.printf("독\n수리");
		System.out.printf("고%d양%d이\n", 10, 20);
		// %03d의 d의 숫자는 자리수를 의미한다. 자리수의 공백은 0으로 채운다.
		System.out.printf("고%03d양%03d이\n", 10, 20);
		// %3d의 d의 숫자는 자리수를 의미한다. 자리 수의 공백은 공백으로 둔다.
		System.out.printf("고%3d양%3d이", 10, 20); */
		
		//System.out.printf("종료합니다잉!!!!!");
	}
}

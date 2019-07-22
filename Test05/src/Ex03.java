import java.util.LinkedList;
import java.util.Scanner;

// 링크드 리스트 사용
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
			System.out.printf("키보드 입력(99는 종료) : ");
			num = scan.nextInt();
			
			if(num == 99)
				break;
			
			// 갱신 : 죽이느냐 살리느냐, 또한 카운트를 위한 for문
			// 그럴러면 LinkedList를 사용해야 된다.
			// size() 만큼 도세요.
			// 랜덤 하게 제거 rand()
			for(int i = 0 ; i < list.size() ; ++i) {
				// 삭제하기 위한 랜덤 인덱스 값 생성
				int rand = (int)(Math.random()*10) % 10;
				list.remove(rand);	// 삭제
				list.add(rand, -1); // 삭제 위치에 -1 
				
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
			// 생성, new를 통한 list.add()
			// 위에서 제거 된 만큼 생성
			for(int j = 0 ; j < removecount ; ++j) {
				list.add(++count);
				
			}
			
			System.out.println(list);
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
		
		System.out.printf("종료합니다잉!!!!!");
	}
}

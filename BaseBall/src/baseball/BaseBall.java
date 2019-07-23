package baseball;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// 롯데, 삼성, 한화, sk
// 한팀당 경기 10회씩, 한팀당 30회가 된다
// 랜덤 0,1,2 : 0이면 롯데 승, 1이면 무, 2이면 패
// 결과값 필드값 : 전적, 승, 무, 패, 승률(전적에서 승리한 비율, 승수/(승수+패수)), 승차
// 정렬은 승률에 따른 정렬
public class BaseBall {
	public static void main(String[] args) {
		
		LinkedList<LinkedList<Base>> b_list = new LinkedList<LinkedList<Base>>();
		
		LinkedList<Base> b_list1997 = new LinkedList<Base>();
		LinkedList<Base> b_list1998 = new LinkedList<Base>();
		LinkedList<Base> b_list1999 = new LinkedList<Base>();
		
		// 데이타 생성, 추가
		Name_Add add = new Name_Add();
		add.add1997(b_list1997);
		add.add1997(b_list1998);
		add.add1997(b_list1999);
		// 게임 실행
		GameStart gs = new GameStart();
		gs.start(b_list1997);
		gs.start(b_list1998);
		gs.start(b_list1999);
		// 승률 처리
		Win_Avr wa = new Win_Avr();
		wa.winAvr(b_list1997);
		wa.winAvr(b_list1998);
		wa.winAvr(b_list1999);
		// 승률 대로 정렬
		Rank_Sort rs = new Rank_Sort();
		rs.rankSort(b_list1997);
		rs.rankSort(b_list1998);
		rs.rankSort(b_list1999);
		// 승차 처리
		Win_Diff wd = new Win_Diff();
		wd.windif(b_list1997);
		wd.windif(b_list1998);
		wd.windif(b_list1999);
		
		//b_list에 b_list1997, b_list1998, b_list1999를 넣어서 모두 관리
		b_list.add(b_list1997);
		b_list.add(b_list1998);
		b_list.add(b_list1999);
		
		// b_list가 가지고 있는 b_list1997, b_list1998, b_list1999 이 3개를 하나하나씩 가져옴
		// 가져온 LinkedList 들을 관리 할 수 있도록 하는 장점이 있다.
		for (LinkedList<Base> item : b_list) {
			Print_out po = new Print_out();
			po.printOut(item);
		}
		// 이렇게 관리도 가능하다.
		Print_out po1 = new Print_out();
		po1.printOut(b_list.get(0));
		
		// 출력
//		Print_out po = new Print_out();
//		System.out.println("\t\t<1997>\t");
//		po.printOut(b_list1997);
//		System.out.println("\t\t<1998>\t");
//		po.printOut(b_list1998);
//		System.out.println("\t\t<1999>\t");
//		po.printOut(b_list1999);
		
		

	}
}

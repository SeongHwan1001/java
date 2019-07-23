package baseball;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// 승률을 가지고 순위 정렬
public class Rank_Sort {
	public void rankSort(LinkedList<Base> b_list) {
		Collections.sort(b_list, new Comparator<Base>() {
			@Override
			public int compare(Base b1, Base b2) {
				return (b1.win_avg < b2.win_avg) ? +1 : -1;
			}
		});
	}
}

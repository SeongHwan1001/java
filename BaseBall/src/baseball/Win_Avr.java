package baseball;

import java.util.LinkedList;

// 승률처리
public class Win_Avr {
	public void winAvr(LinkedList<Base> b_list) {
		for (Base item : b_list) {
			item.win_avg = (float)item.victory / ((float)item.victory+item.defeat);
		}
	}
}

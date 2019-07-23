package baseball;

import java.util.LinkedList;

// 승수 출력
public class Win_Diff {
	public void windif(LinkedList<Base> b_list) {
		for(int i = 0 ; i < b_list.size() ; ++i) {
			if(i != 0) {
				int wwin = b_list.get(0).victory - b_list.get(i).victory;
				int ttie = b_list.get(0).tie - b_list.get(i).tie; 
				b_list.get(i).win_dif = wwin + (ttie*0.5);
			}
		}
	}
	
}

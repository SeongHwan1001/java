package baseball;

import java.util.LinkedList;

//게임 실행
public class GameStart {
	void start(LinkedList<Base> b_list) {
		for(int i = 0 ; i < b_list.size() ; ++i) {
			for(int j = i+1 ; j < b_list.size() ; ++j) {
				
				Base teamA = b_list.get(i);
				Base teamB = b_list.get(j);
				
				for(int s = 0 ; s < 10 ; ++s) {
					int rand = (int)(Math.random()*3) % 3;
					teamA.recode++;
					teamB.recode++;
					if(rand == 0) { // A팀 승
						teamA.victory++;
						teamB.defeat++;
					}
					else if(rand == 1) { // A팀 B팀 무
						teamA.tie++;
						teamB.tie++;
					}
					else {	//B팀 승
						teamB.victory++;
						teamA.defeat++;
					}
				}
			}
		}
	}

}

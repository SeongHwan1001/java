package baseball;

// Base 클래스
class Base {
	// 필드
	String name;	// 구단 이름
	int recode;		// 전적(경기 수)
	int victory;	// 승
	int tie;		// 무
	int defeat;		// 패 
	double win_avg;	// 승률(승률에 따라 1위)
	double win_dif;	// 승률차이
	// 생성자
	public Base(String name, int recode, int victory, int tie, int defeat, double win_avg, double win_dif) {
		this.name = name;
		this.recode = recode;
		this.victory = victory;
		this.tie = tie;
		this.defeat = defeat;
		this.win_avg = win_avg;
		this.win_dif = win_dif;
	}
	
	void output() {
		System.out.printf("%3s %7d %3d %3d %3d %7.3f %6.1f\n", 
				name, recode, victory, tie, defeat, win_avg, win_dif);
	}
}
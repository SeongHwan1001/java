package D_0717;

public class Ex03 {
	public static void main(String[] args) {
		String s = "호랑이";
		// 데이터가 변경 된 것이 아니라 객체가 새로 생성 된 것이다. = 은 new String라는 작업을 한다.
		s = "코끼리";	
	}
}

// String (고정객체) 과 StringBuffer (가변 객체)
// string 한 번 객체가 생성되고 나면 내용물 수정 불가, CRUD 할 수 없음
// StringBuffer 데이터를 갱신 할 수 있다, CRUD 할 수 있음

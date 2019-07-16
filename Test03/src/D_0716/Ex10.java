package D_0716;

// 두개의 인터페이스가 서로 밀접한 관계가 있을 경우에 내부에 포함한다.
// 인터페이스 안에 또 다른 인터페이스가 존재 할 수 있다.
// 떨어 뜨려서 상속을 시켜도 되지만 한 몸 처럼 사용하기 위해 아래의 방법으로 사용한다.
interface Apple10 {
	void func01();
	interface Banana10 {
		void func02();
	}
	interface Melon10 {	}
}

// 이런 경우 apple10 내부에 인터페이스가 있던지 없던지 상관없이 기존 사용법 대로 사용한다.
class Orenge10 implements Apple10 {
	@Override
	public void func01() { }
}

// 내부 인터페이스 사용 방법, 도트 연산자를 사용한다.
class Kewe implements Apple10.Banana10 {
	@Override
	public void func02() { }
}

public class Ex10 {

}



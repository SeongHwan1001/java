package D_0716;

interface Apple09 {
	void func01();
}

// 인터페이스도 인터페이스를 상속을 받을 수 있다. implements가 아니라 extends를 사용해야 한다.
interface Banana09 extends Apple09{
	void func02();
}

class Orenge09 implements Banana09 {

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex09 {

}

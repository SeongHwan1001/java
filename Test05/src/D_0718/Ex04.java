package D_0718;

interface Test1 {
	void test01();
}

public class Ex04 {
	public int outter = 10;
	
	public class Inner {
		int inner = 20;
		int outter = 33;
		void test01() {
			Test1 test1 = () -> { 
				System.out.println("outter : " + outter); // 33
				//바깥 객체의 참조를 얻기 위해서는 클래스명.this를 사용
				System.out.println("outter : " + Ex04.this.outter); // 10, 외부 필드 사용
				
				
				// this의 붙고 안 붙고의 차이는 변수 inner인지 매개변수로 넘어 올 경우의 inner 인지 구별하기 위해.
				System.out.println("inner : " + inner);
				// 람다식 내부에서 this는 Inner 객체를 참조
				System.out.println("innte : " + this.inner);
			};
			test1.test01();
		}

	}
}

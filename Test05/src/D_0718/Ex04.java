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
				//�ٱ� ��ü�� ������ ��� ���ؼ��� Ŭ������.this�� ���
				System.out.println("outter : " + Ex04.this.outter); // 10, �ܺ� �ʵ� ���
				
				
				// this�� �ٰ� �� �ٰ��� ���̴� ���� inner���� �Ű������� �Ѿ� �� ����� inner ���� �����ϱ� ����.
				System.out.println("inner : " + inner);
				// ���ٽ� ���ο��� this�� Inner ��ü�� ����
				System.out.println("innte : " + this.inner);
			};
			test1.test01();
		}

	}
}

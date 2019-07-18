package D_0718;

interface A1 {
	void x();
}

class B11 {
	public void y1(A1 a) {
		a.x();
	}
}

public class Ex02 {
	public static void main(String[] args) {
		B11 b = new B11();
		int i = 10;
		
		// b.y1(a); // ���� �̷��� ���, ������ Ŭ���� ����x
		
		// �͸� �Լ�
		b.y1(new A1() {
			public void x() {
				System.out.println("1 - 1");
			}
		});
		
		// ���ٽ� ����
		b.y1 ( () -> { System.out.println("1 - 1"); } );
	}

}

package D_0716;

interface Apple13 {
	void func01();
}
// 1�� ����� �ʿ��� class
/*class Banana13 implements Apple {
	@Override
	public void func01() {
		System.out.println("Banana call");
	}
	
}*/
public class Ex13 {
	public static void main(String[] args) {
		// 1����� ���ٴ� 2��, 3�� ����� ���� �����. Ư�� 2��
		
		// 1�� ���
		/*Banana13 b = new Banana13();
		b.func01();*/
		
		// 2�� ��� <�͸� Ŭ����>
		// �������̽��� ���� Ŭ���� ���� ��ü�� ������ų �� ������ ������ �� �ڿ� �������� ��� �Լ��� �������ָ� ����� �����ϴ�.
		// �������̽� �Լ��� ���� �� ���� �׻� �Լ� �տ� public�� �ٿ���� ��.
		Apple13 a = new Apple13() { 
			public void func01() {
				System.out.println("Bananaaaa");
			}
		};
		a.func01();	// Bananaaaa ���
		
		// 3�� ��� <�͸�ü>
		// ��ü�� ���� ������ �޸𸮰� �����Ǿ��ٰ� �ٷ� �������. �׷��� ������ ������ �ڿ� ��Ʈ�� ���ؼ� �Լ��� ȣ���� �� �ִ�.
		// ��ü�� �̸��� �������� �ʱ� ������ �͸� ��ü��� �Ѵ�.
		// �Լ��� ����� �����ϰ� ������ ������� �ʰ� �ٷ� ������ �����.
		new Apple13() {
			public void func01() {
				System.out.println("Banana");
			}
		}.func01();
	}
}

package D_0716;

// �ΰ��� �������̽��� ���� ������ ���谡 ���� ��쿡 ���ο� �����Ѵ�.
// �������̽� �ȿ� �� �ٸ� �������̽��� ���� �� �� �ִ�.
// ���� �߷��� ����� ���ѵ� ������ �� �� ó�� ����ϱ� ���� �Ʒ��� ������� ����Ѵ�.
interface Apple10 {
	void func01();
	interface Banana10 {
		void func02();
	}
	interface Melon10 {	}
}

// �̷� ��� apple10 ���ο� �������̽��� �ִ��� ������ ������� ���� ���� ��� ����Ѵ�.
class Orenge10 implements Apple10 {
	@Override
	public void func01() { }
}

// ���� �������̽� ��� ���, ��Ʈ �����ڸ� ����Ѵ�.
class Kewe implements Apple10.Banana10 {
	@Override
	public void func02() { }
}

public class Ex10 {

}



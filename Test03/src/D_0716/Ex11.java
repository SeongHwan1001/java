package D_0716;

// �������̽� �ȿ� class�� ���� �� �� �ִ�.
interface Apple11 {
	void func01();
	class Banana11 {
		void func02() {	
			// ���� ���� �ʾƵ� �ȴ�. ������ �Ʒ����� �������̵��� �ϱ� ����
		}
	}
}

// �ȿ� �ִ� Ŭ������ ������� �ʰڴٸ� �Ϲ������� �������̽� ��� �ϵ��� ����ϸ� �ȴ�.
class Orenge implements Apple11 {
	@Override
	public void func01() {
		System.out.println("func01 call");
		
	}
}

// Ex10 ���� �ٸ��� Ŭ������ ��� �ޱ� ������ extends�� ������� �����϶�.
class Kiwe extends Apple11.Banana11 {
	@Override
	public void func02() {
		System.out.println("func02 call");
	}
}


public class Ex11 {
	public static void main(String[] args) {
		Orenge o = new Orenge();
		o.func01();
		
		Kiwe k = new Kiwe();
		k.func02();
	}
}

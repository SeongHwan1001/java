package D_0716;

interface Apple14 {
	void func01();
}

class Orenge14 implements Apple14 {
	public void func01() {
		System.out.println("Orenge14 1�� ���");
	}
}

public class Ex14 {
	public static void main(String[] args) {
		// 1�� ���
		Orenge14 o = new Orenge14();
		o.func01();
		
		// 2�� ���
		Kiwe k = new Kiwe() {
			public void func01() {
				System.out.println("Kewi 2�����");
			}
		};
		
		// 3�� ���
		/*new Melon() {
			public void func01() {
				System.out.println("Melon 3�����");
			}
		}.func01();*/
	}

}

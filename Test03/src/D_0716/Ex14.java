package D_0716;

interface Apple14 {
	void func01();
}

class Orenge14 implements Apple14 {
	public void func01() {
		System.out.println("Orenge14 1锅 规过");
	}
}

public class Ex14 {
	public static void main(String[] args) {
		// 1锅 规过
		Orenge14 o = new Orenge14();
		o.func01();
		
		// 2锅 规过
		Kiwe k = new Kiwe() {
			public void func01() {
				System.out.println("Kewi 2锅规过");
			}
		};
		
		// 3锅 规过
		/*new Melon() {
			public void func01() {
				System.out.println("Melon 3锅规过");
			}
		}.func01();*/
	}

}

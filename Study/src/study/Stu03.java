package study;

interface Apple {
	void func01();
}

interface Banana {
	Apple func02();
}

public class Stu03 {
	public static void main(String[] args) {
		Banana b = new Banana() {
			@Override
			public Apple func02() {
				return new Apple() {
					@Override
					public void func01() {
						System.out.println("せせせせせせ");
					}
				};
			}
		};
		
		Apple a = b.func02();
		a.func01();
	}
}

package study;

interface Compare {
	public int comareTo(int a, int b);
}

public class Stu02 {
	public static void main(String[] args) {
		Compare co = (a, b) -> {
			return a+b;
		};
		co.comareTo(3, 4);
	}
}

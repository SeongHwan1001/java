package D_0718;

interface LogicName {
	public int plusAandB(int a, int b);
}

public class Ex01 {
	public static void main(String[] args) {
		// 인터페이스를 익명 함수로 구현
		System.out.println("2번 : " + new LogicName() {
			
			@Override
			public int plusAandB(int a, int b) {
				return a+b;
			}
		}.plusAandB(12, 10));
		
		// 람다식으로 구현
		LogicName lambda = (a, b) -> {
			return a+b;
		};
		
		System.out.println("3번 : " + lambda.plusAandB(202, 20));
	}

}

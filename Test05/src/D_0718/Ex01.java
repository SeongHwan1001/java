package D_0718;

interface LogicName {
	public int plusAandB(int a, int b);
}

public class Ex01 {
	public static void main(String[] args) {
		// �������̽��� �͸� �Լ��� ����
		System.out.println("2�� : " + new LogicName() {
			
			@Override
			public int plusAandB(int a, int b) {
				return a+b;
			}
		}.plusAandB(12, 10));
		
		// ���ٽ����� ����
		LogicName lambda = (a, b) -> {
			return a+b;
		};
		
		System.out.println("3�� : " + lambda.plusAandB(202, 20));
	}

}

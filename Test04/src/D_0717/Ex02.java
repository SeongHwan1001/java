package D_0717;

class Apple02{
	// static�� ���α׷� ���� �������� �޸𸮿� �������.
	// ��ü ���� ���� ��� �� �� �ִ�.
	static void func01() {	
		System.out.println(1);
		// ���� �������� �޸𸮿� �Ҵ� �Ϸ��� �ϴµ� func02�� ���� �޸𸮿� �Ҵ� ���� �ʾƼ� ����
		// �׷��� static�� static�� ����ؾ� �Ѵ�.
		func02(); //����
	}
	static void func02() {
		System.out.println(2);
	}
}

public class Ex02 {
	// main���� ��� �Ұ�
	void func01() {	
	}
	
	// main���� ��� ���� , static�̱� ����
	// main���� �Լ��� ���� �����ϰ� test �ϱ� ���� ���
	static void func02() {
	}
	
	// main���� ��� ����
	// num ���� 2���� ��� �� �� �ֵ��� �ϱ�.
	// ���� �ۼ��� �ڵ�
	static void func03(int num) {	// ���� �ۼ�
		
		String arr[];	// �迭 ����
		System.out.println(num);
		
		String bi = Integer.toBinaryString(num);	// 10���� num�� 2������ ��ȯ
		
		// ���� �� 2������ 0�� ���� �ʴ� �������� ���� �������� ���� �ٿ��ֱ� ����.
		int num1 = bi.length() % 4;
		
		// 4���� ������ ���� �� ���� ������ 0�� ������ ��
		for(int j = 0 ; j < 4-num1 ; j++) {
			bi = 0+bi;
		}
		System.out.println(bi);
		
		// ���� 0�� �ٿ��� �� 4��Ʈ�� �ڸ��� ���� �� �Ŀ� �� ���ڸ� �迭�� ����
		arr = bi.split("");
			
		// ���� �� �迭�� 4��Ʈ�� �����ϱ� ���ؼ� if���� ����Ͽ� ���
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]);
			if(i%4==3)
				System.out.print(" ");
		}

	}
	
	// ����԰� �ۼ�
	static void func04(int num) {
		/*String ss = Integer.toBinaryString(num);
		System.out.println(ss);*/
		
		// s1�� �������� ������ �ִ�.
		String s1 = Integer.toBinaryString(num);
		System.out.println(s1.length()); // ���ڿ��� ����
		
		// ������ 0�� ������ �߰��ϱ� ����
		char[] ar = new char[32-s1.length()];
		
		for(int i = 0 ; i < ar.length ; i++) {
			ar[i] = '0';
		}
		
		String s2 = new String(ar);
		System.out.println(s2);
		
		String s3 = s2+s1;
		System.out.println(s3.length());
		
		// s3�� ��� ���� ������.
		StringBuffer s4 = new StringBuffer(s2+s1);
		System.out.println(s4.length());
		
		//s4.insert(4, ' ');
		
		for(int i = 0 ; i < 7 ; i++) {
			s4.insert((7-i)*4, ' ');
		}
		System.out.println(s4);
		System.out.println(s4.length());
	}
	public static void main(String[] args) {
		// ��ü ���� ���� �ٷ� ���� ����
		//Apple02.func01();
		
		//0x3c94ab73(0011 1100 1001 0100 1010 1011 0111 0011)
		// func03(0x3c94ab73);
		
		// ����԰�
		func04(0x3c94ab73);
	}
}

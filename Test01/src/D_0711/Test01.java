package D_0711;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		/*System.out.println("Hello World!");
		
		//************************************************************
		int a = 10;
		int b;
		
		if(a > 0)
			b = 3;
		else
			b = 4;
		
		// �� ����̸� ������ ���׿����� 
		
		b = (a > 0) ? 3 : 4;
		
		if(a > 0)
			System.out.println("ȣ����");
		else
			System.out.println("�ڳ���");
		
		// �� ���嵵 ���׿����ڰ� ��
		
		System.out.println((a > 0) ? "ȣ����" : "�ڳ���");*/
		
		//************************************************************
		
		
		// � �� Ǯ�� ������ �߰����� ��������(3�� �������� ����)
		//int a = 1, b = 2, c = 3;
		//int a = 1, b = 3, c = 2;
		//int a = 2, b = 1, c = 3;
		//int a = 2, b = 3, c = 1;
		//int a = 3, b = 1, c = 2;
		//int a = 3, b = 2, c = 1;
	
		// ���� § �ҽ�
//		int temp = (a+b) > (a+c) ? a+b : a+c;
//		System.out.println(temp > (b+c) ? temp/2 : (b+c)/2);	
		
		
		//����� 1��
//		int m;
//		
//		if(a > b) {	//a�� �ִ� �ƴϸ� �߰�
//			if(a > c) { //a�� �ִ�
//				if(b > c) //b�� �߰�
//					m = b;
//			}
//			else //a�� �߰�
//				m = a;
//		}
//		else {//c�� �߰�
//			if(a < c) {
//				if(b > c) {
//					m = c;
//				}
//				else
//					m = b;
//			} 
//		}
//			m = c;
		
		// ����� 2�� ����
//		int m;
//		
//		if(a > b) {	//a�� �ִ� �ƴϸ� �߰�
//			if(a > c) { //a�� �ִ�
//				m = Math.max(b, c);
//			}
//			else //a�� �߰�
//				m = a;
//		}
//		else {//c�� �߰�
//			if(a < c) {
//				m = Math.min(b, c);
//			} 
//			else
//				m = a;
//		}
		
		// ����� 3�� ����
//		int m;
//		
//		if(a > b) {	//a�� �ִ� �ƴϸ� �߰�
//			m = (a > c) ? Math.max(b, c) : a;
//		}
//		else {//c�� �߰�
//			m = (a < c) ? Math.min(b, c) : a;
//		}
		
		// ����� ����
		//int m = (a > b) ? (a > c) ? Math.max(b, c) : a : (a < c) ? Math.min(b, c) : a;
		//System.out.println(m);
		
		//************************************************************
		
		// �׻� ���� �� ��!!!!!!!!!
		// 0���� 100 ������ ���� 10�� ����Ͽ� �� ���� ����
		/*Random rand = new Random();
		int num;
		//int m;
		
		for(int i = 0 ; i < 10 ; i++) {
			//num = rand.nextInt(100);
			int a = rand.nextInt(100);
			int b = rand.nextInt(100);
			int c = rand.nextInt(100);
			
			int m = (a > b) ? (a > c) ? Math.max(b, c) : a : (a < c) ? Math.min(b, c) : a;
			
			System.out.println(a+","+b+","+c+"="+m);
		}*/
		//************************************************************
		
		// ����� ������� �ʰ� ���α׷� ¥�� ���
//		Random rand = new Random();
//		//int arr[] = new int[10];
//		String arr[] = {"ȣ����", "�ڳ���", "������"};
//		
//		for(int i = 0; i < 10 ; i++) {
//			int num = rand.nextInt(3);
//			
//			//System.out.println(num);
//			
//			/*switch (num) {
//			case 0:
//				System.out.println("ȣ����");
//				break;
//			case 1:
//				System.out.println("�ڳ���");
//				break;
//			case 2:
//				System.out.println("������");
//				break;
//			default:
//				break;
//			}*/
//			
//			System.out.println(arr[num]);
//			
//		}
		//************************************************************
		
		//��ڼ� ��� Ƚ�� ���ϱ�
//		Random rand = new Random();
//		int num = rand.nextInt(100);
//		int count = 0;
//		
//		System.out.println(num);
//		
//		while(num != 1) {
//			num = (num % 2 == 0) ? num / 2 : num*3 + 1;  
//			count++;
//		}
//		System.out.println(count);
		
		//************************************************************
		
//		// ���� �������� ����
//		// ������ i�� 0����, ���ǹ��� ������ �۴ٶ�� ǥ���ϴ� ���� ����. 90% ���Ǵ� ����
//		for(int i = 0 ; i < 10 ; ++i) {
//			
//		}
//		
//		// ���� Ƚ�� ����, 10% ���Ǵ� ����
//		for(int i = 1 ; i <= 10 ; i++) {
//			
//		}
//		
//		// Ƚ�� 11ȸ, ����ȭ ������ ���
//		for(int i = -5 ; i <= 5 ; i++) {
//			
//		}
//		
//		
//		// �� 3���� ������ for������ ����ض�.!!
		
		//************************************************************
	}
}

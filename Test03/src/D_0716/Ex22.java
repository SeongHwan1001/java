package D_0716;

//������ ����ϴ� ���� ****** <�ȵ���̵� ����>
//�����ϰ� �Ѿ��!

class View {
	interface OnClickListener {
		void onClick();
	}
}

class Button {
	void setOnClickListener(View.OnClickListener ab) {
		//A1.B1
		System.out.println("1 C1 func02 call");
		ab.onClick();
	}
}

public class Ex22 {
	public static void main(String[] args) {
		Button c = new Button();
		
		c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("2 C1 func02 call");
			}
		});
	}
}

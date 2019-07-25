package OberverStudy;

public class MyButtonMain {
	public static void main(String[] args) {
		MyButton mb = new MyButton();
		mb.setText("전송");
		mb.setMyOnClickListener(new MyOnClickListener() {
			@Override
			public void onClick() {
				System.out.println("눌러짐");
			}
		});

		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					mb.click();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}
}
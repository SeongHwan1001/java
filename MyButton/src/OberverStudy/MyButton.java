package OberverStudy;

public class MyButton {
	String text;
	MyOnClickListener myOnClickListener;

	public void setMyOnClickListener(MyOnClickListener myOnClickListener) {
		this.myOnClickListener = myOnClickListener;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void click() {
		myOnClickListener.onClick();
	}
}

interface MyOnClickListener {
	   void onClick();
	}
package baseball;

import java.util.LinkedList;

public class Print_out {
	public void printOut(LinkedList<Base> b_list) {
		System.out.printf("구단명   전적     승      무      패         승률            승차\n");
		for (Base item : b_list) {
			item.output();
		}
		System.out.println("-----------------------------------");
	}
}

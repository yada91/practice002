package prob8;

import java.util.Scanner;

/*java.util.Scanner 클래스를 이용하여 상품을 입력받아 Goods 객체를 생성하고 
 이들을 Goods 객체 배열에 저장하세요. 상품 즉, Goods 객체를 3개 입력 받으면
 이들을 모두 화면에 출력하세요.*/

public class GoodsApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Goods[] goods = new Goods[3];
		int count = 0;
		while (count != 3) {
			String temp1 = sc.nextLine();
			goods[count] = new Goods();
			goods[count].setName(temp1.substring(0, temp1.indexOf(" ")));
			temp1 = temp1.substring(temp1.indexOf(" ") + 1);
			int price = Integer
					.parseInt(temp1.substring(0, temp1.indexOf(" ")));
			goods[count].setPrice(price);
			temp1 = temp1.substring(temp1.indexOf(" ") + 1);
			int num = Integer.parseInt(temp1);
			goods[count].setNum(num);
			count++;
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(goods[i].getName() + "(가격:"
					+ goods[i].getPrice() + "원)이 " + goods[i].getNum() + "개"
					+ "입고되었습니다.");

		}
	}
}

class Goods {
	private String name;
	private int price;
	private int num;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}

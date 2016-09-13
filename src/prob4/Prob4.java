package prob4;

import java.util.Scanner;

/*  키보드에서 정수로 된 돈의 액수를 입력 받아 오만 원권, 만원 권, 오천 원권, 천원 권,
 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 
 개로 변환 되는지 작성하시오.
 */
public class Prob4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수로 된 돈을 입력하시오");

		int num = sc.nextInt();
		int count = 0;
		String[] remain = { "오만원권", "만원권", "오천원권", "천원권", "오백원", "백원", "오십원",
				"십원", "일원" };
		int[] money = new int[9];
		

		money[0] = num / 50000;
		num %= 50000;

		money[1] = num / 10000;
		num %= 10000;

		money[2] = num / 5000;
		num %= 5000;

		money[3] = num / 1000;
		num %= 1000;

		money[4] = num / 500;
		num %= 500;

		money[5] = num / 100;
		num %= 100;

		money[6] = num / 50;
		num %= 50;

		money[7] = num / 10;
		num %= 10;

		money[8] = num / 1;
		num %= 1;

		for (String s : remain) {
			System.out.println(s+":"+money[count]);
			count++;
		}
	}
}

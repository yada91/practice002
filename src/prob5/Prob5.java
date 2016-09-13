package prob5;

import java.util.Scanner;

/*[문제5] 배열 크기만큼 키보드에서 정수를 입력받고 평균을 구하는 프로그램을 작성하시오

 키보드에서 문자열을 입력 받을 때에는 java.util.Scanner 클래스를 사용합니다.
 주어진 소스를 수정하면 안됩니다.
 */
public class Prob5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intArray[] = new int[5];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 정장하는 코드 */
		System.out.println("5개의 숫자를 입력하세요.");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			sum += intArray[i];
		}

		System.out.println("평균은 " + (sum / intArray.length) + " 입니다.");

		sc.close();
	}

}

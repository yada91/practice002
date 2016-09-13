package prob2;

import java.util.Scanner;

/*숫자를 입력받아서 아래와 같은 실행결과가 나타나도록 Prob1 클래스의 main 메쏘드를 완성하세요 
 a. 입력받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다.
 - 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
 b. 입력받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
 - 예제 : 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
 */
public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int inputNumber = scanner.nextInt();
		int result = 0;
		if (inputNumber % 2 != 0) {
			for (int i = 1; i <= inputNumber; i = i + 2) {
				result += i;
			}
		} else {
			for (int i = 0; i <= inputNumber; i = i + 2) {
				result += i;
			}
		}

		System.out.println(result);
		scanner.close();
	}
}

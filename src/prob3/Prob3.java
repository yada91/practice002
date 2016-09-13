package prob3;

import java.util.Scanner;

/*문자열을 입력받아서 아래와 같은 실행결과가 나타나도록 Prob1 클래스의 main 메쏘드를 완
 성 하세요. 입력받은 문자열을 한 글자씩 증가시키며 출력하는 프로그램입니다. 
 (단, 대문자로 출력해야 합니다.)
 */

public class Prob3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");

		String s = scanner.nextLine();
		String result = "";
		char temp;
		for (int i = 0; i < s.length(); i++) {
			if (97 <= s.charAt(i) && s.charAt(i) <= 122) {
				temp = (char) ((int) s.charAt(i) - 32);
			} else {
				temp = s.charAt(i);
			}
			result = result + temp;
			System.out.println(result);
		}

		scanner.close();
	}
}

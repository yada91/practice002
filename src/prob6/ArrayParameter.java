package prob6;

/*
 [문제6] 문자열(String)을 입력 받아, 해당 문자열의 공백을 ‘,’로 변환하는 메소드와
 char[]을 입력 받아 출력하는 메소드를 만드세요.*/
public class ArrayParameter {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p',
				'e', 'n', 'c', 'i', 'l', '.' };

		printCharArray(c); // 원래 배열 원소 출력
		replaceSpace(c); // 공백 문자 바꾸기
		printCharArray(c); // 수정된 배열 원소 출력
	}

	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i] = ',';
			}
		}
	}

	static void printCharArray(char a[]) {
		for (char c : a) {
			System.out.print(c);
		}
		System.out.println();
	}
}

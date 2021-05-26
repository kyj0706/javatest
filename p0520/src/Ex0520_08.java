import java.util.Scanner;

public class Ex0520_08 {

	public static void main(String[] args) {
		// main
		// 두수를 입력, 메소드 호출 return값 출력

		// 메소드
		// sum -> 두수사이의 값을 더하여 값을 리턴
		// main 1, 100 5500

		Scanner scan = new Scanner(System.in);
		System.out.println("두수를 숫자 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = sum(num1, num2);
		System.out.println("결과값 "+ result);

	}

	static int sum(int num1, int num2) {
		int result = 0;
		for (int i =num1; i < num2; i++) {
			result = result + i;
		}
		return result;
	}

}

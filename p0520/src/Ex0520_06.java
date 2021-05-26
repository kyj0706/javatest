import java.util.Scanner;

public class Ex0520_06 {

	public static void main(String[] args) {
		// 실수를 입력받아 - > 반올림
		// main() -> 실수입력 , mtMath메소드 호출 return 받아 출력
		// myMath메소드 -> 반올림해서 return 돌려줌
		// 반올림 올림 버림을 선택하면 나오게
		Scanner scan = new Scanner(System.in);
		System.out.println("실수를 입력하세요");
		double num1 = scan.nextDouble();
		System.out.println("[소수점 계산 선택]");
		System.out.println("1.반올림 2.올림 3.버림");
		System.out.println("원하는 번호를 입력하세요");
		int choice = scan.nextInt();
		
		String name = "";
		switch (choice) {
		case 1:
			name = "반올림";
			break;
		case 2:
			name = "올림";
			break;
		case 3:
			name = "버림";
			break;

		default:
			break;
		}
		
		//메소드 호출
		double result = myMath(num1, choice);
		System.out.println(name);
		System.out.println("결과값 :" + result);

	}

	static double myMath(double num1, int choice) {
		
		double result = 0;
		switch (choice) {
		case 1: // 반올림c
			double result1 = Math.round(num1*100)/100;
			result = result1;
			break;
		case 2: // 올림
			double result2 = Math.ceil(num1*100)/100;
			result = result2;
			break;
		case 3://버림
			double result3 = Math.floor(num1*100)/100;
			result = result3;
			break;

		default:
			break;
		}
		return result;
		
		
		
		
//		double result = Math.round(num1);
//		result = Math.ceil(num1);
//		result = Math.floor(num1);
//		return result;
	}

}

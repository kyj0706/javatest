import java.util.Scanner;

public class Ex0511_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학교를 영어로 입력해주세요. >>");
		String input = scan.nextLine();
		if(input.equals("school")) {
		
		//if(input=="school") { // 문자는 등가비교를 할 수 없다.
			System.out.println("정답입니다. : " +input);
		}else {
			System.out.println("오답입니다.  정답은 : " +input);
		}
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		//문자 1개를 입력 받아 알파벳인지 아닌지를 출력하시오
//		System.out.println("문자를 입력해주세요");
//		char ch = scan.next().charAt(0);
//		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
//			System.out.println("알파벳입니다.");
//		}else {
//			System.out.println("기타문자입니다.");
//		}
		
		
		
		
		//		System.out.println("프로그램을 종료(X) 입력 해주세요.>>");
//		char ch = scan.next().charAt(0);
//		//System.out.println("결과값 :" +ch);
//		
//		if(ch=='X' || ch=='x') {
//			System.out.println("프로그램 종료");
//		}else {
//			System.out.println("계속 실행");
//		}
			
		
		
//		if(ch>='0' && ch<='9') {
//			System.out.println("숫자 1개를 입력하였습니다.");
//		}else {
//			System.out.println("숫자가 아닙니다.");
//		}
//		
		
		
		
//		String str ="abcdef";
//		char ch1 = str.charAt(0);
//		System.out.println(ch1);
		
		
		//str.charAt(0); 누구냐넌  글자랑 모든 녀석들은 배열로 되어있다
		//그니깐 abcdef 는 str로 저장 시키고  => 다시 => ch1 로 저장 할 건데 
		//[0][1][2][3][4][5] 
		// a  b  c  d  e  f 
		//원하는거 불러와 ~ 이거야 
		
		
		

	}

}

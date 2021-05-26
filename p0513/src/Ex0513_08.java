import java.util.Scanner;

public class Ex0513_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1~100가지중 1개의 숫자를 랜덤으로 받아 숫자를 맞추는 프로그램을 구현 하세요
		// 회수는 10까지만 가능 현재 입력한 숫자들을 마지막에 모두 출력해보세요. 횟수는 10번까지 가능  
		
		int randomNO = (int)(Math.random()*100)+1;
		int[] arr = new int[10];
		int count = 0;
		
		while(true) {
			if(count>10) {
				System.out.println("프로그램을 종료합니다.");
				count = count-1;
				break;
			}
			
			
			System.out.println("숫자를 입력하세요");
			int input = scan.nextInt();
			arr[count] =input;// 입력한 수를 arr 배열에 저장합니다.
			
			if(randomNO==input) {
				System.out.println("정답입니다.");
				break;
			}else if(randomNO<input) {
				System.out.println(input+"숫자보다 작습니다.");
			}else {
				System.out.println(input+"보다 큽니다.");
			}
			
			count++;
		}
		System.out.println("정답 : "+randomNO);
		System.out.println("총 도전 횟수: "+(count+1));
		System.out.print("입력한 숫자: "+"\t");
		for(int i=0; i<(count+1);i++) {
			System.out.print(arr[i]+"\t");
		}
		
		
		
		
		
//		System.out.println("글자를 입력하세요.>>");
//		String input = scan.next();
//
//		// System.out.println(input.charAt(0));
//		for (int i = 0; i < input.length(); i++) {
//			System.out.println(input.charAt(i));
//		}
//		
//		System.out.println(input.substring(0, 4));
//
//		// 입력한 모든 글자를 1개씩 출력하시오
	}

}

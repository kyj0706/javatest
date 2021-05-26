import java.util.Scanner;

public class Ex0512_08_01 {

	public static void main(String[] args) {
		// 샘 버전
		// 입력
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];// 받을거야 [배열로]
		for (int i = 0; i < input.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.>>");
			input[i] = scan.nextInt();
		}
		// 번호출력
		System.out.println("[내가입력한 번호]");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();

		// --------------------------
		// 1.로또배열 45개 배결 만들기
		int[] ball = new int[45]; // 방만들기 주소값
		// 2. 번호넣기
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 배열은 0부터 시작하니깐 +1을 해준다. //넣어주기 데이터값
		}
		// 3.번호섞기
		for (int i = 0; i < 200; i++) {
			int temp = 0; // 임시저장공간
			int randomNO = 0; // 랜덤주소변수
			randomNO = (int) (Math.random() * 45);
			// 방은 그대로 0~ 45번까지의 사랍 돌려주는거 값 변경하기
			temp = ball[0];
			ball[0] = ball[randomNO];
			ball[randomNO] = temp;
		}
		// 4.로또번호 출력
		System.out.println("[로또번호]");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();

		// 5.비교하기
		int count=0; // for문 안에 들어가면 계속 찾을거니깐 변수 선언은 밖에
		int[] win = new int[6]; // 당첨번호
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (input[i] == ball[i]) {
					win[count] = input[i]; // 당첨번호를 당첨 배열에 저장 
					count++; // 1을 증가시킨다 .
				}
			}
		}
		System.out.println("[당첨번호 개수 : "+count);
		System.out.println("[당첨번호]");
		for(int i=0;i<count;i++) {
			System.out.print(win[i]+" ");
		}
		System.out.println();

	}

}

import java.util.Scanner;

public class Ex0512_09 {

	public static void main(String[] args) {
		// 1. 6개 입렵받아 출력 ok
		// 2. 로또번호 배열 생성 ok
		// 3. 로또번호 순차적 번호넣기 ok
		// 4. 로또번호 섞기 ok 뭐대충 이해 햇어
		// 5. 로또번호 6개 출력하기
		// 6. 당첨번호 개수 출력
		// 7. 당첨번호 출력

		// 입력입니다.
		Scanner scan = new Scanner(System.in);
		int[] select = new int[6];
		for (int i = 0; i < select.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력해줄래?>>");
			select[i] = scan.nextInt();
		}
		// 입력한거 출력입니다.
		System.out.println("님이 넣은 번호 입니다.");
		for (int i = 0; i < select.length; i++) {
			System.out.print(select[i] + " ");
		}
		System.out.println();

		// 번호 배열 생성해볼까?
		int[] lotto = new int[45]; // 방을 만들었습니다.

		// 번호를 넣어볼까?
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		// 번호를 섞어볼까 ?
		for (int i = 0; i < 500; i++) {
			int ect = 0; // 가상의 공간 ??? 전세집입니다 ..
			int ran = (int) (Math.random() * 45);

			ect = lotto[0];
			lotto[0] = lotto[ran];
			lotto[ran] = ect;
		}
		// 번호를 출력할꺼야 ~
		System.out.println("당첨번호 입니다 .");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		// 비교를 할꺼야 = 당첨된거 찾아볼까해 새로운 배얼 winner를 만들어서 
		int count = 0;
		int[] winner = new int[1];  // 새로운 배열 winner를 만들어서 
		for (int i = 0; i < 6; i++) { // 하나씩 넣어볼꺼야
			for (int j = 0; j < 6; j++) { // 너도 하나씩 넣어볼꺼야 뭐를 ?
				if (select[i] == lotto[j]) { // 이녀석들은 근데 
					winner[count] = select[i]; // 0 1 2 3 4 5   0부터 아래의 0 1 2 3 4 5를 한번씩 대입하면서
					count++;					// 0 1 2 3 4 5 
				}
			}
		} // 맞은거 갯수 알려주는거야
		System.out.println("당첨된거는? : " + count + "개야");
		System.out.println("맞은거는?");

		// 얘가 왜있는거지 ?
		for (int i = 0; i < count; i++) {
			System.out.print(winner[i] + " ");
		}
		System.out.println();
	}

}

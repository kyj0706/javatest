
public class Ex0521_03 {

	public static void main(String[] args) {
		LottoBall b = new LottoBall();
//		for (int i = 0; i < LottoBall.ball.length; i++) {
//			System.out.println(b.ball[i]);
//			// 생성자
//
//		}

		// 초기화 블럭
		System.out.println("당첨번호");
		for (int i = 0; i < 6; i++) {
			System.out.print(b.ball[i] + " ");
		}

	}

}

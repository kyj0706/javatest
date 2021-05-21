
public class LottoBall {
	static int[] ball = new int[45];

	static {
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		int temp_num = 0;
		int ran = 0;

		for (int i = 0; i < 100; i++) {
			ran = (int) (Math.random() * 45);
			temp_num = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp_num;

		}
	}
}

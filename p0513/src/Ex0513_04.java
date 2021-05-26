import java.util.Scanner;

public class Ex0513_04 {

	public static void main(String[] args) {
		// 배열[5] [5] 을 생성후 1~25까지 숫자를 넣어서 출력하시오
		// 중복 허용 않음

		Scanner scan = new Scanner(System.in);
		System.out.println("만들고 싶은 1번째 배열을 입력하세요.>>");
		int in_arr1 = scan.nextInt();
		System.out.println("만들고 싶은 2번째 배열을 입력하세요.>>");
		int in_arr2 = scan.nextInt();

		int[] ball = new int[in_arr1 * in_arr2];
		for (int i = 0; i < ball.length-1 * 5; i++) {
			ball[i] = i;
		}
		int temp = 0;
		int ran = 0;
		for (int i = 0; i < 200; i++) {
			ran = (int) (Math.random() * (in_arr1 * in_arr2));

			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}
		int[][] num = new int[in_arr1][in_arr2];

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = ball[in_arr2 * i + j];
			}
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

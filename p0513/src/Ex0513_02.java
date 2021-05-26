import java.util.Scanner;

public class Ex0513_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] score = new int[5][4]; // 학생5명 , 과목3개
		double[] avg = new double[5];
		
		//입력
		for (int i = 0; i < 5; i++) {
			// 1번째 학생 입력
			System.out.print("이름을 입력하세요.>>");
			name[i] = scan.next();
			for (int j = 0; j < 4; j++) {

				System.out.print("점수를 입력하세요.>>");
				score[i][j] = scan.nextInt();

			}	
			score[i][3] = score[i][0] + score[i][1] +score[i][2];
			avg[i] = score[i][3]/3.0;
		}
		//출력
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t\n");
		for (int i = 0; i < 5; i++) {
			// 1번째 학생 입력
			System.out.print(name[i]+"\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(score[i][j]+"\t");
				for(int z=0; z<5; z++) {
					//score[i][3] = score[i][0] + score[i][1] +score[i][2];
				}
			}
			System.out.println(avg[i]+"\t");
			System.out.println();
		}
		
	}

}

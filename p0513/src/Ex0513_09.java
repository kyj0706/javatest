import java.util.Scanner;

public class Ex0513_09 {

	public static void main(String[] args) {
		//이름,국어,영어, 수학 => 이름, 국어, 영어, 수학 ,학계 평균 출력하세요
		// 학생 5명, 국어 ,영어 수학 합계-> 2차원 배열을 쓰세요 
		
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[][] sco = new int[5][4];
		double[] avg = new double[5];
		String[] subject = {"국어","영어","수학"};
		
		for(int i=0; i<5; i++) {
			System.out.print("학생이름 입력.>>");
			name[i] = scan.next();
			for(int j=0; j<sco[i].length-1; j++) {
				System.out.print(subject[j]+"점수를 입력하세요.>>");
				//System.out.println("점수를입력하세요");
				sco[i][j] = scan.nextInt();
				
			}
			sco[i][3]= sco[i][0] +sco[i][1] + sco[i][2];
			avg[i] = sco[i][3]/3.0;
			
		}
		System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("===========================================");
		for(int i=0; i<5; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<4; j++) {
				System.out.print(sco[i][j]+"\t");
				
				
			}
			System.out.printf("%.2f",avg[i]);
			System.out.println();
		}
		
		
		
	}

}

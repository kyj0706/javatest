import java.util.Scanner;

public class Ex0511_04 {

	public static void main(String[] args) {

		
		int i=1;  // 초기값
		while(i<=9) {
			i++;

			int j=2;
			while(j<=9) {
				j++;
				System.out.print(j+" * "+i+" = " +(i*j)+"\t");
			}
			System.out.println();
		}
		
		
		
		
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.print(j+" * "+i+" = " +(i*j)+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
//		for(;;) {
//			System.out.println("");
//			break;
//		}
//		
//		int i=1;
//		int sum=0;
//		while(i<=100) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
		
		
		
		
		
//		//1~100까지 홀수를 더해서 값을 출력하시요. 1.3.5.7.9 ~99 
//		// i++ 1씩 증가 , i+=2씩증가 
//		
//		int sum=0;
//		for(int i=1;i<=100;i+=2) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//		
		
		
		
		
//		int sum=0;    //합계를 하기 위한 sum = 0; 으로 초기화 
//		for(int i=1;i<=100;i++) {
//			sum = sum + i;
//			
//		}
//		System.out.println("합계 : "+sum);
		
		
		
//
//		int j=1;
//		while(j<=10) {
//			System.out.println(j);
//			j++;
//		}
//		
//		
//		
//		for (int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("1~5까지 숫자를 입력하세요");
//		int score = (int)(Math.random()*5)+1;
//		int input = scan.nextInt();
//		if(score==input) {
//			System.out.println("숫자를 맛췄습니다.");
//		}else {
//			System.out.println("틀렸습니다.");
//		}
//		System.out.println("정답 : " +score);
//		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("[숫자 맞추기 게임]");
//		System.out.println("1~10까지 숫자를 입력하세요");
//		int score = (int)(Math.random()*10)+1;
//		int input = scan.nextInt();
//		if(score==input) {
//			System.out.println("숫자를 맞췄습니다.");
//		}else {
//			System.out.println("틀렸습니다.");
//		}
//		System.out.println("입력한 숫자 : " + input);
//		System.out.println("정답 : "+score);
//		
		
		
//		int score = (int)(Math.random()*10); 		//0~9까지 정수 랜덤
//		int score2 = (int)(Math.random()*10)+1;		//1~10까지 정수 램덤
//		int score3 = (int)(Math.random()*10)+2;		//2~11까지 정수 램덤
//		int score4 = (int)(Math.random()*1000)+5;	//1000~1004까지 정수 램덤
//		
//		System.out.println(score);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
	}

}

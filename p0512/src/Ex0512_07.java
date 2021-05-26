import java.util.Scanner;

public class Ex0512_07 {

	public static void main(String[] args) {
		// 번호 1~45까지 6개를 입력받아 
		// 랜덤 로또번호 6개와 입력한 6개를 출력해 보세요 
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		for(int i=0;i<input.length;i++){
			System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
			input[i] =scan.nextInt();
			
		}
		System.out.println("[입력한번호]");
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		int[] ball = new int[45];
		
		for(int i=0; i<45; i++) {
			ball[i]=i+1;
		}

		//번호섞기
		int temp = 0; //저장할 변수 초기화 (가상의 공간)
		for(int i=0;i<500;i++) {
			int rno = (int)(Math.random()*45);
			
			temp = ball[0];
			ball[0] = ball[rno];
			ball[rno] = temp;
		}
		System.out.println("[로또번호 나와라]");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
				
	
		
		
	}

}

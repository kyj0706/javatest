
public class Ex0513_03 {

	public static void main(String[] args) {
		//배결 [3][3] = 1~10 까지 랜덤숫자를 넣어서 출력하세요 
		// 값이 중복허용하지 않음
		// 1차원 배결 ball [] 배열 생성 > 0 ~9까지 넣고 
		// 배열 섞기
		// ball 배열에 있는 num [3][3] 넣기
		
		int[] ball = new int[10];
		for(int i=0; i<ball.length; i++) {
			ball[i] =i;
		}
		int temp =0;
		int ran =0;
		for(int i=0; i<50; i++) {
			ran=(int)(Math.random()*9);
			
			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}
			
		
		
		int[][] num = new int[3][3];
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = ball[3*i+j];
			}
		}
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
//		int[] ball = new int[9];
//		for(int i=0; i<ball.length;i++) {
//			ball[i] = 0;
//		}
//		int etc = 0;
//		for(int i=0; i<9; i++) {
//			
//			etc = num[0];
//			num[0]
//		}
//		
		
		
//		int[] num = new int[7];
//		
//		for(int i=0; i<7; i++) {
//			num[i] = (int)(Math.random()*10)+1;
//		}
//		for(int i=0; i<7; i++) {
//			System.out.print(num[i]+" ");
//		}
//		System.out.println();

	}

}

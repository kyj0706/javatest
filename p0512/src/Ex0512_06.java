
public class Ex0512_06 {

	public static void main(String[] args) {
		// 로또 맟주기
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


public class Ex0524_06 {

	public static void main(String[] args) {
		Deck d = new Deck(); // 52장의 카드 생성 요기 들어 가 있음 1~13숫자 4가지 종류가
		d.shuffle();
		
		//선 5장 

		System.out.println("5장 출력]");
			for (int j = 0; j < 5; j++) {
				//d.c[13*i+j].card_print(i + 1, j +1);
				d.card_print(d.c[j]);
			}
			
		
			System.out.println("52장 출력");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <13; j++) {
				//d.c[13*i+j].card_print(i + 1, j +1);
				d.card_print(d.c[13*i+j]);
			}
			
		}
		
	}

}

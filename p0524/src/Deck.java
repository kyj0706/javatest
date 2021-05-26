
public class Deck {
	//상수 
	final int CARD_NUM = 52;  //final (상수) 는 참조변수를 대문자로 하는게 관례 
	Card[] c = new Card[CARD_NUM];
	
	//기본생성자
	Deck() { // 카드를 초기화 한다.
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				c[13*i+j] = new Card(i+1,j+1);
			}
		}
	}
	void shuffle() {
		for(int i=0; i<1000; i++) {
			
			int random_no = (int)(Math.random()*52);
			Card temp = c[0];
			
			c[0] = c[random_no];
			c[random_no] = temp;
			
			
		}
	}
	void card_print(Card c) {
		String[] kinds= {"","SPADE", "DIAMOND", "HEAT", "CLOVER"};
		String[] numbers= {"0","1","2","3","4","5","6",
						"7","8","9","10","J","Q","K"};
		
		System.out.printf("카드종류 : %s,%s \n",kinds[c.kind],numbers[c.number]);
	}
}

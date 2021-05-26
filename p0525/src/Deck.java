
public class Deck {
	//52장의 카드 생성
	//52장의 카드 kind, number
	//52장을 썩는 메소드생성
	//52장의 카드를 꺼내는 메소드 생성
	//메소드 관련은 다 여기
	
	String[] kinds = {"SPADE", "DIAMOND", "HEART", "CLOVER"};
	String[] numbers = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	Card[] c = new Card[52];
	Card[] Mycard = new Card[7];
	Card[] Comcard = new Card[7];
	//기본생성자
	Deck() {	// 13*i+j 를 하는 이유  52개를 하기 위해서 ?
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				c[13*i+j] = new Card(kinds[i],numbers[j]);
				
			}
		}
		
	}
	void shuffle( ) {
		for(int i=0; i<1000; i++) {
			int random_no = (int)(Math.random()*52);
			Card temp =c[0];
			c[0] = c[random_no];
			c[random_no]= temp;
			
		}
	}
	void print_1card(int index) {
		System.out.printf("카드 : %s , %s \n",c[index].kind,c[index].number);
	}
	
	void print_5card() {
		System.out.println("[5장 출력]");
		for(int i=0; i<5; i++) {
			System.out.printf("카드 : %s , %s \n",c[i].kind,c[i].number);
		}
	}
	void print_my7card() {
		System.out.println("[MY카드 7장]");
		for(int i=0; i<14; i++) {
			if(i<=6) {
				Mycard[i] = new Card(c[i].kind,c[i].number);
				System.out.printf("MY카드 : %s , %s \n",Mycard[i].kind,Mycard[i].number);	
			}else {
				Comcard[i-7] = new Card(c[i].kind,c[i].number);
				System.out.printf("COM카드 : %s , %s \n",Comcard[i-7].kind,Comcard[i-7].number);
				
			}
		}
	}
//	void print_com7card() {
//		System.out.println("[COM카드 7장]");
//		for(int i=7; i<14; i++) {
//			System.out.printf("COM카드 : %s , %s \n",c[i].kind,c[i].number);
//			}
//	}
	//52장 카드 출력
	void print_52card() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				System.out.printf("카드 : %s, %s \n" ,c[13*i+j].kind, c[13*i+j].number);
			}
		}
	}
	void menu_print() {
		System.out.println("[카드 프로그램]");
		System.out.println("1.카드 1장 출력");
		System.out.println("2.카드 5장 출력");
		System.out.println("3.카드 52장 출력");
		System.out.println("4.카드 섞기");
		System.out.println("5.COM과 게임");
		
		System.out.println("0.종료");
		System.out.println("====================");
		System.out.println("원하는 번호를 입력하세요.>>");
		
	}
}

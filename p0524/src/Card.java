
public class Card {
	
 	
	int kind; //SPADE, DIAMOND , HEAT, CLOVER
	int number;
	
	//기본생성자
	Card(){//아무 것도 없을시 
		this(1,1);
	}
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
//	void card_print() {
//		System.out.printf("카드종류 : %s,%s \n",kinds[kind],numbers[number]);
//	}
}

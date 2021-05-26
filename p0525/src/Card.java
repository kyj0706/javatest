
public class Card {

	String kind; // spade, diamond, heart , clover  4개
	String number; // 1,2,3,4,5,6,7,8,9,10,j,q,k
	//기본생성자
	Card(){
		this("SPADE","1"); //적으면 오류나는 이유 다른생성자를 바라보는데 그게 없어서.
	}
	Card(String kind, String number){
		this.kind = kind;
		this.number = number;
	}
//	public String toString() {
//		
//		return "카드 :"+ kind+","+number;
//	}
}

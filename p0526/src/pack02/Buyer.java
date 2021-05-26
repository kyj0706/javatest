package pack02;

public class Buyer {

	String mem_id;
	String men_pw;
	String name;
	int money = 1000; // 초기금액 1000만원 입금
	double bonusPoint = 0;
//다형성 이렇게 쓸수 있음 .... 
	int i = 0;
	Product[] cart = new Product[10];
		
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
			return; //메소드 이기 때문에 return
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] = p;
		System.out.println(p.pro_name+" 구매되었습니다.");
	}
	
//	일일이 다 써야 하는데 수천 수만개가 되면 어쩔거 ? 그래서 위에 
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//		System.out.println("OLEDTV이(가) 구매되었습니다.");
//		
//	}
//	void buy(Computer t2) {
//		money -= t2.price;
//		bonusPoint += t2.bonusPoint;
//		System.out.println("MACBOOK이(가) 구매되었습니다.");	
//	}
//	void buy(Audio t3) {
//		money -= t3.price;
//		bonusPoint += t3.bonusPoint;
//		System.out.println("Auㅇio이(가) 구매되었습니다.");	
//	}
	
}

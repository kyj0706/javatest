package pack03;

public class BuyMe {
	
	String name;
	int money = 2000;
	double M_point = 0;
	
	int count = 0;
	
	Product[] cart = new Product[20];
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("돈이 없는거 같은데 ???");
			return;
			
		}
		money -= p.price;
		M_point += p.Point;
		System.out.println("구매완료");
		cart[count++] = p;
		
		name = p.pro_name;
		System.out.println(p.pro_name + "이가 구매 되었습니다.");
	}
	
	
}

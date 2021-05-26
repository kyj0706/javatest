package pack02;

public class Ex0526_002 {

	public static void main(String[] args) {
		
		Buyer b1 = new Buyer();
		b1.mem_id ="member1";
		b1.name = "홍길동";

	
		b1.buy(new Tv());
		b1.buy(new Audio());
		b1.buy(new Tv());
		b1.buy(new Tv());
		b1.buy(new Tv());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		
		
//기존		
//super("OLEDTV",100,100/10); 너 쓸거야
//		Tv t1 = new Tv(); 
//		b1.buy(t1);
//		
//		Computer t2 = new Computer();
//		b1.buy(t2);
//		
//		Audio t3 = new Audio();
//		b1.buy(t3);
		
		System.out.println("보유금액 :" +b1.money);
		System.out.println("보유보너스: "+b1.bonusPoint);
		
		int sum=0, bouns=0;
		String buy_print="";
		for(int i=0; i<b1.i; i++) {
			sum = sum + b1.cart[i].price;
			bouns = bouns + b1.cart[i].bonusPoint;
			buy_print = buy_print + b1.cart[i].pro_name + "  ";
		}
		System.out.println();
		System.out.println("구매목록 :"+buy_print);
		System.out.println("구매금액 :"+sum);
		System.out.println("총보너스 :"+bouns);
	}

}

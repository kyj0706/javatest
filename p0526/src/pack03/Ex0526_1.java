package pack03;

public class Ex0526_1 {

	public static void main(String[] args) {
		// 조상 : Product [
		// 자손 : [
		//Refrigerator - 300만 "비스포크" , 300,30[
		//Washer - "트럼",180,13[
		//Conditioner - "무풍",230,23[
		//styler -"스타일러,130,13[
		//초기보유금액 - 2000[
		//구매물품 비스포크 2대, 트럼 3대 , 무풍 1대 , 스타일러 2대 [
		//총 구매 금액 출력 , 총구매 개수 출력 . 총구매 목록 출력 
		
		BuyMe s = new BuyMe();
		
		s.buy(new Refrigerator());
		s.buy(new Refrigerator());
		s.buy(new Washer());
		s.buy(new Washer());
		s.buy(new Washer());
		s.buy(new Conditioner());
		s.buy(new Styler());
		s.buy(new Styler());
		
		System.out.println("남은 돈 "+s.money);
		System.out.println("누적 포인트 "+s.M_point);
		
		int sum = 0;
		int s_point = 0;
		String list ="";
		for(int i=0; i<s.count; i++) {
			sum += s.cart[i].price;
			s_point += s.cart[i].Point;
			list += s.cart[i].pro_name+" ";
		}
		System.out.println("총구매 금액 : " +sum );
		System.out.println("총구매 개수 : " +s.count );
		System.out.println("총구매 목록 : " +list);
		
	}

}


public class Ex0521_04 {

	public static void main(String[] args) {
		Product p1 = new Product();
		//인스턴트 초기화블럭은 생성자 안에 넣는 이유 
		p1.product_name="OLED TV";
		p1.price=700;
		p1.bounsPoint=p1.price/100;
		Product p2 = new Product("냉장고",500,5); //냉장고 500 5;
		Product p3 = new Product("세탁기",200,2); //세탁기 200 2;
		
		//System.out.println("p1 : "+p1.serialNo);
		//System.out.println("p2 : "+p2.serialNo);
		//System.out.println("p3 : "+p3.serialNo);
		System.out.println(p1.serialNo);
		System.out.println(p1.product_name);
		System.out.println(p1.bounsPoint);
		System.out.println(p1.price);
		
		
		System.out.println(p2.product_name);
		System.out.println(p3.bounsPoint);
		
		
		System.out.println(p2.serialNo);
		System.out.println(p3.serialNo);
		
		System.out.println("전체count : "+Product.count+" 개");

	}

}

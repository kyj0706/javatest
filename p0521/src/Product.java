
public class Product {

	// 클래스 변수
	static int count;
	// 인스턴스 변수
	int serialNo;
	String product_name; // 이름
	int price; // 가격
	int bounsPoint;

	{
		// 인스턴트 초기화블럭 
		 serialNo = ++count;//생성자 안에 넣어도 된다 근데 왜 만들었을까 ? 
		 //=>생성자에서 공통적인걸 뻡아서 실행해주는 역할
	}

	// 생성자
	public Product() {
		//serialNo = ++count; // 생성자에 넣어도 된다

	}
	//this는 main 의 인스턴트 변수에 반영된다.
	Product(String product_name, int price) {
		this.product_name = product_name;
		this.price = price;
		this.bounsPoint = price/100;
	}
	Product(String product_name, int price, int bounsPoint) {
		this.product_name = product_name;
		this.price = price;
		this.bounsPoint = bounsPoint;
	}
}


public class Ex0518_03 {

	public static void main(String[] args) {
		//인스턴스 변수는 무조건 객체선언을 해줘야 한다.
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("카드종류: %s, 숫자: %d \n", c1.kind,c1.number);
		System.out.printf("카드폭: %d, 카드길이: %d \n", c1.width, c1.height);
		c1.width=200;
		c1.height=300;
		System.out.println("==============================================");
		System.out.printf("카드종류: %s, 숫자: %d \n", c2.kind,c2.number);
		System.out.printf("카드폭: %d, 카드길이: %d \n", c2.width, c2.height);
		
		
		//static은 공통이며 (클래스명.변수명)  이거나 클래스일 경우 객체선언 안해도 된다  
		//Card.width=50;

	}

}


public class MyMath2 {
	//인스턴스 변수
	long a,b; //객체선언 후 사용 , 클래스내 사용
	
	//인스턴스 메소드
	long add() { //특징: 객체선언 후 사용, 클래스내 사용
		return a+b;
	}
	
	//클래스매소드
	static long add(long a, long b) {//특징: 객체선언 없으 사용 가능
		return a+b;
	}
}

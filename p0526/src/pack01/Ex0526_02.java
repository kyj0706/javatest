package pack01;

public class Ex0526_02 {

	public static void main(String[] args) {
		Car c1=null;
		Car c2 = new Car();
		
		FireEngine f1=null;
		FireEngine f2= new FireEngine();
		
		Ambulance a1=null;
		Ambulance a2 = new Ambulance();
		
		Car c3 = new  FireEngine(); // 다형성 : 조상의 참조변수로 자손의 객제를 다룰 수 있는 것
		Car c4 = new Ambulance(); // 다형성 
		
		//자손의 참조 변수로 조상의 객체를 다루는 것은 안된다 .
//안됨	FireEngine f3 = new Car();
		
		//단 조상 객체가 선언되지 않은 참조변수는 사용 가능
		c1 = f1; //조상 객체가 선언되지 않은 참조변수
		c1 = f2; //다형성
		f1 = (FireEngine) c1; // 형변환 필수
//안됨	f1 = (FireEngine) c2; // 문법은 맞다 다만 객체가 선언되어 있기 때문에 불가능  
		
		//System.out.println("f1 : "+f1);
		
		c1 = a1;
		c1 = a2; // 다형성 a:객체선언되어 있음.
		a1 = (Ambulance) c1 ;// 형변환
//안됨	a1 = (Ambulance) c2 ; // 하지 말래두 ..
		
//안됨	f1 = (FireEngine) a1; //자손끼리는되지 않아 .
		
		c1= f1; //Car <- FireEngine이 들어가있다
//안됨	a1 = (Ambulance) c1; //Car에 들어가 있는 참조변수 FireEngine 
		
	}

}

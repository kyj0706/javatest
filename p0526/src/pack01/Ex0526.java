package pack01;

public class Ex0526 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ctv = new CaptionTv();
		ctv.text="라라라~~~";
		
		//둘다 객체가 없다.
		Tv tt=null;
		CaptionTv cctv =null;
		
		// 자손 -> 조상 :형변환 생략 
//정상	tt = cctv; 
		
		//반대 : 는 안됨 
		//단 ! 조장의 참조변수, 자손의 참조변수는 서로 교환가능 
		//객체가 선언이 되어있지 안았을 경우(아래 처럼 형변환을 해줘야한다.)
		//조상 ->자손 :형 변환 필수 .
		cctv =(CaptionTv) tt;
		
		
		
		
		//다형성 : 조상의 참조변수로 자손의 객체를 다룰 수 있는 것
//정상	t = ctv;  
		//반대 : 자손의 참조변수로  조상의 객체 다루는 것은 불가능
		//ctv = t; 
		
		
		//Tv t = new CaptionTv(); 랑 같은 것이다
		
		
	}

}

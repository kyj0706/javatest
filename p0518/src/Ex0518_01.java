
public class Ex0518_01 {
	
	public static void main(String[] args) {
		
	      Time [] t = new Time[3]; // 참조변수의 주소 생성
	      for(int i =0; i< t.length; i++) {
	         t[i] = new Time(); // 참조변수의 데이터 저장공간 생성 
	         t[i].hour = i+1;
	         t[i].minute = i+1;
	         t[i].second = i+1;
	         
	      }
	      
	      for(int i =0; i< t.length; i++) {
	         System.out.printf("%d시 %d분 %d초\n", t[i].hour, t[i].minute,t[i].second);
	      
	      }

		
		
		
		
//		t[0] = new Time();
//		t[0].hour=1;
//		t[0].minute=1;
//		t[0].second=1;
//		//배열일 경우의 장점 ..  for문을 넣을수 있따 .
		
		
		
//		Time t = new Time();
//		t.hour  = 1;
//		t.minute = 1;
//		t.second = 1;
//		//자동생성에서 괄호 열고 닫고가 없으면 변수다
//		
//		System.out.println(t.hour+"시"+t.minute+"분"+t.second+"초");
	}
}

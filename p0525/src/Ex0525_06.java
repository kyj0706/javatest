import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex0525_06 {

	public static void main(String[] args) {
		//이녀석 ~~  알고만 있어라 ~ 
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		//Calendar cas2 = new Calendar();
		Calendar cal = Calendar.getInstance();
		String today3 = sdf3.format(cal.getTime());
		System.out.println("Calendar 객체 시간 : "+today3);
		
		
		//Date 객체 사용해서 - 날짜와 시간을 구하는 것 
		Date Time = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf1.format(Time);
		System.out.println("Date객체 시간 :" +today);
		
		Date time2 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String today2 =sdf2.format(time2);
		System.out.println("Date객체 시간 :" +today2);
		
		
		
		
		
		
		
		
		
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
//기존	
//		Singleton s = new Singleton();//이거 자연스렵게 생성자를 적어준거다 
//		s.setName("홍길동");
//		
//		System.out.println("학번 : "+s.getStu_num());
//		System.out.println("이름 : "+s.getName());
		
		
//기존
//		s.name = "홍길동";
//		
//		System.out.println("학번 :" +s.stu_num);
//		System.out.println("이름 :" + s.name);
	}

}

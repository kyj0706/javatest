package p0616;

public class Person {
	long id;
	
	
	//지금 하고 싶은거 
	//객체변수 a와 b가 같냐 
	//근겐 객체는 주소값이 다르기 때문에 서로 비교 할 수가 없단말이지 
	//그래서 Person냐 라고 자체를 비교 하는거 
	//객체도 데이터도 같냐
	@Override
	public boolean equals(Object obj) { 
		if(obj!=null && obj instanceof Person) {
			if(id==((Person)obj).id) return true;
		else return false;
		}else {return false;}
		//return super.equals(obj);
	}
	
}

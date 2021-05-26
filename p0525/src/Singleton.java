
public class Singleton {

	private static Singleton s = new Singleton();
	static int count;
	private int stu_num;
	private String name;
	
	{
		count++;
		stu_num = count;
	}
	
	
	//기본생성자
//	Singleton() {} 기존
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(s==null) {//단점 수없이 많아도 1개 밖에 없음 
			
		}
		return s; //간혹 메모리에 안올라가는 경우가 있다  그래서 위에 
	}

	public int getStu_num() {
		return stu_num;
	}


	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}


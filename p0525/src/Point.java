
public class Point {

	int x;
	int y;
	
	
	Point(){}
	//매게변수가 있는 생성자
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "X"+x+"Y:"+y;
	}
}

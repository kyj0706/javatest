
public class Circle {
	//객체 주소 참조변수
	Point center;
	int r;
	
	Circle(){
		this(new Point(0,0),100);
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
}

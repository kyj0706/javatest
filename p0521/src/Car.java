
public class Car {

	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",4);
		
		
		
//		color = "white";
//		gearType ="auto";
//		door = 4;
	}
//	Car(String c, String g, int d){
//		color = c;
//		gearType= g;
//		door = d;
//	}
	Car(String color, String gearType, int door){
//		color = color; // 이렇게 되면 이름이 같기 때문에 지역변수에서 계손 돌아간다.
		//그래서 this 넣어주거나 
		//color =c; 로 하거나
		this.color = color;
		this.gearType= gearType;
		this.door = door;
	}

}
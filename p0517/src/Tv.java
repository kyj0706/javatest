
public class Tv {

	String color;
	boolean power; // on-off 밖에 없다 TV는 0또는 1로만 인식하면 된다.
	int channel1; // 3=tvn 5=sbs 7=kbs 9=kbs1 11=mbc

	
	
	void power() {
		power = !power; // true , false
	}

	void channel1Up() {
		channel1++;
	}

	void channel1Down() {
		channel1--;
	}
}

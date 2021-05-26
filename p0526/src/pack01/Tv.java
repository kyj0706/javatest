package pack01;

public class Tv {
	boolean power; // boolean엔 true, false 가 있다.
	int channel;
	void power() {
		power = !power;
	};
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	

}

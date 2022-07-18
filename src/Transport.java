//### 상위 클래스 = 대중교통

public class Transport {
	public Transport(int number, int fuel, int speed, int changeSpeed, int maxPassenger, boolean status) {
		this.number = number;
		this.fuel = fuel;
		this.speed = speed;
		this.changeSpeed = changeSpeed;
		this.maxPassenger = maxPassenger;
		this.status = status;
	}

	public Transport(int number, int speed) {
		this.number = number;
		this.speed = speed;
	}

	int number;
	int fuel = 100;
	int speed = 0;
	int changeSpeed;
	int maxPassenger;
	boolean status = true;

	public void engineStart(){
	}
	public void changeSpeed(){
	}
	public void changeStatus(){
	}
	public void inPassenger(){
	}
}

//### 상위 클래스 = 대중교통

public class Transport {
	int number;

	int fuel;
	int speed;
	int changeSpeed;
	int maxPassenger;
	boolean status;
	public Transport(int number, int fuel, int speed, int changeSpeed, int maxPassenger, boolean status) {
		this.number = number;
		this.fuel = fuel;
		this.speed = speed;
		this.changeSpeed = changeSpeed;
		this.maxPassenger = maxPassenger;
		this.status = status;
	}

	public void engineStart(){
	}
	public void changeSpeed(){
	}
	public void changeStatus(){
		if(status){
			status = false;
		}else status =true;
	}
	public void addPassenger(int passenger){
	}
	public void addPassenger(int passenger, String goal, int km) {
	}
	public void printStatus() {
	}
}

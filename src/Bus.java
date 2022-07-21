public class Bus extends Transport{
	int pay = 1000;
	public Bus(int number) {
		super(number, 100, 0, 0, 30, true);
	}

	@Override
	public void printStatus(){
		System.out.println("버스번호 : "+number);
	}

	@Override
	public void engineStart() {
		status = true;
	}

	@Override
	public void addPassenger(int passenger){
		if(maxPassenger - passenger >0){
			maxPassenger -= passenger;
			System.out.println("탑승 승객 수 = "+ passenger);
			System.out.println("잔여 좌석 수 = "+ maxPassenger);
			System.out.println("요금 = "+(pay * passenger));
		}else System.out.println("최대 승객 수 초과");
	}

	public void usingFule(int oil){
		if(fuel > 10){
			fuel -= oil;
			System.out.println("주유량 = "+fuel);
		}else{
			goingGarage();
		}
	}

	public void charingPule(int oil){
		fuel += oil;
		System.out.println("주유량 = "+fuel);
	}

	public void goingGarage(){
		maxPassenger = 30;
		changeStatus();
		System.out.println("상태 = 차고지행");
		if(fuel < 10){
			System.out.println("주유 필요");
		}
	}
}


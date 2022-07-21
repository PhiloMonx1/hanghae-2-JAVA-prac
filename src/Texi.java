public class Texi extends Transport{
	int pay = 3000;
	int sumPay;
	int getPay;
	public Texi(int number) {
		super(number, 100, 0, 0, 4, true);
	}

	@Override
	public void printStatus(){
		System.out.println("Taxi 번호 = "+number);
		System.out.println("주유량 = "+fuel);
		System.out.println("상태 = 일반");
	}
	@Override
	public void addPassenger(int passenger, String goal, int km){
		if(maxPassenger - passenger >0){
			maxPassenger -= passenger;
			if(km<10){
				getPay += pay+(km*500);
			}else getPay += pay+(km*1000);
			System.out.println("탑승 승객 수 = "+ passenger);
			System.out.println("잔여 좌석 수 = "+ maxPassenger);
			System.out.println("기본 요금 확인  = "+pay);
			System.out.println("목적지 = "+goal);
			System.out.println("목적지까지 거리 = "+km+"km");
			System.out.println("지불할 요금  = "+getPay);

		}else System.out.println("최대 승객 수 초과");
	}

	public void getPay(){
		sumPay += getPay;
		maxPassenger = 4;
		System.out.println("주유량 = "+fuel);
		System.out.println("누적 요금 = "+sumPay);
		if(fuel<10){
			changeStatus();
			getStatus();
			System.out.println("주유 필요");
		}
		getPay=0;
	}

	public void getStatus(){
		if(status){
			System.out.println("상태 = 운행중");
		}else System.out.println("상태 = 운행불가");
	}

	public void usingFule(int oil){
		if(fuel > 10){
			fuel -= oil;
		}else{
			status = false;
		}
	}


}

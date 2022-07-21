public class Main {

	public static void main(String[] args) {


		Transport bus1 = new Bus(1560);
		Bus bus2 = new Bus(5001);

		bus1.printStatus();
		bus2.printStatus();

		System.out.println("=====================");
		bus2.addPassenger(2);
		bus2.usingFule(50);
		bus2.goingGarage();
		bus2.charingPule(10);
		bus2.engineStart();
		bus2.addPassenger(45);
		bus2.addPassenger(5);
		bus2.usingFule(55);
		bus2.usingFule(55);

//		탑승 승객 수 = 2
//		잔여 승객 수 = 28
//		요금 확인 = 2000
//		주유량 = 50
//		상태 = 차고지행
//		주유량 = 60
//		알럿 ‘최대 승객 수 초과’
//		탑승 승객 수 = 5
//		잔여 승객 수 = 25
//		요금 = 5000
//		주유량 = 5
//		상태 = 차고지행
//		알럿 ‘주유 필요’

		System.out.println("*******************************");

		Texi texi1 = new Texi(4885);
		Texi texi2 = new Texi(5854);


		texi1.printStatus();
		texi2.printStatus();

		System.out.println("===========================");
		texi1.addPassenger(2, "서울역", 2);
		texi1.getStatus();
		texi1.usingFule(80);
		texi1.getPay();
		texi1.addPassenger(5, "", 0);
		texi1.addPassenger(3, "구로디지털단지역", 12);
		texi1.usingFule(20);
		texi1.getPay();

//		각 Taxi 번호 다른지 확인
//		주유량 = 100
//		상태 = 일반
//		탑승 승객 수 = 2
//		잔여 승객 수 = 2
//		기본 요금 확인 = 3000
//		목적지 = 서울역
//		목적지까지 거리 = 2km
//		지불할 요금  = 4000
//		상태 = 운행중
//		주유량 = 20
//		누적 요금 = 4000
//		‘최대 승객 수 초과’
//		탑승 승객 수 = 3
//		잔여 승객 수 = 1
//		기본 요금 확인 = 3000
//		목적지 = 구로디지털단지역
//		목적지까지 거리 = 12km
//		지불할 요금  = 14000
//		주유량 = 0
//		상태 = 운행불가
//		누적 요금  = 19000원
//		‘주유 필요’
	}
}
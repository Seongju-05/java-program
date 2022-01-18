package copperation;

public class TakeTrans {

	public static void main(String[] args) {

		Student james = new Student("James", 5000);
		Student tom = new Student("Tom", 8000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen1 = new Subway(2);
		tom.takeSubway(subwayGreen1);
		tom.showInfo();
		subwayGreen1.showInfo();
	}

}

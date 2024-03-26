package sec01.exam03;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		return new Car("Çö´ë(G90)");
	}
	
}

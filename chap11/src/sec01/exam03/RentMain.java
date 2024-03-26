package sec01.exam03;

public class RentMain {

	public static void main(String[] args) {
		HouseAgency hA = new HouseAgency();
		House house = hA.rent(); // House �뿩
		System.out.println("Rent: " + house.getType());
		
		CarAgency cA = new CarAgency();
		Car car = cA.rent(); // Car �뿩
		System.out.println("Rent: " + car.getMakers());
		
		Rentable<Car> Tesla = () -> new Car("�׽���");
		Car car2 = Tesla.rent();
		System.out.println(car2.getMakers());
		
		Rentable<Car> hyundai = () -> new Car("���̿���");
		Car car3 = hyundai.rent();
		System.out.println(car3.getMakers());
		
		Rentable<House> Apartment = () -> new House("����Ʈ");
		House house2 = Apartment.rent();
		System.out.println(house2.getType());
		
	}

}

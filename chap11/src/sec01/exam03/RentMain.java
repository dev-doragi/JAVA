package sec01.exam03;

public class RentMain {

	public static void main(String[] args) {
		HouseAgency hA = new HouseAgency();
		House house = hA.rent(); // House 대여
		System.out.println("Rent: " + house.getType());
		
		CarAgency cA = new CarAgency();
		Car car = cA.rent(); // Car 대여
		System.out.println("Rent: " + car.getMakers());
		
		Rentable<Car> Tesla = () -> new Car("테슬라");
		Car car2 = Tesla.rent();
		System.out.println(car2.getMakers());
		
		Rentable<Car> hyundai = () -> new Car("아이오닉");
		Car car3 = hyundai.rent();
		System.out.println(car3.getMakers());
		
		Rentable<House> Apartment = () -> new House("아파트");
		House house2 = Apartment.rent();
		System.out.println(house2.getType());
		
	}

}

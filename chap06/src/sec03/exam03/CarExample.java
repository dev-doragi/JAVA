package sec03.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.Info: " + car1.getCarInfo());
		
		Car car2 = new Car("Camaro", "Red", 350);
		System.out.println("car2.Info: " + car2.getCarInfo());
		
		Car car3 = new Car("Volkswagen", "Arteon", "Deep Black Pearl", 200);
		System.out.println("car3.Info: " + car3.getCarInfo());
		
	}

}

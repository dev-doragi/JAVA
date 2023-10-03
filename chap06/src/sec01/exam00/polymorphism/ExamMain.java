package sec01.exam00.polymorphism;

public class ExamMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		MotorBike myBike = new MotorBike();
		
		// Driver °´Ã¼ »ý¼º
		Driver driver = new Driver();
		driver.drive(myCar);
		driver.drive(myBike);
	}

}

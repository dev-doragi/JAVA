package sec01.exam00.polymorphism;

public class Driver {
	void drive(Vehicle vehicle) {
		vehicle.start();
		vehicle.moveForward();
		vehicle.moveBackward();
		vehicle.stop();
	}
}

// Driver driver = new Driver();
// driver.drive(Car); -> 자동차 출발! 자동차 앞으로! 뒤로! 스탑!!
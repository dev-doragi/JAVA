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
// driver.drive(Car); -> �ڵ��� ���! �ڵ��� ������! �ڷ�! ��ž!!
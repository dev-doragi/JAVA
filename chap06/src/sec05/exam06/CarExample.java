package sec05.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-30);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		myCar.setSpeed(120);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());

	}

}

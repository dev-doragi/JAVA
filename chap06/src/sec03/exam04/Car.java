package sec03.exam04;

public class Car {
	// �ʵ�
		public String company = "Chevrolet";
		public String model = "Morning";
		public String color = "Yellow";
		public int horsePower = 100;
		
		public Car() {System.out.println("Car() ������ ȣ��");}
		
		public Car(String model) {
			this.model = model;
			System.out.println("Car(String) ������ ȣ��");
		}
		
		public Car(String model, String color) {
			this(model); // this() ������, ������ �ٷ� �ؿ� �����ؾ� ������ �ȳ���.
			this.color = color;
			System.out.println("Car(String, String) ������ ȣ��");
		}
		
		public Car(String model, String color, int horsePower) {
			this(model, color);
			this.horsePower = horsePower;
			System.out.println("Car(String, String, int) ������ ȣ��");
		}
}

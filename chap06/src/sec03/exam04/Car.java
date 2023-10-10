package sec03.exam04;

public class Car {
	// 필드
		public String company = "Chevrolet";
		public String model = "Morning";
		public String color = "Yellow";
		public int horsePower = 100;
		
		public Car() {System.out.println("Car() 생성자 호출");}
		
		public Car(String model) {
			this.model = model;
			System.out.println("Car(String) 생성자 호출");
		}
		
		public Car(String model, String color) {
			this(model); // this() 생성자, 생성자 바로 밑에 생성해야 오류가 안난다.
			this.color = color;
			System.out.println("Car(String, String) 생성자 호출");
		}
		
		public Car(String model, String color, int horsePower) {
			this(model, color);
			this.horsePower = horsePower;
			System.out.println("Car(String, String, int) 생성자 호출");
		}
}

package sec03.exam03;

public class Car {
	// 필드
	public String company = "Chevrolet";
	public String model = "Morning";
	public String color = "Yellow";
	public int horsePower = 100;
	
	// 생성자 Overloading
	public Car() {}
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public Car(String model, String color, int horsePower) {
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;
	}
	
	public Car(String company, String model, String color, int horsePower) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.horsePower = horsePower;
	}
	
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	// method
	public String getCarInfo() {
		return "  ====== Car Info ====== \n" +
					"Company:         " + getCompany() + "\n" +
					 "Model :              " + getModel() + "\n" +
					 "Color: 	           " + getColor() + "\n" +
					 "Horse Power:   " + getHorsePower() + "\n";
	}
	
}

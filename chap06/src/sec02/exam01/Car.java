package sec02.exam01;

public class Car {
	// field
	public String model;
	public String color;
	private int maxSpeed;
	private int speed;
	
	// constructor
	public Car(String model, String color, int maxSpeed, int speed)  {
		this.model = model;
		this. color = color;
		this.maxSpeed = maxSpeed;
		this.speed  = speed;
	}

	// getter & setter
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

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// method
	public String getCarInfo() {
		return " === Car Info === \n" +
					 "Model :         " + getModel() + "\n" +
					 "Color: 	     " + getColor() + "\n" +
					 "MaxSpeed:  " + getMaxSpeed() + "Km\n" +
					 "Speed: 	     " + getSpeed() + "Km\n";
	}
	
}

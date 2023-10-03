package sec01.exam00.encapsulation;

public class Car {
	private String model;
	private String color;
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	private void startEngine() {
		System.out.println("자동차 시동을 겁니다.");	
	}
	
	private void moveForward() {
		System.out.println("자동차가 앞으로 갑니다.");
	}
	
	private void openWindow() {
		System.out.println("모든 창문을 엽니다.");
	}
	
    public void operate() { 
    // private인 멤버 메서드들에 접근하기 위해 public의 operate라는 함수를 통해서 접근 -> 캡슐화
        startEngine();
        moveForward();
        openWindow();
    }
	
	// getter & setter 사용해서 private 멤버 변수에 접근하기
	// 우클릭 소스 generate getter & setter
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
	
	
}

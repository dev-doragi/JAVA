package sec01.exam04;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int mileagePoint;
	protected double mileageRatio;
	protected int agentID;
	protected double discountRate;
	
	public Customer() {
		System.out.println("Customer() 생성자 호출됨.\n");
	}
	
	public int calcMileagePoint(int price) {
		mileagePoint += price * mileageRatio;
		return mileagePoint;
	}

	public void setTitleLength(int len) { // = 개수 정해주는 함수
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < len; i++) {
			builder.append("=");
		}
		builder.append("[  고객 정보  ]");
		for (int i = 0; i < len; i++) {
			builder.append("=");
		}
		builder.append("\n");
		System.out.println(builder.toString());
	}
	
	// 고객 정보 안내 메서드
	public String customerInfo() {
		int len;
		
		// StringBuilder 객체 생성
		StringBuilder builder = new StringBuilder();
		
		// StringBuilder 객체에 문자열 추가
		builder.append(customerName + "님의 등급은 ");
		builder.append(customerGrade + "이며, 현재 마일리지는 ").append(mileagePoint).append("pt 입니다.\n");
		
		// 고객 정보 제목 길이 정하기
		len = (builder.toString()).length() / 2;
		setTitleLength(len);
		
		// StringBuilder 객체의 값을 문자열로 변환하여 반환
		return builder.toString();
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getMileagePoint() {
		return mileagePoint;
	}

	public void setMileagePoint(int mileagePoint) {
		this.mileagePoint = mileagePoint;
	}

	public double getMileageRatio() {
		return mileageRatio;
	}

	public void setMileageRatio(double mileageRatio) {
		this.mileageRatio = mileageRatio;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
}

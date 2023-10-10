package sec05.exam02;

public class Tv {
	static String company = "SAMSUNG";
	static String model = "QLED 8K";
	static String size = "75inch";
	static String info;
	static int discountPrice;
	
	// static 블록 선언
	static {
		System.out.println("static 블록 실행");
		
		info = company + " - " + model + "(" + size + ")";
		
		// discountPrice 계산
		int price = 0;
		for (int i = 0; i <= 75; i++) {
			price += (i * 500);
		}
		discountPrice = price;
	}
}

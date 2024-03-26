package sec06.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.*;

public class ConsumerExample {
	public static void main(String[] args) {
		/* Consumer 함수형 인터페이스(매개값만 있고 리턴값이 없는 accept() 추상메서드 사용) */
		//매개값 T를 받아 출력하는 Consumer 인터페이스를 람다식으로 구현
		Consumer<String> consumer = (t) -> System.out.println("입력값: " + t.toUpperCase());	
		
		//consumer 객체의 accept() 호출
		consumer.accept("java");
		
		//매개값 T를 받아 출력하는 Consumer 인터페이스를 람다식으로 구현
		Consumer<Date> date = (d) -> {
			String today = new SimpleDateFormat("YYYY-MM-dd").format(d);
			System.out.println("오늘 날짜: " + today);
		};
		
		//Date 객체를 생성하여 accept() 메서드의 인자로 전달(d에 전달)
		date.accept(new Date());
		
		//매개값 T, U를 받아 출력하는 BiConsumer 인터페이스를 람다식으로 구현
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("Java", " Programming");		
	}//end of main
}



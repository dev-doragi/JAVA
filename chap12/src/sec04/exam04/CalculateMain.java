package sec04.exam04;

public class CalculateMain {
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		
		calculate.action((x, y) -> {
			double result = x + y;
			return result;
		});
		
		calculate.action((x, y) -> {return (x + y);});
		calculate.action((x, y) -> x + y);	
		
		//리턴값은 연산식 또는 리턴값이 있는 메소드 호출 가능
		calculate.action((x, y) -> {return sum(x, y);});		
		calculate.action((x, y) -> sum(x, y));
	}//end of main	
	public static double sum(double x, double y) {
		return x + y;
	}
}//end of class


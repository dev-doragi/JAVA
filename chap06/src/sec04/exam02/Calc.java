package sec04.exam02;

public class Calc {
	int sum1(int[] values) {
		int result = 0;
		for(int i=0; i<values.length; i++) {
			result += values[i];
		}
		return result;
	}
	
	int sum2(int ... values) { // 향상된 for문
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
}

package step01.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//스터디그룹 등록날짜(foundationDay) 생성 클래스
public class DateUtil {
	//날짜 정보를 파싱하여 원하는 포멧으로 날짜 출력
	public static String toDay(String format) {
		/* SimpleDateFormat 객체 생성
		 * - 파싱할 날짜 문자열 포멧을 생성자 인자로 전달 */		
		SimpleDateFormat dateFormate = new SimpleDateFormat(format);
		//Calendar클래스의 getInstance() 메서드 통해 현재 날짜와 시간 가져와서 포멧에 맞춰 반환
		return dateFormate.format(Calendar.getInstance().getTime());
	}
	
	//날짜 포멧 문자열을 전달하는 메서드
	public static String toDay() {
		return toDay("yyyy.MM.dd a HH:mm:ss");
	}
}

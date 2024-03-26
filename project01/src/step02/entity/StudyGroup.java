package step02.entity;

import java.util.UUID;
import step02.util.DateUtil;

//스터디그룹 클래스
public class StudyGroup {
	private static final int MIN_NAME_LENGTH = 2;
	private static final int MIN_TOPIC_LENGTH = 5;
	
	//필드
	private String id;//아이디(고유 id)
	private String name;//스터디그룹 이름
	private String topic;//스터디 주제
	private String period;//스터디 기간
	private String room;//스터디 룸
	private String foundationDay;//등록(개설)일
	
	//생성자
	private StudyGroup() {
		/* UUID(Universally Unique IDentifiers)
		 * - 분산 컴퓨터 환경에서 사용하는 범용 고유 식별자로 각 객체를 
		 *   고유하게 식별하기 위하여 사용
		 * - UUID는 128-bit 숫자로, UUID 클래스의 randomUUID() 메소드를 사용해서 
		 *   유일한 식별자를 생성하여 문자열로 변환하여 저장
		 *   1. 업로드된 파일명의 중복을 방지하기 위해 파일명을 변경할 때 사용.
		 *   2. 첨부파일 파일다운로드시 다른 파일을 예측하여 다운로드하는것을 방지하는데 사용.
		 *   3. 일련번호 대신 유추하기 힘든 식별자를 사용하여 다른 컨텐츠의 임의 접근을 방지하는데 사용.
		 */
		this.id = UUID.randomUUID().toString();
	}
	
	//생성자 오버로딩
	public StudyGroup(String name, String topic, String period, String room) {
		this();
		setName(name);
		setTopic(topic);
		this.period = period;
		this.room = room;
		//스터디그룹 생성일자 초기화
		this.foundationDay = DateUtil.toDay();
	}

	//게터/세터
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		//제약조건 validation
		if(name.length() < MIN_NAME_LENGTH) {
			System.out.println("스터디그룹명은 2자리 이상입니다.");
			return;
		}
		this.name = name;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		//제약조건 validation
		if (topic.length() < MIN_TOPIC_LENGTH) {
			System.out.println("스터디주제는 5자리 이상입니다.");
			return;
		}
		this.topic = topic;
	}
	
	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	
	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}
	
	/* Object 클래스의 toString() 메소드 오버라이딩
	 * - toString() 메소드는 객체의 정보를 문자열로 형변환하는 메소드로
	 *   Object 클래스를 상속한 자식 클래스들은 필요시 재정의하여 사용
	 */
	@Override
	public String toString() {
		//StringBuilder 객체 생성 및 반환
		StringBuilder builder = new StringBuilder();
		builder.append("[스터디그룹 정보]");
		builder.append("\n------------------------------");
		builder.append("\n * 아이디: ").append(id);
		builder.append("\n * 스터디명: ").append(name);
		builder.append("\n * 스터디주제: ").append(topic);
		builder.append("\n * 스터디기간: ").append(period);
		builder.append("\n * 스터디장소: ").append(room);
		builder.append("\n * 등록일:  ").append(foundationDay);
		
		//builder 객체를 문자열로 변환하여 반환
		return builder.toString();
	}	
}
